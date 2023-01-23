package daggr.ui.steps.company;

import daggr.ui.pages.SuccessPopup;
import daggr.ui.pages.company.CompanyDatabaseUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyDatabaseUpdateSteps {
	CompanyDatabaseUpdatePage company_database_update_view_page =  new CompanyDatabaseUpdatePage();
	
	@Then("Select Company Database Update")
	public  void select_company_database_update() {
		company_database_update_view_page.is_company_database_update_selected();
	}
	@And ("^Enter Database Update Company Name (.+)$")
	public void enter_database_update_company_name(String company_name){
		company_database_update_view_page.enter_database_update_companyName(company_name);
	}
	@Then ("^Update Mandatory Website Url (.+)$")
	public void update_website_url(String website_url){
		company_database_update_view_page.update_the_website(website_url);
	}
	@And ("^Update Optional Employees \"(.*)\"$")
	public void update_employees(String employees){
		company_database_update_view_page.update_employees(employees);
	}
	@And ("^Update Optional Start Date \"(.*)\"$")
	public void update_start_date(String start_date){
		company_database_update_view_page.update_start_date(start_date);
	}
	@And ("^Update Optional Sector \"(.*)\"$")
	public void update_sector(String sector){
		company_database_update_view_page.update_sector(sector);
	}
	@And ("^Update Optional Industry \"(.*)\"$")
	public void update_industry(String industry){
		company_database_update_view_page.update_industry(industry);
	}
	@And ("^Update Optional Address \"(.*)\"$")
	public void update_address(String address){
		company_database_update_view_page.update_address(address);
	}
	@And ("^Update Optional Phone Number \"(.*)\"$")
	public void update_phone_number(String phone_number){
		company_database_update_view_page.update_phone_number(phone_number);
	}
	@And ("^Update Optional Company Description \"(.*)\"$")
	public void update_company_description(String company_description){
		company_database_update_view_page.update_company_description(company_description);
	}
	@And ("^Update Optional ISIN \"(.*)\"$")
	public void update_ISIN(String ISIN){
		company_database_update_view_page.update_ISIN(ISIN);
	}
	@And ("^Update Optional CIK \"(.*)\"$")
	public void update_CIK(String CIK){
		company_database_update_view_page.update_CIK(CIK);
	}
	@And ("^Update Optional CUSIP \"(.*)\"$")
	public void update_CUSIP(String CUSIP){
		company_database_update_view_page.update_CUSIP(CUSIP);
	}
	@And ("^Update Optional SEDOL \"(.*)\"$")
	public void update_SEDOL(String SEDOL){
		company_database_update_view_page.update_SEDOL(SEDOL);
	}
	@And ("^Update Mandatory IR Section Link (.+)$")
	public void update_ir_section_link(String ir_section_link){
		company_database_update_view_page.update_ir_section_link(ir_section_link);
	}
	@And ("^Update Optional PR Section Link \"(.*)\"$")
	public void update_pr_section_link(String pr_section_link){
		company_database_update_view_page.update_pr_section_link(pr_section_link);
	}
	@And ("^Update Optional IR Name \"(.*)\"$")
	public void update_ir_name(String ir_name){
		company_database_update_view_page.update_ir_name(ir_name);
	}
	@And ("^Update Optional IR Designation \"(.*)\"$")
	public void update_ir_designation(String ir_designation){
		company_database_update_view_page.update_ir_designation(ir_designation);
	}
	@And ("^Update Optional IR Phone Number \"(.*)\"$")
	public void update_ir_phone_number(String ir_phone_number){
		company_database_update_view_page.update_ir_phone_number(ir_phone_number);
	}
	@And ("^Update Optional IR Email \"(.*)\"$")
	public void update_ir_email(String ir_email){
		company_database_update_view_page.update_ir_email(ir_email);
	}
	@And ("^Update Optional IR Responding to Email \"(.*)\"$")
	public void update_ir_responding_to_email(String ir_responding_to_email){
		company_database_update_view_page.update_ir_responding_to_email(ir_responding_to_email);
	}
	@And ("^Update Optional IR Responding to Phone Call \"(.*)\"$")
	public void update_ir_responding_to_phone_call(String ir_responding_to_phone){
		company_database_update_view_page.update_ir_responding_to_call(ir_responding_to_phone);
	}
	@And ("^Update Optional Executives Section Link \"(.*)\"$")
	public void update_executives_section_link(String executives_section_link){
		company_database_update_view_page.update_executives_section_link(executives_section_link);
	}
	@And ("^Update Optional Analyst Coverage Link \"(.*)\"$")
	public void update_analyst_coverage_link(String analyst_coverage_link){
		company_database_update_view_page.update_analyst_coverage_link(analyst_coverage_link);
	}
	@And ("^Update Mandatory Events Section Link (.+)$")
	public void update_events_section_link(String events_section_link){
		company_database_update_view_page.update_events_section_link(events_section_link);
	}
	@And ("^Update Optional Earnings Announcement \"(.*)\"$")
	public void update_earnings_announcement(String earnings_announcement){
		company_database_update_view_page.update_earnings_announcement(earnings_announcement);
	}
	@And ("^Update Optional Earnings Call Conducted \"(.*)\"$")
	public void update_earnings_call_conducted(String earnings_call_conducted){
		company_database_update_view_page.update_earnings_call_conducted(earnings_call_conducted);
	}
	@And ("^Update Optional Languages \"(.*)\"$")
	public void update_languages(String languages){
		company_database_update_view_page.update_multiselect_dropdown(languages);
	}
	@And ("^Update Optional Earnings Call Frequency \"(.*)\"$")
	public void update_earnings_call_frequency(String earnings_call_frequency){
		company_database_update_view_page.update_the_earnings_call_frequency(earnings_call_frequency);
	}
	@And ("^Update Optional Email Alert Setup \"(.*)\"$")
	public void update_email_alert_setup(String email_alert_setup){
		company_database_update_view_page.update_email_alert_setup(email_alert_setup);
	}
	@And ("^Update Optional Add to Calendar Option \"(.*)\"$")
	public void update_add_to_calendar_option(String add_to_calendar_option){
		company_database_update_view_page.update_add_to_calendar_option(add_to_calendar_option);
	}
	@And ("^Update Optional Company Comments \"(.*)\"$")
	public void update_company_comments(String comments){
		company_database_update_view_page.update_comments(comments);
	}
	@And ("Click Update")
	public void click_update_button(){
		company_database_update_view_page.click_update_button();
	}
	@Then ("Check Update Success Message")
	public void check_update_success_message(){
   	 	SuccessPopup success_popup =  new SuccessPopup();
   	 	success_popup.get_update_success_message();
	}
}
