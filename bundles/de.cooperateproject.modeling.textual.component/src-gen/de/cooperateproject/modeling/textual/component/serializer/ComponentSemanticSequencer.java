/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Abstraction;
import de.cooperateproject.modeling.textual.component.metamodel.component.Attribute;
import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Connector;
import de.cooperateproject.modeling.textual.component.metamodel.component.Dependency;
import de.cooperateproject.modeling.textual.component.metamodel.component.Generalization;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.Manifestation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Method;
import de.cooperateproject.modeling.textual.component.metamodel.component.Port;
import de.cooperateproject.modeling.textual.component.metamodel.component.Provide;
import de.cooperateproject.modeling.textual.component.metamodel.component.Require;
import de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Substitution;
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ComponentSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentPackage.ABSTRACTION:
				sequence_Abstraction(context, (Abstraction) semanticObject); 
				return; 
			case ComponentPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ComponentPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case ComponentPackage.COMPONENT_DIAGRAM:
				sequence_ComponentDiagram(context, (ComponentDiagram) semanticObject); 
				return; 
			case ComponentPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case ComponentPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case ComponentPackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case ComponentPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case ComponentPackage.MANIFESTATION:
				sequence_Manifestation(context, (Manifestation) semanticObject); 
				return; 
			case ComponentPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case ComponentPackage.PARAMETER:
				sequence_Parameter(context, (de.cooperateproject.modeling.textual.component.metamodel.component.Parameter) semanticObject); 
				return; 
			case ComponentPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case ComponentPackage.PROVIDE:
				sequence_Provide(context, (Provide) semanticObject); 
				return; 
			case ComponentPackage.REQUIRE:
				sequence_Require(context, (Require) semanticObject); 
				return; 
			case ComponentPackage.ROOT_PACKAGE:
				sequence_RootPackage(context, (RootPackage) semanticObject); 
				return; 
			case ComponentPackage.SUBSTITUTION:
				sequence_Substitution(context, (Substitution) semanticObject); 
				return; 
			}
		else if (epackage == TextualCommonsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualCommonsPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Abstraction
	 *     Abstraction returns Abstraction
	 *
	 * Constraint:
	 *     (leftclassifier=[Classifier|EString] rightclassifier=[Classifier|EString])
	 */
	protected void sequence_Abstraction(ISerializationContext context, Abstraction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAbstractionAccess().getLeftclassifierClassifierEStringParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false));
		feeder.accept(grammarAccess.getAbstractionAccess().getRightclassifierClassifierEStringParserRuleCall_4_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=[Classifier|FQN])
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     body=EString
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getBodyEStringParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDiagram returns ComponentDiagram
	 *
	 * Constraint:
	 *     (title=EString rootpackage=RootPackage)
	 */
	protected void sequence_ComponentDiagram(ISerializationContext context, ComponentDiagram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.COMPONENT_DIAGRAM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.COMPONENT_DIAGRAM__TITLE));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getComponentDiagramAccess().getTitleEStringParserRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getComponentDiagramAccess().getRootpackageRootPackageParserRuleCall_3_0(), semanticObject.getRootpackage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         ((name=STRING alias=ID) | name=ID) 
	 *         comments+=Comment? 
	 *         component+=Component* 
	 *         port+=Port* 
	 *         portrelation+=PortRelation* 
	 *         interfacerelation+=InterfaceRelation* 
	 *         interface+=Interface*
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PortRelation returns Connector
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     (((name=EString alias=ID) | name=ID) leftport=[Port|ID] rightport=[Port|ID] interface=[Interface|EString])
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Dependency
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (leftclassifier=[Classifier|EString] rightclassifier=[Classifier|EString])
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDependencyAccess().getLeftclassifierClassifierEStringParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false));
		feeder.accept(grammarAccess.getDependencyAccess().getRightclassifierClassifierEStringParserRuleCall_4_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (leftclassifier=[Classifier|EString] rightclassifier=[Classifier|EString])
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getLeftclassifierClassifierEStringParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false));
		feeder.accept(grammarAccess.getGeneralizationAccess().getRightclassifierClassifierEStringParserRuleCall_4_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (((name=STRING alias=ID) | name=ID) (comments+=Comment | (comments+=Comment? member+=Member*))?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Manifestation
	 *     Manifestation returns Manifestation
	 *
	 * Constraint:
	 *     (leftclassifier=[Classifier|EString] rightclassifier=[Classifier|EString])
	 */
	protected void sequence_Manifestation(ISerializationContext context, Manifestation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getManifestationAccess().getLeftclassifierClassifierEStringParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false));
		feeder.accept(grammarAccess.getManifestationAccess().getRightclassifierClassifierEStringParserRuleCall_4_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         name=ID 
	 *         (parameters+=Parameter parameters+=Parameter*)* 
	 *         type=[Classifier|FQN]?
	 *     )
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=[Classifier|FQN])
	 */
	protected void sequence_Parameter(ISerializationContext context, de.cooperateproject.modeling.textual.component.metamodel.component.Parameter semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     (visibility=Visibility? name=ID)
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceRelation returns Provide
	 *     Provide returns Provide
	 *
	 * Constraint:
	 *     interface=[Interface|FQN]
	 */
	protected void sequence_Provide(ISerializationContext context, Provide semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getProvideAccess().getInterfaceInterfaceFQNParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceRelation returns Require
	 *     Require returns Require
	 *
	 * Constraint:
	 *     interface=[Interface|FQN]
	 */
	protected void sequence_Require(ISerializationContext context, Require semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getRequireAccess().getInterfaceInterfaceFQNParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RootPackage returns RootPackage
	 *
	 * Constraint:
	 *     (name=FQN classifier+=Classifier* relation+=ClassifierRelation*)
	 */
	protected void sequence_RootPackage(ISerializationContext context, RootPackage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Substitution
	 *     Substitution returns Substitution
	 *
	 * Constraint:
	 *     (leftclassifier=[Classifier|EString] rightclassifier=[Classifier|EString])
	 */
	protected void sequence_Substitution(ISerializationContext context, Substitution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getSubstitutionAccess().getLeftclassifierClassifierEStringParserRuleCall_2_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false));
		feeder.accept(grammarAccess.getSubstitutionAccess().getRightclassifierClassifierEStringParserRuleCall_4_0_1(), semanticObject.eGet(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false));
		feeder.finish();
	}
	
	
}
