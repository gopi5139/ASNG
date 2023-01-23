package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class ExchangeAndTickerChangePage extends PageObjectUtils{
	
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
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_exchange_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='security_id']")
	WebElement ticker_exchange;
	
	@FindBy(xpath = "//select[@formcontrolname='security_id']/preceding-sibling::label")
	WebElement ticker_exchange_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_id']/option")
	List<WebElement> ticker_exchange_options;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']")
	WebElement new_exchange;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']/ancestor::app-exchange-search/preceding-sibling::label")
	WebElement new_exchange_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']")
	WebElement new_ticker;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']/preceding-sibling::label")
	WebElement new_ticker_label;
	
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
	
	public ExchangeAndTickerChangePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void is_exchange_and_ticker_change_selected() {
		selectbyVisibleText(selectList, "Exchange & Ticker Change");
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
	
	public void select_ticker_exchange(String tickerExchange){
		check_before_select(ticker_exchange, ticker_exchange_label, "Ticker - Exchange", "Ticker - Exchange");
		sleep(4000);
		selectbyVisibleText(ticker_exchange, tickerExchange);
		check_after_select(ticker_exchange_options, ticker_exchange, tickerExchange, "Ticker - Exchange");
	}
	
	public void enter_new_ticker(String newTicker) {
		check_before_sending_keys(new_ticker, new_ticker_label, "Enter Ticker", "New Ticker", "New Ticker");
		waitForExpectedElement(new_ticker).sendKeys(newTicker);
		check_after_sending_keys(new_ticker, newTicker, "Article Link");
	}
	
	public void enter_new_exchange(String newExchange) {
		check_before_sending_keys(new_exchange, new_exchange_label, "Select Exchange", "New Exchange", "New Exchange");
		waitForExpectedElement(new_exchange).sendKeys(newExchange);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		waitForExpectedElement(select_exchange_autocomplete).click();
		//check_after_sending_keys(new_exchange, newExchange, "New Exchange");
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
