package audio.ui.steps;

import audio.ui.pages.SuccessPopup;
import io.cucumber.java.en.And;

public class SuccessPopupSteps {
	SuccessPopup success_popup = new SuccessPopup();
	@And ("^I Verify Common Pool Success Popup (.+),(.+)$")
	public void check_success_popup(String username,String ticker) {
		success_popup.check_common_pool_success_popup(username,ticker);
	}
	@And ("I Close Common Pool Success Popup")
	public void close_success_popup() {
		success_popup.click_close_success_popup_in_common_pool();
	}
}
