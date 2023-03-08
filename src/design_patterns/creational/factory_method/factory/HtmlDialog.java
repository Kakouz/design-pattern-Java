package design_patterns.creational.factory_method.factory;

import design_patterns.creational.factory_method.buttons.Button;
import design_patterns.creational.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
