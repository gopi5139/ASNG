package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class MergerPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_link_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_link_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement merger_company_name_1;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement merger_company_name_1_label;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]")
	WebElement merger_company_name_2;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement merger_company_name_2_label;
	
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
	
	public MergerPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_acquisition_selected(){
		selectbyVisibleText(selectList, "Merger");
	}
	
	public void enter_article_url(String article_link){
		check_before_sending_keys(article_link_textbox, article_link_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_link_textbox).sendKeys(article_link);
		check_after_sending_keys(article_link_textbox, article_link, "Article Link");
	}
	public void enter_merged_company_name_1(String mergerCompanyName1) {
		check_before_sending_keys(merger_company_name_1, merger_company_name_1_label, "Enter Company Name", "Merger Company 1 *", "Merger Company 1");
		waitForExpectedElement(merger_company_name_1).sendKeys(mergerCompanyName1);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, mergerCompanyName1);
		check_after_sending_keys(merger_company_name_1, mergerCompanyName1, "Merger Company 1");
	}
	public void enter_merged_company_name_2(String mergerCompanyName2) {
		check_before_sending_keys(merger_company_name_2, merger_company_name_2_label, "Enter Company Name", "Merger Company 2 *", "Merger Company 2");
		waitForExpectedElement(merger_company_name_2).sendKeys(mergerCompanyName2);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, mergerCompanyName2);
		check_after_sending_keys(merger_company_name_2, mergerCompanyName2, "Merger Company 2");
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
	public void add_merger_company(String addMergerCompany) {
		waitForExpectedElement(add_company).click();
		WebElement merged_company_name = company_names_textboxes.get(company_names_textboxes.size()-2);
		String count = String.valueOf(company_names_textboxes.size()-1);
		WebElement merged_company_name_label = merged_company_name.findElement(By.xpath("ancestor::app-shared-company-search/preceding-sibling::label"));
		check_before_sending_keys(merged_company_name, merged_company_name_label, "Enter Company Name", "Merger Company "+count+" *", "Merger Company "+count);
		waitForExpectedElement(merged_company_name).sendKeys(addMergerCompany);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, addMergerCompany);
		check_after_sending_keys(merged_company_name, addMergerCompany, "Merger Company "+count);
	}
	public void enter_merged_company_name(String mergedCompanyName) {
		WebElement merged_company_name = company_names_textboxes.get(company_names_textboxes.size()-1);
		WebElement merged_company_name_label = merged_company_name.findElement(By.xpath("ancestor::app-shared-company-search/preceding-sibling::label"));
		check_before_sending_keys(merged_company_name, merged_company_name_label, "Enter Company Name", "Merged Company Name", "Merged Company Name");
		waitForExpectedElement(merged_company_name).sendKeys(mergedCompanyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, mergedCompanyName);
		check_after_sending_keys(merged_company_name, mergedCompanyName, "Merged Company Name");
	}
	public void click_submit() {
		waitForExpectedElement(submit_button).click();
	}
}
