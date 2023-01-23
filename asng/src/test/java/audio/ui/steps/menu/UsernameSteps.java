package audio.ui.steps.menu;

import audio.ui.pages.menu.UsernameMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UsernameSteps {
	UsernameMenu username_mewnu = new UsernameMenu();
	@Then ("I Navigate To Dashboard")
	public void navigate_to_dashboard() {
		username_mewnu.navigate_to_dashboard();
	}
	@Then ("I Navigate To Font")
	public void navigate_to_font() {
		username_mewnu.navigate_to_font();
	}
	@And ("I Click Audio Service Log Out")
	public void navigate_to_logout() {
		username_mewnu.navigate_to_logout();
	}
}
