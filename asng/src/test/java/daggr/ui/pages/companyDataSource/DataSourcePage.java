package daggr.ui.pages.companyDataSource;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class DataSourcePage extends PageObjectUtils{
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement company_name;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement html_tracking_type;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement rss_tracking_type;
	
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
	WebElement comments_textarea;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit_button;
	
	@FindBy(xpath = "//button[normalize-space()='Save & Add New']")
	WebElement save_and_addNew_button;
	
	@FindBy(xpath = "//label[text()='Company Name']")
	WebElement company_name_label;
	
	@FindBy(xpath = "//p[text()='Tracking Type']")
	WebElement tracking_type_label;
	
	@FindBy(xpath = "//label[text()='Tracking Link']")
	WebElement tracking_url_label;
	
	@FindBy(xpath = "//p[text()='Status']")
	WebElement status_label;
	
	@FindBy(xpath = "//label[text()='Scraping Frequency']")
	WebElement scraping_frequency_label;
	
	@FindBy(xpath = "//label[text()='Manual Check Frequency']")
	WebElement manual_scraping_frequency_label;
	
	@FindBy(xpath = "//label[@for='exampleFormControlTextarea1']")
	WebElement comments_label;
	
	String tracking_type_value = null;

	public DataSourcePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}

	public void enter_company_name(String companyName){
		check_before_sending_keys(company_name, company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(company_name).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
		check_after_sending_keys(company_name, companyName, "Company Name");
	}

	public void select_the_tracking_type(String trackingType){
		check_before_selecting_tracking_type(html_tracking_type, rss_tracking_type, manual_tracking_type, tracking_type_label, "Tracking Type", "Tracking Type");
		if(trackingType.equalsIgnoreCase("RSS")) {
			waitForExpectedElement(rss_tracking_type).click();
		}
		else if(trackingType.equalsIgnoreCase("HTML")) {
			waitForExpectedElement(html_tracking_type).click();
		}
		else if(trackingType.equalsIgnoreCase("Manual")){
			waitForExpectedElement(manual_tracking_type).click();
			tracking_type_value = "Manual";
		}
		check_after_selecting_tracking_type(html_tracking_type, rss_tracking_type, manual_tracking_type, trackingType, "Tracking Type");
	}

	public void enter_the_tracking_url(String trackingUrl){
		check_before_sending_keys(tracking_url, tracking_url_label, "Enter Tracking Link", "Tracking Link", "Tracking Link");
		waitForExpectedElement(tracking_url).sendKeys(trackingUrl);
		check_after_sending_keys(tracking_url, trackingUrl, "Tracking Link");
	}

	public void select_the_status(String status){
		check_before_radio_status_select(active_status, inactive_status, status_label, "Status", "Status");
		if(status.equalsIgnoreCase("Active")) {
			waitForExpectedElement(active_status).click();
		}
		else {
			waitForExpectedElement(inactive_status).click();
		}
		check_after_radio_status_select(active_status, inactive_status, status, "Status");
	}

	public void enter_scraping_frequency(String scrapingFrequency){
		if(tracking_type_value == null){
			check_before_sending_keys(scraping_frequency, scraping_frequency_label, "Choose One", "Scraping Frequency", "Scraping Frequency");
		}else{
			check_before_sending_keys(scraping_frequency, manual_scraping_frequency_label, "Choose One", "Manual Check Frequency", "Manual Check Frequency");
		}
		if(!scrapingFrequency.equals("")){
			waitForExpectedElement(scraping_frequency).sendKeys(scrapingFrequency);
			waitForExpectedElement(select_from_dropdown).click();
		}
		check_after_sending_keys(scraping_frequency, scrapingFrequency, "Scraping Frequency");
	}

	public void enter_comments(String comments){
		if(tracking_type_value == null){
			check_before_sending_keys(comments_textarea, comments_label, "Comments", "Comments", "Comments");
		}else{
			check_before_sending_keys(comments_textarea, comments_label, "Comments", "Comments *", "Comments");
		}
		waitForExpectedElement(comments_textarea).sendKeys(comments);
		check_after_sending_keys(comments_textarea, comments, "Comments");
	}

	public void click_submit_button(){
		waitForExpectedElement(submit_button).click();
	}
	
	public void click_save_and_add_new_button(){
		waitForExpectedElement(save_and_addNew_button).click();
	}
}
