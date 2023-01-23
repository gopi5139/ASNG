package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.CompanyNameChangePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyNameChangeSteps {
	CompanyNameChangePage company_name_change = new CompanyNameChangePage();
	@Then ("Select Company Name Change")
	public void select_company_name_change(){
		company_name_change.is_company_name_change_selected();
	}
	@And ("^Enter Mandatory Company_Name_Change Article Url (.+)$")
	public void enter_article_url(String article_url) {
		company_name_change.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Company_Name_Change Company Name (.+)$")
	public void enter_company_name(String company_name) {
		company_name_change.enter_company_name(company_name);
	}
	@And ("^Enter Mandatory Company_Name_Change New Company Name (.+)$")
	public void enter_new_company_name(String new_company_name) {
		company_name_change.enter_new_company_name(new_company_name);
	}
	@And ("^Enter Mandatory Company_Name_Change Effective Date (.+)$")
	public void enter_effective_date(String effective_date) {
		company_name_change.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Company_Name_Change Time Zone (.+)$")
	public void enter_time_zone(String time_zone) {
		company_name_change.enter_time_zone(time_zone);
	}
	@And ("Click Company_Name_Change Submit")
	public void click_submit() {
		company_name_change.click_submit();
	}
}
