package design_patterns.creational.factory_method;

import design_patterns.creational.factory_method.factory.Dialog;
import design_patterns.creational.factory_method.factory.HtmlDialog;
import design_patterns.creational.factory_method.factory.WindowsDialog;

public class Main {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		
		configure();
		runBusinessLogic();

	}

	static void configure() {
		if (System.getProperty("os.name").equals("Linux")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	static void runBusinessLogic() {
		dialog.renderWindow();
	}

}
