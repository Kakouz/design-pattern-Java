package design_patterns.creational.abstract_factory.buttons;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Você criou um botão Windows");
		
	}

}
