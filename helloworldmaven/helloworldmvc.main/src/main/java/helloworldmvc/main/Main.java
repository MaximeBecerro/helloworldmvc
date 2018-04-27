package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		final Model model = new Model();
		final View view = new View();
		final Controller controller = new Controller(view, model);
		controller.run();
	}

}
