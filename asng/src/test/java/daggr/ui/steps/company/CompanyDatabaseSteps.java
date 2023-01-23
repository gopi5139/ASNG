package daggr.ui.steps.company;

import daggr.ui.pages.company.CompanyDatabasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyDatabaseSteps {
	CompanyDatabasePage company_database_page =  new CompanyDatabasePage();
	
	@Then ("Select Company Database")
	public void select_company_database(){
		company_database_page.is_company_database_selected();
	}
	@And ("^Enter Mandatory Company Name (.+)$")
	public void enter_company_name(String company_name){
		company_database_page.enter_companyName(company_name);
	}
	@And ("^Enter Mandatory Article Url (.+)$")
	public void enter_article_url(String article_url){
		company_database_page.enter_the_article_url(article_url);
	}
	@And ("^Enter Mandatory Company Type (.+)$")
	public void enter_company_type(String company_type){
		company_database_page.select_companyType(company_type);
	}
	@And ("^Enter Mandatory Company Status (.+)$")
	public void enter_company_status(String company_status){
		company_database_page.select_companyStatus(company_status);
	}
	@And ("^Enter Mandatory Website Url (.+)$")
	public void enter_website_url(String website_url){
		company_database_page.enter_the_website(website_url);
	}
	@And ("^Enter Optional Employees \"(.*)\"$")
	public void enter_employees(String employees){
		company_database_page.enter_employees(employees);
	}
	@And ("^Enter Optional Start Date \"(.*)\"$")
	public void enter_start_date(String start_date){
		company_database_page.select_start_date(start_date);
	}
	@And ("^Enter Optional End Date \"(.*)\"$")
	public void enter_end_date(String end_date){
		company_database_page.select_end_date(end_date);
	}
	@And ("^Enter Optional Sector \"(.*)\"$")
	public void enter_sector(String sector){
		company_database_page.select_sector(sector);
	}
	@And ("^Enter Optional Industry \"(.*)\"$")
	public void enter_industry(String industry){
		company_database_page.enter_industry(industry);
	}
	@And ("^Enter Mandatory Country (.+)$")
	public void enter_country(String country){
		company_database_page.enter_country(country);
	}
	@And ("^Enter Optional State \"(.*)\"$")
	public void enter_state(String state){
		company_database_page.enter_state(state);
	}
	@And ("^Enter Optional City \"(.*)\"$")
	public void enter_city(String city){
		company_database_page.enter_city(city);
	}
	@And ("^Enter Optional Address \"(.*)\"$")
	public void enter_address(String address){
		company_database_page.enter_address(address);
	}
	@And ("^Enter Optional Phone Number \"(.*)\"$")
	public void enter_phone_number(String phone_number){
		company_database_page.enter_phone_number(phone_number);
	}
	@And ("^Enter Optional Company Description \"(.*)\"$")
	public void enter_company_description(String company_description){
		company_database_page.enter_company_description(company_description);
	}
	@And ("^Enter Optional ISIN \"(.*)\"$")
	public void enter_ISIN(String ISIN){
		company_database_page.enter_ISIN(ISIN);
	}
	@And ("^Enter Optional CIK \"(.*)\"$")
	public void enter_CIK(String CIK){
		company_database_page.enter_CIK(CIK);
	}
	@And ("^Enter Optional CUSIP \"(.*)\"$")
	public void enter_CUSIP(String CUSIP){
		company_database_page.enter_CUSIP(CUSIP);
	}
	@And ("^Enter Optional SEDOL \"(.*)\"$")
	public void enter_SEDOL(String SEDOL){
		company_database_page.enter_SEDOL(SEDOL);
	}
	@And ("Click Next")
	public void click_next_button(){
		company_database_page.click_next_button();
	}
	@And ("^Enter Mandatory IR Section Link (.+)$")
	public void enter_ir_section_link(String ir_section_link){
		company_database_page.enter_ir_section_link(ir_section_link);
	}
	@And ("^Enter Optional PR Section Link \"(.*)\"$")
	public void enter_pr_section_link(String pr_section_link){
		company_database_page.enter_pr_section_link(pr_section_link);
	}
	@And ("^Enter Optional IR Name \"(.*)\"$")
	public void enter_ir_name(String ir_name){
		company_database_page.enter_ir_name(ir_name);
	}
	@And ("^Enter Optional IR Designation \"(.*)\"$")
	public void enter_ir_designation(String ir_designation){
		company_database_page.enter_ir_designation(ir_designation);
	}
	@And ("^Enter Optional IR Phone Number \"(.*)\"$")
	public void enter_ir_phone_number(String ir_phone_number){
		company_database_page.enter_ir_phone_number(ir_phone_number);
	}
	@And ("^Enter Optional IR Email \"(.*)\"$")
	public void enter_ir_email(String ir_email){
		company_database_page.enter_ir_email(ir_email);
	}
	@And ("^Enter Optional IR Responding to Email \"(.*)\"$")
	public void select_ir_responding_to_email(String ir_responding_to_email){
		company_database_page.select_ir_responding_to_email(ir_responding_to_email);
	}
	@And ("^Enter Optional IR Responding to Phone Call \"(.*)\"$")
	public void select_ir_responding_to_phone_call(String ir_responding_to_phone){
		company_database_page.select_ir_responding_to_call(ir_responding_to_phone);
	}
	@And ("^Enter Optional Executives Section Link \"(.*)\"$")
	public void enter_executives_section_link(String executives_section_link){
		company_database_page.enter_executives_section_link(executives_section_link);
	}
	@And ("^Enter Optional Analyst Coverage Link \"(.*)\"$")
	public void enter_analyst_coverage_link(String analyst_coverage_link){
		company_database_page.enter_analyst_coverage_link(analyst_coverage_link);
	}
	@And ("^Enter Mandatory Events Section Link (.+)$")
	public void enter_events_section_link(String events_section_link){
		company_database_page.enter_events_section_link(events_section_link);
	}
	@And ("^Select Optional Earnings Announcement \"(.*)\"$")
	public void select_earnings_announcement(String earnings_announcement){
		company_database_page.select_earnings_announcement(earnings_announcement);
	}
	@And ("^Select Optional Earnings Call Conducted \"(.*)\"$")
	public void select_earnings_call_conducted(String earnings_call_conducted){
		company_database_page.select_earnings_call_conducted(earnings_call_conducted);
	}
	@And ("^Select Optional Languages \"(.*)\"$")
	public void select_languages(String languages){
		company_database_page.enter_multiselect_dropdown(languages);
	}
	@And ("^Select Optional Earnings Call Frequency \"(.*)\"$")
	public void select_earnings_call_frequency(String earnings_call_frequency){
		company_database_page.select_the_earnings_call_frequency(earnings_call_frequency);
	}
	@And ("^Select Optional Email Alert Setup \"(.*)\"$")
	public void select_email_alert_setup(String email_alert_setup){
		company_database_page.select_email_alert_setup(email_alert_setup);
	}
	@And ("^Select Optional Add to Calander Option \"(.*)\"$")
	public void select_add_to_calander_option(String add_to_calander_option){
		company_database_page.select_add_to_calendar_option(add_to_calander_option);
	}
	@And ("^Enter Optional Company Comments \"(.*)\"$")
	public void enter_company_comments(String comments){
		company_database_page.enter_comments(comments);
	}
	@And ("^Select Mandatory Traking Type (.+)$")
	public void select_tracking_type(String tracking_type){
		company_database_page.select_tracking_type(tracking_type);
	}
	@And ("^Enter Mandatory Tracking Link (.+)$")
	public void enter_tracking_link(String tracking_link){
		company_database_page.enter_company_data_source_link(tracking_link);
	}
	@And ("^Enter Mandatory Tracking Status (.+)$")
	public void enter_tracking_status(String tracking_status){
		company_database_page.select_company_data_source_status(tracking_status);
	}
	@And ("^Enter Mandatory Scraping Frequency (.+)$")
	public void enter_scraping_frequency(String scraping_frequency){
		company_database_page.select_scrapping_frequency(scraping_frequency);
	}
	@And ("^Enter Mandatory/Optional Data Source Comments \"(.*)\"$")
	public void enter_data_source_comments(String comments){
		company_database_page.enter_datasource_comments(comments);
	}
	@And ("^Enter Mandatory Ticker (.+)$")
	public void enter_ticker(String ticker){
		company_database_page.enter_ticker(ticker);
	}
	@And ("^Enter Mandatory Exchanges (.+)$")
	public void enter_exchanges(String exchanges){
		company_database_page.enter_exchange(exchanges);
	}
	@And ("^Enter Optional Security Type \"(.*)\"$")
	public void enter_security_type(String security_type){
		company_database_page.select_security_type(security_type);
	}
	@And ("^Enter Optional Security Category \"(.*)\"$")
	public void enter_security_category(String security_category){
		company_database_page.select_security_category(security_category);
	}
	@And ("^Enter Optional Trading Start Date \"(.*)\"$")
	public void enter_trading_start_date(String trading_start_date){
		company_database_page.select_trading_start_date(trading_start_date);
	}
	@And ("^Enter Optional Trading End Date \"(.*)\"$")
	public void enter_trading_end_date(String trading_end_date){
		company_database_page.select_trading_end_date(trading_end_date);
	}
	@And ("^Select Mandatory Trading Status (.+)$")
	public void select_trading_status(String trading_status){
		company_database_page.select_trading_status(trading_status);
	}
	@And ("^Select Mandatory Primary Ticker (.+)$")
	public void select_primary_ticker(String primary_ticker){
		company_database_page.select_primary_ticker(primary_ticker);
	}
	@And ("Click Submit")
	public void click_submit_button(){
		company_database_page.click_submit_button();
	}
}
