package daggr.ui.pages.persons;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class AddPersons_WorkHistory extends PageObjectUtils{
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement work_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]/parent::div/parent::div/parent::ng-autocomplete/parent::div/parent::app-shared-company-search/preceding-sibling::label")
	WebElement company_name_label;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//input[@formcontrolname='currently_working']/parent::div/parent::div/preceding-sibling::div/p")
	WebElement currently_working_label;
	
	@FindBy(xpath = "(//input[@formcontrolname='currently_working'])[1]")
	WebElement currently_working_yes;
	
	@FindBy(xpath = "(//input[@formcontrolname='currently_working'])[2]")
	WebElement currently_working_no;
	
	@FindBy(xpath = "//input[@formcontrolname='designation']/preceding-sibling::label")
	WebElement work_designation_label;
	
	@FindBy(xpath = "//input[@formcontrolname='designation']")
	WebElement work_designation;
	
	@FindBy(xpath = "//input[@formcontrolname='description']/preceding-sibling::label")
	WebElement work_description_label;
	
	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement work_description;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='start_date']/preceding-sibling::label")
	WebElement work_start_date_label;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='start_date']")
	WebElement work_start_date;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='end_date']/preceding-sibling::label")
	WebElement work_end_date_label;
	
	@FindBy(xpath = "//div[@formarrayname='work_history']//input[@formcontrolname='end_date']")
	WebElement work_end_date;
	
	@FindBy(xpath = "//select[@formcontrolname='type']/preceding-sibling::label")
	WebElement details_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='type']")
	WebElement details_type;
	
	@FindBy(xpath = "//select[@formcontrolname='type']/option")
	List<WebElement> details_type_options;
	
	@FindBy(xpath = "//input[@formcontrolname='year']")
	WebElement year_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='year']/preceding-sibling::label")
	WebElement year_label;
	
	@FindBy(xpath = "//input[@placeholder='Currency']")
	WebElement currency_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Currency']/parent::div/parent::div/parent::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement currency_label;
	
	@FindBy(xpath = "//input[@formcontrolname='salary']")
	WebElement salary_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='salary']/preceding-sibling::label")
	WebElement salary_label;
	
	@FindBy(xpath = "//input[@formcontrolname='bonus']")
	WebElement bonus_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='bonus']/preceding-sibling::label")
	WebElement bonus_label;
	
	@FindBy(xpath = "//input[@formcontrolname='cash_awards']")
	WebElement cash_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='cash_awards']/preceding-sibling::label")
	WebElement cash_awards_label;
	
	@FindBy(xpath = "//input[@formcontrolname='stock_awards']")
	WebElement stock_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='stock_awards']/preceding-sibling::label")
	WebElement stock_awards_label;
	
	@FindBy(xpath = "//input[@formcontrolname='option_awards']")
	WebElement option_awards_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='option_awards']/preceding-sibling::label")
	WebElement option_awards_label;
	
	@FindBy(xpath = "//input[@formcontrolname='pension_and_deferred']")
	WebElement pension_and_deferred_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='pension_and_deferred']/preceding-sibling::label")
	WebElement pension_and_deferred_label;
	
	@FindBy(xpath = "//input[@formcontrolname='non_equity_incentives']")
	WebElement non_equity_incentives_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='non_equity_incentives']/preceding-sibling::label")
	WebElement non_equity_incentives_label;
	
	@FindBy(xpath = "//input[@formcontrolname='other_compensation']")
	WebElement other_compensation_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='other_compensation']/preceding-sibling::label")
	WebElement other_compensation_label;
	
	@FindBy(xpath = "//input[@formcontrolname='total']")
	WebElement total_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='total']/preceding-sibling::label")
	WebElement total_label;
	
	@FindBy(xpath = "//label[text()='Phone number']/following-sibling::input")
	WebElement phone_number_textbox;
	
	@FindBy(xpath = "//label[text()='Phone number']")
	WebElement phone_number_label;
	
	@FindBy(xpath = "(//label[text()='Email']/following-sibling::input)[2]")
	WebElement email_textbox;
	
	@FindBy(xpath = "(//label[text()='Email'])[2]")
	WebElement email_label;
	
	@FindBy(xpath = "//input[@placeholder='Currency type']")
	WebElement currency_type_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Currency type']/parent::div/parent::div/parent::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement currency_type_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]")
	WebElement coverage_company_name_textbox;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]/parent::div/parent::div/parent::ng-autocomplete/parent::div/parent::app-shared-company-search/preceding-sibling::label")
	WebElement coverage_company_name_label;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_start_date']")
	WebElement coverage_start_date_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_start_date']/preceding-sibling::label")
	WebElement coverage_start_date_label;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_end_date']")
	WebElement coverage_end_date_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='coverage_end_date']/preceding-sibling::label")
	WebElement coverage_end_date_label;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']")
	WebElement sector_coverage;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']/div[2]/ul[1]")
	WebElement sector_coverage_select_all;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']/div[2]/ul[2]")
	WebElement sector_coverage_specified;
	
	@FindBy(xpath = "//span[@style='float:right !important;padding-right:4px']")
	WebElement sector_coverage_dropdown_icon;
	
	public AddPersons_WorkHistory() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void enter_work_history_company_name(String companyName){
		check_before_sending_keys(work_company_name, company_name_label, "Enter Company Name", "Company Name*", "Work History Company Name");
		waitForExpectedElement(work_company_name).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(work_company_name, companyName, "Work History Company Name");
	}
	public void select_currently_working(String currentlyWorking){
		check_before_radio_select(currently_working_yes, currently_working_no, currently_working_label, "Currently Working", "Currently Working");
		if(currentlyWorking.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(currently_working_yes).click();
		}else {
			waitForExpectedElement(currently_working_no).click();
		}
		check_after_radio_select(currently_working_yes, currently_working_no, currentlyWorking, "Currently Working");
	}
	public void enter_work_designation(String workDesignation){
		check_before_sending_keys(work_designation, work_designation_label, "Enter Designation", "Designation *", "Designation");
		waitForExpectedElement(work_designation).sendKeys(workDesignation);
		check_after_sending_keys(work_designation, workDesignation, "Work Designation");
	}
	public void enter_work_description(String educationalDescription){
		check_before_sending_keys(work_description, work_description_label, "Enter Description", "Description", "Description");
		waitForExpectedElement(work_description).sendKeys(educationalDescription);
		check_after_sending_keys(work_description, educationalDescription, "Work Description");
	}
	public void select_work_start_date(String workStartDate){
		check_before_sending_keys(work_start_date, work_start_date_label, "YYYY-MM-DD", "Start date", "Work Start date");
		waitForExpectedElement(work_start_date).click();
		datepickerDateSelect(workStartDate);
		check_after_sending_keys(work_start_date, workStartDate, "Work Start date");
	}
	public void select_work_end_date(String workEndDate){
		check_before_sending_keys(work_end_date, work_end_date_label, "YYYY-MM-DD", "End date", "Work End date");
		waitForExpectedElement(work_end_date).click();
		datepickerDateSelect(workEndDate);
		check_after_sending_keys(work_end_date, workEndDate, "Work End date");
	}
	public void select_details_type(String detailsType){
		check_before_select(details_type, details_type_label, "Type *", "Type");
		selectbyVisibleText(details_type, detailsType.toUpperCase());
		check_after_select(details_type_options, details_type, detailsType.toUpperCase(), "Type");
	}
	public void enter_year(String workYear){
		check_before_sending_keys(year_textbox, year_label, "Year", "Year", "Year");
		waitForExpectedElement(year_textbox).sendKeys(workYear);
		check_after_sending_keys(year_textbox, workYear, "Year");
	}
	public void enter_currency(String currency){
		check_before_sending_keys(currency_textbox, currency_label, "Currency", "Currency", "Currency");
		waitForExpectedElement(currency_textbox).sendKeys(currency);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(currency_textbox, currency, "Currency");
	}
	public void enter_salary(String salary){
		check_before_sending_keys(salary_textbox, salary_label, "Salary", "Salary", "Salary");
		waitForExpectedElement(salary_textbox).sendKeys(salary);
		check_after_sending_keys(salary_textbox, salary, "Salary");
	}
	public void enter_bonus(String bonus){
		check_before_sending_keys(bonus_textbox, bonus_label, "Bonus", "Bonus", "Bonus");
		waitForExpectedElement(bonus_textbox).sendKeys(bonus);
		check_after_sending_keys(bonus_textbox, bonus, "Bonus");
	}
	public void enter_cash_awards(String cash_awards){
		check_before_sending_keys(cash_awards_textbox, cash_awards_label, "Cash Awards", "Cash Awards", "Cash Awards");
		waitForExpectedElement(cash_awards_textbox).sendKeys(cash_awards);
		check_after_sending_keys(cash_awards_textbox, cash_awards, "Cash Awards");
	}
	public void enter_stock_awards(String stock_awards){
		check_before_sending_keys(stock_awards_textbox, stock_awards_label, "Stock Awards", "Stock Awards", "Stock Awards");
		waitForExpectedElement(stock_awards_textbox).sendKeys(stock_awards);
		check_after_sending_keys(stock_awards_textbox, stock_awards, "Stock Awards");
	}
	public void enter_option_awards(String option_awards){
		check_before_sending_keys(option_awards_textbox, option_awards_label, "Option Awards", "Option Awards", "Option Awards");
		waitForExpectedElement(option_awards_textbox).sendKeys(option_awards);
		check_after_sending_keys(option_awards_textbox, option_awards, "Option Awards");
	}
	public void enter_pension_deferred(String pension_deferred){
		check_before_sending_keys(pension_and_deferred_textbox, pension_and_deferred_label, "Pension & Deferred", "Pension & Deferred", "Pension & Deferred");
		waitForExpectedElement(pension_and_deferred_textbox).sendKeys(pension_deferred);
		check_after_sending_keys(pension_and_deferred_textbox, pension_deferred, "Pension & Deferred");
	}
	public void enter_non_equity_incentives(String non_equity_incentives){
		check_before_sending_keys(non_equity_incentives_textbox, non_equity_incentives_label, "Non Equity Incentives", "Non Equity Incentives", "Non Equity Incentives");
		waitForExpectedElement(non_equity_incentives_textbox).sendKeys(non_equity_incentives);
		check_after_sending_keys(non_equity_incentives_textbox, non_equity_incentives, "Non Equity Incentives");
	}
	public void enter_other_compensation(String other_compensation){
		check_before_sending_keys(other_compensation_textbox, other_compensation_label, "Other Compensation", "Other Compensation", "Other Compensation");
		waitForExpectedElement(other_compensation_textbox).sendKeys(other_compensation);
		check_after_sending_keys(other_compensation_textbox, other_compensation, "Other Compensation");
	}
	public void enter_total(String total){
		check_before_sending_keys(total_textbox, total_label, "Total", "Total", "Total");
		waitForExpectedElement(total_textbox).sendKeys(total);
		check_after_sending_keys(total_textbox, total, "Total");
	}
	public void enter_sector_coverage(String sectorCoverage){
		check_multiselect_before_sending_keys(sector_coverage,"Sector Coverage", "Sector Coverage");
		if(!sectorCoverage.equals("")) {
			waitForExpectedElement(sector_coverage).click();
			String sectorCoverageArray[]= sectorCoverage.split(",");
			Arrays.sort(sectorCoverageArray);
			List<WebElement> sectorCoverageList=waitForExpectedElement(sector_coverage_specified).findElements(By.tagName("li"));
			for (WebElement li : sectorCoverageList) {
				for(int i=0 ;i<sectorCoverageArray.length;i++) {
					if (li.getText().equals(sectorCoverageArray[i])) {
						li.click();
					}
				}
			}
			waitForExpectedElement(sector_coverage_dropdown_icon).click();
		}
		check_multiselect_after_sending_keys(sector_coverage, sectorCoverage, "Sector Coverage");
	}
	public void enter_phone_number(String phone_number){
		check_before_sending_keys(phone_number_textbox, phone_number_label, "Enter Sector Coverage", "Phone number", "Phone number");
		waitForExpectedElement(phone_number_textbox).sendKeys(phone_number);
		check_after_sending_keys(phone_number_textbox, phone_number, "Phone number");
	}
	public void enter_email(String email){
		check_before_sending_keys(email_textbox, email_label, "Enter Sector Coverage", "Email", "Email");
		waitForExpectedElement(email_textbox).sendKeys(email);
		check_after_sending_keys(email_textbox, email, "Email");
	}
	public void enter_currency_type(String currency_type){
		check_before_sending_keys(currency_type_textbox, currency_type_label, "Currency type", "Currency type", "Currency type");
		waitForExpectedElement(currency_type_textbox).sendKeys(currency_type);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(currency_type_textbox, currency_type, "Currency type");
	}
	public void enter_coverage_company_name(String coverage_company_name){
		check_before_sending_keys(coverage_company_name_textbox, coverage_company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(coverage_company_name_textbox).sendKeys(coverage_company_name);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(coverage_company_name_textbox, coverage_company_name, "Company Name");
	}
	public void select_coverage_start_date(String coverage_start_date){
		check_before_sending_keys(coverage_start_date_textbox, coverage_start_date_label, "YYYY-MM-DD", "Coverage Start date", "Coverage Start date");
		waitForExpectedElement(coverage_start_date_textbox).click();
		datepickerDateSelect(coverage_start_date);
		check_after_sending_keys(coverage_start_date_textbox, coverage_start_date, "Coverage Start date");
	}
	public void select_coverage_end_date(String coverage_end_date){
		check_before_sending_keys(coverage_end_date_textbox, coverage_end_date_label, "YYYY-MM-DD", "Coverage End date", "Coverage End date");
		waitForExpectedElement(coverage_end_date_textbox).click();
		datepickerDateSelect(coverage_end_date);
		check_after_sending_keys(coverage_end_date_textbox, coverage_end_date, "Coverage End date");
	}
}
