package design_patterns.creational.factory_method.factory;

import design_patterns.creational.factory_method.buttons.Button;
import design_patterns.creational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
