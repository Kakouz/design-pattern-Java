package design_patterns.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import design_patterns.behavioral.mediator.mediators.Mediator;

public class SaveButton extends JButton implements Component {
	private Mediator mediator;

	public SaveButton() {
		super("Save");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.saveChanges();
	}

	@Override
	public String getName() {
		return "SaveButton";
	}
}