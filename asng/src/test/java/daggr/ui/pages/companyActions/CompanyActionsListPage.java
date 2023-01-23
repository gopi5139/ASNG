package daggr.ui.pages.companyActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CompanyActionsListPage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "//input[@placeholder='Enter companyAction']")
	WebElement company_action;
	
	@FindBy(xpath = "//button[text()='ApplyFilter']")
	WebElement apply_filter_button;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "//table/tbody/tr")
	List<WebElement> table_data;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement next_button;
	
	@FindBy(xpath = "//modal-container//table/tr[2]/td[2]")
	WebElement acquirer_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[16]/td[2]")
	WebElement target_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[8]/td[2]")
	WebElement acquisition_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[17]/td[2]")
	WebElement acquisition_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[11]/td[2]")
	WebElement post_acquisition;
	
	@FindBy(xpath = "//modal-container//table/tr[10]/td[2]")
	WebElement new_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[3]/td[2]")
	WebElement liquidation_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement liquidation_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[11]/td[2]")
	WebElement liquidation_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[4]/td[2]")
	WebElement bankruptcy_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[1]/td[2]")
	WebElement bankruptcy_type;
	
	@FindBy(xpath = "//modal-container//table/tr[7]/td[2]")
	WebElement bankruptcy_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[12]/td[2]")
	WebElement bankruptcy_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[3]/td[2]")
	WebElement company_name_change_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[8]/td[2]")
	WebElement company_name_change_new_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement company_name_change_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[12]/td[2]")
	WebElement company_name_change_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[3]/td[2]")
	WebElement exchange_ticker_change_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[10]/td[2]")
	WebElement exchange_ticker_change_old_ticker;
	
	@FindBy(xpath = "//modal-container//table/tr[9]/td[2]")
	WebElement exchange_ticker_change_old_exchange;
	
	@FindBy(xpath = "//modal-container//table/tr[7]/td[2]")
	WebElement exchange_ticker_change_new_exchange;
	
	@FindBy(xpath = "//modal-container//table/tr[15]/td[2]")
	WebElement exchange_ticker_change_new_ticker;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement exchange_ticker_change_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[16]/td[2]")
	WebElement exchange_ticker_change_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[4]/td[2]")
	WebElement headquarters_change_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[9]/td[2]")
	WebElement headquarters_change_new_headquarters;
	
	@FindBy(xpath = "//modal-container//table/tr[16]/td[2]")
	WebElement headquarters_change_new_state;
	
	@FindBy(xpath = "//modal-container//table/tr[1]/td[2]")
	WebElement headquarters_change_new_city;
	
	@FindBy(xpath = "//modal-container//table/tr[8]/td[2]")
	WebElement headquarters_change_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[18]/td[2]")
	WebElement headquarters_change_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[3]/td[2]")
	WebElement delisted_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[14]/td[2]")
	WebElement delisted_ticker;
	
	@FindBy(xpath = "//modal-container//table/tr[7]/td[2]")
	WebElement delisted_exchange;
	
	@FindBy(xpath = "//modal-container//table/tr[9]/td[2]")
	WebElement delisted_mark_company_as_private;
	
	@FindBy(xpath = "//modal-container//table/tr[16]/td[2]")
	WebElement delisted_trading_status;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement delisted_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[15]/td[2]")
	WebElement delisted_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement merger_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[14]/td[2]")
	WebElement merger_time_zone;
	
	@FindBy(xpath = "//modal-container//table/tr[9]/td[2]")
	WebElement merged_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[10]/td[2]")
	WebElement merger_company_names;
	
	@FindBy(xpath = "//modal-container//table/tr[12]/td[2]")
	WebElement spinoff_company_names;
	
	@FindBy(xpath = "//modal-container//table/tr[9]/td[2]")
	WebElement parent_company_name;
	
	@FindBy(xpath = "//modal-container//table/tr[6]/td[2]")
	WebElement spinoff_effective_date;
	
	@FindBy(xpath = "//modal-container//table/tr[14]/td[2]")
	WebElement spinoff_time_zone;
	
	public CompanyActionsListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void enter_company_name(String companyName) {
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, companyName);
	}

	public void enter_company_action(String companyAction) {
		waitForExpectedElement(company_action).sendKeys(companyAction);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, companyAction);
	}

	public void click_apply_filter() {
		waitForExpectedElement(apply_filter_button).click();
	}
	public void click_popup_from_table(String acquirer_company_name, String effective_date) {
		boolean isNotFound = true;
		do {
			for(WebElement row : table_data) {
				List<WebElement> coloumns = row.findElements(By.tagName("td"));
				if(coloumns.get(1).getText().trim().equalsIgnoreCase(acquirer_company_name)&&coloumns.get(3).getText().trim().equalsIgnoreCase(effective_date)) {
					coloumns.get(0).click();
					isNotFound = false;
					break;
				}
			}
			if(table_data.size() == 10 && isNotFound == true) {
				waitForExpectedElement(next_button).click();
			}
		}while(isNotFound);
		
	}
	public void verify_acquirer_company_name(String acqirerCompanyName) {
		String tableValue = waitForExpectedElement(acquirer_company_name).getText().trim();
		soft.assertEquals(acqirerCompanyName, tableValue, "Acquirer Company Name");
	}
	public void verify_target_company_name(String targetCompanyName) {
		String tableValue = waitForExpectedElement(target_company_name).getText().trim();
		soft.assertEquals(targetCompanyName, tableValue, "Target Company Name");
	}
	public void verify_acquisition_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(acquisition_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_acquisition_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(acquisition_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_post_acquistion(String postAcquistion) {
		String tableValue = waitForExpectedElement(post_acquisition).getText().trim();
		if(tableValue.equals("true")) {
			tableValue = "Yes";
		}else {
			tableValue = "No";
		}
		soft.assertEquals(postAcquistion, tableValue, "Post Acquisition");
	}
	public void verify_new_company_name(String newCompanyName) {
		String tableValue = waitForExpectedElement(new_company_name).getText().trim();
		soft.assertEquals(newCompanyName, tableValue, "New Company Name");
	}
	public void verify_liquidation_company_name(String companyName) {
		String tableValue = waitForExpectedElement(liquidation_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_liquidation_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(liquidation_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_liquidation_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(liquidation_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_bankruptcy_company_name(String companyName) {
		String tableValue = waitForExpectedElement(bankruptcy_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_bankruptcy_type(String bankruptcyType) {
		String tableValue = waitForExpectedElement(bankruptcy_type).getText().trim();
		String[] s = tableValue.split("_");
		tableValue = s[0].concat(" "+s[1]);
		soft.assertEquals(bankruptcyType.toUpperCase(), tableValue.toUpperCase(), "Bankruptcy Type");
	}
	public void verify_bankruptcy_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(bankruptcy_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_bankruptcy_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(bankruptcy_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_company_name_change_company_name(String companyName) {
		String tableValue = waitForExpectedElement(company_name_change_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_company_name_change_new_company_name(String newCompanyName) {
		String tableValue = waitForExpectedElement(company_name_change_new_company_name).getText().trim();
		soft.assertEquals(newCompanyName, tableValue, "Company Name");
	}
	public void verify_company_name_change_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(company_name_change_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_company_name_change_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(company_name_change_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_exchange_ticker_change_company_name(String companyName) {
		String tableValue = waitForExpectedElement(exchange_ticker_change_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_exchange_ticker_change_ticker_exchange(String tickerExchange) {
		String[] s = tickerExchange.split("-");
		String oldTickertableValue = waitForExpectedElement(exchange_ticker_change_old_ticker).getText().trim();
		soft.assertEquals(s[0], oldTickertableValue, "Old Ticker");
		String oldExchangeTableValue = waitForExpectedElement(exchange_ticker_change_old_exchange).getText().trim();
		soft.assertEquals(s[1], oldExchangeTableValue, "Old Exchange");
	}
	public void verify_exchange_ticker_change_new_ticker(String newTicker) {
		String tableValue = waitForExpectedElement(exchange_ticker_change_new_ticker).getText().trim();
		soft.assertEquals(newTicker, tableValue, "New Ticker");
	}
	public void verify_exchange_ticker_change_new_exchange(String newExchange) {
		String tableValue = waitForExpectedElement(exchange_ticker_change_new_exchange).getText().trim();
		soft.assertEquals(newExchange, tableValue, "New Exchange");
	}
	public void verify_exchange_ticker_change_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(exchange_ticker_change_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_exchange_ticker_change_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(exchange_ticker_change_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_headquarters_change_company_name(String companyName) {
		String tableValue = waitForExpectedElement(headquarters_change_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_headquarters_change_new_headquarters(String newHeadquarters) {
		String tableValue = waitForExpectedElement(headquarters_change_new_headquarters).getText().trim();
		soft.assertEquals(newHeadquarters, tableValue, "New Headquarters");
	}
	public void verify_headquarters_change_new_state(String newState) {
		String tableValue = waitForExpectedElement(headquarters_change_new_state).getText().trim();
		soft.assertEquals(newState, tableValue, "New State");
	}
	public void verify_headquarters_change_new_city(String newCity) {
		String tableValue = waitForExpectedElement(headquarters_change_new_city).getText().trim();
		soft.assertEquals(newCity, tableValue, "New City");
	}
	public void verify_headquarters_change_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(headquarters_change_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_headquarters_change_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(headquarters_change_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_delisted_company_name(String companyName) {
		String tableValue = waitForExpectedElement(delisted_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	public void verify_delisted_ticker_exchange(String tickerExchange) {
		String[] s = tickerExchange.split("-");
		String tickertableValue = waitForExpectedElement(delisted_ticker).getText().trim();
		soft.assertEquals(s[0], tickertableValue, "Ticker");
		String exchangeTableValue = waitForExpectedElement(delisted_exchange).getText().trim();
		soft.assertEquals(s[1], exchangeTableValue, "Exchange");
	}
	public void verify_delisted_trading_status(String tradingStatus) {
		String tableValue = waitForExpectedElement(delisted_trading_status).getText().trim();
		soft.assertEquals(tradingStatus.toUpperCase(), tableValue.toUpperCase(), "Trading Status");
	}
	public void verify_delisted_mark_company_as_private(String markCompanyAsPrivate) {
		String tableValue = waitForExpectedElement(delisted_mark_company_as_private).getText().trim();
		soft.assertEquals(markCompanyAsPrivate, tableValue, "Mark Company as Private");
	}
	public void verify_delisted_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(delisted_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_delisted_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(delisted_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_merger_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(merger_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_merger_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(merger_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_merger_merged_company_name(String mergedCompanyName) {
		String tableValue = waitForExpectedElement(merged_company_name).getText().trim();
		soft.assertEquals(mergedCompanyName, tableValue, "Merged Company Name");
	}
	public void verify_spinoff_parent_company_name(String parentCompanyName) {
		String tableValue = waitForExpectedElement(parent_company_name).getText().trim();
		soft.assertEquals(parentCompanyName, tableValue, "Parent Company Name");
	}
	public void verify_spinoff_effective_date(String effectiveDate) {
		String tableValue = waitForExpectedElement(spinoff_effective_date).getText().trim();
		soft.assertEquals(effectiveDate, tableValue, "Effective Date");
	}
	public void verify_spinoff_time_zone(String timeZone) {
		String tableValue = waitForExpectedElement(spinoff_time_zone).getText().trim();
		soft.assertEquals(timeZone, tableValue, "Time Zone");
	}
	public void verify_company_name_in_merger_companies(String mergerCompanyName) {
		String tableValue = null;
		String popupValue = waitForExpectedElement(merger_company_names).getText().trim();
		String[] s = popupValue.split(",");
		for(int i=0;i<s.length;i++) {
			if(mergerCompanyName.equalsIgnoreCase(s[i])) {
				tableValue  = mergerCompanyName;
				break;
			}else {
				soft.assertTrue(false, "Merger Company names");
			}
		}
		soft.assertEquals(mergerCompanyName, tableValue, "Merger Company Name");
	}
	public void verify_company_name_in_spinoff_companies(String spinoffCompanyName) {
		String tableValue = null;
		String popupValue = waitForExpectedElement(spinoff_company_names).getText().trim();
		String[] s = popupValue.split(",");
		for(int i=0;i<s.length;i++) {
			if(spinoffCompanyName.equalsIgnoreCase(s[i])) {
				tableValue  = spinoffCompanyName;
				break;
			}else {
				soft.assertTrue(false, "Spinoff Company names");
			}
		}
		soft.assertEquals(spinoffCompanyName, tableValue, "Spinoff Company Name");
	}
}
