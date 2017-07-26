/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import de.cooperateproject.modeling.textual.component.formatting2.ComponentFormatter;
import de.cooperateproject.modeling.textual.component.issues.ComponentAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.component.parser.antlr.ComponentAntlrTokenFileProvider;
import de.cooperateproject.modeling.textual.component.parser.antlr.ComponentParser;
import de.cooperateproject.modeling.textual.component.parser.antlr.internal.InternalComponentLexer;
import de.cooperateproject.modeling.textual.component.scoping.ComponentScopeProvider;
import de.cooperateproject.modeling.textual.component.serializer.ComponentSemanticSequencer;
import de.cooperateproject.modeling.textual.component.serializer.ComponentSyntacticSequencer;
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;
import de.cooperateproject.modeling.textual.component.validation.ComponentValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.DefaultUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IAlternativeNameProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.CooperateAutomatedValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;
import java.util.Properties;
import net.winklerweb.cdoxtext.runtime.CDOTextRegionAccessBuilder;
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

/**
 * Manual modifications go to {@link ComponentRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractComponentRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "de/cooperateproject/modeling/textual/component/Component.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("de.cooperateproject.modeling.textual.component.Component");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("cmp");
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public Class<? extends IGrammarAccess> bindIGrammarAccess() {
		return ComponentGrammarAccess.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
		return ComponentSemanticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
		return ComponentSyntacticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IParser> bindIParser() {
		return ComponentParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
		return AntlrTokenToStringConverter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return ComponentAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends Lexer> bindLexer() {
		return InternalComponentLexer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
		return AntlrTokenDefProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Provider<? extends InternalComponentLexer> provideInternalComponentLexer() {
		return LexerProvider.create(InternalComponentLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(InternalComponentLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
	@SingletonBinding(eager=true)
	public Class<? extends ComponentValidator> bindComponentValidator() {
		return ComponentValidator.class;
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
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment2
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Ecore2XtextTerminalConverters.class;
	}
	
	// contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
	public Class<? extends IFormatter2> bindIFormatter2() {
		return ComponentFormatter.class;
	}
	
	// contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
	public void configureFormatterPreferences(Binder binder) {
		binder.bind(org.eclipse.xtext.preferences.IPreferenceValuesProvider.class).annotatedWith(org.eclipse.xtext.formatting2.FormatterPreferences.class).to(org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return ComponentScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(ImportedNamespaceAwareLocalScopeProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIgnoreCaseLinking(Binder binder) {
		binder.bindConstant().annotatedWith(IgnoreCaseLinking.class).to(false);
	}
	
	// contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment2
	public Class<? extends TextRegionAccessBuilder> bindTextRegionAccessBuilder() {
		return CDOTextRegionAccessBuilder.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
		return CooperateResourceSet.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return CooperateGlobalScopeProvider.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
		return ConventionalUMLUriFinder.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends IUMLPrimitiveTypeSelector> bindIUMLPrimitiveTypeSelector() {
		return DefaultUMLPrimitiveTypeSelector.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends IAutomatedIssueResolutionProvider> bindIAutomatedIssueResolutionProvider() {
		return ComponentAutomatedIssueResolutionProvider.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends IIssueCodeRegistry> bindIIssueCodeRegistry() {
		return IssueCodeRegistry.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
	public Class<? extends ICooperateAutomatedValidator> bindICooperateAutomatedValidator() {
		return CooperateAutomatedValidator.class;
	}
	
	// contributed by de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2
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
