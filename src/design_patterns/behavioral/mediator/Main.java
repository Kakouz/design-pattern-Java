package design_patterns.behavioral.mediator;

import javax.swing.DefaultListModel;

import design_patterns.behavioral.mediator.components.AddButton;
import design_patterns.behavioral.mediator.components.DeleteButton;
import design_patterns.behavioral.mediator.components.Filter;
import design_patterns.behavioral.mediator.components.List;
import design_patterns.behavioral.mediator.components.SaveButton;
import design_patterns.behavioral.mediator.components.TextBox;
import design_patterns.behavioral.mediator.components.Title;
import design_patterns.behavioral.mediator.mediators.Editor;
import design_patterns.behavioral.mediator.mediators.Mediator;

public class Main {
	public static void main(String[] args) {
		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}
}
