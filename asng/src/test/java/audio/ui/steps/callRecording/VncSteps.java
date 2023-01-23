package audio.ui.steps.callRecording;

import audio.ui.pages.callRecording.VncPage;
import io.cucumber.java.en.And;

public class VncSteps {
	VncPage vnc_page = new VncPage();
	@And ("I Click Connect In VNC")
	public void click_connect_button() {
		vnc_page.click_connect_button();
	}
	@And ("I Switch Tab")
	public void switch_tab() {
		vnc_page.switch_tab();
	}
}
