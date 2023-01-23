package daggr.ui.pages.securities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class SecuritiesListPage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	public WebElement search_company_name;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath="//bs-days-calendar-view//table//tbody")
	public WebElement date_select;
	
	@FindBy(xpath="//table//tbody")
	public WebElement table;
	
	@FindBy(xpath="//modal-container//table")
	public WebElement details_popup;
	
	@FindBy(xpath="//table//thead//tr//th")
	public WebElement popup_close;
	
	@FindBy(xpath="//modal-container//table//tr[2]//td[2]")
	public WebElement popup_company_name;
	
	@FindBy(xpath="//modal-container//table//tr[11]//td[2]")
	public WebElement popup_ticker;
	
	@FindBy(xpath="//modal-container//table//tr[3]//td[2]")
	public WebElement popup_exchange;
	
	@FindBy(xpath="//modal-container//table//tr[8]//td[2]")
	public WebElement popup_security_type;
	
	@FindBy(xpath="//modal-container//table//tr[6]//td[2]")
	public WebElement popup_security_category;
	
	@FindBy(xpath="//modal-container//table//tr[13]//td[2]")
	public WebElement popup_trading_start_date;
	
	@FindBy(xpath="//modal-container//table//tr[12]//td[2]")
	public WebElement popup_trading_end_date;
	
	@FindBy(xpath="//modal-container//table//tr[14]//td[2]")
	public WebElement popup_trading_status;
	
	@FindBy(xpath="//modal-container//table//tr[4]//td[2]")
	public WebElement popup_primary_ticker;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement next_button;
	
	public SecuritiesListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void search_by_company_name(String companyName){
		waitForExpectedElement(search_company_name).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
	}
	
	public void click_popup(String ticker,String exchange) {
		boolean isFound = true;
		do{
			sleep(2000);
			List<WebElement> rows,cols;
			rows=table.findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++){
				cols=rows.get(i).findElements(By.tagName("td"));
				if(cols.get(1).getText().trim().equals(ticker) && cols.get(2).getText().trim().equals(exchange)){
					cols.get(0).click();
					isFound = false;
					return;
				}
			}
			if(isFound == true){
				waitForExpectedElement(next_button).click();
			}
			if(isFound == true && rows.size() <= 9){
				soft.assertTrue(false, "Created Ticker is not there in list");
			}
		}while(isFound);
	}
	
	public void click_action(String ticker,String exchange) {
		boolean isFound = true;
		do{
			sleep(2000);
			List<WebElement> rows,cols;
			rows=table.findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++){
				cols=rows.get(i).findElements(By.tagName("td"));
				if(cols.get(1).getText().trim().equals(ticker) && cols.get(2).getText().trim().equals(exchange)){
					cols.get(8).findElement(By.tagName("a")).click();
					isFound = false;
					return;
				}
			}
			if(isFound == true){
				waitForExpectedElement(next_button).click();
			}
			if(isFound == true && rows.size() <= 9){
				soft.assertTrue(false, "Created Ticker is not there in list");
			}
		}while(isFound);
	}
	
	public void check_company_name(String companyName){
		String tableValue = waitForExpectedElement(popup_company_name).getText().trim();
		soft.assertEquals(companyName, tableValue, "Company Name");
	}
	
	public void check_ticker(String ticker){
		String tableValue = waitForExpectedElement(popup_ticker).getText().trim();
		soft.assertEquals(ticker, tableValue, "Ticker");
	}
	
	public void check_security_type(String security_type){
		String tableValue;
		if(!security_type.equals("")){
			tableValue = waitForExpectedElement(popup_security_type).getText().trim();
			case_convertion(security_type, tableValue, "Security Type");
		}
		else{
			tableValue = "N/A";
			security_type = "N/A";
		}
	}
	
	public void check_exchange(String exchange){
		String tableValue = waitForExpectedElement(popup_exchange).getText().trim();
		soft.assertEquals(exchange, tableValue, "Exchange");
	}
	
	public void check_security_category(String security_category){
		String tableValue;
		if(!security_category.equals("")){
			tableValue = waitForExpectedElement(popup_security_category).getText().trim();
			case_convertion(security_category, tableValue, "Security Category");
		}
		else{
			tableValue = "N/A";
			security_category = "N/A";
		}
	}
	
	public void check_trading_start_date(String trading_start_date){
		String tableValue;
		if(!trading_start_date.equals("")){
			tableValue = waitForExpectedElement(popup_trading_start_date).getText().trim();
		}
		else{
			tableValue = "N/A";
			trading_start_date = "N/A";
		}
		soft.assertEquals(trading_start_date, tableValue, "Trading Start Date");
	}
	
	public void check_trading_end_date(String trading_end_date){
		String tableValue;
		if(!trading_end_date.equals("")){
			tableValue = waitForExpectedElement(popup_trading_end_date).getText().trim();
		}
		else{
			tableValue = "N/A";
			trading_end_date = "N/A";
		}
		soft.assertEquals(trading_end_date, tableValue, "Trading End Date");
	}
	public void check_trading_status(String trading_status){
		String tableValue = waitForExpectedElement(popup_trading_status).getText().trim();
		soft.assertEquals(trading_status.toUpperCase(), tableValue, "Trading Status");
	}
	
	public void check_primary_ticker(String primary_ticker){
		String tableValue = waitForExpectedElement(popup_primary_ticker).getText().trim().equals("true")?"Yes":"No";
		soft.assertEquals(primary_ticker, tableValue, "Primary Ticker");
	}
	
	public void popup_close() {
		moveToElement(popup_close).click().perform();
	}
	
	public void case_convertion(String inputValue,String tableValue,String message) {
		String[] parts = inputValue.split(" ");
		if(parts.length == 1) {
			soft.assertEquals(tableValue,parts[0].toUpperCase(), message);
		}else {
			String part1 = parts[0].toUpperCase();
			String part2 = parts[1].toUpperCase();
			String s = part1.concat("_").concat(part2);
			soft.assertEquals(tableValue,s, message);
		}
	}
}
