package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.HeadquartersChangePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HeadquarterChangeSteps {
	HeadquartersChangePage headquarters_change = new HeadquartersChangePage();
	@Then ("Select Headquarters Change")
	public void select_headquarters_change(){
		headquarters_change.is_headquarters_change_selected();
	}
	@And ("^Enter Mandatory Headquarters_Change Article Url (.+)$")
	public void enter_headquarters_change_article_url(String article_url) {
		headquarters_change.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Headquarters_Change Company Name (.+)$")
	public void enter_headquarters_change_company_name(String company_name) {
		headquarters_change.enter_headquarters_change_company_name(company_name);
	}
	@And ("^Enter Mandatory Headquarters_Change New Headquarters (.+)$")
	public void enter_headquarters_change_new_headquarters(String new_headquarters) {
		headquarters_change.enter_headquarters_change_new_headquarters(new_headquarters);
	}
	@And ("^Enter Mandatory Headquarters_Change New State (.+)$")
	public void enter_headquarters_change_new_state(String new_state) {
		headquarters_change.enter_headquarters_change_new_state(new_state);
	}
	@And ("^Enter Mandatory Headquarters_Change New City (.+)$")
	public void enter_headquarters_change_new_city(String new_city) {
		headquarters_change.enter_headquarters_change_new_city(new_city);
	}
	@And ("^Enter Mandatory Headquarters_Change Effective Date (.+)$")
	public void enter_headquarters_change_effective_date(String effective_date) {
		headquarters_change.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Headquarters_Change Time Zone (.+)$")
	public void enter_headquarters_change_time_zone(String time_zone) {
		headquarters_change.enter_time_zone(time_zone);
	}
	@And ("Click Headquarters_Change Submit")
	public void click_submit() {
		headquarters_change.click_submit();
	}
}
