package daggr.ui.steps;

import daggr.ui.pages.SuccessPopup;
import io.cucumber.java.en.Then;

public class SuccessPopupSteps {
	@Then ("Check Success Message")
	public void check_success_message(){
   	 	SuccessPopup success_popup =  new SuccessPopup();
   	 	success_popup.get_success_message();
	}
}
