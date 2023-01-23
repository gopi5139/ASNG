package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.DelistedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DelistedSteps {
	DelistedPage delisted = new DelistedPage();
	@Then ("Select Delisted")
	public void select_delisted(){
		delisted.is_delisted_selected();
	}
	@And ("^Enter Mandatory Delisted Article Url (.+)$")
	public void enter_article_url(String article_url) {
		delisted.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Delisted Company Name (.+)$")
	public void enter_company_name(String company_name) {
		delisted.enter_company_name(company_name);
	}
	@And ("^Select Mandatory Delisted Ticker-Exchange (.+)$")
	public void select_ticker_exchange(String ticker_exchange) {
		delisted.select_ticker_exchange(ticker_exchange);
	}
	@And ("^Select Mandatory Delisted Trading Status (.+)$")
	public void select_trading_status(String trading_status) {
		delisted.select_trading_status(trading_status);
	}
	@And ("^Select Mandatory Delisted Mark Company as Private (.+)$")
	public void select_mark_company_as_private(String mark_company_as_private) {
		delisted.select_mark_company_as_private(mark_company_as_private);
	}
	@And ("^Enter Mandatory Delisted Effective Date (.+)$")
	public void enter_effective_date(String effective_date) {
		delisted.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Delisted Time Zone (.+)$")
	public void enter_time_zone(String time_zone) {
		delisted.enter_time_zone(time_zone);
	}
	@And ("Click Delisted Submit")
	public void click_submit() {
		delisted.click_submit();
	}
}
