package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.LiquidationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LiquidationSteps {
	LiquidationPage liquidation = new LiquidationPage();
	@Then ("Select Liquidation")
	public void select_liquidation(){
		liquidation.is_liquidation_selected();
	}
	@And ("^Enter Mandatory Liquidation Article Url (.+)$")
	public void enter_article_url(String article_url) {
		liquidation.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Liquidation Company Name (.+)$")
	public void enter_company_name(String company_name) {
		liquidation.enter_company_name(company_name);
	}
	@And ("^Enter Mandatory Liquidation Effective Date (.+)$")
	public void enter_effective_date(String effective_date) {
		liquidation.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Liquidation Time Zone (.+)$")
	public void enter_time_zone(String time_zone) {
		liquidation.enter_time_zone(time_zone);
	}
	@And ("Click Liquidation Submit")
	public void click_submit() {
		liquidation.click_submit();
	}
}
