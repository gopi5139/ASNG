package daggr.ui.steps.persons;

import daggr.ui.pages.persons.AddPersonsPage;
import daggr.ui.pages.persons.AddPersons_Education;
import daggr.ui.pages.persons.AddPersons_WorkHistory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddPersonsSteps {
	AddPersonsPage add_persons = new AddPersonsPage();
	AddPersons_Education add_persons_education = new AddPersons_Education();
	AddPersons_WorkHistory add_persons_work_history = new AddPersons_WorkHistory();
	
	@Then ("Select Add Persons")
	public void select_company_database(){
		add_persons.is_add_persons_selected();
	}
	@And ("^Enter Mandatory Add Persons Article Link (.+)$")
	public void enter_article_url(String article_url){
		add_persons.enter_the_article_url(article_url);
	}
	@And ("^Enter Mandatory Person Name (.+)$")
	public void enter_person_name(String personName){
		add_persons.enter_person_name(personName);
	}
	@And ("^Enter Mandatory Gender (.+)$")
	public void select_gender(String gender){
		add_persons.select_gender(gender);
	}
	@And ("^Select Optional Status \"(.*)\"$")
	public void select_status(String status){
		add_persons.select_person_status(status);
	}
	@And ("^Select Optional Resigned Date \"(.*)\"$")
	public void select_resigned_date(String resigned_date){
		add_persons.select_resigned_date(resigned_date);
	}
	@And ("^Select Optional Retired Date \"(.*)\"$")
	public void select_retired_date(String retired_date){
		add_persons.select_retired_date(retired_date);
	}
	@And ("^Select Optional Dismissed Date \"(.*)\"$")
	public void select_dismissed_date(String dismissed_date){
		add_persons.select_dismissed_date(dismissed_date);
	}
	@And ("^Enter Optional Person Email \"(.*)\"$")
	public void enter_person_email(String person_email){
		add_persons.enter_email(person_email);
	}
	@And ("^Select Optional Date of Birth \"(.*)\"$")
	public void select_date_of_birth(String date_of_birth){
		add_persons.select_date_of_birth(date_of_birth);
	}
	@And ("^Select Optional Deceased \"(.*)\"$")
	public void select_deceased(String deceased){
		add_persons.select_deceased(deceased);
	}
	@And ("^Select Optional Deceased Date \"(.*)\"$")
	public void select_deceased_date(String deceasedDate){
		add_persons.select_deceased_date(deceasedDate);
	}
	@And ("^Enter Optional Biography \"(.*)\"$")
	public void enter_biography(String biography){
		add_persons.enter_biography(biography);
	}
	@And ("Click Optional Add Education")
	public void click_add_education(){
		add_persons.click_add_education();
	}
	@And ("^Enter Mandatory Eductational Institution (.+)$")
	public void enter_eductaional_institution(String eductaional_institution){
		add_persons_education.enter_educational_institution(eductaional_institution);
	}
	@And ("^Enter Optional Eductational Qualification \"(.*)\"$")
	public void enter_educational_qualification(String educational_qualification){
		add_persons_education.enter_educational_qualification(educational_qualification);
	}
	@And ("^Enter Optional Eductational Description \"(.*)\"$")
	public void enter_educational_description(String educational_description){
		add_persons_education.enter_educational_description(educational_description);
	}
	@And ("^Select Optional Educational Start Date \"(.*)\"$")
	public void select_educational_start_date(String start_date){
		add_persons_education.select_educational_start_date(start_date);
	}
	@And ("^Select Optional Educational End Date \"(.*)\"$")
	public void select_educational_end_date(String end_date){
		add_persons_education.select_educational_end_date(end_date);
	}
	@And ("Click Optional Add Work History")
	public void click_add_work_history(){
		add_persons.click_add_work_history();
	}
	@And ("^Enter Mandatory Work History Company Name (.+)$")
	public void enter_work_history_company_name(String company_name){
		add_persons_work_history.enter_work_history_company_name(company_name);
	}
	@And ("^Select Mandatory Currently Working (.+)$")
	public void select_currently_working(String currently_working){
		add_persons_work_history.select_currently_working(currently_working);
	}
	@And ("^Enter Mandatory Work History Designation (.+)$")
	public void enter_work_history_designation(String designation){
		add_persons_work_history.enter_work_designation(designation);
	}
	@And ("^Enter Optional Work History Description \"(.*)\"$")
	public void enter_work_history_description(String desciption){
		add_persons_work_history.enter_work_description(desciption);
	}
	@And ("^Select Optional Work History Start Date \"(.*)\"$")
	public void select_work_history_start_date(String start_date){
		add_persons_work_history.select_work_start_date(start_date);
	}
	@And ("^Select Optional Work History End Date \"(.*)\"$")
	public void select_work_history_end_date(String end_date){
		add_persons_work_history.select_work_end_date(end_date);
	}
	@And ("^Select Mandatory Details Type (.+)$")
	public void select_details_type(String type){
		add_persons_work_history.select_details_type(type);
	}
	@And ("^Enter Optional Year \"(.*)\"$")
	public void enter_year(String year){
		add_persons_work_history.enter_year(year);
	}
	@And ("^Enter Optional Currency \"(.*)\"$")
	public void enter_currency(String currency){
		add_persons_work_history.enter_currency(currency);
	}
	@And ("^Enter Optional Salary \"(.*)\"$")
	public void enter_salary(String salary){
		add_persons_work_history.enter_salary(salary);
	}
	@And ("^Enter Optional Bonus \"(.*)\"$")
	public void enter_bonus(String bonus){
		add_persons_work_history.enter_bonus(bonus);
	}
	@And ("^Enter Optional Cash Awards \"(.*)\"$")
	public void enter_cash_awards(String cash_awards){
		add_persons_work_history.enter_cash_awards(cash_awards);
	}
	@And ("^Enter Optional Stock Awards \"(.*)\"$")
	public void enter_stock_awards(String stock_awards){
		add_persons_work_history.enter_stock_awards(stock_awards);
	}
	@And ("^Enter Optional Option Awards \"(.*)\"$")
	public void enter_option_awards(String option_awards){
		add_persons_work_history.enter_option_awards(option_awards);
	}
	@And ("^Enter Optional Pension & Deferred \"(.*)\"$")
	public void enter_pension_deferred(String pension_deferred){
		add_persons_work_history.enter_pension_deferred(pension_deferred);
	}
	@And ("^Enter Optional Non Equity Incentives \"(.*)\"$")
	public void enter_non_equity_incentives(String non_equity_incentives){
		add_persons_work_history.enter_non_equity_incentives(non_equity_incentives);
	}
	@And ("^Enter Optional Other Compensation \"(.*)\"$")
	public void enter_other_compensation(String other_compensation){
		add_persons_work_history.enter_other_compensation(other_compensation);
	}
	@And ("^Enter Optional Total \"(.*)\"$")
	public void enter_total(String total){
		add_persons_work_history.enter_total(total);
	}
	@And ("^Select Optional Sector Coverage \"(.*)\"$")
	public void select_sector_coverage(String sector_coverage){
		add_persons_work_history.enter_sector_coverage(sector_coverage);
	}
	@And ("^Enter Optional Work History Phone Number \"(.*)\"$")
	public void enter_phone_number(String phone_number){
		add_persons_work_history.enter_phone_number(phone_number);
	}
	@And ("^Enter Optional Work History Email \"(.*)\"$")
	public void enter_email(String email){
		add_persons_work_history.enter_email(email);
	}
	@And ("^Enter Optional Currency Type \"(.*)\"$")
	public void enter_currency_type(String currency_type){
		add_persons_work_history.enter_currency_type(currency_type);
	}
	@And ("^Enter Mandatory Coverage Company Name (.+)$")
	public void select_coverage_company_name(String company_name){
		add_persons_work_history.enter_coverage_company_name(company_name);
	}
	@And ("^Select Optional Coverage Start Date \"(.*)\"$")
	public void select_coverage_start_date(String start_date){
		add_persons_work_history.select_coverage_start_date(start_date);
	}
	@And ("^Select Optional Coverage End Date \"(.*)\"$")
	public void select_coverage_end_date(String end_date){
		add_persons_work_history.select_coverage_end_date(end_date);
	}
	@And ("Click Person Submit button")
	public void click_submit_button(){
		add_persons.click_submit_button();
	}
}
