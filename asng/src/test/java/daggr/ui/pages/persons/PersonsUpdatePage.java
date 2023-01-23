package daggr.ui.pages.persons;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class PersonsUpdatePage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath = "//input[@placeholder='Enter person Name']")
	WebElement person_name;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[1]")
	WebElement gender_male;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[2]")
	WebElement gender_female;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[3]")
	WebElement gender_others;
	
	@FindBy(xpath = "//select[@formcontrolname='person_status']")
	WebElement person_status;
	
	@FindBy(xpath = "//select[@formcontrolname='person_status']/option")
	List<WebElement> person_status_options;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement email_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='date_of_birth']")
	WebElement date_of_birth;
	
	@FindBy(xpath = "(//input[@formcontrolname='deceased'])[1]")
	WebElement deceased_yes;
	
	@FindBy(xpath = "(//input[@formcontrolname='deceased'])[2]")
	WebElement deceased_no;
	
	@FindBy(xpath = "//input[@formcontrolname='deceased_date']")
	WebElement deceased_date;
	
	@FindBy(xpath = "(//textarea[@formcontrolname='description'])[1]")
	WebElement biography_textarea;
	
	@FindBy(xpath = "//input[@formcontrolname='resigned_date']")
	WebElement resigned_date;
	
	@FindBy(xpath = "//input[@formcontrolname='dismissed_date']")
	WebElement dismissed_date;
	
	@FindBy(xpath = "//input[@formcontrolname='retired_date']")
	WebElement retired_date;
	
	@FindBy(xpath = "//input[@formcontrolname='educational_institution']")
	WebElement educational_institution;
	
	@FindBy(xpath = "//input[@formcontrolname='educational_qualification']")
	WebElement educational_qualification;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//textarea[@formcontrolname='description']")
	WebElement educational_description;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='start_date']")
	WebElement educational_start_date;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='end_date']")
	WebElement educational_end_date;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement work_company_name;
	
	@FindBy(xpath = "(//input[@formcontrolname='currently_working'])[1]")
	WebElement currently_working_yes;
	
	@FindBy(xpath = "(//input[@formcontrolname='currently_working'])[2]")
	WebElement currently_working_no;
	
	@FindBy(xpath = "//input[@formcontrolname='designation']")
	WebElement work_designation;
	
	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement work_description;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='start_date']")
	WebElement work_start_date;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='end_date']")
	WebElement work_end_date;
	
	@FindBy(xpath = "//select[@formcontrolname='type']")
	WebElement details_type;
	
	@FindBy(xpath = "//select[@formcontrolname='type']/option")
	List<WebElement> details_type_options;
	
	@FindBy(xpath = "//input[@formcontrolname='year']")
	WebElement year_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Currency']")
	WebElement currency_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='salary']")
	WebElement salary_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='bonus']")
	WebElement bonus_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='cash_awards']")
	WebElement cash_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='stock_awards']")
	WebElement stock_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='option_awards']")
	WebElement option_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='pension_and_deferred']")
	WebElement pension_and_deferred_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='non_equity_incentives']")
	WebElement non_equity_incentives_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='other_compensation']")
	WebElement other_compensation_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='total']")
	WebElement total_textbox;
	
	@FindBy(xpath = "//label[text()='Phone number']/following-sibling::input")
	WebElement phone_number_textbox;
	
	@FindBy(xpath = "(//label[text()='Email']/following-sibling::input)[2]")
	WebElement work_history_email_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Currency type']")
	WebElement currency_type_textbox;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]")
	WebElement coverage_company_name_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_start_date']")
	WebElement coverage_start_date_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_end_date']")
	WebElement coverage_end_date_textbox;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']")
	WebElement sector_coverage;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']/div[2]/ul[1]")
	WebElement sector_coverage_select_all;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']/div[2]/ul[2]")
	WebElement sector_coverage_specified;
	
	@FindBy(xpath = "//span[@style='float:right !important;padding-right:4px']")
	WebElement sector_coverage_dropdown_icon;
	
	public PersonsUpdatePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void check_person_name(String personName) {
		String tableValue = waitForExpectedElement(person_name).getAttribute("value");
		soft.assertEquals(tableValue, personName, "Person Name");
	}

	public void check_gender(String genderValue) {
		String tableValue;
		if(waitForExpectedElement(gender_male).isSelected()) {
			tableValue = "Male";
		}
		else if(waitForExpectedElement(gender_female).isSelected()){
			tableValue = "Female";
		}
		else {
			tableValue = "Others";
		}
		soft.assertEquals(tableValue, genderValue, "Gender");
	}

	public void check_person_status(String statusValue) {
		String tableValue = getTextBySelect(person_status_options, person_status);
		if(statusValue.equals("")){
			statusValue = "Select One";
		}
		soft.assertEquals(tableValue, statusValue, "Status");
	}

	public void check_resigned_date(String resignedDate) {
		String tableValue = waitForExpectedElement(resigned_date).getAttribute("value");
		soft.assertEquals(tableValue, resignedDate, "Resigned Date");
	}

	public void check_retired_date(String retiredDate) {
		String tableValue = waitForExpectedElement(retired_date).getAttribute("value");
		soft.assertEquals(tableValue, retiredDate, "Retired Date");
	}

	public void check_dismissed_date(String dismissedDate) {
		String tableValue = waitForExpectedElement(dismissed_date).getAttribute("value");
		soft.assertEquals(tableValue, dismissedDate, "Dismissed Date");
	}

	public void check_email(String person_email) {
		String tableValue = waitForExpectedElement(email_textbox).getAttribute("value");
		soft.assertEquals(tableValue, person_email, "Email");
	}

	public void check_date_of_birth(String dob) {
		String tableValue = waitForExpectedElement(date_of_birth).getAttribute("value");
		soft.assertEquals(tableValue, dob, "Date Of Birth");
	}

	public void check_deceased(String deceased) {
		String tableValue;
		if(waitForExpectedElement(deceased_yes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(deceased_no).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, deceased, "Deceased");
	}

	public void check_deceased_date(String deceasedDate) {
		String tableValue = waitForExpectedElement(deceased_date).getAttribute("value");
		soft.assertEquals(tableValue, deceasedDate, "Deceased Date");
	}
	
	public void check_biography(String biography) {
		String tableValue = waitForExpectedElement(biography_textarea).getAttribute("value");
		soft.assertEquals(tableValue, biography, "Biography");
	}

	public void check_educational_institution(String eductaionalInstitution) {
		String tableValue = waitForExpectedElement(educational_institution).getAttribute("value");
		soft.assertEquals(tableValue, eductaionalInstitution, "Educational Institution");
	}

	public void check_educational_qualification(String educationalQualification) {
		String tableValue = waitForExpectedElement(educational_qualification).getAttribute("value");
		soft.assertEquals(tableValue, educationalQualification, "Educational Qualification");
	}

	public void check_educational_description(String educationalDescription) {
		String tableValue = waitForExpectedElement(educational_description).getAttribute("value");
		soft.assertEquals(tableValue, educationalDescription, "Educational Description");
	}

	public void check_educational_start_date(String startDate) {
		String tableValue = waitForExpectedElement(educational_start_date).getAttribute("value");
		soft.assertEquals(tableValue, startDate, "Educational Start  Date");
	}

	public void check_educational_end_date(String endDate) {
		String tableValue = waitForExpectedElement(educational_end_date).getAttribute("value");
		soft.assertEquals(tableValue, endDate, "Educational End  Date");
	}

	public void check_work_history_company_name(String company_name) {
		String tableValue = waitForExpectedElement(work_company_name).getAttribute("value");
		soft.assertEquals(tableValue, company_name, "Work History Company Name");
	}

	public void check_currently_working(String currently_working) {
		String tableValue;
		if(waitForExpectedElement(currently_working_yes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(currently_working_no).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, currently_working, "Currently Working");
	}

	public void check_work_designation(String designation) {
		String tableValue = waitForExpectedElement(work_designation).getAttribute("value");
		soft.assertEquals(tableValue, designation, "Work History Designation");
	}

	public void check_work_description(String desciption) {
		String tableValue = waitForExpectedElement(work_description).getAttribute("value");
		soft.assertEquals(tableValue, desciption, "Work History Description");
	}

	public void check_work_start_date(String start_date) {
		String tableValue = waitForExpectedElement(work_start_date).getAttribute("value");
		soft.assertEquals(tableValue, start_date, "Work History Start Date");
	}

	public void check_work_end_date(String end_date) {
		String tableValue = waitForExpectedElement(work_end_date).getAttribute("value");
		soft.assertEquals(tableValue, end_date, "Work History End Date");
	}

	public void check_details_type(String type) {
		String tableValue = getTextBySelect(details_type_options, details_type);
		if(type.equals("")){
			type = "Select One";
		}
		soft.assertEquals(tableValue, type.toUpperCase(), "Details Type");
	}

	public void check_year(String year) {
		String tableValue = waitForExpectedElement(year_textbox).getAttribute("value");
		soft.assertEquals(tableValue, year, "Year");
	}

	public void check_currency(String currency) {
		String tableValue = waitForExpectedElement(currency_textbox).getAttribute("value");
		soft.assertEquals(tableValue, currency, "Currecy");
	}

	public void check_salary(String salary) {
		String tableValue = waitForExpectedElement(salary_textbox).getAttribute("value");
		soft.assertEquals(tableValue, salary, "Salary");
	}

	public void check_bonus(String bonus) {
		String tableValue = waitForExpectedElement(bonus_textbox).getAttribute("value");
		soft.assertEquals(tableValue, bonus, "Bonus");
	}

	public void check_cash_awards(String cash_awards) {
		String tableValue = waitForExpectedElement(cash_awards_textbox).getAttribute("value");
		soft.assertEquals(tableValue, cash_awards, "Cash Awards");
	}

	public void check_stock_awards(String stock_awards) {
		String tableValue = waitForExpectedElement(stock_awards_textbox).getAttribute("value");
		soft.assertEquals(tableValue, stock_awards, "Stock Awards");
	}

	public void check_option_awards(String option_awards) {
		String tableValue = waitForExpectedElement(option_awards_textbox).getAttribute("value");
		soft.assertEquals(tableValue, option_awards, "Option Awards");
	}

	public void check_pension_deferred(String pension_deferred) {
		String tableValue = waitForExpectedElement(pension_and_deferred_textbox).getAttribute("value");
		soft.assertEquals(tableValue, pension_deferred, "Pension and Deferred");
	}

	public void check_non_equity_incentives(String non_equity_incentives) {
		String tableValue = waitForExpectedElement(non_equity_incentives_textbox).getAttribute("value");
		soft.assertEquals(tableValue, non_equity_incentives, "Non Equity Incentives");
	}

	public void check_other_compensation(String other_compensation) {
		String tableValue = waitForExpectedElement(other_compensation_textbox).getAttribute("value");
		soft.assertEquals(tableValue, other_compensation, "Other Compensation");
	}

	public void check_total(String total) {
		String tableValue = waitForExpectedElement(total_textbox).getAttribute("value");
		soft.assertEquals(tableValue, total, "Total");
	}

	public void check_sector_coverage(String sector_coverage) {
		check_sector_coverage_in_multiselect(sector_coverage,sector_coverage_specified,"Sector Coverage");
	}

	public void check_phone_number(String phone_number) {
		String tableValue = waitForExpectedElement(phone_number_textbox).getAttribute("value");
		soft.assertEquals(tableValue, phone_number, "Phone Number");
	}

	public void check_work_email(String work_email) {
		String tableValue = waitForExpectedElement(work_history_email_textbox).getAttribute("value");
		soft.assertEquals(tableValue, work_email, "Email");
	}
	
	public void check_currency_type(String currency_type) {
		String tableValue = waitForExpectedElement(currency_type_textbox).getAttribute("value");
		soft.assertEquals(tableValue, currency_type, "Currency Type");
	}

	public void check_coverage_company_name(String company_name) {
		String tableValue = waitForExpectedElement(coverage_company_name_textbox).getAttribute("value");
		soft.assertEquals(tableValue, company_name, "Coverage Company Name");
	}

	public void check_coverage_start_date(String start_date) {
		String tableValue = waitForExpectedElement(coverage_start_date_textbox).getAttribute("value");
		soft.assertEquals(tableValue, start_date, "Coverage Start Date");
	}

	public void check_coverage_end_date(String end_date) {
		String tableValue = waitForExpectedElement(coverage_end_date_textbox).getAttribute("value");
		soft.assertEquals(tableValue, end_date, "Coverage End Date");
	}

}
