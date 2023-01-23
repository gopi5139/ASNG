package audio.ui.steps;

import audio.ui.pages.Header;
import io.cucumber.java.en.Then;

public class Header_Steps {
	@Then ("^I Verify Audio Service Navbar (.+),(.+)$")
	public void verify_nav_bar_items(String userName, String operatorType) {
		Header headerbar = new Header();
		headerbar.verify_default_elements(userName, operatorType);
	}
}
