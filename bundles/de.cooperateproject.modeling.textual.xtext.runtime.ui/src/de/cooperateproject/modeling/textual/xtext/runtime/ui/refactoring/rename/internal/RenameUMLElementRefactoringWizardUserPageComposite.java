package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Strings;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.Activator;

/**
 * Composite that contains the controls to ask for a new name.
 */
public class RenameUMLElementRefactoringWizardUserPageComposite extends Composite {
    private final IObservableValue<String> newName;
    private Text textNewName;

    /**
     * Creates the composite.
     * 
     * @param parent
     *            The parent composite.
     * @param style
     *            The SWT style.
     * @param newNameDTO
     *            The object that receives the chosen new name.
     */
    public RenameUMLElementRefactoringWizardUserPageComposite(Composite parent, int style, IObservableValue<String> newNameDTO) {
        super(parent, style);
        this.newName = newNameDTO;
        setLayout(new GridLayout(2, false));

        Label lblNewName = new Label(this, SWT.NONE);
        lblNewName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblNewName.setText("New Name");

        textNewName = new Text(this, SWT.BORDER);
        textNewName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        initCustomDataBindings();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    private void initCustomDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();

        IObservableValue<?> observedNewName = WidgetProperties.text(SWT.Modify).observe(textNewName);

        UpdateValueStrategy strategyAtomicModelNameTargetToModel = new UpdateValueStrategy();
        strategyAtomicModelNameTargetToModel
                .setAfterGetValidator(RenameUMLElementRefactoringWizardUserPageComposite::newNameIsValid);
        bindingContext.bindValue(observedNewName, newName, strategyAtomicModelNameTargetToModel,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
    }

    private static IStatus newNameIsValid(Object newName) {
        if (!(newName instanceof String)) {
            return new Status(IStatus.ERROR, Activator.getInstance().getBundle().getSymbolicName(),
                    "The new name must be a string.");
        }
        if (Strings.isNullOrEmpty((String) newName)) {
            return new Status(IStatus.ERROR, Activator.getInstance().getBundle().getSymbolicName(),
                    "The new name must not be empty.");
        }
        return Status.OK_STATUS;
    }
}
