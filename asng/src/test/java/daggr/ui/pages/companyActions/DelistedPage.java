package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class DelistedPage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
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
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']")
	WebElement trading_status;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/preceding-sibling::label")
	WebElement trading_status_label;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/option")
	List<WebElement> trading_status_options;
	
	@FindBy(css = "span.checkmark")
	WebElement mark_company_as_private;
	
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
	
	public DelistedPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void is_delisted_selected() {
		selectbyVisibleText(selectList, "Delisted");
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
	
	public void select_trading_status(String tradingStatus) {
		check_before_select(trading_status, trading_status_label, "Trading Status", "Trading Status");
		selectbyVisibleText(trading_status, tradingStatus);
		check_after_select(trading_status_options, trading_status, tradingStatus, "Trading Status");
	}
	
	public void select_mark_company_as_private(String markCompanyAsPrivate) {
		if(mark_company_as_private.isSelected()==false) {
			if(Boolean.parseBoolean(markCompanyAsPrivate) == true) {
				waitForExpectedElement(mark_company_as_private).click();
			}
		}
		else {
			soft.assertTrue(false, "Mark Company as Private by default not selected");
		}
	}

	public void enter_effective_date(String effectiveDate) {
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
