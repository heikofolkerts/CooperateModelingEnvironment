package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Member
import org.eclipse.uml2.uml.Feature

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsMemberStaticQualifierFactory extends ClsAutomatedIssueResolutionFactoryBase<Member<? extends Feature>> {
	
	public static val ISSUE_CODE = "staticModifierMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], Member as Class<?> as Class<Member<? extends Feature>>)
	}
	
	private static def isResolvable(Member<? extends Feature> element) {
		return element.hasReferencedElement
	}
	
	override protected createInternal(Member<? extends Feature> element) {
		return new ClsMemberStaticQualifierResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(Member<? extends Feature> element) {
		return "The staticness of the element is different to the staticness used in UML."
	}
	
	override protected getIssueFeatureInternal(Member<? extends Feature> element) {
	    new IssueLocator(ClsPackage.Literals.MEMBER__STATIC, element)
	}
	
	override protected getResolutionNameInternal(Member<? extends Feature> element) {
		return "Set static modifier to modifier in UML to the modifier currently used."
	}
	
	override protected hasIssueInternal(Member<? extends Feature> element) {
		if (element.hasReferencedElementOfType(Feature)) {
			val umlStatic = (element.referencedElement as Feature).static
			val clsAttributeStatic = element.static
			return umlStatic != clsAttributeStatic
		}
		return false
	}
	
}