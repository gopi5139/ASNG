package daggr.ui.pages.companyDataSource;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CompanyDatasourceUpdatePage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath = "(//input)[1]")
	WebElement companyName_textbox;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement rss_tracking_type;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement html_tracking_type;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	WebElement manual_tracking_type;
	
	@FindBy(xpath = "//textarea[@formcontrolname='company_data_source_link']")
	WebElement tracking_url;
	
	@FindBy(xpath = "//input[@id='enum_answer_ACTIVE']")
	WebElement active_status;
	
	@FindBy(xpath = "//input[@id='enum_answer_IN_ACTIVE']")
	WebElement inactive_status;
	
	@FindBy(xpath = "//input[@placeholder='Choose One']")
	WebElement scraping_frequency;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement update_button;
	
	public CompanyDatasourceUpdatePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void check_company_name(String company_name){
		String tableValue = waitForExpectedElement(companyName_textbox).getAttribute("value");
		soft.assertEquals(tableValue, company_name, "Company Name");
	}
	public void check_tracking_type(String tracking_type){
		String tableValue = null;
		if(rss_tracking_type.isSelected()) {
			tableValue = "RSS";
		}
		else if(html_tracking_type.isSelected()){
			tableValue = "HTML";
		}
		else {
			tableValue = "MANUAL";
		}
		soft.assertEquals(tableValue, tracking_type.toUpperCase(), "Tracking Type");
	}
	public void check_tracking_link(String tracking_link){
		String tableValue = waitForExpectedElement(tracking_url).getAttribute("value");
		soft.assertEquals(tableValue, tracking_link, "Tracking Link");
	}
	public void check_status(String status){
		String tableValue = null;
		if(active_status.isSelected()) {
			tableValue = "Active";
		}
		else {
			tableValue = "Inactive";
		}
		soft.assertEquals(tableValue, status, "Status");
	}
	public void check_scraping_frequency(String scrapingFrequency){
		String tableValue = waitForExpectedElement(scraping_frequency).getAttribute("value");
		soft.assertEquals(tableValue, scrapingFrequency, "Scraping Frequency");
	}
	public void check_comments(String commentsValue){
		String tableValue = waitForExpectedElement(comments).getAttribute("value");
		soft.assertEquals(tableValue, commentsValue, "Comments");
	}
	public void update_status(String status){
		if(status.equalsIgnoreCase("Active")) {
			waitForExpectedElement(active_status).click();
		}
		else {
			waitForExpectedElement(inactive_status).click();
		}
	}
	public void update_scraping_frequency(String scrapingFrequency){
		waitForExpectedElement(scraping_frequency).sendKeys(Keys.CONTROL+"a");
		waitForExpectedElement(scraping_frequency).sendKeys(Keys.DELETE);
		waitForExpectedElement(scraping_frequency).sendKeys(scrapingFrequency);
		waitForExpectedElement(select_from_dropdown).click();
	}
	public void click_update_button() {
		waitForExpectedElement(update_button).click();
	}
}
