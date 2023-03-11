package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.buttons.Button;
import design_patterns.creational.abstract_factory.checkboxes.CheckBox;
import design_patterns.creational.abstract_factory.factories.GUIFactory;

public class Aplicacao {

		private Button botao;
		private CheckBox checkbox;

		public Aplicacao(GUIFactory factory) {
			botao = factory.criarBotao();
			checkbox = factory.criarCheckbox();
		}
		
		public void paint() {
			botao.paint();
			checkbox.paint();
		}
	}


