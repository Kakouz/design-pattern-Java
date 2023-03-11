package design_patterns.creational.abstract_factory.checkboxes;

public class WindowsCheckbox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("Você criou um Checkbox Windows!");
		
	}

}
