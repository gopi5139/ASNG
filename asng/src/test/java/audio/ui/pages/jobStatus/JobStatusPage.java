package audio.ui.pages.jobStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.CucumberReporterUtils;
import utils.PageObjectUtils;

public class JobStatusPage extends PageObjectUtils {
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath = "//input[@id='jobStatus']")
	private WebElement job_status;

	@FindBy(xpath = "//input[@id='jobStatus']/following-sibling::div/a")
	private List<WebElement> job_status_list;

	@FindBy(xpath = "//input[@id='jobStatus']/preceding::label")
	private WebElement job_status_label;

	@FindBy(xpath = "//input[@id='fromDate']/parent::div/preceding-sibling::label")
	private WebElement job_date_label;

	@FindBy(xpath = "//input[@id='fromDate']")
	private WebElement job_date_from;

	@FindBy(xpath = "//input[@id='toDate']")
	private WebElement job_date_to;

	@FindBy(xpath = "//input[@id='selectOptionKey']")
	private WebElement search_filter_key;

	@FindBy(xpath = "//input[@id='selectOptionKey']/following-sibling::div/a")
	private List<WebElement> search_filter_key_list;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement search_filter_company_name_value;
	
	@FindBy(xpath="//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[@class='ng-star-inserted']")
	private List<WebElement> company_name_dropdown_list;
	
	@FindBy(xpath="//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[1]")
	private WebElement company_name_dropdown;

	@FindBy(xpath = "//input[@id='searchValue']")
	private WebElement search_filter_value;

	@FindBy(xpath = "//input[@id='selectOptionKey']//ancestor::ul/parent::div/parent::div/parent::div/preceding-sibling::label")
	private WebElement search_filter_label;

	@FindBy(xpath = "//button[text()='Clear filter']")
	private WebElement clear_filter;

	@FindBy(xpath = "//button[text()='Apply filter']")
	private WebElement apply_filter;

	@FindBy(xpath = "//div[@class='container-fluid p-0']/preceding-sibling::h6[text()='Job Status']")
	private WebElement job_status_title;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']")
	private WebElement columns_job_id;

	@FindBy(xpath = "//nav[@class='float-end']/ul/li/a[text()='Next']")
	private WebElement next_button;

	@FindBy(xpath = "//nav[@class='float-end']/ul/li/a[text()='Previous']")
	private WebElement previous_button;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[1]")
	private WebElement table_header_recording_id;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[2]")
	private WebElement table_header_job_date;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[3]")
	private WebElement table_header_event_date;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[4]")
	private WebElement table_header_event_time;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[5]")
	private WebElement table_header_company_name;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[6]")
	private WebElement table_header_event_title;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[7]")
	private WebElement table_header_recorded_by;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[8]")
	private WebElement table_header_duration;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[9]")
	private WebElement table_header_call_status;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[10]")
	private WebElement table_header_upload_status;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']")
	private List<WebElement> table_columns;
	
	@FindBy(xpath = "//button[text()='Refresh data']")
	private List<WebElement> table_columns_refresh_data;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/span")
	private List<WebElement> table_columns_job_id_text;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']")
	private List<WebElement> table_columns_job_id;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobDate']")
	private List<WebElement> table_columns_job_date;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='eventDate']")
	private List<WebElement> table_columns_event_date;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='eventTime']")
	private List<WebElement> table_columns_event_time;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='companyName']")
	private List<WebElement> table_columns_company_name;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='eventTitle']")
	private List<WebElement> table_columns_event_title;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='recordedBy']")
	private List<WebElement> table_columns_recorded_by;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='duration']")
	private List<WebElement> table_columns_duration;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='callStatus']")
	private List<WebElement> table_columns_call_status;

	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='uploadStatus']")
	private List<WebElement> table_columns_upload_status;

	@FindBy(xpath = "//div[@id='eventId']")
	private List<WebElement> table_columns_event_id;
	
	@FindBy(xpath = "//div[@id='eventId']/parent::div/parent::div/preceding-sibling::div/div[1][text()='Event id']")
	private List<WebElement> table_columns_event_id_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[3]/div[2]//div[@id='status']")
	private List<WebElement> table_columns_status;
	
	@FindBy(xpath = "//div[@id='status']/parent::div/parent::div/preceding-sibling::div/div[2][text()='Status']")
	private List<WebElement> table_columns_status_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[3]/div[2]//div[@id='uploadedBy']")
	private List<WebElement> table_columns_uploaded_by;
	
	@FindBy(xpath = "//div[@id='uploadedBy']/parent::div/parent::div/preceding-sibling::div/div[3][text()='Uploaded by']")
	private List<WebElement> table_columns_uploaded_by_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[3]/div[2]//div[@id='uploadDate']")
	private List<WebElement> table_columns_uploaded_date;
	
	@FindBy(xpath = "//div[@id='uploadDate']/parent::div/parent::div/preceding-sibling::div/div[4][text()='Upload date']")
	private List<WebElement> table_columns_uploaded_date_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[3]/div[2]//div[@id='uploadTime']")
	private List<WebElement> table_columns_uploaded_time;
	
	@FindBy(xpath = "//div[@id='uploadTime']/parent::div/parent::div/preceding-sibling::div/div[5][text()='Upload time']")
	private List<WebElement> table_columns_uploaded_time_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[3]/div[2]//div[@id='comments']")
	private List<WebElement> table_columns_comments;
	
	@FindBy(xpath = "//div[@id='comments']/parent::div/parent::div/preceding-sibling::div/div[6][text()='Comments']")
	private List<WebElement> table_columns_comments_label;

	@FindBy(xpath = "//p[@id='ticker']")
	private List<WebElement> table_columns_ticker;
	
	@FindBy(xpath = "//p[@id='ticker']/preceding-sibling::label[text()='Ticker :']")
	private List<WebElement> table_columns_ticker_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[1]/div[2]/div/p[@id='recordingStartTime']")
	private List<WebElement> table_columns_recording_start_time;
	
	@FindBy(xpath = "//p[@id='recordingStartTime']/preceding-sibling::label[text()='Recording start time :']")
	private List<WebElement> table_columns_recording_start_time_label;
	
	@FindBy(xpath = "//div[@class='asng-audio-tables-content ng-star-inserted']/div/div[@id='jobid']/parent::div/following-sibling::div/div[1]/div[3]/div/p[@id='recordingEndTime']")
	private List<WebElement> table_columns_recording_end_time;
	
	@FindBy(xpath = "//p[@id='recordingEndTime']/preceding-sibling::label[text()='Recording end time :']")
	private List<WebElement> table_columns_recording_end_time_label;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[@class='list-nodata p-3 ng-star-inserted']/p[text()='No Data ...']")
	private WebElement table_no_data;
	
	@FindBy(xpath = "//input[@id='jobStatus']/following-sibling::div/a[2]")
	private WebElement job_status_inProgress;
	
	@FindBy(xpath = "//input[@id='jobStatus']/following-sibling::div/a[1]")
	private WebElement job_status_notStarted;
	
	@FindBy(xpath = "//input[@id='jobStatus']/following-sibling::div/a[3]")
	private WebElement job_status_completed;
	
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
	
	@FindBy(css = "ng-tns-c55-2.la-2x.la-ball-clip-rotate-multiple") 
	private List<WebElement> page_spinner;
	
	@FindBy(css = "#asng-audio-tables > div.asng-table-data > div > p") 
	private List<WebElement> no_data;

	public JobStatusPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}

	public void verify_default_elements() {
		moveToElement(job_status_title).perform();
		is_job_status_title_displayed();
		verify_table_header_elements();
		is_job_status_elements_displayed();
	}

	public void is_job_status_title_displayed() {
		soft.assertTrue(waitForExpectedElement(job_status_title).isDisplayed(),"Job status title is not displayed");
	}
	
	public void verify_job_status_dropdown_elements() {
		soft.assertEquals(job_status_inProgress.getAttribute("innerHTML"), "In Progress","In Progress option in Job Status dropdown is not displaying");
		soft.assertEquals(job_status_notStarted.getAttribute("innerHTML"), "Not Started","Not Started option in Job Status dropdown is not displaying");
		soft.assertEquals(job_status_completed.getAttribute("innerHTML"), "Completed","Completed option in Job Status dropdown is not displaying");
	}
	
	public void verify_search_filter_dropdown_elements() {
		soft.assertEquals(search_filter_all.getAttribute("innerHTML"), "All","All option in search filter dropdown is not displaying");
		soft.assertEquals(search_filter_company_name.getAttribute("innerHTML"), "Company name","Company Name option in search filter dropdown is not displaying");
		soft.assertEquals(search_filter_ticker.getAttribute("innerHTML"), "Ticker","Ticker option in search filter dropdown is not displaying");
		soft.assertEquals(search_filter_job_id.getAttribute("innerHTML"), "Job id","Job id option in search filter dropdown is not displaying");
		soft.assertEquals(search_filter_event_id.getAttribute("innerHTML"), "Event id","Event id option in search filter dropdown is not displaying");
	}

	public void is_job_status_elements_displayed() {
		soft.assertTrue(job_status_label.isDisplayed(),"Job status Label is not displayed in the elements");
		soft.assertTrue(job_status.isDisplayed(),"Job status field is not displayed in the elements");
		soft.assertTrue(job_date_label.isDisplayed(),"Job date label is not displayed in the elements");
		soft.assertTrue(job_date_from.isDisplayed(),"Job date from is not displayed in the elements");
		soft.assertTrue(job_date_to.isDisplayed(),"Job date to is not displayed in the elements");
		soft.assertTrue(search_filter_key.isDisplayed(),"Search filter dropdown is not displayed in the elements");
		soft.assertTrue(search_filter_value.isDisplayed(),"Search filter value is not displayed in the elements");
		soft.assertTrue(search_filter_label.isDisplayed(),"Search filter label is not displayed in the elements");
		soft.assertTrue(clear_filter.isDisplayed(),"Clear filter button is not displayed in the elements");
		soft.assertTrue(apply_filter.isDisplayed(),"Clear filter button is not displayed in the elements");
		soft.assertTrue(previous_button.isDisplayed(),"Previous button is not displayed in the elements");
		soft.assertTrue(next_button.isDisplayed(),"Next button is not displayed in the elements");
	}

	public void select_job_status(String jobStatus) {
		verify_job_status_dropdown_elements();
		check_before_sending_keys(job_status, job_status_label, "Select type", "Job status", "Job Status");
		waitForExpectedElement(job_status).click();
		for (WebElement i : job_status_list) {
			if (jobStatus.equalsIgnoreCase(waitForExpectedElement(i).getText())) {
				waitForExpectedElement(i).click();
				break;
			}
		}
		check_after_sending_keys(job_status, jobStatus, "Job Status");
	}

	public void select_from_date(String fromDate) {
//		check_before_sending_keys(job_date_from, job_date_label, "From", "Job date", "From Date");
		waitForExpectedElement(job_date_from).click();
		datepickerDateSelect(fromDate.trim());
		//check_after_sending_keys(job_date_from, fromDate, "From Date");
	}

	public void select_to_date(String toDate) {
//		check_before_sending_keys(job_date_to, job_date_label, "To", "Job date", "To Date");
		waitForExpectedElement(job_date_to).click();
		datepickerDateSelect(toDate.trim());
		//check_after_sending_keys(job_date_to, toDate, "To Date");
	}

	public void click_apply_filter() {
		waitForExpectedElement(apply_filter).click();
		sleep(3000,page_spinner);
	}

	public void click_clear_filter() {
		waitForExpectedElement(clear_filter).click();
	}

	public void select_search_filter_key(String searchFilterKey) {
		verify_search_filter_dropdown_elements();
		check_before_sending_keys(search_filter_key, search_filter_label, "Select type","Search filter", "Search Filter Key");
		waitForExpectedElement(search_filter_key).click();
		for (WebElement i : search_filter_key_list) {
			if (searchFilterKey.trim().equalsIgnoreCase(waitForExpectedElement(i).getText())) {
				waitForExpectedElement(i).click();
				break;
			}
		}
		check_after_sending_keys(search_filter_key, searchFilterKey, "Search Filter Key");
	}

	public void enter_search_filter_value(String searchFilterKey,String searchFilterValue) {
		if(searchFilterKey.equals("Company name")) {
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

	public void click_next() {
		waitForExpectedElement(columns_job_id).getSize();
		if (Integer.valueOf(waitForExpectedElement(columns_job_id).getSize().toString()) == 10) {
			waitForExpectedElement(next_button).click();
		}
	}

	public void click_previous() {
		waitForExpectedElement(previous_button).click();
	}

	public void verify_table_header_elements() {
		soft.assertEquals(table_header_recording_id.getText(), "Job id","Recording Id in table header is not matched");
		soft.assertEquals(table_header_job_date.getText(), "Job date","Job date in table header is not matched");
		soft.assertEquals(table_header_event_date.getText(), "Event date","Event date in table header is not matched");
		soft.assertEquals(table_header_event_time.getText(), "Event time","Event time in table header is not matched");
		soft.assertEquals(table_header_company_name.getText(), "Company name","Company name in table header is not matched");
		soft.assertEquals(table_header_recorded_by.getText(), "Recorded by","Recorded by in table header is not matched");
		soft.assertEquals(table_header_event_title.getText(), "Event title","Event title in table header is not matched");
		soft.assertEquals(table_header_duration.getText(), "Duration","Duration in table header is not matched");
		soft.assertEquals(table_header_call_status.getText(), "Job status","Call status in table header is not matched");
		soft.assertEquals(table_header_upload_status.getText(), "Upload status","Upload status in table header is not matched");
	}

	public void verify_searchResults_in_jobsStatusTable(String jobStatus, String fromDate, String toDate,String uploadStatus, String searchFilterKey, String searchValue,String eventDate,String eventTime,String companyName,String eventTitle,String callStatus,String recordedBy,String ticker,String jobDate,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		try {
			boolean isNotPresent = true;
			do {
				if (!jobStatus.equals("")) {
					for (int i = 0; i < table_columns_call_status.size(); i++) {
						String tableValue = waitForExpectedElement(table_columns_call_status.get(i)).getText();
						soft.assertEquals(tableValue, jobStatus, "Job Status in row " + i);
					}
				}
				if (!fromDate.equals("") && !toDate.equals("")) {
					for (int i = 0; i < table_columns_event_date.size(); i++) {
						Date tableValue = new SimpleDateFormat("dd-MMM-yyyy").parse(waitForExpectedElement(table_columns_job_date.get(i)).getText());
						Date min = new SimpleDateFormat("yyyy-MM-dd").parse(fromDate),max = new SimpleDateFormat("yyyy-MM-dd").parse(toDate);
						DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
						if (tableValue.equals(max)) {
							soft.assertEquals(dateFormat.format(tableValue), dateFormat.format(max),"Event Date in row " + i + " is not matched");
						} else if (tableValue.equals(min)) {
							soft.assertEquals(dateFormat.format(tableValue), dateFormat.format(min),"Event Date in row " + i + " is not matched");
						} else if (!tableValue.after(min) && !tableValue.before(max)) {
							soft.assertTrue(false,"Event Date in row " + i + " is not in between fromDate and toDate");
						}
					}
				}
				if (!searchFilterKey.equals("")) {
					if (searchFilterKey.trim().equalsIgnoreCase("Company name")) {
						for (int i = 0; i < table_columns_company_name.size(); i++) {
							String tableValue = waitForExpectedElement(table_columns_company_name.get(i)).getText();
							soft.assertEquals(tableValue, searchValue, "Company Name in row " + i + " is not matched");
						}
					} else if (searchFilterKey.trim().equalsIgnoreCase("Ticker")) {
						for (int i = 0; i < table_columns_ticker.size(); i++) {
							String tableValue = table_columns_ticker.get(i).getAttribute("innerHTML");
							soft.assertEquals(tableValue, searchValue, "Ticker in row " + i + " is not matched");
						}
					} else if (searchFilterKey.trim().equalsIgnoreCase("Job id")) {
						for (int i = 0; i < table_columns_job_id_text.size(); i++) {
							String tableValue = table_columns_job_id_text.get(i).getAttribute("innerHTML").split(" ")[0];
							soft.assertEquals(tableValue, searchValue, "Job ID in row " + i + " is not matched");
						}
					} else if (searchFilterKey.trim().equalsIgnoreCase("Event id")) {
						for (int i = 0; i < table_columns_event_id.size(); i++) {
							String tableValue = table_columns_event_id.get(i).getAttribute("innerHTML");
							soft.assertEquals(tableValue, searchValue, "Event ID in row " + i + " is not matched");
						}
					} else if (searchFilterKey.trim().equalsIgnoreCase("All")) {

					}
				}
				if (table_columns_call_status.size() == 0) {
					soft.assertEquals(String.valueOf(table_columns.size()), String.valueOf(0),"Table columns should be empty");
					soft.assertTrue(waitForExpectedElement(table_no_data).isDisplayed(),"No Data message is not displayed");
				}
				for(int i=0;i<table_columns_job_id.size();i++) {
					if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
						soft.assertNotNull(table_columns_job_id.get(i).getText().trim(),"Job id is null");
						//soft.assertEquals(table_columns_recording_id.get(i).getText().trim(), shortId, "Recording id is not matched");
						soft.assertEquals(table_columns_job_date.get(i).getText().trim(), jobDate, "Job date is not matched");
						soft.assertEquals(table_columns_event_date.get(i).getText().trim(), eventDateValue, "Event date is not matched");
						soft.assertEquals(table_columns_event_time.get(i).getText().trim(), eventTimeValue, "Event time is not matched");
						soft.assertEquals(table_columns_event_title.get(i).getText().trim(), eventTitle, "Event title is not matched");
						soft.assertEquals(table_columns_company_name.get(i).getText().trim(), companyName, "Company name is not matched");
						soft.assertEquals(table_columns_recorded_by.get(i).getText().trim(), recordedBy, "Recorded by is not matched");
						soft.assertEquals(table_columns_call_status.get(i).getText().trim(), callStatus, "Call status is not matched");
						table_columns_job_id.get(i).click();
						soft.assertTrue(table_columns_ticker_label.get(i).isDisplayed(),"Ticker label is not displayed");
						soft.assertEquals(table_columns_ticker.get(i).getAttribute("innerHTML").trim(), ticker, "Ticker is not matched");
						soft.assertTrue(table_columns_event_id_label.get(i).isDisplayed(),"Event id label is not displayed");
						soft.assertNotNull(table_columns_event_id.get(i).isDisplayed(),"Event id is null");
						//soft.assertEquals(table_columns_event_id.get(i).getAttribute("innerHTML"), eventId, "Event ID is not matched");
						soft.assertTrue(table_columns_refresh_data.get(i).isDisplayed(),"Refresh data is not displayed");
						soft.assertTrue(table_columns_recording_start_time_label.get(i).isDisplayed(),"Recording start time label is not displayed");
						soft.assertTrue(table_columns_recording_end_time_label.get(i).isDisplayed(),"Recording end time label is not displayed");
						soft.assertTrue(table_columns_status_label.get(i).isDisplayed(),"Status label is not displayed");
						soft.assertTrue(table_columns_uploaded_by_label.get(i).isDisplayed(),"Uploaded by label is not displayed");
						soft.assertTrue(table_columns_uploaded_date_label.get(i).isDisplayed(),"Uploaded date label is not displayed");
						soft.assertTrue(table_columns_uploaded_time_label.get(i).isDisplayed(),"Uploaded time label is not displayed");
						soft.assertTrue(table_columns_comments_label.get(i).isDisplayed(),"Comments label is not displayed");
						table_columns_job_id.get(i).click();
						isNotPresent = false;
						break;
					}
				}
				if(isNotPresent==true) {
					waitForExpectedElement(next_button).click();
				}
			}while(isNotPresent);
			
		} catch (ParseException e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
}
