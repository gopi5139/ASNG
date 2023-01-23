package daggr.ui.steps.securities;

import daggr.ui.pages.securities.SecuritiesListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SecuritiesListSteps {
	SecuritiesListPage securities_list_page = new SecuritiesListPage();
	
	@Then ("^Search By Securities Company Name (.+)$")
	public void search_by_securities_company_name(String company_name){
		securities_list_page.search_by_company_name(company_name);
	}
	
	@Then ("^Click Popup on Created Secuirty (.+),(.+)$")
	public void check_created_ticker_displayed_in_list(String ticker,String exchange){
		securities_list_page.click_popup(ticker, exchange);
	}
	
	@And ("^Check Securities Company Name (.+)$")
	public void check_company_name(String company_name){
		securities_list_page.check_company_name(company_name);
	}
	
	@And ("^Check Securities Ticker (.+)$")
	public void check_ticker(String ticker){
		securities_list_page.check_ticker(ticker);
	}
	
	@And ("^Check Securities Exchange (.+)$")
	public void check_exchange(String exchange){
		securities_list_page.check_exchange(exchange);
	}
	
	@And ("^Check Securities Security Type \"(.*)\"$")
	public void check_security_type(String security_type){
		securities_list_page.check_security_type(security_type);
	}
	
	@And ("^Check Securities Security Category \"(.*)\"$")
	public void check_security_category(String security_category){
		securities_list_page.check_security_category(security_category);
	}
	
	@And ("^Check Securities Trading Start Date \"(.*)\"$")
	public void check_trading_start_date(String trading_start_date){
		securities_list_page.check_trading_start_date(trading_start_date);
	}
	
	@And ("^Check Securities Trading End Date \"(.*)\"$")
	public void check_trading_end_date(String trading_end_date){
		securities_list_page.check_trading_end_date(trading_end_date);
	}
	
	@And ("^Check Securities Trading Status (.+)$")
	public void check_trading_status(String trading_status){
		securities_list_page.check_trading_status(trading_status);
	}
	
	@And ("^Check Securities Primary Ticker (.+)$")
	public void check_primary_ticker(String primary_ticker){
		securities_list_page.check_primary_ticker(primary_ticker);
	}
	
	@And ("Close Popup")
	public void close_popup(){
		securities_list_page.popup_close();
	}
	
	@Then ("^Click Secuirty Update Action (.+),(.+)$")
	public void click_security_action(String ticker,String exchange){
		securities_list_page.click_action(ticker, exchange);
	}
	
}
