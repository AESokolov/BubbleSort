package org.itstep;

import org.itstep.controller.Controller;
import org.itstep.model.Model;
import org.itstep.view.View;

public class AppRunnerArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 6, 9};
		Model model = new Model(6, array);
		View view = new View();
		Controller controller = new Controller(view, model);

		controller.getElementOfArray();
	}
}
