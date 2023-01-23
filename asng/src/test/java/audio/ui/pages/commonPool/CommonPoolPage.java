package audio.ui.pages.commonPool;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CommonPoolPage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//input[@id='selectOptionKey']")
	private WebElement search_filter_key;
	
	@FindBy(xpath="//input[@id='selectOptionKey']/following-sibling::div/a")
	private List<WebElement> search_filter_key_dropdown;
	
	@FindBy(xpath="//input[@id='searchValue']")
	private WebElement search_filter_value;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement search_filter_company_name_value;
	
	@FindBy(xpath="//input[@id='selectOptionKey']/ancestor::ul/parent::div/parent::div/parent::div/preceding-sibling::label")
	private WebElement search_filter_label;
	
	@FindBy(xpath="//button[text()='Clear filter']")
	private WebElement clear_filter;
	
	@FindBy(xpath="//button[text()='Apply filter']")
	private WebElement apply_filter;
	
	@FindBy(xpath="//h6[normalize-space(text())='Common Pool']")
	private WebElement common_pool_title;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[1]")
	private WebElement table_header_recording_id;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[2]")
	private WebElement table_header_company_name;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[3]")
	private WebElement table_header_ticker;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[4]")
	private WebElement table_header_event_date;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[5]")
	private WebElement table_header_event_time;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[6]")
	private WebElement table_header_webcast_link;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[7]")
	private WebElement table_header_us_phone;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[8]")
	private WebElement table_header_us_passcode;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[9]")
	private WebElement table_header_action;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[1]/div[10]")
	private WebElement table_header_alert;
	
	@FindBy(xpath="//div[@id='asng-audio-tables']/div[@class='list-nodata p-3 ng-star-inserted']/p[text()='No Data ...']")
	private WebElement table_no_data;
	
	@FindBy(xpath="//div[@id='jobId']/span")
	private List<WebElement> table_columns_job_id;
	
	@FindBy(xpath="//div[@id='jobId']/div/p")
	private List<WebElement> table_columns_short_id;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']")
	private List<WebElement> table_columns;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[1]")
	private List<WebElement> table_columns_company_name;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/div/div")
	private WebElement table_columns_live_or_replay_icon;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[2]")
	private List<WebElement> table_columns_ticker;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[3]")
	private List<WebElement> table_columns_event_date;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[4]")
	private List<WebElement> table_columns_event_time;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[5]/span/img")
	private List<WebElement> table_columns_webcast_link;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[6]/span/img")
	private List<WebElement> table_columns_us_phone;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[7]")
	private List<WebElement> table_columns_us_passcode;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[8]/button[text()='Pick']")
	private List<WebElement> table_columns_action;
	
	@FindBy(xpath="//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobId']/following-sibling::div[9]/img")
	private List<WebElement> table_columns_alert;
	
	@FindBy(xpath="//div[@class='aucard-content live_class']/following-sibling::div/div/div[@class='d-flex justify-content-between']/div[3]/div[1]/label[text()='Event id:']")
	private List<WebElement> table_columns_event_id_label;
	
	@FindBy(xpath="//div[@class='aucard-content live_class']/following-sibling::div/div/div[@class='d-flex justify-content-between']/div[3]/div[1]/p")
	private List<WebElement> table_columns_event_id;
	
	@FindBy(xpath="//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[@class='ng-star-inserted']")
	private List<WebElement> company_name_dropdown_list;
	
	@FindBy(xpath="//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[1]")
	private WebElement company_name_dropdown;
	
	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a[1]")
	private WebElement search_filter_all;
	
	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a[2]")
	private WebElement search_filter_company_name;
	
	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a[3]")
	private WebElement search_filter_ticker;
	
	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a[4]")
	private WebElement search_filter_job_id;
	
	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a[5]")
	private WebElement search_filter_event_id;
	
	@FindBy(xpath = "//div[@id='jobId']/div/div[@class='status-id ng-star-inserted']")
	private List<WebElement> jobDetails_job_type;
	
	@FindBy(xpath = "//label[text()='Event title:']")
	private List<WebElement> jobDetails_event_title;
	
	@FindBy(xpath = "//label[text()='Event title:']/following-sibling::p")
	private List<WebElement> jobDetails_event_title_value;
	
	@FindBy(xpath = "//label[text()='Event added date:']")
	private List<WebElement> jobDetails_event_addedDate;
	
	@FindBy(xpath = "//label[text()='Event added date:']/following-sibling::p")
	private List<WebElement> jobDetails_event_addedDate_value;
	
	@FindBy(xpath = "//label[text()='Webcast link (live):']")
	private List<WebElement> jobDetails_webcast_live;
	
	@FindBy(xpath = "//label[text()='Webcast link (live):']/following-sibling::span/p/img[@alt='copy']")
	private List<WebElement> jobDetails_webcast_live_copy;
	
	@FindBy(xpath = "//label[text()='Webcast link (live):']/following-sibling::span/p/a")
	private List<WebElement> jobDetails_webcast_live_newTab;
	
	@FindBy(xpath = "//label[text()='Webcast link (replay):']")
	private List<WebElement> jobDetails_webcast_replay;
	
	@FindBy(xpath = "//label[text()='Webcast link (replay):']/following-sibling::span/p/img[@alt='copy']")
	private List<WebElement> jobDetails_webcast_replay_copy;
	
	@FindBy(xpath = "//label[text()='Webcast link (replay):']/following-sibling::span/p/a")
	private List<WebElement> jobDetails_webcast_replay_newTab;
	
	@FindBy(xpath = "//label[text()='Meeting id:']")
	private List<WebElement> jobDetails_meeting_id;
	
	@FindBy(xpath = "//label[text()='Meeting id:']/following-sibling::p")
	private List<WebElement> jobDetails_meeting_id_value;
	
	@FindBy(xpath = "//label[text()='US phone (live):']")
	private List<WebElement> jobDetails_live_phone_us;
	
	@FindBy(xpath = "//label[text()='US phone (live):']/following-sibling::p")
	private List<WebElement> jobDetails_live_phone_us_value;
	
	@FindBy(xpath = "//label[text()='International phone (live):']")
	private List<WebElement> jobDetails_live_phone_international;
	
	@FindBy(xpath = "//label[text()='International phone (live):']/following-sibling::p")
	private List<WebElement> jobDetails_live_phone_international_value;
	
	@FindBy(xpath = "//label[text()='US phone (replay):']")
	private List<WebElement> jobDetails_replay_phone_us;
	
	@FindBy(xpath = "//label[text()='US phone (replay):']/following-sibling::p")
	private List<WebElement> jobDetails_replay_phone_us_value;
	
	@FindBy(xpath = "//label[text()='International phone (replay):']")
	private List<WebElement> jobDetails_replay_phone_international;
	
	@FindBy(xpath = "//label[text()='International phone (replay):']/following-sibling::p")
	private List<WebElement> jobDetails_replay_phone_international_value;
	
	@FindBy(xpath = "//label[text()='Registration phone:']")
	private List<WebElement> jobDetails_registration_phone;
	
	@FindBy(xpath = "//label[text()='Registration phone:']/following-sibling::p")
	private List<WebElement> jobDetails_registration_phone_value;
	
	@FindBy(xpath = "//label[text()='Event type:']")
	private List<WebElement> jobDetails_eventType;
	
	@FindBy(xpath = "//label[text()='Event type:']/following-sibling::p")
	private List<WebElement> jobDetails_eventType_value;
	
	@FindBy(xpath = "//label[text()='Event added time (IST):']")
	private List<WebElement> jobDetails_event_addedTime;
	
	@FindBy(xpath = "//label[text()='Event added time (IST):']/following-sibling::p")
	private List<WebElement> jobDetails_event_addedTime_value;
	
	@FindBy(xpath = "//label[text()='Webcast passcode (live):']")
	private List<WebElement> jobDetails_webcast_passcode_live;
	
	@FindBy(xpath = "//label[text()='Webcast passcode (live):']/following-sibling::p")
	private List<WebElement> jobDetails_webcast_passcode_live_value;
	
	@FindBy(xpath = "//label[text()='Webcast passcode (replay):']")
	private List<WebElement> jobDetails_webcast_passcode_replay;
	
	@FindBy(xpath = "//label[text()='Webcast passcode (replay):']/following-sibling::p")
	private List<WebElement> jobDetails_webcast_passcode_replay_value;
	
	@FindBy(xpath = "//label[text()='Control number:']")
	private List<WebElement> jobDetails_control_number;
	
	@FindBy(xpath = "//label[text()='Control number:']/following-sibling::p")
	private List<WebElement> jobDetails_control_number_value;
	
	@FindBy(xpath = "//label[text()='US passcode (live):']")
	private List<WebElement> jobDetails_live_passcode_us;
	
	@FindBy(xpath = "//label[text()='US passcode (live):']/following-sibling::p")
	private List<WebElement> jobDetails_live_passcode_us_value;
	
	@FindBy(xpath = "//label[text()='International passcode (live):']")
	private List<WebElement> jobDetails_live_passcode_international;
	
	@FindBy(xpath = "//label[text()='International passcode (live):']/following-sibling::p")
	private List<WebElement> jobDetails_live_passcode_international_value;
	
	@FindBy(xpath = "//label[text()='US passcode (replay):']")
	private List<WebElement> jobDetails_replay_passcode_us;
	
	@FindBy(xpath = "//label[text()='US passcode (replay):']/following-sibling::p")
	private List<WebElement> jobDetails_replay_passcode_us_value;
	
	@FindBy(xpath = "//label[text()='International passcode (replay):']")
	private List<WebElement> jobDetails_replay_passcode_international;
	
	@FindBy(xpath = "//label[text()='International passcode (replay):']/following-sibling::p")
	private List<WebElement> jobDetails_replay_passcode_international_value;
	
	@FindBy(xpath = "//label[text()='Registration passcode:']")
	private List<WebElement> jobDetails_registration_passcode;
	
	@FindBy(xpath = "//label[text()='Registration passcode:']/following-sibling::p")
	private List<WebElement> jobDetails_registration_passcode_value;
	
	@FindBy(xpath = "//label[text()='Event id:']")
	private List<WebElement> jobDetails_event_id;
	
	@FindBy(xpath = "//label[text()='Product type:']")
	private List<WebElement> jobDetails_product_type;
	
	@FindBy(xpath = "//label[text()='Event id:']/following-sibling::p")
	private List<WebElement> jobDetails_event_id_value;
	
	@FindBy(xpath = "//label[text()='Product type:']/following-sibling::p")
	private List<WebElement> jobDetails_product_type_value;
	
	@FindBy(xpath = "//label[text()='Duration:']")
	private List<WebElement> jobDetails_duration;
	
	@FindBy(xpath = "//label[text()='Duration:']/following-sibling::p")
	private List<WebElement> jobDetails_duration_value;
	
	@FindBy(xpath = "//label[text()='TAT:']")
	private List<WebElement> jobDetails_tat;
	
	@FindBy(xpath = "//label[text()='TAT:']/following-sibling::p")
	private List<WebElement> jobDetails_tat_value;
	
	@FindBy(xpath = "//label[text()='IRS team alert:']")
	private List<WebElement> jobDetails_irs_team_alert;
	
	@FindBy(xpath = "//label[text()='IRS team alert:']/following-sibling::p")
	private List<WebElement> jobDetails_irs_team_alert_value;
	
	@FindBy(xpath = "//img[@alt='edit']")
	private List<WebElement> jobDetails_edit;
	
	@FindBy(xpath = "//h4[text()='+']")
	private List<WebElement> jobDetails_add;
	
	public CommonPoolPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verify_default_elements() {
		is_common_pool_title_displayed();
		verify_table_header_elements();
		is_common_pool_elements_displayed();
	}
	
	public void is_common_pool_elements_displayed() {
		soft.assertTrue(search_filter_label.isDisplayed(),"Search filter label is not displayed in the elements");
		soft.assertTrue(search_filter_key.isDisplayed(),"Search filter dropdown is not displayed in the elements");
		soft.assertTrue(search_filter_value.isDisplayed(),"Search filter textbox is not displayed in the elements");
		soft.assertTrue(clear_filter.isDisplayed(),"Clear filter button is not displayed in the elements");
		soft.assertTrue(apply_filter.isDisplayed(),"Apply filter button is not displayed in the elements");
	}
	
	public void verify_table_header_elements() {
		soft.assertEquals(table_header_recording_id.getText(), "Job id","Job id in table header is not matched");
		soft.assertEquals(table_header_ticker.getText(), "Ticker","Ticker in table header is not matched");
		soft.assertEquals(table_header_event_date.getText(), "Event date","Event date in table header is not matched");
		soft.assertEquals(table_header_event_time.getText(), "Event time","Event time in table header is not matched");
		soft.assertEquals(table_header_company_name.getText(), "Company name","Company name in table header is not matched");
		soft.assertEquals(table_header_webcast_link.getText(), "Webcast link","Webcast link in table header is not matched");
		soft.assertEquals(table_header_us_phone.getText(), "US phone","US phone in table header is not matched");
		soft.assertEquals(table_header_us_passcode.getText(), "US passcode","US passcode in table header is not matched");
		soft.assertEquals(table_header_alert.getText(), "Alert","Alert in table header is not matched");
		soft.assertEquals(table_header_action.getText(), "Actions","Actions in table header is not matched");
	}
	public void verify_search_filter_dropdown_elements() {
		waitForExpectedElement(search_filter_key).click();
		soft.assertEquals(search_filter_all.getAttribute("innerHTML"), "All","All option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_company_name.getAttribute("innerHTML"), "Company name","Company Name option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_ticker.getAttribute("innerHTML"), "Ticker","Ticker option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_job_id.getAttribute("innerHTML"), "Job id","Job id option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_event_id.getAttribute("innerHTML"), "Event id","Event id option in search filter dropdown is not matched");
	}
	public void is_common_pool_title_displayed() {
		soft.assertTrue(waitForExpectedElement(common_pool_title).isDisplayed(),"Common Pool title is not displayed in the elements");
	}
	public void verify_searchResults_in_jobsStatusTable(String searchFilterKey,String searchValue){
		if(!searchFilterKey.equals("")&& !searchValue.equals("")) {
			if(searchFilterKey.equalsIgnoreCase("Company name")) {
				for(int i=0;i<table_columns_company_name.size();i++) {
					String tableValue = waitForExpectedElement(table_columns_company_name.get(i)).getText();
					soft.assertEquals(tableValue, searchValue, "Company Name in row "+i + " is not matched");
				}
			}
			else if(searchFilterKey.equalsIgnoreCase("Ticker")) {
				for(int i=0;i<table_columns_ticker.size();i++) {
					String tableValue = waitForExpectedElement(table_columns_ticker.get(i)).getText();
					soft.assertEquals(tableValue, searchValue, "Ticker in row "+i + " is not matched");
				}
			}
			else if(searchFilterKey.equalsIgnoreCase("Job id")) {
				for(int i=0;i<table_columns_job_id.size();i++) {
					String tableValue = waitForExpectedElement(table_columns_job_id.get(i)).getText();
					soft.assertEquals(tableValue, searchValue, "Job ID in row "+i + " is not matched");
				}
			}
			else if(searchFilterKey.equalsIgnoreCase("Event id")) {
				for(int i=0;i<table_columns_job_id.size();i++) {
					waitForExpectedElement(table_columns_company_name.get(i)).click();
					String tableValue = waitForExpectedElement(table_columns_event_id.get(i)).getText();
					soft.assertEquals(tableValue, searchValue, "Event ID in row "+i + " is not matched");
					waitForExpectedElement(table_columns_company_name.get(i)).click();
				}
			}
			else if(searchFilterKey.equalsIgnoreCase("All")) {
				for(int i=0;i<table_columns_company_name.size();i++) {
					if(table_columns_company_name.get(i).getText().equals(searchValue)) {
						String tableValue = waitForExpectedElement(table_columns_company_name.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Company Name in row "+i + " is not matched");
					}else if(table_columns_ticker.get(i).getText().equals(searchValue)) {
						String tableValue = waitForExpectedElement(table_columns_ticker.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Ticker in row "+i + " is not matched");
					}else if(table_columns_job_id.get(i).getText().equals(searchValue)) {
						String tableValue = waitForExpectedElement(table_columns_job_id.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Job ID in row "+i + " is not matched");
					}else {
						waitForExpectedElement(table_columns_company_name.get(i)).click();
						if(table_columns_event_id.get(i).getText().equals(searchValue)) {
							String tableValue = waitForExpectedElement(table_columns_event_id.get(i)).getText();
							soft.assertEquals(tableValue, searchValue, "Event ID in row "+i + " is not matched");
						}else {
							Assert.assertTrue(false, "Search filter value is not matched but jobs are displaying");
						}
					}
				}
			}
		}
		if(table_columns_short_id.size()==0) {
			soft.assertEquals(String.valueOf(table_columns.size()), String.valueOf(0),"Table columns should be empty");
			soft.assertTrue(waitForExpectedElement(table_no_data).isDisplayed(),"No data is not displayed");
		}
	}
	public void click_apply_filter() {
		waitForExpectedElement(apply_filter).click();
	}
	public void click_clear_filter() {
		waitForExpectedElement(clear_filter).click();
	}
	public void select_search_filter_key(String searchFilterKey) {
		verify_search_filter_dropdown_elements();
		check_before_sending_keys(search_filter_key, search_filter_label, "Select type", "Search filter", "Search Filter Key");
		for (WebElement i : search_filter_key_dropdown) 
		{ 
		    if(searchFilterKey.equalsIgnoreCase(waitForExpectedElement(i).getText())) {
		    	waitForExpectedElement(i).click();
		    	break;
		    }
		}
		check_after_sending_keys(search_filter_key, searchFilterKey, "Search Filter Key");
	}
	public void enter_search_filter_value(String searchFilterKey,String searchFilterValue) {
		if(searchFilterKey.equalsIgnoreCase("Company name")) {
			check_before_sending_keys(search_filter_company_name_value, "Search", "Search Filter Value");
			waitForExpectedElement(search_filter_company_name_value).sendKeys(searchFilterValue);
			waitForExpectedElement(company_name_dropdown).isDisplayed();
			select_from_dropdown(company_name_dropdown_list, searchFilterValue);
			check_after_sending_keys(search_filter_company_name_value, searchFilterValue, "Search Filter Value");
		}
		else {
			check_before_sending_keys(search_filter_value, "Search", "Search Filter Value");
			waitForExpectedElement(search_filter_value).sendKeys(searchFilterValue);
			check_after_sending_keys(search_filter_value, searchFilterValue, "Search Filter Value");
		}
	}
	public void click_pick_job(String companyName,String eventDate,String eventTime,String timeZone) {
		sleep(5000);
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
//		String eventDateValue = getDateConversion(eventDate);
//		String eventTimeValue = getTimeConversion(eventTime);
		if(table_columns_short_id.size()!=0) {
			boolean isAvailable = false;
			for(int i=0;i<table_columns_short_id.size();i++) {
				if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
					waitForExpectedElement(table_columns_action.get(i)).click();
					isAvailable = true;
					break;
				}
			}
			if(isAvailable == false) {
				Assert.assertTrue(false,"Job is not available in table");
			}
		}else {
			Assert.assertTrue(false, "No jobs in table");
		}
	}
	
	public void verify_picked_job_is_not_displayed(String companyName,String eventDate,String eventTime,String timeZone) {
		sleep(3000);
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
//		String eventDateValue = getDateConversion(eventDate);
//		String eventTimeValue = getTimeConversion(eventTime);
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				Assert.assertTrue(false,"Job is still displayed in table after picking the job");
			}
		}
	}
	
	public void verify_job_details_in_table(String companyName,String eventDate,String eventTime,String ticker,String livePasscodeUs,String jobType,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		//String eventDateValue = getDateConversion(eventDate);
		//String eventTimeValue = getTimeConversion(eventTime);
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				soft.assertNotNull(table_columns_short_id.get(i).getText().trim(),"Short Id at row "+ i + " is null");
				soft.assertEquals(table_columns_company_name.get(i).getText().trim(), companyName, "Company Name at row "+ i + " is not matched");
				soft.assertEquals(table_columns_ticker.get(i).getText().trim(), ticker, "Ticker at row "+ i + " is not matched");
				soft.assertEquals(table_columns_event_date.get(i).getText().trim(), eventDateValue, "Event Date at row "+ i + " is not matched");
				soft.assertEquals(table_columns_event_time.get(i).getText().trim(), eventTimeValue, "Event Time at row "+ i + " is not matched");
				if(!livePasscodeUs.equals("")) {
					soft.assertEquals(table_columns_us_passcode.get(i).getText().trim(), livePasscodeUs, "Us Passcode at row "+ i + " is not matched");
				}else {
					soft.assertEquals(table_columns_us_passcode.get(i).getText().trim(), "-", "Us Passcode at row "+ i + " is not matched");
				}
				soft.assertTrue(table_columns_action.get(i).isDisplayed(),"Pick button at row "+ i +"is not displayed");
				if(jobType.equals("Live Phone and Live Webcast")||jobType.equals("Live Phone")||jobType.equals("Live Webcast")) {
					soft.assertEquals(jobDetails_job_type.get(i).getText().trim(), "L", "Job Type at row "+ i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_job_type.get(i).getText().trim(), "R", "Job Type at row "+ i + " is not matched");
				}
				soft.assertTrue(table_columns_webcast_link.get(i).isDisplayed(), "Webcast Link icon at row "+ i + " is not displayed");
				soft.assertTrue(table_columns_us_phone.get(i).isDisplayed(), "Us Phone icon at row "+ i + " is not displayed");
			}
		}
	}
	
	public void verify_event_details(String companyName,String eventDate,String eventTime,String eventTitle,String eventType,String eventAddedDate,String eventAddedTime,String productType,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		String eventISTTimeValue = seperateISTTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		String eventISTDateValue = seperateISTTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				waitForExpectedElement(table_columns_company_name.get(i)).click();
				soft.assertTrue(jobDetails_event_title.get(i).isDisplayed(),"Event title in job details is not displayed");
				soft.assertEquals(jobDetails_event_title_value.get(i).getAttribute("innerHTML"), eventTitle, "Event Title at row "+i + " is not matched");
				soft.assertTrue(jobDetails_event_addedDate.get(i).isDisplayed(),"Event added date in job details is not displayed");
				soft.assertEquals(jobDetails_event_addedDate_value.get(i).getAttribute("innerHTML"), eventISTDateValue, "Event Added Date at row "+i + " is not matched");
				soft.assertTrue(jobDetails_eventType.get(i).isDisplayed(),"Event type in job details is not displayed");
				soft.assertEquals(jobDetails_eventType_value.get(i).getAttribute("innerHTML"), eventType, "Event Type at row "+i + " is not matched");
				soft.assertTrue(jobDetails_event_addedTime.get(i).isDisplayed(),"Event added time in job details is not displayed");
				soft.assertEquals(jobDetails_event_addedTime_value.get(i).getAttribute("innerHTML"), eventISTTimeValue, "Event Added Time at row "+i + " is not matched");
				soft.assertTrue(jobDetails_event_id.get(i).isDisplayed(),"Event id in job details is not displayed");
				soft.assertNotEquals(jobDetails_event_id_value.get(i).getAttribute("innerHTML"),"N/A","Event id in job details is null");
				//soft.assertEquals(jobDetails_event_id_value.getAttribute("innerHTML"), eventId, "Event Id at row "+i + " is not matched");
				soft.assertTrue(jobDetails_product_type.get(i).isDisplayed(),"Product type in job details is not displayed");
				soft.assertEquals(jobDetails_product_type_value.get(i).getAttribute("innerHTML"), productType, "Product type at row "+i + " is not matched");
				soft.assertTrue(jobDetails_add.get(i).isDisplayed(),"Add icon not displayed in event details");
				soft.assertTrue(jobDetails_edit.get(i).isDisplayed(),"Edit icon not displayed in event details");
			}
		}
	}
	
	public void verify_live_details(String companyName,String eventDate,String eventTime,String liveWebcast,String liveWebcastPasscode,String livePhoneUs,String livePasscodeUs,String livePhoneInternational,String livePasscodeInternational,String registrationPhone,String registrationPasscode,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		//String eventTimeValue = getTimeConversion(eventTime);
		//String eventDateValue = getDateConversion(eventDate);
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				if(!liveWebcast.equals("")) {
					soft.assertTrue(jobDetails_webcast_live.get(i).isDisplayed(),"Webcast live label is not displayed");
					soft.assertTrue(jobDetails_webcast_live_copy.get(i).isDisplayed(),"Webcast live copy icon is not displayed");
					waitForExpectedElement(jobDetails_webcast_live_copy.get(i)).click();
					String copiedWebcastLink = get_clip_board_value();
					soft.assertEquals(copiedWebcastLink, liveWebcast, "Copied Live webcast link is not matched");
					soft.assertTrue(jobDetails_webcast_live_newTab.get(i).isDisplayed(),"Webcast live new tab icon is not displayed");
				}
				soft.assertTrue(jobDetails_webcast_passcode_live.get(i).isDisplayed(), "live webcast passcode label is not displayed");
				if(!liveWebcastPasscode.equals("")) {
					soft.assertEquals(jobDetails_webcast_passcode_live_value.get(i).getAttribute("innerHTML"), liveWebcastPasscode, "Live webcast passcode at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_webcast_passcode_live_value.get(i).getAttribute("innerHTML"), "N/A", "Live webcast passcode at row "+i + " is not matched");
				}
				soft.assertTrue(jobDetails_live_phone_us.get(i).isDisplayed(),"live phone us label is not displayed");
				soft.assertTrue(jobDetails_live_passcode_us.get(i).isDisplayed(),"live passcode us label is not displayed");
				soft.assertTrue(jobDetails_live_phone_international.get(i).isDisplayed(),"live phone international label is not displayed");
				soft.assertTrue(jobDetails_live_passcode_international.get(i).isDisplayed(),"live passcode international label is not displayed");
				soft.assertTrue(jobDetails_registration_phone.get(i).isDisplayed(),"Registration phone label is not displayed");
				soft.assertTrue(jobDetails_registration_passcode.get(i).isDisplayed(),"Registration passcode label is not displayed");
				if(!livePhoneUs.equals("")) {
					soft.assertEquals(jobDetails_live_phone_us_value.get(i).getAttribute("innerHTML"), livePhoneUs, "Live phone us at row "+i + " is not matched");
					soft.assertEquals(jobDetails_live_passcode_us_value.get(i).getAttribute("innerHTML"), livePasscodeUs, "Live passcode us at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_live_phone_us_value.get(i).getAttribute("innerHTML"), "N/A", "Live phone us at row "+i + " is not matched");
					soft.assertEquals(jobDetails_live_passcode_us_value.get(i).getAttribute("innerHTML"), "N/A", "Live passcode us at row "+i + " is not matched");
				}
				if(!livePhoneInternational.equals("")) {
					soft.assertEquals(jobDetails_live_phone_international_value.get(i).getAttribute("innerHTML"), livePhoneInternational, "Live phone international at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_live_phone_international_value.get(i).getAttribute("innerHTML"), "N/A", "Live phone international at row "+i + " is not matched");
				}
				if(!livePasscodeInternational.equals("")) {
					soft.assertEquals(jobDetails_live_passcode_international_value.get(i).getAttribute("innerHTML"), livePasscodeInternational, "Live passcode international at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_live_passcode_international_value.get(i).getAttribute("innerHTML"), "N/A", "Live passcode international at row "+i + " is not matched");
				}
				if(!registrationPhone.equals("")) {
					soft.assertEquals(jobDetails_registration_phone_value.get(i).getAttribute("innerHTML"), registrationPhone, "Registration phone at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_registration_phone_value.get(i).getAttribute("innerHTML"), "N/A", "Registration phone at row "+i + " is not matched");
				}
				if(!registrationPasscode.equals("")) {
					soft.assertEquals(jobDetails_registration_passcode_value.get(i).getAttribute("innerHTML"), registrationPasscode, "Registration passcode at  "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_registration_passcode_value.get(i).getAttribute("innerHTML"), "N/A", "Registration passcode at  "+i + " is not matched");
				}
			}
		}
	}
	
	public void verify_replay_details(String companyName,String eventDate,String eventTime,String replayWebcast,String replayWebcastPasscode,String replayPhoneUs,String replayPasscodeUs,String replayPhoneInternational,String replayPasscodeInternational,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		//String eventTimeValue = getTimeConversion(eventTime);
		//String eventDateValue = getDateConversion(eventDate);
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				if(!replayWebcast.equals("")) {
					soft.assertTrue(jobDetails_webcast_replay.get(i).isDisplayed(),"Webcast replay label is not displayed");
					soft.assertTrue(jobDetails_webcast_replay_copy.get(i).isDisplayed(),"Webcast replay copy icon is not displayed");
					waitForExpectedElement(jobDetails_webcast_replay_copy.get(i)).click();
					String copiedWebcastLink = get_clip_board_value();
					soft.assertEquals(copiedWebcastLink, replayWebcast, "Copied Replay webcast link is not matched");
					soft.assertTrue(jobDetails_webcast_replay_newTab.get(i).isDisplayed(),"Webcast replay new tab icon is not displayed");
				}
				soft.assertTrue(jobDetails_webcast_passcode_replay.get(i).isDisplayed(), "Replay webcast passcode label is not displayed");
				soft.assertTrue(jobDetails_replay_phone_us.get(i).isDisplayed(),"Replay phone us label is not displayed");
				soft.assertTrue(jobDetails_replay_passcode_us.get(i).isDisplayed(),"Replay passcode us label is not displayed");
				soft.assertTrue(jobDetails_replay_phone_international.get(i).isDisplayed(),"Replay phone international label is not displayed");
				soft.assertTrue(jobDetails_replay_passcode_international.get(i).isDisplayed(),"Replay passcode international label is not displayed");
				if(!replayWebcastPasscode.equals("")) {
					soft.assertEquals(jobDetails_webcast_passcode_replay_value.get(i).getAttribute("innerHTML"), replayWebcastPasscode, "Replay webcast passcode at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_webcast_passcode_replay_value.get(i).getAttribute("innerHTML"), "N/A", "Replay webcast passcode at row "+i + " is not matched");
				}
				if(!replayPhoneUs.equals("")) {
					soft.assertEquals(jobDetails_replay_phone_us_value.get(i).getAttribute("innerHTML"), replayPhoneUs, "Replay phone us at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_replay_phone_us_value.get(i).getAttribute("innerHTML"), "N/A", "Replay phone us at row "+i + " is not matched");
				}
				if(!replayPasscodeUs.equals("")) {
					soft.assertEquals(jobDetails_replay_passcode_us_value.get(i).getAttribute("innerHTML"), replayPasscodeUs, "Replay passcode us at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_replay_passcode_us_value.get(i).getAttribute("innerHTML"), "N/A", "Replay passcode us at row "+i + " is not matched");
				}
				if(!replayPhoneInternational.equals("")) {
					soft.assertEquals(jobDetails_replay_phone_international_value.get(i).getAttribute("innerHTML"), replayPhoneInternational, "Replay phone international at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_replay_phone_international_value.get(i).getAttribute("innerHTML"), "N/A", "Replay phone international at row "+i + " is not matched");
				}
				if(!replayPasscodeInternational.equals("")) {
					soft.assertEquals(jobDetails_replay_passcode_international_value.get(i).getAttribute("innerHTML"), replayPasscodeInternational, "Replay passcode international at row "+i + " is not matched");
				}else {
					soft.assertEquals(jobDetails_replay_passcode_international_value.get(i).getAttribute("innerHTML"), "N/A", "Replay passcode international at row "+i + " is not matched");
				}
			}
		}
	}
}
