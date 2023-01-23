package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.AcquisitionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AcquisitionSteps {
	AcquisitionPage acquisition = new AcquisitionPage();
	@Then ("Select Acquisition")
	public void select_acquisition(){
		acquisition.is_acquisition_selected();
	}
	@And ("^Enter Mandatory Acquisition Article Url (.+)$")
	public void enter_acquisition_article_url(String article_url) {
		acquisition.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Acquisition Acquirer Company Name (.+)$")
	public void enter_acquisition_acquirer_company_name(String acquirer_company_name) {
		acquisition.enter_acquirer_company_name(acquirer_company_name);
	}
	@And ("^Enter Mandatory Acquisition Target Company Name (.+)$")
	public void enter_acquisition_target_company_name(String target_company_name) {
		acquisition.enter_target_company_name(target_company_name);
	}
	@And ("^Enter Mandatory Acquisition Effective Date (.+)$")
	public void enter_acquisition_effective_date(String effective_date) {
		acquisition.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Acquistion Time Zone (.+)$")
	public void enter_acquisition_time_zone(String time_zone) {
		acquisition.enter_time_zone(time_zone);
	}
	@And ("^Select Optional Company Name Changed Post Acquisition \"(.*)\"$")
	public void select_acquisition_company_name_changed_post_acquisition(String company_name_changed_post_acquisition){
		acquisition.select_company_name_changed_post_acquisition(company_name_changed_post_acquisition);
	}
	@And ("^Enter Mandatory/Optional New Company Name \"(.*)\"$")
	public void enter_acquisition_new_company_name(String new_company_name) {
		acquisition.enter_new_company_name(new_company_name);
	}
	@And ("Click Acquisition Submit")
	public void click_submit() {
		acquisition.click_submit();
	}
}
