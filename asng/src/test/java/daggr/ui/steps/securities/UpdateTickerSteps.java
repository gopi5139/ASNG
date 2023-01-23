package daggr.ui.steps.securities;

import daggr.ui.pages.securities.UpdateTickerInformationPage;
import io.cucumber.java.en.And;

public class UpdateTickerSteps {
	UpdateTickerInformationPage update_page = new UpdateTickerInformationPage();
	
	@And ("^Update Mandatory Add Ticker Company Name (.+)$")
	public void update_company_name(String companyName){
		update_page.update_company_name(companyName);
	}
	
	@And ("^Update Mandatory Add Ticker Value (.+)$")
	public void update_ticker(String tickerDetails){
		update_page.update_ticker(tickerDetails);
	}
	@And ("^Update Mandatory Add Ticker Exchange (.+)$")
	public void update_exchange(String exchange){
		update_page.update_exchange(exchange);
	}
	@And ("^Update Optional Add Ticker Security Type \"(.*)\"$")
	public void update_ticker_security_type(String security_type){
		update_page.update_security_type(security_type);
	}
	@And ("^Update Optional Add Ticker Security Category \"(.*)\"$")
	public void update_ticker_security_category(String security_category){
		update_page.update_security_category(security_category);
	}
	@And ("^Update Optional Add Ticker Trading Start Date \"(.*)\"$")
	public void update_ticker_trading_start_date(String trading_start_date){
		update_page.update_trading_start_date(trading_start_date);
	}
	@And ("^Update Optional Add Ticker Trading End Date \"(.*)\"$")
	public void update_ticker_trading_end_date(String trading_end_date){
		update_page.update_trading_end_date(trading_end_date);
	}
	@And ("^Update Mandatory Add Ticker Trading Status (.+)$")
	public void update_trading_status(String trading_status){
		update_page.update_trading_status(trading_status);
	}
	@And ("^Update Mandatory Add Ticker Primary Ticker (.+)$")
	public void update_primary_ticker(String primary_ticker){
		update_page.update_primary_ticker(primary_ticker);
	}
	@And ("Click Ticker Update")
	public void click_update(){
		update_page.click_update_button();
	}
}
