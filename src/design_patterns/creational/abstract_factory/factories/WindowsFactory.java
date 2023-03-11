package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.buttons.Button;
import design_patterns.creational.abstract_factory.buttons.WindowsButton;
import design_patterns.creational.abstract_factory.checkboxes.CheckBox;
import design_patterns.creational.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button criarBotao() {
		return new WindowsButton();
	}

	@Override
	public CheckBox criarCheckbox() {
		return new WindowsCheckbox();
	}

}
