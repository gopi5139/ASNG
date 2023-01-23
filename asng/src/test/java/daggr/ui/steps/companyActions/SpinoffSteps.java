package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.SpinoffPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SpinoffSteps {
	SpinoffPage spinoff = new SpinoffPage();
	@Then ("Select Spinoff")
	public void select_acquisition(){
		spinoff.is_spinoff_selected();
	}
	@And ("^Enter Mandatory Spinoff Article Url (.+)$")
	public void enter_spinoff_article_url(String article_url) {
		spinoff.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Spinoff Parent Company Name (.+)$")
	public void enter_spinoff_parent_company_name(String parent_company_name) {
		spinoff.enter_spinoff_parent_company_name(parent_company_name);
	}
	@And ("^Enter Mandatory Spinoff Spin-off Company Name (.+)$")
	public void enter_spinoff_company_name(String spin_off_company_name) {
		spinoff.enter_spinoff_company_name(spin_off_company_name);
	}
	@And ("^Add Spinoff Company (.+)$")
	public void add_spinoff_company(String add_company) {
		spinoff.add_spinoff_company(add_company);
	}
	@And ("^Enter Mandatory Spinoff Effective Date (.+)$")
	public void enter_spinoff_effective_date(String effective_date) {
		spinoff.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Spinoff Time Zone (.+)$")
	public void enter_spinoff_time_zone(String time_zone) {
		spinoff.enter_time_zone(time_zone);
	}
	@And ("Click Spinoff Submit")
	public void click_submit() {
		spinoff.click_submit();
	}
}
