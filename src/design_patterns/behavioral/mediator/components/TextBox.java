package design_patterns.behavioral.mediator.components;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

import design_patterns.behavioral.mediator.mediators.Mediator;

public class TextBox extends JTextArea implements Component {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void processComponentKeyEvent(KeyEvent keyEvent) {
		mediator.markNote();
	}

	@Override
	public String getName() {
		return "TextBox";
	}
}