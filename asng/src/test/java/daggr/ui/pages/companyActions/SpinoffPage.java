package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class SpinoffPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_link_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_link_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement parent_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement parent_company_name_label;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]")
	WebElement spin_off_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement spin_off_company_name_label;
	
	@FindBy(xpath = "//label[text()='Add Company']")
	WebElement add_company;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']")
	WebElement effective_date;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']/preceding-sibling::label")
	WebElement effective_date_label;
	
	@FindBy(xpath = "//input[@placeholder='Select Time Zone']")
	WebElement time_zone;
	
	@FindBy(xpath = "//input[@placeholder='Select Time Zone']/ancestor::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement time_zone_label;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	List<WebElement> company_names_textboxes;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	public SpinoffPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_spinoff_selected(){
		selectbyVisibleText(selectList, "Spin-off");
	}
	
	public void enter_article_url(String article_link){
		check_before_sending_keys(article_link_textbox, article_link_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_link_textbox).sendKeys(article_link);
		check_after_sending_keys(article_link_textbox, article_link, "Article Link");
	}
	public void enter_spinoff_parent_company_name(String parentCompanyName) {
		check_before_sending_keys(parent_company_name, parent_company_name_label, "Enter Company Name", "Parent Company Name", "Parent Company Name");
		waitForExpectedElement(parent_company_name).sendKeys(parentCompanyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, parentCompanyName);
		check_after_sending_keys(parent_company_name, parentCompanyName, "Parent Company Name");
	}
	public void enter_spinoff_company_name(String spinoffCompanyName) {
		check_before_sending_keys(spin_off_company_name, spin_off_company_name_label, "Enter Company Name", "Spin-off Company Name", "Spin-off Company Name");
		waitForExpectedElement(spin_off_company_name).sendKeys(spinoffCompanyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, spinoffCompanyName);
		check_after_sending_keys(spin_off_company_name, spinoffCompanyName, "Spin-off Company Name");
	}
	public void enter_effective_date(String effectiveDate){
		check_before_sending_keys(effective_date, effective_date_label, "YYYY-MM-DD", "Effective Date", "Effective Date");
		waitForExpectedElement(effective_date).click();
		datepickerDateSelect(effectiveDate);
		check_after_sending_keys(effective_date, effectiveDate, "Effective Date");
	}
	public void enter_time_zone(String timeZone) {
		check_before_sending_keys(time_zone, time_zone_label, "Select Time Zone", "Time Zone", "Time Zone");
		waitForExpectedElement(time_zone).sendKeys(timeZone);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, timeZone);
		check_after_sending_keys(time_zone, timeZone, "Time Zone");
	}
	public void add_spinoff_company(String addSpinoffCompany) {
		waitForExpectedElement(add_company).click();
		WebElement spinoff_company_name = company_names_textboxes.get(company_names_textboxes.size()-1);
		String count = String.valueOf(company_names_textboxes.size()-2);
		WebElement merged_company_name_label = spinoff_company_name.findElement(By.xpath("ancestor::app-shared-company-search/preceding-sibling::label"));
		check_before_sending_keys(spinoff_company_name, merged_company_name_label, "Enter Company Name", "Spin-off Company Name "+count, "Spin-off Company "+count);
		waitForExpectedElement(spinoff_company_name).sendKeys(addSpinoffCompany);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, addSpinoffCompany);
		check_after_sending_keys(spinoff_company_name, addSpinoffCompany, "Spinoff Company "+count);
	}
	public void click_submit() {
		waitForExpectedElement(submit_button).click();
	}
}
