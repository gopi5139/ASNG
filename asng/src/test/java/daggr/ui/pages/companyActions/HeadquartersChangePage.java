package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class HeadquartersChangePage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_link_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_link_label;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement company_name;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement company_name_label;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "//input[@placeholder='Select country']")
	WebElement new_headquarters;
	
	@FindBy(xpath = "//input[@placeholder='Select country']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement new_headquarters_label;
	
	@FindBy(xpath = "//input[@placeholder='Select state']")
	WebElement new_state;
	
	@FindBy(xpath = "//input[@placeholder='Select state']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement new_state_label;
	
	@FindBy(xpath = "//input[@placeholder='Select city']")
	WebElement new_city;
	
	@FindBy(xpath = "//input[@placeholder='Select city']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement new_city_label;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']")
	WebElement effective_date;
	
	@FindBy(xpath = "//input[@formcontrolname='effective_date']/preceding-sibling::label")
	WebElement effective_date_label;
	
	@FindBy(xpath = "//input[@placeholder='Select TimeZone']")
	WebElement time_zone;
	
	@FindBy(xpath = "//input[@placeholder='Select TimeZone']/ancestor::ng-autocomplete/parent::div/preceding-sibling::label")
	WebElement time_zone_label;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	public HeadquartersChangePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_headquarters_change_selected(){
		selectbyVisibleText(selectList, "Headquarters Change");
	}
	
	public void enter_article_url(String article_link){
		check_before_sending_keys(article_link_textbox, article_link_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_link_textbox).sendKeys(article_link);
		check_after_sending_keys(article_link_textbox, article_link, "Article Link");
	}
	public void enter_headquarters_change_company_name(String companyName) {
		check_before_sending_keys(company_name, company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, companyName);
		check_after_sending_keys(company_name, companyName, "Company Name");
		sleep(3000);
	}
	public void enter_headquarters_change_new_headquarters(String newHeadquarter) {
		check_before_sending_keys(new_headquarters, new_headquarters_label, "Select country", "New Headquarters", "New Hedquarters");
		waitForExpectedElement(new_headquarters).sendKeys(newHeadquarter);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, newHeadquarter);
		check_after_sending_keys(new_headquarters, newHeadquarter, "New Hedquarters");
	}
	public void enter_headquarters_change_new_state(String newState) {
		check_before_sending_keys(new_state, new_state_label, "Select state", "New State", "New State");
		waitForExpectedElement(new_state).sendKeys(newState);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, newState);
		check_after_sending_keys(new_state, newState, "New State");
	}
	public void enter_headquarters_change_new_city(String newCity) {
		check_before_sending_keys(new_city, new_city_label, "Select city", "City", "City");
		waitForExpectedElement(new_city).sendKeys(newCity);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, newCity);
		check_after_sending_keys(new_city, newCity, "City");
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
	public void click_submit() {
		waitForExpectedElement(submit_button).click();
	}
}
