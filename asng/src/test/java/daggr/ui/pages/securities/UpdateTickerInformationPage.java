package daggr.ui.pages.securities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class UpdateTickerInformationPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "(//label)[1]")
	WebElement company_name_label;
	
	@FindBy(xpath = "//div[@class='suggestions-container is-visible']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']")
	WebElement ticker;
	
	@FindBy(xpath = "(//label)[2]")
	WebElement ticker_label;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']")
	WebElement exchange;
	
	@FindBy(xpath = "(//label)[3]")
	WebElement exchange_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']")
	WebElement security_type;
	
	@FindBy(xpath = "(//label)[4]")
	WebElement security_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']")
	WebElement security_category;
	
	@FindBy(xpath = "(//label)[6]")
	WebElement security_category_label;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_start_date']")
	WebElement trading_start_date;
	
	@FindBy(xpath = "(//label)[8]")
	WebElement trading_start_date_label;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_end_date']")
	WebElement trading_end_date;
	
	@FindBy(xpath = "(//label)[9]")
	WebElement trading_end_date_label;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']")
	WebElement trading_status;
	
	@FindBy(xpath = "(//label)[10]")
	WebElement trading_status_label;
	
	@FindBy(xpath = "(//label)[12]")
	WebElement primary_ticker_label;
	
	@FindBy(xpath = "(//label)[11]")
	WebElement primary_ticker_label_for_active;
	
	@FindBy(xpath = "(//input[@formcontrolname='primary_ticker'])[1]")
	WebElement primaryTickerRadioYes;
	
	@FindBy(xpath = "(//input[@formcontrolname='primary_ticker'])[2]")
	WebElement primaryTickerRadioNo;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update_button;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']/option")
	List<WebElement> security_type_options;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']/option")
	List<WebElement> security_category_options;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/option")
	List<WebElement> trading_status_options;
	
	String trading_status_value;
	
	public UpdateTickerInformationPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void update_company_name(String companyName){
		waitForExpectedElement(company_name).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(company_name).sendKeys(Keys.DELETE);
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(company_name, companyName, "Company Name");
	}
	public void update_ticker(String tickerDetails){
		waitForExpectedElement(ticker).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ticker).sendKeys(Keys.DELETE);
		waitForExpectedElement(ticker).sendKeys(tickerDetails);
		check_after_sending_keys(ticker, tickerDetails, "Ticker");
	}
	public void update_exchange(String exchangeDetails){
		waitForExpectedElement(exchange).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(exchange).sendKeys(Keys.DELETE);
		waitForExpectedElement(exchange).sendKeys(exchangeDetails);
		waitForExpectedElement(select_from_dropdown).click();
		//check_after_sending_keys(exchange, exchangeDetails, "Exchange");
	}
	public void update_security_type(String securityType){
		if(!securityType.equals("")){
			selectbyVisibleText(security_type, securityType);
		}else {
			securityType = "Select One";
			selectbyVisibleText(security_category, securityType);
		}
		check_after_select(security_type_options, security_type, securityType, "Security Type");
	}
	public void update_security_category(String securityCategory){
		if(!securityCategory.equals("")){
			selectbyVisibleText(security_category, securityCategory);
		}else {
			securityCategory = "Select One";
			selectbyVisibleText(security_category, securityCategory);
		}
		check_after_select(security_category_options, security_category, securityCategory, "Security Category");
	}
	public void update_trading_start_date(String tradingStartDate){
		if(!tradingStartDate.equals("")){
			waitForExpectedElement(trading_start_date).click();
			datepickerDateSelect(tradingStartDate);
		}else {
			waitForExpectedElement(trading_start_date).sendKeys(Keys.CONTROL + "a");
			waitForExpectedElement(trading_start_date).sendKeys(Keys.DELETE);
			waitForExpectedElement(trading_start_date).sendKeys(Keys.TAB);
		}
		check_after_sending_keys(trading_start_date, tradingStartDate, "Trading Start Date");
	}
	public void update_trading_end_date(String tradingEndDate){
		if(!tradingEndDate.equals("")){
			waitForExpectedElement(trading_end_date).click();
			datepickerDateSelect(tradingEndDate);
		}else {
			waitForExpectedElement(trading_end_date).sendKeys(Keys.CONTROL + "a");
			waitForExpectedElement(trading_end_date).sendKeys(Keys.DELETE);
			waitForExpectedElement(trading_end_date).sendKeys(Keys.TAB);
		}
		check_after_sending_keys(trading_end_date, tradingEndDate, "Trading End Date");
	}
	public void update_trading_status(String tradingStatus){
		selectbyVisibleText(trading_status, tradingStatus);
		check_after_select(trading_status_options, trading_status, tradingStatus, "Trading Status");
		trading_status_value = tradingStatus;
	}
	public void update_primary_ticker(String primaryTicker){
		if(primaryTicker.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(primaryTickerRadioYes).click();
		}
		else if(primaryTicker.equalsIgnoreCase("No")){
			waitForExpectedElement(primaryTickerRadioNo).click();
		}
		check_after_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primaryTicker, "Primary Ticker");
	}
	public void click_update_button(){
		waitForExpectedElement(update_button).click();
	}
}
