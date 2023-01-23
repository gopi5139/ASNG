package daggr.ui.pages.securities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class TickerInformationPage extends PageObjectUtils{
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_url_textbox;
	
	@FindBy(xpath = "(//label)[1]")
	WebElement article_url_label;
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "(//label)[4]")
	WebElement company_name_label;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']")
	WebElement ticker;
	
	@FindBy(xpath = "(//label)[5]")
	WebElement ticker_label;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']")
	WebElement exchange;
	
	@FindBy(xpath = "(//label)[6]")
	WebElement exchange_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']")
	WebElement security_type;
	
	@FindBy(xpath = "(//label)[7]")
	WebElement security_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']")
	WebElement security_category;
	
	@FindBy(xpath = "(//label)[9]")
	WebElement security_category_label;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_start_date']")
	WebElement trading_start_date;
	
	@FindBy(xpath = "(//label)[11]")
	WebElement trading_start_date_label;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_end_date']")
	WebElement trading_end_date;
	
	@FindBy(xpath = "(//label)[12]")
	WebElement trading_end_date_label;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']")
	WebElement trading_status;
	
	@FindBy(xpath = "(//label)[13]")
	WebElement trading_status_label;
	
	@FindBy(xpath = "(//label)[15]")
	WebElement primary_ticker_label;
	
	@FindBy(xpath = "(//label)[14]")
	WebElement primary_ticker_label_for_active;
	
	@FindBy(xpath = "(//input[@formcontrolname='primary_ticker'])[1]")
	WebElement primaryTickerRadioYes;
	
	@FindBy(xpath = "(//input[@formcontrolname='primary_ticker'])[2]")
	WebElement primaryTickerRadioNo;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']/option")
	List<WebElement> security_type_options;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']/option")
	List<WebElement> security_category_options;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/option")
	List<WebElement> trading_status_options;
	
	String trading_status_value;
	
	public TickerInformationPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void is_add_ticker_information_selected(){
		waitForExpectedElement(company_name);
		selectbyVisibleText(selectList, "Add Ticker Information");
	}
	
	public void enter_the_article_url(String article_url){
		check_before_sending_keys(article_url_textbox, article_url_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_url_textbox).sendKeys(article_url);
		check_after_sending_keys(article_url_textbox, article_url, "Article Link");
	}
	
	public void enter_company_name(String companyName){
		check_before_sending_keys(company_name, company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(company_name, companyName, "Company Name");
	}
	public void enter_ticker(String tickerDetails){
		check_before_sending_keys(ticker, ticker_label, "Enter Ticker", "Ticker", "Ticker");
		waitForExpectedElement(ticker).sendKeys(tickerDetails);
		check_after_sending_keys(ticker, tickerDetails, "Ticker");
	}
	public void enter_exchange(String exchangeDetails){
		check_before_sending_keys(exchange, exchange_label, "Select Exchange", "Exchange", "Exchange");
		waitForExpectedElement(exchange).sendKeys(exchangeDetails);
		waitForExpectedElement(select_from_dropdown).click();
		//check_after_sending_keys(exchange, exchangeDetails, "Exchange");
	}
	public void select_security_type(String securityType){
		check_before_select(security_type, security_type_label, "Security Type", "Security Type");
		if(!securityType.equals("")){
			selectbyVisibleText(security_type, securityType);
		}
		check_after_select(security_type_options, security_type, securityType, "Security Type");
	}
	public void select_security_category(String securityCategory){
		check_before_select(security_category, security_category_label, "Security Category", "Security Category");
		if(!securityCategory.equals("")){
			selectbyVisibleText(security_category, securityCategory);
		}
		check_after_select(security_category_options, security_category, securityCategory, "Security Category");
	}
	public void select_trading_start_date(String tradingStartDate){
		check_before_sending_keys(trading_start_date, trading_start_date_label, "YYYY-MM-DD", "Trading Start Date", "Trading Start Date");
		if(!tradingStartDate.equals("")){
			waitForExpectedElement(trading_start_date).click();
			datepickerDateSelect(tradingStartDate);
		}
		check_after_sending_keys(trading_start_date, tradingStartDate, "Trading Start Date");
	}
	public void select_trading_end_date(String tradingEndDate){
		check_before_sending_keys(trading_end_date, trading_end_date_label, "YYYY-MM-DD", "Trading end Date", "Trading End Date");
		if(!tradingEndDate.equals("")){
			waitForExpectedElement(trading_end_date).click();
			datepickerDateSelect(tradingEndDate);
		}
		check_after_sending_keys(trading_end_date, tradingEndDate, "Trading End Date");
	}
	public void select_trading_status(String tradingStatus){
		check_before_select(trading_status, trading_status_label, "Trading Status", "Trading Status");
		selectbyVisibleText(trading_status, tradingStatus);
		check_after_select(trading_status_options, trading_status, tradingStatus, "Trading Status");
		trading_status_value = tradingStatus;
	}
	public void select_primary_ticker(String primaryTicker){
		if(trading_status_value.equalsIgnoreCase("active")){
			check_before_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primary_ticker_label_for_active, "Primary Ticker", "Primary Ticker");
		}
		else{
			check_before_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primary_ticker_label, "Primary Ticker", "Primary Ticker");
		}
		if(primaryTicker.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(primaryTickerRadioYes).click();
		}
		else if(primaryTicker.equalsIgnoreCase("No")){
			waitForExpectedElement(primaryTickerRadioNo).click();
		}
		check_after_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primaryTicker, "Primary Ticker");
	}
	public void click_submit_button(){
		waitForExpectedElement(submit_button).click();
	}
}
