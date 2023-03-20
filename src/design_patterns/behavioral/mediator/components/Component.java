package design_patterns.behavioral.mediator.components;

import design_patterns.behavioral.mediator.mediators.Mediator;

public interface Component {
	void setMediator(Mediator mediator);

	String getName();
}
