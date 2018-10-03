package org.itstep.controller;

import org.itstep.model.Model;
import org.itstep.view.View;

public class Controller {

	View view;
	Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	public Controller() {
		super();
	}

	public void getElementOfArray() {
		view.getMessageInArray(view.NumberInArray, model.getNumber());
		if (model.getIndexArray().length != 0) {
			
			view.getMessageInArrayIndex(view.IndexInArray, model.getStringIndex(model.getIndexArray()));
		} else {
			view.getMessageNotArray(view.NotNumberInArray);
		}

	}

}
