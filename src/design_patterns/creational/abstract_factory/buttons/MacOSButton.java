package design_patterns.creational.abstract_factory.buttons;

public class MacOSButton implements Button {

	@Override
	public void paint() {
		System.out.println("Você criou um botão do MacOS!");
		
	}

}
