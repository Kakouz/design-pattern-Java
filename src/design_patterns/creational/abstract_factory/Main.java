package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.factories.GUIFactory;
import design_patterns.creational.abstract_factory.factories.MacOSFactory;
import design_patterns.creational.abstract_factory.factories.WindowsFactory;

public class Main {

	private static Aplicacao configurarApp() {
		Aplicacao app;
		GUIFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();

		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}

		app = new Aplicacao(factory);
		return app;
	}

	public static void main(String[] args) {
		Aplicacao app = configurarApp();
		app.paint();
	}
}
