package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.ui.Player;

public abstract class State {
	Player player;

	State(Player player) {
		this.player = player;
	}

	public abstract String onLock();

	public abstract String onPlay();

	public abstract String onNext();

	public abstract String onPrevious();
}
