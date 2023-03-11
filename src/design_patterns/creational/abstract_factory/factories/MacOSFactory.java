package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.buttons.Button;
import design_patterns.creational.abstract_factory.buttons.MacOSButton;
import design_patterns.creational.abstract_factory.checkboxes.CheckBox;
import design_patterns.creational.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button criarBotao() {
		return new MacOSButton();
	}

	@Override
	public CheckBox criarCheckbox() {
		return new MacOSCheckbox();
	}

}
