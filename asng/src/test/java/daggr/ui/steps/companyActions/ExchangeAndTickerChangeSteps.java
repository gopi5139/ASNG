package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.ExchangeAndTickerChangePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ExchangeAndTickerChangeSteps {
	ExchangeAndTickerChangePage exchange_and_ticker_change = new ExchangeAndTickerChangePage();
	@Then ("Select Exchange & Ticker Change")
	public void select_exchange_and_ticker_change(){
		exchange_and_ticker_change.is_exchange_and_ticker_change_selected();
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change Article Url (.+)$")
	public void enter_article_url(String article_url) {
		exchange_and_ticker_change.enter_article_url(article_url);
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change Company Name (.+)$")
	public void enter_company_name(String company_name) {
		exchange_and_ticker_change.enter_company_name(company_name);
	}
	@And ("^Select Mandatory Exchange_and_Ticker_Change Ticker-Exchange (.+)$")
	public void select_ticker_exchange(String ticker_exchange) {
		exchange_and_ticker_change.select_ticker_exchange(ticker_exchange);
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change New Exchange (.+)$")
	public void enter_new_exchange(String new_exchange) {
		exchange_and_ticker_change.enter_new_exchange(new_exchange);
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change New Ticker (.+)$")
	public void enter_new_ticker(String new_ticker) {
		exchange_and_ticker_change.enter_new_ticker(new_ticker);
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change Effective Date (.+)$")
	public void enter_effective_date(String effective_date) {
		exchange_and_ticker_change.enter_effective_date(effective_date);
	}
	@And ("^Enter Mandatory Exchange_and_Ticker_Change Time Zone (.+)$")
	public void enter_time_zone(String time_zone) {
		exchange_and_ticker_change.enter_time_zone(time_zone);
	}
	@And ("Click Exchange_and_Ticker_Change Submit")
	public void click_submit() {
		exchange_and_ticker_change.click_submit();
	}
}
