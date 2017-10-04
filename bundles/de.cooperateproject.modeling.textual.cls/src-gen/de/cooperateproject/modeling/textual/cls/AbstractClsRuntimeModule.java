/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.cls;

import java.util.Properties;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ITokenToStringConverter;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.antlr.LexerProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.IgnoreCaseLinking;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer;
import org.eclipse.xtext.service.DefaultRuntimeModule;
import org.eclipse.xtext.service.SingletonBinding;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

import de.cooperateproject.modeling.common.primitivetypes.DefaultUMLPrimitiveTypeFilter;
import de.cooperateproject.modeling.common.primitivetypes.IUMLPrimitiveTypeFilter;
import de.cooperateproject.modeling.textual.cls.formatting2.ClsFormatter;
import de.cooperateproject.modeling.textual.cls.issues.ClsAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.cls.parser.antlr.ClsAntlrTokenFileProvider;
import de.cooperateproject.modeling.textual.cls.parser.antlr.ClsParser;
import de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer;
import de.cooperateproject.modeling.textual.cls.scoping.ClsScopeProvider;
import de.cooperateproject.modeling.textual.cls.serializer.ClsSemanticSequencer;
import de.cooperateproject.modeling.textual.cls.serializer.ClsSyntacticSequencer;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
import de.cooperateproject.modeling.textual.cls.validation.ClsValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IAlternativeNameProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.CooperateAutomatedValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;
import net.winklerweb.cdoxtext.runtime.CDOTextRegionAccessBuilder;

/**
 * Manual modifications go to {@link ClsRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractClsRuntimeModule extends DefaultRuntimeModule {

    protected Properties properties = null;

    @Override
    public void configure(Binder binder) {
        properties = tryBindProperties(binder, "de/cooperateproject/modeling/textual/cls/Cls.properties");
        super.configure(binder);
    }

    public void configureLanguageName(Binder binder) {
        binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME))
                .toInstance("de.cooperateproject.modeling.textual.cls.Cls");
    }

    public void configureFileExtensions(Binder binder) {
        if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
            binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("cls");
    }

    // contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
    public ClassLoader bindClassLoaderToInstance() {
        return getClass().getClassLoader();
    }

    // contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
    public Class<? extends IGrammarAccess> bindIGrammarAccess() {
        return ClsGrammarAccess.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
    public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
        return ClsSemanticSequencer.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
    public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
        return ClsSyntacticSequencer.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
    public Class<? extends ISerializer> bindISerializer() {
        return Serializer.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends IParser> bindIParser() {
        return ClsParser.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
        return AntlrTokenToStringConverter.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
        return ClsAntlrTokenFileProvider.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends Lexer> bindLexer() {
        return InternalClsLexer.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
        return AntlrTokenDefProvider.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Provider<? extends InternalClsLexer> provideInternalClsLexer() {
        return LexerProvider.create(InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public void configureRuntimeLexer(Binder binder) {
        binder.bind(Lexer.class).annotatedWith(Names.named(LexerBindings.RUNTIME)).to(InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
    @SingletonBinding(eager = true)
    public Class<? extends ClsValidator> bindClsValidator() {
        return ClsValidator.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
    public Class<? extends IContainer.Manager> bindIContainer$Manager() {
        return StateBasedContainerManager.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
    public Class<? extends IAllContainersState.Provider> bindIAllContainersState$Provider() {
        return ResourceSetBasedAllContainersStateProvider.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
    public void configureIResourceDescriptions(Binder binder) {
        binder.bind(IResourceDescriptions.class).to(ResourceSetBasedResourceDescriptions.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
    public void configureIResourceDescriptionsPersisted(Binder binder) {
        binder.bind(IResourceDescriptions.class)
                .annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS))
                .to(ResourceSetBasedResourceDescriptions.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment2
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return Ecore2XtextTerminalConverters.class;
    }

    // contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
    public Class<? extends IFormatter2> bindIFormatter2() {
        return ClsFormatter.class;
    }

    // contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
    public void configureFormatterPreferences(Binder binder) {
        binder.bind(org.eclipse.xtext.preferences.IPreferenceValuesProvider.class)
                .annotatedWith(org.eclipse.xtext.formatting2.FormatterPreferences.class)
                .to(org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
    public Class<? extends IScopeProvider> bindIScopeProvider() {
        return ClsScopeProvider.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
    public void configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(ImportedNamespaceAwareLocalScopeProvider.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
    public void configureIgnoreCaseLinking(Binder binder) {
        binder.bindConstant().annotatedWith(IgnoreCaseLinking.class).to(false);
    }

    // contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment2
    public Class<? extends TextRegionAccessBuilder> bindTextRegionAccessBuilder() {
        return CDOTextRegionAccessBuilder.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends XtextResourceSet> bindXtextResourceSet() {
        return CooperateResourceSet.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
        return CooperateGlobalScopeProvider.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return ConventionalUMLUriFinder.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IUMLPrimitiveTypeFilter> bindIUMLPrimitiveTypeFilter() {
        return DefaultUMLPrimitiveTypeFilter.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IAutomatedIssueResolutionProvider> bindIAutomatedIssueResolutionProvider() {
        return ClsAutomatedIssueResolutionProvider.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IIssueCodeRegistry> bindIIssueCodeRegistry() {
        return IssueCodeRegistry.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends ICooperateAutomatedValidator> bindICooperateAutomatedValidator() {
        return CooperateAutomatedValidator.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
        return AutomatedIssueResolutionFactoryRegistry.class;
    }

    // contributed by de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment2
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return CooperateQualifiedNameProvider.class;
    }

    // contributed by de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment2
    public Class<? extends IAlternativeNameProvider> bindIAlternativeNameProvider() {
        return CooperateQualifiedNameProvider.class;
    }

}
