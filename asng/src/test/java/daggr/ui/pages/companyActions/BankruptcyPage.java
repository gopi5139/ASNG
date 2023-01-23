package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class BankruptcyPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;

	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_link_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_link_label;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement company_name_label;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='bankruptcy_type']")
	WebElement bankruptcy_type;
	
	@FindBy(xpath = "//select[@formcontrolname='bankruptcy_type']/preceding-sibling::label")
	WebElement bankruptcy_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='bankruptcy_type']/option")
	List<WebElement> bankruptcy_type_options;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']")
	WebElement effective_date;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']/preceding-sibling::label")
	WebElement effective_date_label;
	
	@FindBy(xpath = "//input[@placeholder='Select Time Zone']")
	WebElement time_zone;
	
	@FindBy(xpath = "//input[@placeholder='Select Time Zone']/ancestor::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement time_zone_label;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	public BankruptcyPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void is_bankruptcy_selected() {
		selectbyVisibleText(selectList, "Bankruptcy");
	}

	public void enter_article_url(String article_link) {
		check_before_sending_keys(article_link_textbox, article_link_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_link_textbox).sendKeys(article_link);
		check_after_sending_keys(article_link_textbox, article_link, "Article Link");
	}

	public void enter_company_name(String companyName) {
		check_before_sending_keys(company_name, company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, companyName);
		check_after_sending_keys(company_name, companyName, "Company Name");
	}
	
	public void select_bankruptcy_type(String bankruptcyType){
		check_before_select(bankruptcy_type, bankruptcy_type_label, "Bankruptcy Type", "Bankruptcy Type");
		selectbyVisibleText(bankruptcy_type, bankruptcyType);
		check_after_select(bankruptcy_type_options, bankruptcy_type, bankruptcyType, "Bankruptcy Type");
	}

	public void enter_effective_date(String effectiveDate) {
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

	public void click_submit() {
		waitForExpectedElement(submit_button).click();
	}

}
