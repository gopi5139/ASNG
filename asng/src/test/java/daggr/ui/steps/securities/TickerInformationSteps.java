package daggr.ui.steps.securities;

import daggr.ui.pages.securities.TickerInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TickerInformationSteps {
	TickerInformationPage ticker_information_page = new TickerInformationPage();
	
	@Then ("Select Add Ticker Information")
	public void select_add_ticker_information(){
		ticker_information_page.is_add_ticker_information_selected();
	}
	@Then ("^Enter Mandatory Add Ticker Article Link (.+)$")
	public void enter_tracking_article_url(String article_link){
		ticker_information_page.enter_the_article_url(article_link);
	}
	
	@And ("^Enter Mandatory Add Ticker Company Name (.+)$")
	public void enter_tracking_company_name(String company_name){
		ticker_information_page.enter_company_name(company_name);
	}
	@And ("^Enter Mandatory Add Ticker Value (.+)$")
	public void enter_ticker(String ticker){
		ticker_information_page.enter_ticker(ticker);
	}
	@And ("^Enter Mandatory Add Ticker Exchange (.+)$")
	public void enter_exchange(String exchange){
		ticker_information_page.enter_exchange(exchange);
	}
	@And ("^Select Optional Add Ticker Security Type \"(.*)\"$")
	public void enter_ticker_security_type(String security_type){
		ticker_information_page.select_security_type(security_type);
	}
	@And ("^Select Optional Add Ticker Security Category \"(.*)\"$")
	public void enter_ticker_security_category(String security_category){
		ticker_information_page.select_security_category(security_category);
	}
	@And ("^Select Optional Add Ticker Trading Start Date \"(.*)\"$")
	public void enter_ticker_trading_start_date(String trading_start_date){
		ticker_information_page.select_trading_start_date(trading_start_date);
	}
	@And ("^Select Optional Add Ticker Trading End Date \"(.*)\"$")
	public void enter_ticker_trading_end_date(String trading_end_date){
		ticker_information_page.select_trading_end_date(trading_end_date);
	}
	@And ("^Select Mandatory Add Ticker Trading Status (.+)$")
	public void enter_trading_status(String trading_status){
		ticker_information_page.select_trading_status(trading_status);
	}
	@And ("^Select Mandatory Add Ticker Primary Ticker (.+)$")
	public void enter_primary_ticker(String primary_ticker){
		ticker_information_page.select_primary_ticker(primary_ticker);
	}
	@And ("Click Ticker Submit")
	public void click_submit(){
		ticker_information_page.click_submit_button();
	}
}
