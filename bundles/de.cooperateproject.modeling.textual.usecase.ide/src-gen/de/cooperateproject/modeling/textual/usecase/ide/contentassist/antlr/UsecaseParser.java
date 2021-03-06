/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.usecase.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.usecase.ide.contentassist.antlr.internal.InternalUsecaseParser;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UsecaseParser extends AbstractContentAssistParser {

	@Inject
	private UsecaseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUsecaseParser createParser() {
		InternalUsecaseParser result = new InternalUsecaseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActorAccess().getAlternatives_3(), "rule__Actor__Alternatives_3");
					put(grammarAccess.getSystemAccess().getAlternatives_2(), "rule__System__Alternatives_2");
					put(grammarAccess.getUseCaseAccess().getAlternatives_3(), "rule__UseCase__Alternatives_3");
					put(grammarAccess.getUseCaseAccess().getAlternatives_4(), "rule__UseCase__Alternatives_4");
					put(grammarAccess.getExtensionPointAccess().getAlternatives_1(), "rule__ExtensionPoint__Alternatives_1");
					put(grammarAccess.getRelationshipAccess().getAlternatives(), "rule__Relationship__Alternatives");
					put(grammarAccess.getCardinalityBoundAccess().getAlternatives(), "rule__CardinalityBound__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getActorTypeAccess().getAlternatives(), "rule__ActorType__Alternatives");
					put(grammarAccess.getUseCaseDiagramAccess().getGroup(), "rule__UseCaseDiagram__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup(), "rule__RootPackage__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_3_1(), "rule__Actor__Group_3_1__0");
					put(grammarAccess.getActorAccess().getGroup_4(), "rule__Actor__Group_4__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getSystemAccess().getGroup_2_1(), "rule__System__Group_2_1__0");
					put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup_3_1(), "rule__UseCase__Group_3_1__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4_1(), "rule__UseCase__Group_4_1__0");
					put(grammarAccess.getExtensionPointAccess().getGroup(), "rule__ExtensionPoint__Group__0");
					put(grammarAccess.getExtensionPointAccess().getGroup_1_1(), "rule__ExtensionPoint__Group_1_1__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_6(), "rule__Association__Group_6__0");
					put(grammarAccess.getAssociationAccess().getGroup_6_3(), "rule__Association__Group_6_3__0");
					put(grammarAccess.getGeneralizationAccess().getGroup(), "rule__Generalization__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
					put(grammarAccess.getExtendAccess().getGroup_10(), "rule__Extend__Group_10__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup_1(), "rule__Cardinality__Group_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getUseCaseDiagramAccess().getTitleAssignment_2(), "rule__UseCaseDiagram__TitleAssignment_2");
					put(grammarAccess.getUseCaseDiagramAccess().getRootPackageAssignment_3(), "rule__UseCaseDiagram__RootPackageAssignment_3");
					put(grammarAccess.getRootPackageAccess().getNameAssignment_1(), "rule__RootPackage__NameAssignment_1");
					put(grammarAccess.getRootPackageAccess().getActorsAssignment_2(), "rule__RootPackage__ActorsAssignment_2");
					put(grammarAccess.getRootPackageAccess().getSystemsAssignment_3(), "rule__RootPackage__SystemsAssignment_3");
					put(grammarAccess.getRootPackageAccess().getRelationshipsAssignment_4(), "rule__RootPackage__RelationshipsAssignment_4");
					put(grammarAccess.getActorAccess().getVisibilityAssignment_0(), "rule__Actor__VisibilityAssignment_0");
					put(grammarAccess.getActorAccess().getAbstractAssignment_1(), "rule__Actor__AbstractAssignment_1");
					put(grammarAccess.getActorAccess().getNameAssignment_3_0(), "rule__Actor__NameAssignment_3_0");
					put(grammarAccess.getActorAccess().getNameAssignment_3_1_0(), "rule__Actor__NameAssignment_3_1_0");
					put(grammarAccess.getActorAccess().getAliasAssignment_3_1_2(), "rule__Actor__AliasAssignment_3_1_2");
					put(grammarAccess.getActorAccess().getTypeAssignment_4_2(), "rule__Actor__TypeAssignment_4_2");
					put(grammarAccess.getActorAccess().getCommentsAssignment_5(), "rule__Actor__CommentsAssignment_5");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getCommentsAssignment_2_0(), "rule__System__CommentsAssignment_2_0");
					put(grammarAccess.getSystemAccess().getCommentsAssignment_2_1_1(), "rule__System__CommentsAssignment_2_1_1");
					put(grammarAccess.getSystemAccess().getUsecasesAssignment_2_1_2(), "rule__System__UsecasesAssignment_2_1_2");
					put(grammarAccess.getUseCaseAccess().getVisibilityAssignment_0(), "rule__UseCase__VisibilityAssignment_0");
					put(grammarAccess.getUseCaseAccess().getAbstractAssignment_1(), "rule__UseCase__AbstractAssignment_1");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_3_0(), "rule__UseCase__NameAssignment_3_0");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_3_1_0(), "rule__UseCase__NameAssignment_3_1_0");
					put(grammarAccess.getUseCaseAccess().getAliasAssignment_3_1_2(), "rule__UseCase__AliasAssignment_3_1_2");
					put(grammarAccess.getUseCaseAccess().getCommentsAssignment_4_0(), "rule__UseCase__CommentsAssignment_4_0");
					put(grammarAccess.getUseCaseAccess().getCommentsAssignment_4_1_1(), "rule__UseCase__CommentsAssignment_4_1_1");
					put(grammarAccess.getUseCaseAccess().getExtensionPointsAssignment_4_1_2(), "rule__UseCase__ExtensionPointsAssignment_4_1_2");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_1_0(), "rule__ExtensionPoint__NameAssignment_1_0");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_1_1_0(), "rule__ExtensionPoint__NameAssignment_1_1_0");
					put(grammarAccess.getExtensionPointAccess().getAliasAssignment_1_1_2(), "rule__ExtensionPoint__AliasAssignment_1_1_2");
					put(grammarAccess.getAssociationAccess().getActorAssignment_2(), "rule__Association__ActorAssignment_2");
					put(grammarAccess.getAssociationAccess().getUsecaseAssignment_4(), "rule__Association__UsecaseAssignment_4");
					put(grammarAccess.getAssociationAccess().getActorCardinalityAssignment_6_2(), "rule__Association__ActorCardinalityAssignment_6_2");
					put(grammarAccess.getAssociationAccess().getUseCaseCardinalityAssignment_6_3_1(), "rule__Association__UseCaseCardinalityAssignment_6_3_1");
					put(grammarAccess.getGeneralizationAccess().getSpecificAssignment_2(), "rule__Generalization__SpecificAssignment_2");
					put(grammarAccess.getGeneralizationAccess().getGeneralAssignment_4(), "rule__Generalization__GeneralAssignment_4");
					put(grammarAccess.getIncludeAccess().getIncludingCaseAssignment_2(), "rule__Include__IncludingCaseAssignment_2");
					put(grammarAccess.getIncludeAccess().getAdditionAssignment_4(), "rule__Include__AdditionAssignment_4");
					put(grammarAccess.getExtendAccess().getExtensionAssignment_2(), "rule__Extend__ExtensionAssignment_2");
					put(grammarAccess.getExtendAccess().getExtendedCaseAssignment_4(), "rule__Extend__ExtendedCaseAssignment_4");
					put(grammarAccess.getExtendAccess().getExtensionLocationAssignment_8(), "rule__Extend__ExtensionLocationAssignment_8");
					put(grammarAccess.getExtendAccess().getConditionAssignment_10_2(), "rule__Extend__ConditionAssignment_10_2");
					put(grammarAccess.getCommentAccess().getBodyAssignment_1(), "rule__Comment__BodyAssignment_1");
					put(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0(), "rule__Cardinality__LowerBoundAssignment_0");
					put(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1(), "rule__Cardinality__UpperBoundAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UsecaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UsecaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
