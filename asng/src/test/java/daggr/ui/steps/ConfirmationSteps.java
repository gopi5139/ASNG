package daggr.ui.steps;

import daggr.ui.pages.ConfirmationPopup;
import io.cucumber.java.en.Then;

public class ConfirmationSteps {
	ConfirmationPopup popup = new ConfirmationPopup();
	
	@Then ("Check Confirmation Popup")
	public void check_confirm_popup(){
		popup.verify_confirmation_popup();
	}
	@Then ("Click Confirmation Popup Yes")
	public void click_confirm_popup_yes(){
		popup.click_yes_button();
	}
}
