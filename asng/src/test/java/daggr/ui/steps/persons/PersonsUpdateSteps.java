package daggr.ui.steps.persons;

import daggr.ui.pages.persons.PersonsUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PersonsUpdateSteps {
	PersonsUpdatePage persons_update_page = new PersonsUpdatePage();
	
	@Then ("^Check Mandatory Person Name (.+)$")
	public void check_person_name(String personName){
		persons_update_page.check_person_name(personName);
	}
	@And ("^Check Mandatory Gender (.+)$")
	public void check_gender(String gender){
		persons_update_page.check_gender(gender);
	}
	@And ("^Check Optional Status \"(.*)\"$")
	public void check_status(String status){
		persons_update_page.check_person_status(status);
	}
	@And ("^Check Optional Resigned Date \"(.*)\"$")
	public void check_resigned_date(String resigned_date){
		persons_update_page.check_resigned_date(resigned_date);
	}
	@And ("^Check Optional Retired Date \"(.*)\"$")
	public void check_retired_date(String retired_date){
		persons_update_page.check_retired_date(retired_date);
	}
	@And ("^Check Optional Dismissed Date \"(.*)\"$")
	public void check_dismissed_date(String dismissed_date){
		persons_update_page.check_dismissed_date(dismissed_date);
	}
	@And ("^Check Optional Person Email \"(.*)\"$")
	public void check_person_email(String person_email){
		persons_update_page.check_email(person_email);
	}
	@And ("^Check Optional Date of Birth \"(.*)\"$")
	public void check_date_of_birth(String date_of_birth){
		persons_update_page.check_date_of_birth(date_of_birth);
	}
	@And ("^Check Optional Deceased \"(.*)\"$")
	public void check_deceased(String deceased){
		persons_update_page.check_deceased(deceased);
	}
	@And ("^Check Optional Deceased Date \"(.*)\"$")
	public void check_deceased_date(String deceased_date){
		persons_update_page.check_deceased_date(deceased_date);
	}
	@And ("^Check Optional Biography \"(.*)\"$")
	public void check_biography(String biography){
		persons_update_page.check_biography(biography);
	}
	@And ("^Check Mandatory Eductational Institution (.+)$")
	public void check_eductaional_institution(String eductaional_institution){
		persons_update_page.check_educational_institution(eductaional_institution);
	}
	@And ("^Check Optional Eductational Qualification \"(.*)\"$")
	public void check_educational_qualification(String educational_qualification){
		persons_update_page.check_educational_qualification(educational_qualification);
	}
	@And ("^Check Optional Eductational Description \"(.*)\"$")
	public void check_educational_description(String educational_description){
		persons_update_page.check_educational_description(educational_description);
	}
	@And ("^Check Optional Educational Start Date \"(.*)\"$")
	public void check_educational_start_date(String start_date){
		persons_update_page.check_educational_start_date(start_date);
	}
	@And ("^Check Optional Educational End Date \"(.*)\"$")
	public void check_educational_end_date(String end_date){
		persons_update_page.check_educational_end_date(end_date);
	}
	@And ("^Check Mandatory Work History Company Name (.+)$")
	public void check_work_history_company_name(String company_name){
		persons_update_page.check_work_history_company_name(company_name);
	}
	@And ("^Check Mandatory Currently Working (.+)$")
	public void check_currently_working(String currently_working){
		persons_update_page.check_currently_working(currently_working);
	}
	@And ("^Check Mandatory Work History Designation (.+)$")
	public void check_work_history_designation(String designation){
		persons_update_page.check_work_designation(designation);
	}
	@And ("^Check Optional Work History Description \"(.*)\"$")
	public void check_work_history_description(String desciption){
		persons_update_page.check_work_description(desciption);
	}
	@And ("^Check Optional Work History Start Date \"(.*)\"$")
	public void check_work_history_start_date(String start_date){
		persons_update_page.check_work_start_date(start_date);
	}
	@And ("^Check Optional Work History End Date \"(.*)\"$")
	public void check_work_history_end_date(String end_date){
		persons_update_page.check_work_end_date(end_date);
	}
	@And ("^Check Mandatory Details Type (.+)$")
	public void check_details_type(String type){
		persons_update_page.check_details_type(type);
	}
	@And ("^Check Optional Year \"(.*)\"$")
	public void check_year(String year){
		persons_update_page.check_year(year);
	}
	@And ("^Check Optional Currency \"(.*)\"$")
	public void check_currency(String currency){
		persons_update_page.check_currency(currency);
	}
	@And ("^Check Optional Salary \"(.*)\"$")
	public void check_salary(String salary){
		persons_update_page.check_salary(salary);
	}
	@And ("^Check Optional Bonus \"(.*)\"$")
	public void check_bonus(String bonus){
		persons_update_page.check_bonus(bonus);
	}
	@And ("^Check Optional Cash Awards \"(.*)\"$")
	public void check_cash_awards(String cash_awards){
		persons_update_page.check_cash_awards(cash_awards);
	}
	@And ("^Check Optional Stock Awards \"(.*)\"$")
	public void check_stock_awards(String stock_awards){
		persons_update_page.check_stock_awards(stock_awards);
	}
	@And ("^Check Optional Option Awards \"(.*)\"$")
	public void check_option_awards(String option_awards){
		persons_update_page.check_option_awards(option_awards);
	}
	@And ("^Check Optional Pension & Deferred \"(.*)\"$")
	public void check_pension_deferred(String pension_deferred){
		persons_update_page.check_pension_deferred(pension_deferred);
	}
	@And ("^Check Optional Non Equity Incentives \"(.*)\"$")
	public void check_non_equity_incentives(String non_equity_incentives){
		persons_update_page.check_non_equity_incentives(non_equity_incentives);
	}
	@And ("^Check Optional Other Compensation \"(.*)\"$")
	public void check_other_compensation(String other_compensation){
		persons_update_page.check_other_compensation(other_compensation);
	}
	@And ("^Check Optional Total \"(.*)\"$")
	public void check_total(String total){
		persons_update_page.check_total(total);
	}
	@And ("^Check Optional Sector Coverage \"(.*)\"$")
	public void check_sector_coverage(String sector_coverage){
		persons_update_page.check_sector_coverage(sector_coverage);
	}
	@And ("^Check Optional Work History Phone Number \"(.*)\"$")
	public void check_phone_number(String phone_number){
		persons_update_page.check_phone_number(phone_number);
	}
	@And ("^Check Optional Work History Email \"(.*)\"$")
	public void check_work_email(String email){
		persons_update_page.check_work_email(email);
	}
	@And ("^Check Optional Currency Type \"(.*)\"$")
	public void check_currency_type(String currency_type){
		persons_update_page.check_currency_type(currency_type);
	}
	@And ("^Check Mandatory Coverage Company Name (.+)$")
	public void check_coverage_company_name(String company_name){
		persons_update_page.check_coverage_company_name(company_name);
	}
	@And ("^Check Optional Coverage Start Date \"(.*)\"$")
	public void check_coverage_start_date(String start_date){
		persons_update_page.check_coverage_start_date(start_date);
	}
	@And ("^Check Optional Coverage End Date \"(.*)\"$")
	public void check_coverage_end_date(String end_date){
		persons_update_page.check_coverage_end_date(end_date);
	}
}
