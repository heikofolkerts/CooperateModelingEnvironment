package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.IDocumentProvider;

/**
 * Document provider that allows reinitializing the document based on a changed root element.
 */
public interface IReinitializingDocumentProvider extends IDocumentProvider {

    /**
     * Reinitializes the document content based on a given root element.
     * 
     * @param document
     *            The document to reinitialize.
     * @param rootElement
     *            The root element that shall be represented in the editor.
     */
    void reinitializeDocumentContent(IDocument document, EObject rootElement);

}
