package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Parameter;

public class ParameterLabel implements SummaryItemLabelHandler{
	private final String classText = "parameter";
	
	public String getText(EObject item){
		Parameter param = (Parameter)item;
		String type = ": " + param.getType().getName();
		return param.getVisibility().getName().toLowerCase() + " " + param.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}


}
