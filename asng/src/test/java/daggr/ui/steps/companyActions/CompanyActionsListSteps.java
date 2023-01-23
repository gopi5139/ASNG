package daggr.ui.steps.companyActions;

import daggr.ui.pages.companyActions.CompanyActionsListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyActionsListSteps {
	CompanyActionsListPage companyActions = new CompanyActionsListPage();
	@And ("^Enter Search Company Name (.+)$")
	public void enter_acquisition_search_company_name(String company_name) {
		companyActions.enter_company_name(company_name);
	}
	@And ("^Enter Search Company Action \"(.*)\"$")
	public void enter_acquisition_search_company_action(String company_action) {
		companyActions.enter_company_action(company_action);
	}
	@And ("Click Search Apply Filter")
	public void click_apply_filter() {
		companyActions.click_apply_filter();
	}
	@Then ("^Click popup based on company name (.+) and effective date (.+)$")
	public void click_popup(String company_name,String effective_date) {
		companyActions.click_popup_from_table(company_name,effective_date);
	}
	@And ("^Verify Acquistion Acquirer Company Name (.+)$")
	public void verify_acquirer_company_name(String acqirer_company_name) {
		companyActions.verify_acquirer_company_name(acqirer_company_name);
	}
	@And ("^Verify Acquistion Target Company Name (.+)$")
	public void verify_target_company_name(String acqirer_company_name) {
		companyActions.verify_target_company_name(acqirer_company_name);
	}
	@And ("^Verify Acquistion Effective Date (.+)$")
	public void verify_acquisition_effective_date(String effective_date) {
		companyActions.verify_acquisition_effective_date(effective_date);
	}
	@And ("^Verify Acquistion Time Zone (.+)$")
	public void verify_acquisition_time_zone(String time_zone) {
		companyActions.verify_acquisition_time_zone(time_zone);
	}
	@And ("^Verify Acquistion Company Name Changed Post Acquisition \"(.*)\"$")
	public void verify_post_acquistion(String post_acquistion) {
		companyActions.verify_post_acquistion(post_acquistion);
	}
	@And ("^Verify Acquistion New Company Name \"(.*)\"$")
	public void verify_new_company_name(String new_company_name) {
		companyActions.verify_new_company_name(new_company_name);
	}
	@And ("^Verify Liquidation Company Name (.+)$")
	public void verify_liquidation_company_name(String company_name) {
		companyActions.verify_liquidation_company_name(company_name);
	}
	@And ("^Verify Liquidation Effective Date (.+)$")
	public void verify_liquidation_effective_date(String effective_date) {
		companyActions.verify_liquidation_effective_date(effective_date);
	}
	@And ("^Verify Liquidation Time Zone (.+)$")
	public void verify_liquidation_time_zone(String time_zone) {
		companyActions.verify_liquidation_time_zone(time_zone);
	}
	@And ("^Verify Bankruptcy Company Name (.+)$")
	public void verify_bankruptcy_company_name(String company_name) {
		companyActions.verify_bankruptcy_company_name(company_name);
	}
	@And ("^Verify Bankruptcy Type (.+)$")
	public void verify_bankruptcy_type(String bankruptcy_type) {
		companyActions.verify_bankruptcy_type(bankruptcy_type);
	}
	@And ("^Verify Bankruptcy Effective Date (.+)$")
	public void verify_bankruptcy_effective_date(String effective_date) {
		companyActions.verify_bankruptcy_effective_date(effective_date);
	}
	@And ("^Verify Bankruptcy Time Zone (.+)$")
	public void verify_bankruptcy_time_zone(String time_zone) {
		companyActions.verify_bankruptcy_time_zone(time_zone);
	}
	@And ("^Verify Company_Name_Change Company Name (.+)$")
	public void verify_company_name_change_company_name(String company_name) {
		companyActions.verify_company_name_change_company_name(company_name);
	}
	@And ("^Verify Company_Name_Change New Company Name (.+)$")
	public void verify_company_name_change_new_company_name(String new_company_name) {
		companyActions.verify_company_name_change_new_company_name(new_company_name);
	}
	@And ("^Verify Company_Name_Change Effective Date (.+)$")
	public void verify_company_name_change_effective_date(String effective_date) {
		companyActions.verify_company_name_change_effective_date(effective_date);
	}
	@And ("^Verify Company_Name_Change Time Zone (.+)$")
	public void verify_company_name_change_time_zone(String time_zone) {
		companyActions.verify_company_name_change_time_zone(time_zone);
	}
	@And ("^Verify Exchange_and_Ticker_Change Company Name (.+)$")
	public void verify_exchange_ticker_change_company_name(String company_name) {
		companyActions.verify_exchange_ticker_change_company_name(company_name);
	}
	@And ("^Verify Exchange_and_Ticker_Change Ticker-Exchange (.+)$")
	public void verify_exchange_ticker_change_ticker_exchange(String ticker_exchange) {
		companyActions.verify_exchange_ticker_change_ticker_exchange(ticker_exchange);
	}
	@And ("^Verify Exchange_and_Ticker_Change New Exchange (.+)$")
	public void verify_exchange_ticker_change_new_exchange(String new_exchange) {
		companyActions.verify_exchange_ticker_change_new_exchange(new_exchange);
	}
	@And ("^Verify Exchange_and_Ticker_Change New Ticker (.+)$")
	public void verify_exchange_ticker_change_new_ticker(String new_ticker) {
		companyActions.verify_exchange_ticker_change_new_ticker(new_ticker);
	}
	@And ("^Verify Exchange_and_Ticker_Change Effective Date (.+)$")
	public void verify_exchange_ticker_change_effective_date(String effective_date) {
		companyActions.verify_exchange_ticker_change_effective_date(effective_date);
	}
	@And ("^Verify Exchange_and_Ticker_Change Time Zone (.+)$")
	public void verify_exchange_ticker_change_time_zone(String time_zone) {
		companyActions.verify_exchange_ticker_change_time_zone(time_zone);
	}
	@And ("^Verify Headquarters_Change Company Name (.+)$")
	public void verify_headquarters_change_company_name(String company_name) {
		companyActions.verify_headquarters_change_company_name(company_name);
	}
	@And ("^Verify Headquarters_Change New Headquarters (.+)$")
	public void verify_headquarters_change_new_headquarters(String new_headquarters) {
		companyActions.verify_headquarters_change_new_headquarters(new_headquarters);
	}
	@And ("^Verify Headquarters_Change New State (.+)$")
	public void verify_headquarters_change_new_state(String new_state) {
		companyActions.verify_headquarters_change_new_state(new_state);
	}
	@And ("^Verify Headquarters_Change New City (.+)$")
	public void verify_headquarters_change_new_city(String new_city) {
		companyActions.verify_headquarters_change_new_city(new_city);
	}
	@And ("^Verify Headquarters_Change Effective Date (.+)$")
	public void verify_headquarters_change_effective_date(String effective_date) {
		companyActions.verify_headquarters_change_effective_date(effective_date);
	}
	@And ("^Verify Headquarters_Change Time Zone (.+)$")
	public void verify_headquarters_change_time_zone(String time_zone) {
		companyActions.verify_headquarters_change_time_zone(time_zone);
	}
	@And ("^Verify Delisted Company Name (.+)$")
	public void verify_delisted_company_name(String company_name) {
		companyActions.verify_delisted_company_name(company_name);
	}
	@And ("^Verify Delisted Ticker-Exchange (.+)$")
	public void verify_delisted_ticker_exchange(String ticker_exchange) {
		companyActions.verify_delisted_ticker_exchange(ticker_exchange);
	}
	@And ("^Verify Delisted Trading Status (.+)$")
	public void verify_delisted_trading_status(String trading_status) {
		companyActions.verify_delisted_trading_status(trading_status);
	}
	@And ("^Verify Delisted Mark Company as Private (.+)$")
	public void verify_delisted_mark_company_as_private(String mark_company_as_private) {
		companyActions.verify_delisted_mark_company_as_private(mark_company_as_private);
	}
	@And ("^Verify Delisted Effective Date (.+)$")
	public void verify_delisted_effective_date(String effective_date) {
		companyActions.verify_delisted_effective_date(effective_date);
	}
	@And ("^Verify Delisted Time Zone (.+)$")
	public void verify_delisted_time_zone(String time_zone) {
		companyActions.verify_delisted_time_zone(time_zone);
	}
	@And ("^Verify Merger Effective Date (.+)$")
	public void verify_merger_effective_date(String effective_date) {
		companyActions.verify_merger_effective_date(effective_date);
	}
	@And ("^Verify Merger Time Zone (.+)$")
	public void verify_merger_time_zone(String time_zone) {
		companyActions.verify_merger_time_zone(time_zone);
	}
	@And ("^Verify Merger Merged Company Name (.+)$")
	public void verify_merger_merged_company_name(String merged_company_name) {
		companyActions.verify_merger_merged_company_name(merged_company_name);
	}
	@And ("^Verify Company Name in Merger Company Names (.+)$")
	public void verify_company_name_in_merger_companies(String merged_company_name) {
		companyActions.verify_company_name_in_merger_companies(merged_company_name);
	}
	@And ("^Verify Company Name in Spinoff Company Names (.+)$")
	public void verify_company_name_in_spinoff_companies(String spinoff_company_name) {
		companyActions.verify_company_name_in_spinoff_companies(spinoff_company_name);
	}
	@And ("^Verify Spinoff Effective Date (.+)$")
	public void verify_spinoff_effective_date(String effective_date) {
		companyActions.verify_spinoff_effective_date(effective_date);
	}
	@And ("^Verify Spinoff Time Zone (.+)$")
	public void verify_spinoff_time_zone(String time_zone) {
		companyActions.verify_spinoff_time_zone(time_zone);
	}
	@And ("^Verify Spinoff Parent Company Name (.+)$")
	public void verify_spinoff_parent_company_name(String parent_company_name) {
		companyActions.verify_spinoff_parent_company_name(parent_company_name);
	}
}
