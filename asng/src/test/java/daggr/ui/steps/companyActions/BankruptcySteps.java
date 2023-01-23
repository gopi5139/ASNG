package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.BankruptcyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BankruptcySteps {
	BankruptcyPage bankruptcy = new BankruptcyPage();
	@Then ("Select Bankruptcy")
	public void select_bankruptcy(){
		bankruptcy.is_bankruptcy_selected();
	}
	@And ("^Enter Mandatory Bankruptcy Article Url (.+)$")
	public void enter_article_url(String article_url) {
		bankruptcy.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Bankruptcy Company Name (.+)$")
	public void enter_company_name(String company_name) {
		bankruptcy.enter_company_name(company_name);
	}
	@And ("^Select Mandatory Bankruptcy Type (.+)$")
	public void select_bankruptcy_type(String bankruptcy_type) {
		bankruptcy.select_bankruptcy_type(bankruptcy_type);
	}
	@And ("^Enter Mandatory Bankruptcy Effective Date (.+)$")
	public void enter_effective_date(String effective_date) {
		bankruptcy.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Bankruptcy Time Zone (.+)$")
	public void enter_time_zone(String time_zone) {
		bankruptcy.enter_time_zone(time_zone);
	}
	@And ("Click Bankruptcy Submit")
	public void click_submit() {
		bankruptcy.click_submit();
	}
}
