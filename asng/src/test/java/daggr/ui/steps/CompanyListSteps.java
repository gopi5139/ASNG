package daggr.ui.steps;

import daggr.ui.pages.company.CompanyDatabaseUpdatePage;
import daggr.ui.pages.company.CompanyListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyListSteps {
	CompanyListPage company_list =  new CompanyListPage();
	CompanyDatabaseUpdatePage company_database_update_view_page =  new CompanyDatabaseUpdatePage();
	
	@Then ("^Search By Company Name (.+)$")
	public void search_by_company_name(String company_name){
		company_list.search_company_name_in_list(company_name);
	}
	@Then ("^Company Name is Displayed In Table (.+)$")
	public void check_company_name_is_displayed_in_table(String company_name){
		company_list.is_company_displayed(company_name);
	}
	@And ("Click Action")
	public void click_action_button(){
		company_list.click_edit_button();
	}
	@Then ("^Check Mandatory Company Name (.+)$")
	public void check_company_name(String company_name){
		company_database_update_view_page.check_company_name(company_name);
	}
	@And ("^Check Mandatory Company Type (.+)$")
	public void check_company_type(String company_type){
		company_database_update_view_page.check_company_type(company_type);
	}
	@And ("^Check Mandatory Company Status (.+)$")
	public void check_company_status(String company_status){
		company_database_update_view_page.check_company_status(company_status);
	}
	@And ("^Check Mandatory Website Url (.+)$")
	public void check_website_url(String website_url){
		company_database_update_view_page.check_website_url(website_url);
	}
	@And ("^Check Optional Employees \"(.*)\"$")
	public void check_employees(String employees){
		company_database_update_view_page.check_employees(employees);
	}
	@And ("^Check Optional Start Date \"(.*)\"$")
	public void check_start_date(String start_date){
		company_database_update_view_page.check_start_date(start_date);
	}
	@And ("^Check Optional End Date \"(.*)\"$")
	public void check_end_date(String end_date){
		company_database_update_view_page.check_end_date(end_date);
	}
	@And ("^Check Optional Sector \"(.*)\"$")
	public void check_sector(String sector){
		company_database_update_view_page.check_sector(sector);
	}
	@And ("^Check Optional Industry \"(.*)\"$")
	public void check_industry(String industry){
		company_database_update_view_page.check_industry(industry);
	}
	@And ("^Check Mandatory Country (.+)$")
	public void check_country(String country){
		company_database_update_view_page.check_country(country);
	}
	@And ("^Check Optional State \"(.*)\"$")
	public void check_state(String state){
		company_database_update_view_page.check_state(state);
	}
	@And ("^Check Optional City \"(.*)\"$")
	public void check_city(String city){
		company_database_update_view_page.check_city(city);
	}
	@And ("^Check Optional Address \"(.*)\"$")
	public void check_address(String address){
		company_database_update_view_page.check_address(address);
	}
	@And ("^Check Optional Phone Number \"(.*)\"$")
	public void check_phone_number(String phone_number){
		company_database_update_view_page.check_phone_number(phone_number);
	}
	@And ("^Check Optional Company Description \"(.*)\"$")
	public void check_company_description(String company_description){
		company_database_update_view_page.check_company_description(company_description);
	}
	@And ("^Check Optional ISIN \"(.*)\"$")
	public void check_ISIN(String ISIN){
		company_database_update_view_page.check_ISIN(ISIN);
	}
	@And ("^Check Optional CIK \"(.*)\"$")
	public void check_CIK(String CIK){
		company_database_update_view_page.check_CIK(CIK);
	}
	@And ("^Check Optional CUSIP \"(.*)\"$")
	public void check_CUSIP(String CUSIP){
		company_database_update_view_page.check_CUSIP(CUSIP);
	}
	@And ("^Check Optional SEDOL \"(.*)\"$")
	public void check_SEDOL(String SEDOL){
		company_database_update_view_page.check_SEDOL(SEDOL);
	}
	@And ("^Check Mandatory IR Section Link (.+)$")
	public void check_ir_section_link(String ir_section_link){
		company_database_update_view_page.check_ir_section_link(ir_section_link);
	}
	@And ("^Check Optional PR Section Link \"(.*)\"$")
	public void check_pr_section_link(String pr_section_link){
		company_database_update_view_page.check_pr_section_link(pr_section_link);
	}
	@And ("^Check Optional IR Name \"(.*)\"$")
	public void check_ir_name(String ir_name){
		company_database_update_view_page.check_ir_name(ir_name);
	}
	@And ("^Check Optional IR Designation \"(.*)\"$")
	public void check_ir_designation(String ir_designation){
		company_database_update_view_page.check_ir_designation(ir_designation);
	}
	@And ("^Check Optional IR Phone Number \"(.*)\"$")
	public void check_ir_phone_number(String ir_phone_number){
		company_database_update_view_page.check_ir_phone_number(ir_phone_number);
	}
	@And ("^Check Optional IR Email \"(.*)\"$")
	public void check_ir_email(String ir_email){
		company_database_update_view_page.check_ir_email(ir_email);
	}
	@And ("^Check Optional IR Responding to Email \"(.*)\"$")
	public void check_ir_responding_to_email(String ir_responding_to_email){
		company_database_update_view_page.check_is_IR_Responding_to_Email(ir_responding_to_email);
	}
	@And ("^Check Optional IR Responding to Phone Call \"(.*)\"$")
	public void check_ir_responding_to_phone_call(String ir_responding_to_phone){
		company_database_update_view_page.check_is_IR_Responding_to_Phone_Call(ir_responding_to_phone);
	}
	@And ("^Check Optional Executives Section Link \"(.*)\"$")
	public void check_executives_section_link(String executives_section_link){
		company_database_update_view_page.check_executives_section_link(executives_section_link);
	}
	@And ("^Check Optional Analyst Coverage Link \"(.*)\"$")
	public void check_analyst_coverage_link(String analyst_coverage_link){
		company_database_update_view_page.check_analyst_coverage_link(analyst_coverage_link);
	}
	@And ("^Check Mandatory Events Section Link (.+)$")
	public void check_events_section_link(String events_section_link){
		company_database_update_view_page.check_events_section_link(events_section_link);
	}
	@And ("^Check Optional Earnings Announcement \"(.*)\"$")
	public void check_earnings_announcement(String earnings_announcement){
		company_database_update_view_page.check_earnings_announcement(earnings_announcement);
	}
	@And ("^Check Optional Earnings Call Conducted \"(.*)\"$")
	public void check_earnings_call_conducted(String earnings_call_conducted){
		company_database_update_view_page.check_earnings_call_conducted(earnings_call_conducted);
	}
	@And ("^Check Optional Languages \"(.*)\"$")
	public void check_languages(String languages){
		company_database_update_view_page.check_languages(languages);
	}
	@And ("^Check Optional Earnings Call Frequency \"(.*)\"$")
	public void check_earnings_call_frequency(String earnings_call_frequency){
		company_database_update_view_page.check_earnings_call_frequency(earnings_call_frequency);
	}
	@And ("^Check Optional Email Alert Setup \"(.*)\"$")
	public void check_email_alert_setup(String email_alert_setup){
		company_database_update_view_page.check_email_alert_setup(email_alert_setup);
	}
	@And ("^Check Optional Add to Calendar Option \"(.*)\"$")
	public void check_add_to_calendar_option(String add_to_calendar_option){
		company_database_update_view_page.check_add_calendar_to_option(add_to_calendar_option);
	}
	@And ("^Check Optional Company Comments \"(.*)\"$")
	public void check_company_comments(String comments){
		company_database_update_view_page.check_comments(comments);
	}
}
