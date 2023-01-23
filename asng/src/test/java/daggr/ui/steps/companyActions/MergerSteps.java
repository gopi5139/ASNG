package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.MergerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MergerSteps {
	MergerPage merger = new MergerPage();
	@Then ("Select Merger")
	public void select_acquisition(){
		merger.is_acquisition_selected();
	}
	@And ("^Enter Mandatory Merger Article Url (.+)$")
	public void enter_acquisition_article_url(String article_url) {
		merger.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Merger Company Name_1 (.+)$")
	public void enter_merger_company_name_1(String company_name_1) {
		merger.enter_merged_company_name_1(company_name_1);
	}
	@And ("^Enter Mandatory Merger Company Name_2 (.+)$")
	public void enter_merger_company_name_2(String company_name_2) {
		merger.enter_merged_company_name_2(company_name_2);
	}
	@And ("^Add Merger Company (.+)$")
	public void add_merger_company(String add_company) {
		merger.add_merger_company(add_company);
	}
	@And ("^Enter Mandatory Merger Effective Date (.+)$")
	public void enter_merger_effective_date(String effective_date) {
		merger.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Merger Time Zone (.+)$")
	public void enter_merger_time_zone(String time_zone) {
		merger.enter_time_zone(time_zone);
	}
	@And ("^Enter Mandatory Merger Merged Company Name (.+)$")
	public void enter_merger_merged_company_name(String merged_company_name) {
		merger.enter_merged_company_name(merged_company_name);
	}
	@And ("Click Merger Submit")
	public void click_submit() {
		merger.click_submit();
	}
}
