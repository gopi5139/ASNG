package audio.ui.steps;

import audio.ui.pages.ConfirmationPopup;
import io.cucumber.java.en.And;

public class ConfirmationPopupSteps {
	ConfirmationPopup confirmation_popup = new ConfirmationPopup();
	@And ("^I Click Yes In Confirmation Popup In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_yes_in_callRecording_confirmation_popup(String eventDate,String eventTime,String companyName,String timeZone) {
		confirmation_popup.click_yes_in_callRecording_confirmation_popup(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Click Yes In Confirmation Popup In Common Pool (.+),(.+),(.+),(.+)$")
	public void click_yes_in_commonPool_confirmation_popup(String companyName,String eventDate,String eventTime,String timeZone) {
		confirmation_popup.click_yes_in_commonPool_confirmation_popup(companyName,eventDate,eventTime,timeZone);
	}
}
