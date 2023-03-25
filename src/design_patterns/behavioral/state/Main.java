package design_patterns.behavioral.state;

import design_patterns.behavioral.state.ui.Player;
import design_patterns.behavioral.state.ui.UI;

public class Main {

	public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
	}

}
