package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class AcquisitionPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_link_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_link_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement acquirer_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement acquirer_company_name_label;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]")
	WebElement target_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[2]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement target_company_name_label;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']")
	WebElement effective_date;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']/preceding-sibling::label")
	WebElement effective_date_label;
	
	@FindBy(xpath = "//input[@placeholder='Select TimeZone']")
	WebElement time_zone;
	
	@FindBy(xpath = "//input[@placeholder='Select TimeZone']/ancestor::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement time_zone_label;
	
	@FindBy(xpath = "(//input[@formcontrolname='post_acquisition'])[1]")
	WebElement company_name_changed_post_acquisition_yes;
	
	@FindBy(xpath = "(//input[@formcontrolname='post_acquisition'])[2]")
	WebElement company_name_changed_post_acquisition_no;
	
	@FindBy(xpath = "(//input[@formcontrolname='post_acquisition'])[1]/parent::div/parent::div/preceding-sibling::label")
	WebElement company_name_changed_post_acquisition_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[3]")
	WebElement new_company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[3]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement new_company_name_label;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	public AcquisitionPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_acquisition_selected(){
		selectbyVisibleText(selectList, "Acquisition");
	}
	
	public void enter_article_url(String article_link){
		check_before_sending_keys(article_link_textbox, article_link_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_link_textbox).sendKeys(article_link);
		check_after_sending_keys(article_link_textbox, article_link, "Article Link");
	}
	public void enter_acquirer_company_name(String acquirerCompanyName) {
		check_before_sending_keys(acquirer_company_name, acquirer_company_name_label, "Enter Company Name", "Acquirer Company Name", "Acquirer Company Name");
		waitForExpectedElement(acquirer_company_name).sendKeys(acquirerCompanyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, acquirerCompanyName);
		check_after_sending_keys(acquirer_company_name, acquirerCompanyName, "Acquirer Company Name");
	}
	public void enter_target_company_name(String targetCompanyName) {
		check_before_sending_keys(target_company_name, target_company_name_label, "Enter Company Name", "Target Company Name", "Target Company Name");
		waitForExpectedElement(target_company_name).sendKeys(targetCompanyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, targetCompanyName);
		check_after_sending_keys(target_company_name, targetCompanyName, "Target Company Name");
	}
	public void enter_effective_date(String effectiveDate){
		check_before_sending_keys(effective_date, effective_date_label, "YYYY-MM-DD", "Effective Date", "Effective Date");
		waitForExpectedElement(effective_date).click();
		datepickerDateSelect(effectiveDate);
		check_after_sending_keys(effective_date, effectiveDate, "Effective Date");
	}
	public void enter_time_zone(String timeZone) {
		check_before_sending_keys(time_zone, time_zone_label, "Select TimeZone", "Time Zone", "Time Zone");
		waitForExpectedElement(time_zone).sendKeys(timeZone);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, timeZone);
		check_after_sending_keys(time_zone, timeZone, "Time Zone");
	}
	public void select_company_name_changed_post_acquisition(String companyNameChangedPostAcquisition) {
		check_before_radio_select_default_yes(company_name_changed_post_acquisition_yes, company_name_changed_post_acquisition_no, company_name_changed_post_acquisition_label, "Company Name Changed Post Acquisition", "Company Name Changed Post Acquisition");
		if(companyNameChangedPostAcquisition.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(company_name_changed_post_acquisition_yes).click();
		}else if(companyNameChangedPostAcquisition.equalsIgnoreCase("No")) {
			waitForExpectedElement(company_name_changed_post_acquisition_no).click();
		}
		check_after_radio_select(company_name_changed_post_acquisition_yes, company_name_changed_post_acquisition_no, companyNameChangedPostAcquisition, "Company Name Changed Post Acquisition");
	}
	public void enter_new_company_name(String newCompanyName) {
		if(!newCompanyName.equals("")) {
			check_before_sending_keys(new_company_name, new_company_name_label, "Enter Company Name", "New Company Name", "New Company Name");
			waitForExpectedElement(new_company_name).sendKeys(newCompanyName);
			waitForExpectedElement(autocomplete_dropdown).isDisplayed();
			waitForExpectedElement(new_company_name).sendKeys(Keys.TAB);
			check_after_sending_keys(new_company_name, newCompanyName, "New Company Name");
		}
	}
	public void click_submit() {
		waitForExpectedElement(submit_button).click();
	}
}
