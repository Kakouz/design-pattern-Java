package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.buttons.Button;
import design_patterns.creational.abstract_factory.checkboxes.CheckBox;

public interface GUIFactory {
	Button criarBotao();
	CheckBox criarCheckbox();
}
