/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import de.cooperateproject.modeling.textual.cls.ui.inFile.ClsLocationInFileProvider
import org.eclipse.xtext.resource.ILocationInFileProvider
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextEditor
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer
import org.eclipse.xtext.ui.editor.model.edit.DefaultTextEditComposer
import org.eclipse.xtext.resource.SaveOptions
import com.google.inject.Binder
import com.google.inject.name.Names
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter
import de.cooperateproject.modeling.textual.cls.ui.outline.OutlineFlattenFilterAndSorter
import de.cooperateproject.modeling.textual.cls.ui.outline.FlatOutlineViewContribution

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ClsUiModule extends AbstractClsUiModule {

	override bindXtextEditor() {
		return CooperateCDOXtextEditor;
	}

	def Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return ClsLocationInFileProvider;
	}

	def Class<? extends ITextEditComposer> bindITextEditComposer() {
		return ClsTextEditComposer
	}

	def configureToggleOutlineViewContribution(Binder binder) {
		binder.bind(IOutlineContribution).annotatedWith(Names.named("ToggleOutlineView")).to(
			FlatOutlineViewContribution);
	}
	
	def Class<? extends OutlineFilterAndSorter> bindOutlineFilterAndSorter() {
		return OutlineFlattenFilterAndSorter
	}

	public static class ClsTextEditComposer extends DefaultTextEditComposer {

		override SaveOptions getSaveOptions() {
			return SaveOptions.newBuilder.noValidation.options
		}
	}

}
