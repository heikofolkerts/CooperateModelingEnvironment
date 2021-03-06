package de.cooperateproject.modeling.transformation.usecase.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

public class TextualToGraphicalUseCaseTraceTest extends UsecaseDirectionalTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(TestEnvironmentConstants.PLUGIN_ID,
            "Textual_to_Graphical_for_UseCase.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(TestEnvironmentConstants.PLUGIN_ID,
            "Graphical_to_Textual_for_UseCase.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(TestEnvironmentConstants.PLUGIN_ID,
            "Textual_to_Graphical_for_UseCase_Trace.qvto");

    static {
        UsecasePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalUseCaseTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testDefault() throws Exception {
        testTraceTransformation("UseCaseDiagram");
    }

    @Test
    public void testNotes() throws Exception {
        testTraceTransformation("UseCaseDiagramNotes");
    }
}
