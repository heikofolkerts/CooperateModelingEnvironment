package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.common.derivedstate.calculator.UMLReferencingElementCalculator;
import de.cooperateproject.modeling.textual.common.derivedstate.initializer.VisibilityHavingElementInitializer;
import de.cooperateproject.modeling.textual.common.derivedstate.remover.UMLReferencingElementRemover;
import de.cooperateproject.modeling.textual.common.services.TextualCommonsTransientStatusProvider;
import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.derivedstate.calculator.AssociationCalculator;
import de.cooperateproject.modeling.textual.usecase.derivedstate.initializers.ActorInitializer;
import de.cooperateproject.modeling.textual.usecase.derivedstate.removers.ActorRemover;
import de.cooperateproject.modeling.textual.usecase.services.UseCaseTransientStatusProvider;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.DelegatingTransientStatusProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

public class UseCaseCustomizedRuntimeModule extends UsecaseRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {

        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(UsecasePackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages,
                String issueId) {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages) {
            return Collections.emptyList();
        }

    }

    private static class DummyAtomicProcessorRegistry implements IAtomicDerivedStateProcessorRegistry {

        private static final Class<?>[] RELEVANT_CLASSES = { IAtomicDerivedStateProcessor.class,
                AssociationCalculator.class, UMLReferencingElementCalculator.class, UMLReferencingElementRemover.class,
                VisibilityHavingElementInitializer.class, ActorInitializer.class, ActorRemover.class };
        @SuppressWarnings("rawtypes")
        private static final Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> PROCESSORS = getProcessors();

        @Inject
        public DummyAtomicProcessorRegistry(Injector injector) {
            PROCESSORS.values().stream().map(Map::values).flatMap(Collection::stream).distinct()
                    .forEach(injector::injectMembers);
        }

        @SuppressWarnings("rawtypes")
        private static Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> getProcessors() {

            Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> categories = new EnumMap<>(
                    DerivedStateProcessorApplicability.class);
            for (DerivedStateProcessorApplicability applicability : DerivedStateProcessorApplicability.values()) {
                categories.put(applicability, new HashMap<>());
            }

            List<Class<?>> packageProvidingClasses = Arrays.asList(RELEVANT_CLASSES);
            Collection<URL> urls = packageProvidingClasses.stream()
                    .map(cls -> ClasspathHelper.forPackage(cls.getPackage().getName(), cls.getClassLoader()))
                    .flatMap(Collection::stream).collect(Collectors.toSet());
            String[] packageNames = packageProvidingClasses.stream().map(Class::getPackage).map(Package::getName)
                    .collect(Collectors.toSet()).toArray(new String[0]);
            Reflections reflections = new Reflections(
                    new ConfigurationBuilder().setUrls(urls).setScanners(new SubTypesScanner(false))
                            .filterInputsBy(new FilterBuilder().includePackage(packageNames)));
            Set<Class<? extends IAtomicDerivedStateProcessor>> subTypes = reflections
                    .getSubTypesOf(IAtomicDerivedStateProcessor.class).stream().filter(c -> !c.isInterface()
                            && !Modifier.isAbstract(c.getModifiers()) && Modifier.isPublic(c.getModifiers()))
                    .collect(Collectors.toSet());

            for (Class<? extends IAtomicDerivedStateProcessor> type : subTypes) {
                IAtomicDerivedStateProcessor<?> instance;
                try {
                    instance = type.newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                Applicability applicabilities = instance.getClass().getAnnotation(Applicability.class);
                for (DerivedStateProcessorApplicability applicability : applicabilities.applicabilities()) {
                    categories.get(applicability).put(instance.getType(), instance);
                }
            }

            return categories;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type) {
            return Optional.ofNullable(
                    PROCESSORS.get(DerivedStateProcessorApplicability.INITIALIZATION).getOrDefault(type, null));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type) {
            return Optional
                    .ofNullable(PROCESSORS.get(DerivedStateProcessorApplicability.CLEANING).getOrDefault(type, null));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type) {
            return Optional.ofNullable(
                    PROCESSORS.get(DerivedStateProcessorApplicability.CALCULATION).getOrDefault(type, null));
        }

    }

    private static class StaticallyBoundTransientStatusProvider extends DelegatingTransientStatusProvider {
        public StaticallyBoundTransientStatusProvider() {
            super(Arrays.asList(new UseCaseTransientStatusProvider(), new TextualCommonsTransientStatusProvider()));
        }
    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return UsecaseInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

    @Override
    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
        return DummyFactoryRegistry.class;
    }

    @Override
    public Class<? extends IAtomicDerivedStateProcessorRegistry> bindIAtomicDerivedStateProcessorRegistry() {
        return DummyAtomicProcessorRegistry.class;
    }

    @Override
    public Class<? extends ITransientStatusProvider> bindITransientStatusProvider() {
        return StaticallyBoundTransientStatusProvider.class;
    }

}
