/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.usecase.formatting2;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;
import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage

class UsecaseFormatter extends AbstractFormatter2 {
	
	@Inject extension UsecaseGrammarAccess

	def dispatch void format(UseCaseDiagram usecasediagram, extension IFormattableDocument document) {
		usecasediagram.regionFor.feature(UsecasePackage.Literals.USE_CASE_DIAGRAM__TITLE).append[newLines = 2]
		format(usecasediagram.getRootPackage(), document);
		usecasediagram.regionFor.keyword(useCaseDiagramAccess.endUcKeyword_3).prepend[newLines = 2]
	}

	def dispatch void format(RootPackage rootpackage, extension IFormattableDocument document) {
		rootpackage.regionFor.assignment(rootPackageAccess.nameAssignment_1).append[newLines = 2] 
		
		for (Actor actor : rootpackage.getActors()) {
			format(actor, document);
			actor.append[newLine]
		}
		rootpackage.actors.last?.append[newLines = 2; priority=2]
		
		for (de.cooperateproject.modeling.textual.usecase.usecase.System systems : rootpackage.getSystems()) {
			format(systems, document);
		}
		rootpackage.systems.last?.append[newLines = 2]
		
		for (Relationship relationship : rootpackage.getRelationships()) {
			format(relationship, document);
			relationship.append[newLine]
		}
		rootpackage.relationships.last?.append[newLines = 2; priority=2]
	}

	def dispatch void format(de.cooperateproject.modeling.textual.usecase.usecase.System system, extension IFormattableDocument document) {
		interior(
			system.regionFor.keyword(systemAccess.leftCurlyBracketKeyword_2).append[newLine],
			system.regionFor.keyword(systemAccess.rightCurlyBracketKeyword_4),
			[indent]
		)
		for (UseCase usecases : system.getUsecases()) {
			format(usecases, document);
		}
		if (system.usecases.isEmpty) {
			system.append[newLine; priority = 2]
		} else {
			system.append[newLines = 2; priority = 2]
		}
	}

	def dispatch void format(UseCase usecase, extension IFormattableDocument document) {
		interior(
			usecase.regionFor.keyword(useCaseAccess.leftCurlyBracketKeyword_4_0).append[newLine],
			usecase.regionFor.keyword(useCaseAccess.rightCurlyBracketKeyword_4_2),
			[indent]
		) 
		for (ExtensionPoint extensionPoint : usecase.getExtensionPoints()) {
			format(extensionPoint, document);
			extensionPoint.append[newLine]
		}
		if (usecase.extensionPoints.isEmpty) {
			usecase.append[newLine; priority = 2]
		} else {
			usecase.append[newLines = 2; priority = 2]
		}
	}

	def dispatch void format(Association association, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(association.getActorCardinality(), document);
		format(association.getUseCaseCardinality(), document);
	}
}