/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.language.usecase.ide.contentassist.antlr.internal.InternalUseCaseParser;
import de.cooperateproject.modeling.language.usecase.services.UseCaseGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class UseCaseParser extends AbstractContentAssistParser {

	@Inject
	private UseCaseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUseCaseParser createParser() {
		InternalUseCaseParser result = new InternalUseCaseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommentableAccess().getAlternatives(), "rule__Commentable__Alternatives");
					put(grammarAccess.getActorAccess().getAlternatives_7(), "rule__Actor__Alternatives_7");
					put(grammarAccess.getUseCaseAccess().getAlternatives_1(), "rule__UseCase__Alternatives_1");
					put(grammarAccess.getUseCaseAccess().getAlternatives_4(), "rule__UseCase__Alternatives_4");
					put(grammarAccess.getUseCaseAccess().getAlternatives_4_1_1(), "rule__UseCase__Alternatives_4_1_1");
					put(grammarAccess.getMultiplicityElementAccess().getAlternatives(), "rule__MultiplicityElement__Alternatives");
					put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
					put(grammarAccess.getCommentAccess().getAlternatives(), "rule__Comment__Alternatives");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
					put(grammarAccess.getUMLModelReferenceAccess().getGroup(), "rule__UMLModelReference__Group__0");
					put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
					put(grammarAccess.getTest2Access().getGroup(), "rule__Test2__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_6(), "rule__Actor__Group_6__0");
					put(grammarAccess.getActorAccess().getGroup_7_0(), "rule__Actor__Group_7_0__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup_3(), "rule__UseCase__Group_3__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4_1(), "rule__UseCase__Group_4_1__0");
					put(grammarAccess.getExtensionPointAccess().getGroup(), "rule__ExtensionPoint__Group__0");
					put(grammarAccess.getExtensionAccess().getGroup(), "rule__Extension__Group__0");
					put(grammarAccess.getExtensionAccess().getGroup_7(), "rule__Extension__Group_7__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_5(), "rule__Association__Group_5__0");
					put(grammarAccess.getAssociationAccess().getGroup_11(), "rule__Association__Group_11__0");
					put(grammarAccess.getMultiplicityAccess().getGroup(), "rule__Multiplicity__Group__0");
					put(grammarAccess.getMultiplicityAccess().getGroup_1(), "rule__Multiplicity__Group_1__0");
					put(grammarAccess.getAnnotationDefinitionAccess().getGroup(), "rule__AnnotationDefinition__Group__0");
					put(grammarAccess.getDiagramAccess().getUmlModelAssignment_0(), "rule__Diagram__UmlModelAssignment_0");
					put(grammarAccess.getDiagramAccess().getTestAssignment_1(), "rule__Diagram__TestAssignment_1");
					put(grammarAccess.getDiagramAccess().getTest2Assignment_2(), "rule__Diagram__Test2Assignment_2");
					put(grammarAccess.getDiagramAccess().getActorsAssignment_3(), "rule__Diagram__ActorsAssignment_3");
					put(grammarAccess.getDiagramAccess().getSystemAssignment_4(), "rule__Diagram__SystemAssignment_4");
					put(grammarAccess.getDiagramAccess().getAssociationsAssignment_5(), "rule__Diagram__AssociationsAssignment_5");
					put(grammarAccess.getUMLModelReferenceAccess().getImportURIAssignment_1(), "rule__UMLModelReference__ImportURIAssignment_1");
					put(grammarAccess.getTestAccess().getActorAssignment_1(), "rule__Test__ActorAssignment_1");
					put(grammarAccess.getTest2Access().getActorAssignment_1(), "rule__Test2__ActorAssignment_1");
					put(grammarAccess.getActorAccess().getCommentsAssignment_1(), "rule__Actor__CommentsAssignment_1");
					put(grammarAccess.getActorAccess().getVisibilityAssignment_2(), "rule__Actor__VisibilityAssignment_2");
					put(grammarAccess.getActorAccess().getModifiersAssignment_3(), "rule__Actor__ModifiersAssignment_3");
					put(grammarAccess.getActorAccess().getNameAssignment_5(), "rule__Actor__NameAssignment_5");
					put(grammarAccess.getActorAccess().getBaseActorsAssignment_6_1(), "rule__Actor__BaseActorsAssignment_6_1");
					put(grammarAccess.getSystemAccess().getCommentsAssignment_0(), "rule__System__CommentsAssignment_0");
					put(grammarAccess.getSystemAccess().getNameAssignment_2(), "rule__System__NameAssignment_2");
					put(grammarAccess.getSystemAccess().getUsecasesAssignment_4(), "rule__System__UsecasesAssignment_4");
					put(grammarAccess.getUseCaseAccess().getCommentsAssignment_0(), "rule__UseCase__CommentsAssignment_0");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_2(), "rule__UseCase__NameAssignment_2");
					put(grammarAccess.getUseCaseAccess().getBaseUseCasesAssignment_3_1(), "rule__UseCase__BaseUseCasesAssignment_3_1");
					put(grammarAccess.getUseCaseAccess().getExtensionPointsAssignment_4_1_1_0(), "rule__UseCase__ExtensionPointsAssignment_4_1_1_0");
					put(grammarAccess.getUseCaseAccess().getExtensionsAssignment_4_1_1_1(), "rule__UseCase__ExtensionsAssignment_4_1_1_1");
					put(grammarAccess.getUseCaseAccess().getIncludesAssignment_4_1_1_2(), "rule__UseCase__IncludesAssignment_4_1_1_2");
					put(grammarAccess.getExtensionPointAccess().getCommentsAssignment_0(), "rule__ExtensionPoint__CommentsAssignment_0");
					put(grammarAccess.getExtensionPointAccess().getVisibilityAssignment_1(), "rule__ExtensionPoint__VisibilityAssignment_1");
					put(grammarAccess.getExtensionPointAccess().getModifiersAssignment_2(), "rule__ExtensionPoint__ModifiersAssignment_2");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_4(), "rule__ExtensionPoint__NameAssignment_4");
					put(grammarAccess.getExtensionAccess().getCommentsAssignment_0(), "rule__Extension__CommentsAssignment_0");
					put(grammarAccess.getExtensionAccess().getVisibilityAssignment_1(), "rule__Extension__VisibilityAssignment_1");
					put(grammarAccess.getExtensionAccess().getNameAssignment_3(), "rule__Extension__NameAssignment_3");
					put(grammarAccess.getExtensionAccess().getLocationAssignment_6(), "rule__Extension__LocationAssignment_6");
					put(grammarAccess.getExtensionAccess().getConditionAssignment_7_1(), "rule__Extension__ConditionAssignment_7_1");
					put(grammarAccess.getIncludeAccess().getCommentsAssignment_0(), "rule__Include__CommentsAssignment_0");
					put(grammarAccess.getIncludeAccess().getVisibilityAssignment_1(), "rule__Include__VisibilityAssignment_1");
					put(grammarAccess.getIncludeAccess().getNameAssignment_3(), "rule__Include__NameAssignment_3");
					put(grammarAccess.getIncludeAccess().getAdditionAssignment_4(), "rule__Include__AdditionAssignment_4");
					put(grammarAccess.getConstraintAccess().getLanguageAssignment_0(), "rule__Constraint__LanguageAssignment_0");
					put(grammarAccess.getConstraintAccess().getExpressionAssignment_1(), "rule__Constraint__ExpressionAssignment_1");
					put(grammarAccess.getAssociationAccess().getCommentsAssignment_0(), "rule__Association__CommentsAssignment_0");
					put(grammarAccess.getAssociationAccess().getVisibilityAssignment_1(), "rule__Association__VisibilityAssignment_1");
					put(grammarAccess.getAssociationAccess().getModifiersAssignment_2(), "rule__Association__ModifiersAssignment_2");
					put(grammarAccess.getAssociationAccess().getNameAssignment_4(), "rule__Association__NameAssignment_4");
					put(grammarAccess.getAssociationAccess().getBaseAssociationsAssignment_5_1(), "rule__Association__BaseAssociationsAssignment_5_1");
					put(grammarAccess.getAssociationAccess().getActorMultiplicityAssignment_7(), "rule__Association__ActorMultiplicityAssignment_7");
					put(grammarAccess.getAssociationAccess().getActorAssignment_8(), "rule__Association__ActorAssignment_8");
					put(grammarAccess.getAssociationAccess().getUsecaseMultiplicityAssignment_9(), "rule__Association__UsecaseMultiplicityAssignment_9");
					put(grammarAccess.getAssociationAccess().getUsecaseAssignment_10(), "rule__Association__UsecaseAssignment_10");
					put(grammarAccess.getAssociationAccess().getOwnedRulesAssignment_11_1(), "rule__Association__OwnedRulesAssignment_11_1");
					put(grammarAccess.getMultiplicityAccess().getLowerBoundAssignment_0(), "rule__Multiplicity__LowerBoundAssignment_0");
					put(grammarAccess.getMultiplicityAccess().getUpperBoundAssignment_1_1(), "rule__Multiplicity__UpperBoundAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalUseCaseParser typedParser = (InternalUseCaseParser) parser;
			typedParser.entryRuleDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}

	public UseCaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}