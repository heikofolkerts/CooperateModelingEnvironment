/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.formatting2

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram
import de.cooperateproject.modeling.textual.cmp.cmp.Classifier
import de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation
import de.cooperateproject.modeling.textual.cmp.cmp.RootPackage
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage
import de.cooperateproject.modeling.textual.cmp.cmp.Component
import de.cooperateproject.modeling.textual.cmp.cmp.Attribute
import de.cooperateproject.modeling.textual.cmp.cmp.Method
import de.cooperateproject.modeling.textual.cmp.cmp.Parameter
import de.cooperateproject.modeling.textual.cmp.cmp.Interface
import de.cooperateproject.modeling.textual.cmp.cmp.Member
import de.cooperateproject.modeling.textual.cmp.cmp.PortRelation
import de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentGrammarAccess

	def dispatch void format(ComponentDiagram componentDiagram, extension IFormattableDocument document) {
		componentDiagram.regionFor.feature(CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE).append[newLines = 2]
		componentDiagram.getRootpackage.format;
		componentDiagram.regionFor.keyword(componentDiagramAccess.endCpdKeyword_4).prepend[newLines = 2 priority = 1]
	}

	def dispatch void format(RootPackage rootPackage, extension IFormattableDocument document) {
		for (ClassifierRelation elementRelation : rootPackage.getRelations()) {
			elementRelation.format;
		}
		for (Classifier elementContent : rootPackage.getClassifiers()) {
			elementContent.format;
		}
		rootPackage.regionFor.assignment(rootPackageAccess.nameAssignment_2).append[newLines = 2]

	}
		 
	
	def dispatch void format(ClassifierRelation clr, extension IFormattableDocument document) {
	clr.append[newLine]
	}
	
	def dispatch void format(Component cmp, extension IFormattableDocument document) {
		interior(			
			cmp.regionFor.keyword(componentAccess.leftCurlyBracketKeyword_3_1_0).append[newLine],
			cmp.regionFor.keyword(componentAccess.rightCurlyBracketKeyword_3_1_2).append[newLine].prepend[newLines = 1 priority = 4],
			[indent]
		)
		for(Component component: cmp.getComponent()){
			component.format();
		}
		for(Interface iface: cmp.getNestedInterface()){
			iface.format();
		}
		for(PortRelation portRel: cmp.getPortRelation){
			portRel.append[newLine]
		}
		for(InterfaceRelation portRel: cmp.getInterfaceRelation()){
			portRel.append[newLine]
		}
	}
	
	def dispatch void format(Interface iface, extension IFormattableDocument document) {
		interior(
			iface.regionFor.keyword(interfaceAccess.leftCurlyBracketKeyword_3_1_0).append[newLine],
			iface.regionFor.keyword(interfaceAccess.rightCurlyBracketKeyword_3_1_3),
			[indent]
		)
		
		for (Member members : iface.getMembers()) {
			format(members, document);
		}
		iface.append[newLine; priority = 2]
	}
	
	def dispatch void format(Attribute attribute, extension IFormattableDocument document) {
		format(attribute.getType(), document);
		attribute.append[newLine]
	}

	def dispatch void format(Method method, extension IFormattableDocument document) {
		for (Parameter parameters : method.getParameters()) {
			format(parameters, document);
		}
		format(method.getType(), document);
		method.append[newLine]
	}

	def dispatch void format(Parameter parameter, extension IFormattableDocument document) {
		format(parameter.getType(), document);
	}

}