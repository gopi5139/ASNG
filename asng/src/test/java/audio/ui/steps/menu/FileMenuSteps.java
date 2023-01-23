package audio.ui.steps.menu;

import audio.ui.pages.menu.FileMenu;
import io.cucumber.java.en.Then;

public class FileMenuSteps {
	FileMenu file_menu =  new FileMenu();
	@Then ("I Navigate To Get Job")
	public void navigate_to_get_job() {
		file_menu.navigate_to_get_job();
	}
}
