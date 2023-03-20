package design_patterns.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import design_patterns.behavioral.mediator.mediators.Mediator;
import design_patterns.behavioral.mediator.mediators.Note;

public class AddButton extends JButton implements Component {
	private Mediator mediator;

	public AddButton() {
		super("Add");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.addNewNote(new Note());
	}

	@Override
	public String getName() {
		return "AddButton";
	}
}