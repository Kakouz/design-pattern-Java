package design_patterns.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import design_patterns.behavioral.mediator.mediators.Mediator;

public class DeleteButton extends JButton implements Component
{
	private Mediator mediator;

	public DeleteButton() {
		super("Del");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.deleteNote();
	}

	@Override
	public String getName() {
		return "DelButton";
	}
}