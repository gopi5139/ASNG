package audio.ui.steps.menu;

import audio.ui.pages.callRecording.CallRecordingPage;
import audio.ui.pages.commonPool.CommonPoolPage;
import audio.ui.pages.jobStatus.JobStatusPage;
import audio.ui.pages.menu.ViewMenu;
import io.cucumber.java.en.Then;

public class ViewMenuSteps {
	ViewMenu edit_menu = new ViewMenu();
	CallRecordingPage call_recording_page = new CallRecordingPage();
	CommonPoolPage common_pool_page = new CommonPoolPage();
	JobStatusPage job_status_page = new JobStatusPage();

	@Then("I Navigate To Common Pool Page")
	public void navigate_to_common_pool() {
		edit_menu.navigate_to_common_pool();
		common_pool_page.verify_default_elements();
	}

	@Then("I Navigate To Call Recording Page")
	public void navigate_to_call_recording() {
		edit_menu.navigate_to_call_recording();
		call_recording_page.verify_default_elements();
	}

	@Then("I Navigate To Audio Events Page")
	public void navigate_to_audio_events() {
		edit_menu.navigate_to_audio_events();
	}

	@Then("I Navigate To Audio List Page")
	public void navigate_to_audio_list() {
		edit_menu.navigate_to_audio_list();
	}

	@Then("I Navigate To Job Status Page")
	public void navigate_to_job_status() {
		edit_menu.navigate_to_job_status();
		job_status_page.verify_default_elements();
	}
}
