package audio.ui.steps.menu;

import audio.ui.pages.menu.ManageMenu;
import io.cucumber.java.en.Then;

public class ManageMenuSteps {
	ManageMenu tools_menu = new ManageMenu();
	@Then ("I Navigate To Manage Job Scheduler")
	public void navigate_to_manage_job_scheduler() {
		tools_menu.navigate_to_manage_job_scheduler();
	}
	@Then ("I Navigate To Manage Job Assignment")
	public void navigate_to_manage_job_assignment() {
		tools_menu.navigate_to_job_assignment();
	}
	@Then ("I Navigate To Manage Shortcut Keys")
	public void navigate_to_manage_shortcut_keys() {
		tools_menu.navigate_to_shortcut_keys();
	}
}
