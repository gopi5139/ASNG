package audio.ui.pages.callRecording;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.CucumberReporterUtils;
import utils.PageObjectUtils;

public class CallRecordingPage extends PageObjectUtils {
	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input")
	private WebElement call_status;

	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input/following-sibling::div/a")
	private List<WebElement> call_status_list;

	@FindBy(xpath = "//div[@id='callStatus']/preceding-sibling::label")
	private WebElement call_status_label;

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

	@FindBy(xpath = "//input[@id='searchValue']")
	private WebElement search_filter_value;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement search_filter_company_name_value;

	@FindBy(xpath = "//input[@id='selectOptionKey']/ancestor::ul/parent::div/parent::div/parent::div/preceding-sibling::label")
	private WebElement search_filter_label;

	@FindBy(xpath = "//button[text()='Clear filter']")
	private WebElement clear_filter;

	@FindBy(xpath = "//button[text()='Apply filter']")
	private WebElement apply_filter;

	@FindBy(xpath = "//div[@class='audio-swich d-flex']/preceding-sibling::h6[text()='Call Recording Status']")
	private WebElement call_recording_title;

	@FindBy(xpath = "//label[text()='Auto Assignment']")
	private WebElement auto_assignment_label;

	@FindBy(xpath = "//label[text()='Auto Assignment']/following-sibling::label/input")
	private WebElement auto_assignment;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next_button;

	@FindBy(xpath = "//button[text()='Previous']")
	private WebElement previous_button;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[1]")
	private WebElement table_header_recording_id;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[2]")
	private WebElement table_header_company_name;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[3]")
	private WebElement table_header_ticker;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[4]")
	private WebElement table_header_event_date;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[5]")
	private WebElement table_header_event_time;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[6]")
	private WebElement table_header_webcast_link;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[7]")
	private WebElement table_header_us_phone;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[8]")
	private WebElement table_header_us_passcode;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[9]")
	private WebElement table_header_meeting_id;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[10]")
	private WebElement table_header_control_number;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[11]")
	private WebElement table_header_status;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div[1]/div[12]")
	private WebElement table_header_actions;

	@FindBy(xpath = "//div[@id='asng-audio-tables']/div/div[@class='list-nodata p-3 ng-star-inserted']/p[text()='No Data ...']")
	private WebElement table_no_data;
	
	@FindBy(xpath = "//div[@class='asng-table-data']/div")
	private List<WebElement> table_columns;

	@FindBy(xpath = "//div[@id='companyName']/preceding-sibling::div/span")
	private List<WebElement> table_columns_recording_id;
	
	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='jobId']/div/p")
	private List<WebElement> table_columns_short_id;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='companyName']")
	private List<WebElement> table_columns_company_name;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='ticker']")
	private List<WebElement> table_columns_ticker;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='eventDate']")
	private List<WebElement> table_columns_event_date;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='eventTime']")
	private List<WebElement> table_columns_event_time;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='websaketlink']/span/img")
	private List<WebElement> table_columns_webcast_link;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='usPhone']/span/img")
	private List<WebElement> table_columns_us_phone;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='usPasscode']")
	private List<WebElement> table_columns_us_passcode;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='meetingId']")
	private List<WebElement> table_columns_meeting_id;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='convidolNumber']")
	private List<WebElement> table_columns_control_number;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='status']")
	private List<WebElement> table_columns_status;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='jobId']/following-sibling::div[11]/img[1]")
	private List<WebElement> table_columns_record;

	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='jobId']/following-sibling::div[11]/img[2]")
	private List<WebElement> table_columns_edit;

	@FindBy(xpath = "//div[@class='event-details']/div[2]/div[3]/div/label[text()='Event ID:']")
	private List<WebElement> table_columns_event_id_label;

	@FindBy(xpath = "//label[text()='Event ID:']/following-sibling::p")
	private List<WebElement> table_columns_event_id;

	@FindBy(xpath = "//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[@class='ng-star-inserted']")
	private List<WebElement> company_name_dropdown_list;

	@FindBy(xpath = "//ng-autocomplete[@id='autocomplete']/div/div[2]/ul/li/div/a[1]")
	private WebElement company_name_dropdown;
	
	@FindBy(xpath = "//h5[text()='Webcast details']")
	private List<WebElement> webcastDetailsLabel;
	
	@FindBy(xpath = "//h5[text()='//h5[text()='Dial-in details']")
	private List<WebElement> dailinDetailsLabel;
	
	@FindBy(xpath = "//img[@alt='edit']/parent::div/parent::div//div[@class='row']")
	private List<WebElement> edit_popup;

	@FindBy(xpath = "//input[@formcontrolname='live_webcast_url']")
	private List<WebElement> edit_webcast_link;

	@FindBy(xpath = "//input[@formcontrolname='live_webcast_url']/preceding-sibling::label")
	private List<WebElement> edit_webcast_link_label;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	private List<WebElement> edit_password;

	@FindBy(xpath = "//input[@formcontrolname='password']/preceding-sibling::label")
	private List<WebElement> edit_password_label;

	@FindBy(xpath = "//input[@formcontrolname='meeting_id']")
	private List<WebElement> edit_meeting_id;

	@FindBy(xpath = "//input[@formcontrolname='meeting_id']/preceding-sibling::label")
	private List<WebElement> edit_meeting_id_label;

	@FindBy(xpath = "//input[@formcontrolname='condivol_number']")
	private List<WebElement> edit_control_number;

	@FindBy(xpath = "//input[@formcontrolname='condivol_number']/preceding-sibling::label")
	private List<WebElement> edit_control_number_label;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_us']")
	private List<WebElement> edit_live_phone_us;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_us']/preceding-sibling::label")
	private List<WebElement> edit_live_phone_us_label;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_us']")
	private List<WebElement> edit_live_passcode_us;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_us']/preceding-sibling::label")
	private List<WebElement> edit_live_passcode_us_label;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_international']")
	private List<WebElement> edit_live_phone_international;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_international']/preceding-sibling::label")
	private List<WebElement> edit_live_phone_international_label;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_international']")
	private List<WebElement> edit_live_passcode_international;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_international']/preceding-sibling::label")
	private List<WebElement> edit_live_passcode_international_label;

	@FindBy(xpath = "//input[@formcontrolname='registration_phone']")
	private List<WebElement> edit_registration_phone;

	@FindBy(xpath = "//input[@formcontrolname='registration_phone']/preceding-sibling::label")
	private List<WebElement> edit_registration_phone_label;

	@FindBy(xpath = "//input[@formcontrolname='registration_passcode']")
	private List<WebElement> edit_registration_passcode;

	@FindBy(xpath = "//input[@formcontrolname='registration_passcode']/preceding-sibling::label")
	private List<WebElement> edit_registration_passcode_label;

	@FindBy(xpath = "//input[@formcontrolname='registration_passcode']/parent::div/following-sibling::p")
	private List<WebElement> update_success_message;

	@FindBy(xpath = "//button[text()='Save']")
	private List<WebElement> edit_save_button;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private List<WebElement> edit_cancel_button;

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

	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input/following-sibling::div/a[1]")
	private WebElement call_status_all;

	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input/following-sibling::div/a[2]")
	private WebElement call_status_not_started;

	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input/following-sibling::div/a[3]")
	private WebElement call_status_started;

	@FindBy(xpath = "//div[@id='callStatus']/ul/li/input/following-sibling::div/a[4]")
	private WebElement call_status_stopped;
	
	@FindBy(xpath = "//label[text()=' Container URL']")
	private List<WebElement> webcast_popup_containerURL_label;
	
	@FindBy(xpath = "//label[text()=' Container URL']/following-sibling::span/img")
	private List<WebElement> webcast_popup_containerURL_copy;
	
	@FindBy(xpath = "//label[text()=' Container URL']/following-sibling::a")
	private List<WebElement> webcast_popup_containerURL_newTab;
	
	@FindBy(xpath = "//label[normalize-space(text())='Preload browser']")
	private List<WebElement> webcast_popup_preload_browser_label;
	
	@FindBy(xpath = "//label[normalize-space(text())='Preload browser']/following-sibling::label")
	private List<WebElement> webcast_popup_preload_browser_toggle_button;
	
	@FindBy(xpath = "//label[text()='Webcastlink to capture']")
	private WebElement webcast_popup_webcastLink_toCapture_label;
	
	@FindBy(xpath = "//label[text()='Webcastlink to capture']/following-sibling::select")
	private WebElement webcast_popup_webcastLink_toCapture_dropdown;
	
	@FindBy(xpath = "//label[text()='Webcastlink to capture']/following-sibling::select/option")
	private List<WebElement> webcast_popup_webcastLink_toCapture_dropdown_options;
	
	@FindBy(xpath = "//label[text()='Browser']")
	private WebElement webcast_popup_browser_label;
	
	@FindBy(xpath = "//label[text()='Browser']/following-sibling::select")
	private WebElement webcast_popup_browser_dropdown;
	
	@FindBy(xpath = "//label[text()='Browser']/following-sibling::select/option")
	private List<WebElement> webcast_popup_browser_dropdown_options;
	
	@FindBy(xpath = "//label[text()='Try to auto capture']")
	private WebElement webcast_popup_try_autoCapture_label;
	
	@FindBy(xpath = "//label[text()='Try to auto capture']/following-sibling::input")
	private WebElement webcast_popup_try_autoCapture_checkBox;
	
	@FindBy(xpath = "//button[text()='Launch browser in vnc']")
	private WebElement webcast_popup_launch_vnc_browser_button;
	
	@FindBy(xpath = "//div[@id='jobId']/div/div")
	private List<WebElement> jobDetails_job_type;
	
	@FindBy(xpath = "//label[text()='Job id:']")
	private List<WebElement> jobDetails_job_id;
	
	@FindBy(xpath = "//label[text()='Job id:']/following-sibling::p")
	private List<WebElement> jobDetails_short_id_value;
	
	@FindBy(xpath = "//label[text()='Job id:']/following-sibling::span")
	private List<WebElement> jobDetails_job_id_value;
	
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
	
	@FindBy(xpath = "//label[text()='STT status:']")
	private List<WebElement> jobDetails_stt_status;
	
	@FindBy(xpath = "//label[text()='STT status:']/following-sibling::div/label")
	private List<WebElement> jobDetails_stt_status_toggle;
	
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
	
	@FindBy(xpath = "//label[text()='Event id:']/following-sibling::p")
	private List<WebElement> jobDetails_event_id_value;
	
	@FindBy(xpath = "//label[text()='Product type:']")
	private List<WebElement> jobDetails_product_type;
	
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
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='Update Success']")
	private WebElement update_success_toaster_message;
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='Assigned']")
	private WebElement vnc_assigned_toaster_message;
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='VNC']")
	private WebElement browser_launched_toaster_message;
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='RECORDING STARTED']")
	private WebElement recording_started_toaster_message;
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='RECORDING STOPPED']")
	private WebElement recording_stopped_toaster_message;
	
	@FindBy(xpath = "//div[@id='toast-container']/div/div[1][normalize-space(text())='Job Closed']")
	private WebElement job_closed_toaster_message;
	
	@FindBy(xpath = "//button[text()='Refresh data']")
	private WebElement refresh_data_button;
	
	@FindBy(xpath = "//button[text()='Close Job']")
	private WebElement close_job_button;
	
	@FindBy(xpath = "//div[@class='vjs-control-bar']")
	private WebElement audio_palyer;
	
	@FindBy(xpath = "//div[@class='vjs-control-bar']/button[@title='Play']")
	private WebElement audio_palyer_play_button;
	
	@FindBy(xpath = "//div[@class='vjs-control-bar']/div[5]/div[@role='slider']")
	private WebElement audio_palyer_slider;
	
	@FindBy(xpath = "//div[@class='vjs-control-bar']/div[2]")
	private WebElement audio_palyer_start_time;
	
	@FindBy(xpath = "//div[@class='vjs-control-bar']/div[4]")
	public WebElement audio_palyer_end_time;
	
	@FindBy(css = ".spinner-border.spinner-border-sm") 
	private List<WebElement> row_spinner;
	
	@FindBy(css = "#asng-audio-tables > div.asng-table-data > div > p") 
	private List<WebElement> no_data;
	
	@FindBy(css = "[id^='audio-item']") 
	private List<WebElement> collapse;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	public CallRecordingPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}

	public void verify_search_filter_dropdown_elements() {
		waitForExpectedElement(search_filter_key).click();
		soft.assertEquals(search_filter_all.getAttribute("innerHTML"), "All","All option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_company_name.getAttribute("innerHTML"), "Company name","Company Name option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_ticker.getAttribute("innerHTML"), "Ticker","Ticker option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_job_id.getAttribute("innerHTML"), "Recording id","Recording id option in search filter dropdown is not matched");
		soft.assertEquals(search_filter_event_id.getAttribute("innerHTML"), "Event id","Event id option in search filter dropdown is not matched");
	}

	public void verify_call_status_dropdown_elements() {
		soft.assertEquals(call_status_all.getAttribute("innerHTML"), "All","All option in call status dropdown is not matched");
		soft.assertEquals(call_status_not_started.getAttribute("innerHTML"), "Not Started","Not Started option in call status dropdown is not matched");
		soft.assertEquals(call_status_started.getAttribute("innerHTML"), "Started","Started option in call status dropdown is not matched");
		soft.assertEquals(call_status_stopped.getAttribute("innerHTML"), "Stopped","Stopped option in call status dropdown is not matched");
	}

	public void verify_table_header_elements() {
		soft.assertEquals(table_header_recording_id.getAttribute("innerHTML"), "Recording Id","Recording Id in table header is not matched");
		soft.assertEquals(table_header_company_name.getAttribute("innerHTML"), "Company name","Company name in table header is not matched");
		soft.assertEquals(table_header_ticker.getAttribute("innerHTML"), "Ticker","Ticker in table header is not matched");
		soft.assertEquals(table_header_event_date.getAttribute("innerHTML"), "Event date","Event date in table header is not matched");
		soft.assertEquals(table_header_event_time.getAttribute("innerHTML"), "Event time","Event time in table header is not matched");
		soft.assertEquals(table_header_webcast_link.getAttribute("innerHTML"), "Webcast link","Webcast link in table header is not matched");
		soft.assertEquals(table_header_us_phone.getAttribute("innerHTML"), "US phone","US phone in table header is not matched");
		soft.assertEquals(table_header_us_passcode.getAttribute("innerHTML"), "US passcode","US passcode in table header is not matched");
		soft.assertEquals(table_header_meeting_id.getAttribute("innerHTML"), "Meeting id","Meeting id in table header is not matched");
		soft.assertEquals(table_header_control_number.getAttribute("innerHTML"), "Control number","Control number in table header is not matched");
		soft.assertEquals(table_header_status.getAttribute("innerHTML"), "Status","Status in table header is not matched");
		soft.assertEquals(table_header_actions.getAttribute("innerHTML"), "Actions","Actions in table header is not matched");
	}

	public void click_auto_assignment() {
		waitForExpectedElement(auto_assignment).click();
	}

	public void is_call_recording_title_displayed() {
		soft.assertTrue(waitForExpectedElement(call_recording_title).isDisplayed(), "Call Recording Title is not displayed");
	}

	public void is_call_recording_elements_displayed() {
		soft.assertTrue(call_status_label.isDisplayed(), "Call Status label is not displayed");
		soft.assertTrue(call_status.isDisplayed(), "Call Status dropdown is not displayed");
		soft.assertTrue(job_date_label.isDisplayed(), "Job date label is not displayed");
		soft.assertTrue(job_date_from.isDisplayed(), "Job date From textbox is not displayed");
		soft.assertTrue(job_date_to.isDisplayed(), "Job date To textbox is not displayed");
		soft.assertTrue(search_filter_key.isDisplayed(), "Search filter dropdown is not displayed");
		soft.assertTrue(search_filter_value.isDisplayed(), "Search filter textbox is not displayed");
		soft.assertTrue(search_filter_label.isDisplayed(), "Search filter label is not displayed");
		soft.assertTrue(auto_assignment_label.isDisplayed(), "Auto Assignment label is not displayed");
		soft.assertTrue(clear_filter.isDisplayed(), "Clear filter button is not displayed");
		soft.assertTrue(apply_filter.isDisplayed(), "Apply filter button is not displayed");
	}

	public void verify_default_elements() {
		is_call_recording_title_displayed();
		verify_table_header_elements();
		is_call_recording_elements_displayed();
	}

	public void select_search_filter_key(String searchFilterKey) {
		verify_search_filter_dropdown_elements();
		check_before_sending_keys(search_filter_key, search_filter_label, "Select type", "Search filter","Search Filter Key");
		for (WebElement i : search_filter_key_list) {
			if (searchFilterKey.equalsIgnoreCase(waitForExpectedElement(i).getText())) {
				waitForExpectedElement(i).click();
				break;
			}
		}
		check_after_sending_keys(search_filter_key, searchFilterKey, "Search Filter Key");
	}

	public void enter_search_filter_value(String searchFilterKey, String searchFilterValue) {
		if (searchFilterKey.equalsIgnoreCase("Company name")) {
			check_before_sending_keys(search_filter_company_name_value, "Search", "Search Filter Value");
			waitForExpectedElement(search_filter_company_name_value).sendKeys(searchFilterValue);
			waitForExpectedElement(company_name_dropdown).isDisplayed();
			select_from_dropdown(company_name_dropdown_list, searchFilterValue);
			check_after_sending_keys(search_filter_company_name_value, searchFilterValue, "Search Filter Value");
		} else {
			check_before_sending_keys(search_filter_value, "Search", "Search Filter Value");
			waitForExpectedElement(search_filter_value).sendKeys(searchFilterValue);
			check_after_sending_keys(search_filter_value, searchFilterValue, "Search Filter Value");
		}
	}

	public void select_call_status(String callStatus) {
		verify_call_status_dropdown_elements();
		check_before_sending_keys(call_status, call_status_label, "Select type", "Call status", "Call Status");
		waitForExpectedElement(call_status).click();
		for (WebElement i : call_status_list) {
			if (callStatus.equalsIgnoreCase(waitForExpectedElement(i).getText())) {
				waitForExpectedElement(i).click();
				break;
			}
		}
		check_after_sending_keys(call_status, callStatus, "Call Status");
	}

	public void select_from_date(String fromDate) {
		check_before_sending_keys(job_date_from, job_date_label, "From", "Job date", "From Date");
		waitForExpectedElement(job_date_from).click();
		datepickerDateSelect(fromDate);
		// check_after_sending_keys(job_date_from, fromDate, "From Date");
	}

	public void select_to_date(String toDate) {
		check_before_sending_keys(job_date_to, job_date_label, "To", "Job date", "To Date");
		waitForExpectedElement(job_date_to).click();
		datepickerDateSelect(toDate);
		// check_after_sending_keys(job_date_to, toDate, "To Date");
	}

	public void click_apply_filter() {
		waitForExpectedElement(apply_filter).click();
		sleep(5000);
	}

	public void click_clear_filter() {
		waitForExpectedElement(clear_filter).click();
		sleep(5000);
	}

	public void verify_searchResults_in_jobsStatusTable(String callStatus, String fromDate, String toDate, String searchFilterKey,String searchValue){
		try {
			if (!callStatus.equals("")) {
				if(!callStatus.equals("All")) {
					for (int i = 0; i < table_columns_status.size(); i++) {
						String tableValue = waitForExpectedElement(table_columns_status.get(i)).getText();
						soft.assertEquals(tableValue, callStatus, "Status in row " + i + " is not matched");
					}
				}
				else {
					for(int i=0; i<table_columns_status.size();i++) {
						if(table_columns_status.get(i).getText().equals("Not Started")||table_columns_status.get(i).getText().equals("Started")||table_columns_status.get(i).getText().equals("Stopped")) {
							
						}else {
							Assert.assertTrue(false,"Call status in jobs are not matched");
						}
					}
				}
			}
			if (!fromDate.equals("") && !toDate.equals("")) {
				for (int i = 0; i < table_columns_event_date.size(); i++) {
					Date tableValue = new SimpleDateFormat("dd-MMM-yyyy").parse(waitForExpectedElement(table_columns_event_date.get(i)).getText());
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
				if (searchFilterKey.equalsIgnoreCase("Company name")) {
					for (int i = 0; i < table_columns_company_name.size(); i++) {
						String tableValue = waitForExpectedElement(table_columns_company_name.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Company Name in row " + i + " is not matched");
					}
				} else if (searchFilterKey.equalsIgnoreCase("Ticker")) {
					for (int i = 0; i < table_columns_ticker.size(); i++) {
						String tableValue = waitForExpectedElement(table_columns_ticker.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Ticker in row " + i + " is not matched");
					}
				} else if (searchFilterKey.equalsIgnoreCase("Recording id")) {
					for (int i = 0; i < table_columns_recording_id.size(); i++) {
						String tableValue = waitForExpectedElement(table_columns_recording_id.get(i)).getText().trim();
						soft.assertEquals(tableValue, searchValue, "Recording ID in row " + i + " is not matched");
					}
				} else if (searchFilterKey.equalsIgnoreCase("Event id")) {
					for (int i = 0; i < table_columns_company_name.size(); i++) {
						waitForExpectedElement(table_columns_company_name.get(i)).click();
						String tableValue = waitForExpectedElement(table_columns_event_id.get(i)).getText();
						soft.assertEquals(tableValue, searchValue, "Event ID in row " + i + " is not matched");
						waitForExpectedElement(table_columns_company_name.get(i)).click();
					}
				} else if (searchFilterKey.equalsIgnoreCase("All")) {
					for(int i=0;i<table_columns_company_name.size();i++) {
						waitForExpectedElement(table_columns_company_name.get(i)).click();
						if(table_columns_company_name.get(i).getText().equals(searchValue)) {
							String tableValue = waitForExpectedElement(table_columns_company_name.get(i)).getText();
							soft.assertEquals(tableValue, searchValue, "Company Name in row "+i + " is not matched");
						}else if(table_columns_ticker.get(i).getText().equals(searchValue)) {
							String tableValue = waitForExpectedElement(table_columns_ticker.get(i)).getText();
							soft.assertEquals(tableValue, searchValue, "Ticker in row "+i + " is not matched");
						}else if(table_columns_recording_id.get(i).getText().equals(searchValue)) {
							String tableValue = waitForExpectedElement(table_columns_recording_id.get(i)).getText().trim();
							soft.assertEquals(tableValue, searchValue, "Job ID in row "+i + " is not matched");
						}else {
							if(table_columns_event_id.get(i).getText().equals(searchValue)) {
								String tableValue = waitForExpectedElement(table_columns_event_id.get(i)).getText();
								soft.assertEquals(tableValue, searchValue, "Event ID in row "+i + " is not matched");
							}else {
								Assert.assertTrue(false, "Search filter value is not matched but jobs are displaying");
							}
						}
						waitForExpectedElement(table_columns_company_name.get(i)).click();
					}
				}
			}
			if (table_columns_company_name.size() == 0) {
				soft.assertEquals(String.valueOf(table_columns.size()), String.valueOf(0),"Table columns should be empty");
				soft.assertTrue(table_no_data.isDisplayed(), "No Data message not displayed when table is empty");
			}
		} catch (ParseException e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
	public void click_launch_browser_in_vnc() {
		String parentWindow = WebDriverHelper.getDriver().getWindowHandle();
		waitForExpectedElement(webcast_popup_launch_vnc_browser_button).click();
		int counter = 0;
		while(WebDriverHelper.getDriver().getWindowHandles().size() == 1 && counter < 18) {
			sleep(500);
			counter = counter+1;
		}
		WebDriverHelper.getDriver().switchTo().window(parentWindow);
		waitForExpectedElement(browser_launched_toaster_message).isDisplayed();
	}
	public void close_webcast_popup() {
		moveToElement(table_header_company_name).click().perform();
	}
	public void check_audio_player(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_company_name.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				table_columns_company_name.get(i).click();
				sleep(5000,row_spinner);
				soft.assertTrue(audio_palyer.isDisplayed(),"Audio Player is not displayed");
				soft.assertTrue(audio_palyer_play_button.isDisplayed(),"Audio Player Play button is not displayed");
				soft.assertTrue(audio_palyer_slider.isDisplayed(),"Audio Player Slider is not displayed");
				soft.assertTrue(audio_palyer_start_time.isDisplayed(),"Audio Player start time is not displayed");
				soft.assertTrue(audio_palyer_end_time.isDisplayed(),"Audio Player end time is not displayed");
				table_columns_company_name.get(i).click();
				break;
			}
		}
	}
	public void click_recording(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				table_columns_record.get(i).click();
				break;
			}
		}
	}
	public void click_refresh_data(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_company_name.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				//Actions action = new Actions(WebDriverHelper.getDriver());
				sleep(10000);
				//action.doubleClick(table_columns_company_name.get(i)).perform();
				table_columns_company_name.get(i).click();
				waitForExpectedElement(refresh_data_button).click();
				sleep(5000);
				table_columns_company_name.get(i).click();
				break;
			}
		}
	}
	public void click_close_job(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		sleep(5000,no_data);
		sleep(5000,row_spinner);
		for(int i=0;i<table_columns_company_name.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				waitForExpectedElement(table_columns_company_name.get(i)).click();
				waitForExpectedElement(table_columns_company_name.get(i)).click();
				waitForExpectedElement(close_job_button).click();
//			
//				if(waitForExpectedElement(collapse.get(i)).getAttribute("aria-expanded").equals("false")) {
//				}
				waitForExpectedElement(job_closed_toaster_message).isDisplayed();
				break;
			}
		}
	}
	public void check_recording_started_toaster_message() {
		waitForExpectedElement(recording_started_toaster_message).isDisplayed();
	}
	public void check_recording_stopped_toaster_message() {
		waitForExpectedElement(recording_stopped_toaster_message).isDisplayed();
	}
	public void click_container_url_copy(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				waitForExpectedElement(webcast_popup_containerURL_copy.get(i)).click();
			}
		}
	}
	public void click_container_url_new_tab(String eventDate,String eventTime,String companyName,String timeZone) {
		try {
			String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
			String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
			for(int i=0;i<table_columns_short_id.size();i++) {
				if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
					waitForExpectedElement(webcast_popup_containerURL_newTab.get(i)).click();
					int counter = 0;
					while(WebDriverHelper.getDriver().getWindowHandles().size() == 1 && counter < 18) {
						sleep(500);
						counter = counter+1;
					}
					String containerUrl = get_clip_board_value();
					soft.assertEquals(WebDriverHelper.getDriver().getCurrentUrl(), containerUrl);
				}
			}
		}catch(Exception e) {
			Assert.assertTrue(false, "Unable to verify the container url");
		}
	}
	public void click_try_to_auto_capture_checkbox() {
		waitForExpectedElement(webcast_popup_try_autoCapture_checkBox).click();
	}
	public void select_webcastLink_toCapture(String jobType) {
		webcast_popup_webcastLink_toCapture_dropdown.click();
		if(jobType.equalsIgnoreCase("Live Phone and Live Webcast")||jobType.equalsIgnoreCase("Live Webcast")) {
			webcast_popup_webcastLink_toCapture_dropdown_options.get(1).click();
		}else if(jobType.equalsIgnoreCase("Replay Phone and Replay Webcast")||jobType.equalsIgnoreCase("Replay Webcast")) {
			webcast_popup_webcastLink_toCapture_dropdown_options.get(2).click();
		}
	}
	public void click_webcast_link(String eventDate,String eventTime,String companyName,String timeZone) {
		boolean isAvailable = false;
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				table_columns_webcast_link.get(i).click();
				waitForExpectedElement(vnc_assigned_toaster_message).isDisplayed();
				soft.assertTrue(webcast_popup_containerURL_label.get(i).isDisplayed(), "Container URL label is not displayed");
				soft.assertTrue(webcast_popup_containerURL_copy.get(i).isDisplayed(), "Container URL copy icon is not displayed");
				soft.assertTrue(webcast_popup_containerURL_newTab.get(i).isDisplayed(), "Container URL new tab icon is not displayed");
				soft.assertTrue(webcast_popup_preload_browser_label.get(i).isDisplayed(), "Preload Browser label is not displayed");
				soft.assertTrue(webcast_popup_preload_browser_toggle_button.get(i).isDisplayed(), "Preload Browser toggle button is not displayed");
				isAvailable = true;
				break;
			}
		}
		if(isAvailable == false) {
			Assert.assertTrue(false,"Job is not available in table");
		}
	}
	public void verify_closed_job_is_not_displayed(String eventDate,String eventTime,String companyName,String timeZone) {
		sleep(3000);
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				Assert.assertTrue(false,"Job is displayed in table after closing job");
			}
		}
	}
	public void enable_preload_browser(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				waitForExpectedElement(webcast_popup_preload_browser_toggle_button.get(i)).click();
				waitForExpectedElement(webcast_popup_webcastLink_toCapture_label).isDisplayed();
				soft.assertTrue(webcast_popup_webcastLink_toCapture_label.isDisplayed(),"Webcast link to capture label is not displaed");
				soft.assertTrue(webcast_popup_webcastLink_toCapture_dropdown.isDisplayed(),"Webcast link to capture dropdown is not displaed");
				soft.assertTrue(webcast_popup_browser_label.isDisplayed(),"Broswer label is not displaed");
				soft.assertTrue(webcast_popup_browser_dropdown.isDisplayed(),"Broswer dropdown is not displaed");
				soft.assertTrue(webcast_popup_try_autoCapture_label.isDisplayed(),"Try to auto capture label is not displaed");
				soft.assertTrue(webcast_popup_try_autoCapture_checkBox.isDisplayed(),"Try to auto capture checkbox is not displaed");
				soft.assertTrue(webcast_popup_launch_vnc_browser_button.isDisplayed(), "Launch vnc browser button is not displayed");
				break;
			}
		}
	}
	public void verify_job_details_in_table(String companyName,String eventDate,String eventTime,String ticker,String livePasscodeUs,String jobType,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
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
				soft.assertTrue(jobDetails_event_title.get(i).isDisplayed(),"Event title Label in job details is not displayed");
				soft.assertEquals(jobDetails_event_title_value.get(i).getAttribute("innerHTML"), eventTitle, "Event Title at row "+ i + " is not matched");
				soft.assertTrue(jobDetails_event_addedDate.get(i).isDisplayed(),"Event added date in job details is not displayed");
				soft.assertEquals(jobDetails_event_addedDate_value.get(i).getAttribute("innerHTML"), eventISTDateValue, "Event Added Date at row "+ i + " is not matched");
				soft.assertTrue(jobDetails_eventType.get(i).isDisplayed(),"Event type in job details is not displayed");
				soft.assertEquals(jobDetails_eventType_value.get(i).getAttribute("innerHTML"), eventType, "Event Type at row "+ i + " is not matched");
				soft.assertTrue(jobDetails_event_addedTime.get(i).isDisplayed(),"Event added time in job details is not displayed");
				soft.assertEquals(jobDetails_event_addedTime_value.get(i).getAttribute("innerHTML"), eventISTTimeValue, "Event Added Time at row "+ i + " is not matched");
				soft.assertTrue(jobDetails_event_id.get(i).isDisplayed(),"Event id in job details is not displayed");
				soft.assertNotEquals(jobDetails_event_id_value.get(i).getAttribute("innerHTML"),"N/A","Event id in job details is null");
				//soft.assertEquals(jobDetails_event_id_value.getAttribute("innerHTML"), eventId, "Event Id at row "+i + " is not matched");
				soft.assertTrue(jobDetails_product_type.get(i).isDisplayed(),"Product type in job details is not displayed");
				soft.assertEquals(jobDetails_product_type_value.get(i).getAttribute("innerHTML"), productType, "Product type at row "+ i + " is not matched");
				soft.assertTrue(jobDetails_job_id.get(i).isDisplayed(), "Job Id in job details is not displayed");
				soft.assertNotEquals(jobDetails_job_id_value.get(i).getAttribute("innerHTML").trim(),"N/A","Job id at row "+ i + " is null");
			}
		}
	}
	
	public void verify_live_details(String companyName,String eventDate,String eventTime,String liveWebcast,String liveWebcastPasscode,String livePhoneUs,String livePasscodeUs,String livePhoneInternational,String livePasscodeInternational,String registrationPhone,String registrationPasscode,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				soft.assertTrue(jobDetails_webcast_live.get(i).isDisplayed(),"Webcast live label is not displayed");
				soft.assertTrue(jobDetails_webcast_live_copy.get(i).isDisplayed(),"Webcast live copy icon is not displayed");
				waitForExpectedElement(jobDetails_webcast_live_copy.get(i)).click();
				String copiedWebcastLink = get_clip_board_value();
				soft.assertEquals(copiedWebcastLink, liveWebcast, "Copied Live webcast link is not matched");
				soft.assertTrue(jobDetails_webcast_live_newTab.get(i).isDisplayed(),"Webcast live new tab icon is not displayed");
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
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().trim().equals(companyName)&&table_columns_event_date.get(i).getText().trim().equals(eventDateValue)&&table_columns_event_time.get(i).getText().trim().equals(eventTimeValue)) {
				soft.assertTrue(jobDetails_webcast_replay.get(i).isDisplayed(),"Webcast replay label is not displayed");
				soft.assertTrue(jobDetails_webcast_replay_copy.get(i).isDisplayed(),"Webcast replay copy icon is not displayed");
				waitForExpectedElement(jobDetails_webcast_replay_copy.get(i)).click();
				String copiedWebcastLink = get_clip_board_value();
				soft.assertEquals(copiedWebcastLink, replayWebcast, "Copied Replay webcast link is not matched");
				soft.assertTrue(jobDetails_webcast_replay_newTab.get(i).isDisplayed(),"Webcast replay new tab icon is not displayed");
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
				waitForExpectedElement(table_columns_company_name.get(i)).click();
			}
		}
	}
	public void clickEdit(String companyName,String eventDate,String eventTime,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				table_columns_edit.get(i).click();
				sleep(2000);
				waitForExpectedElement(edit_popup.get(i)).isDisplayed();
				verifyEditPopupDefaultElements(companyName,eventDate,eventTime,timeZone);
			}
		}
	}
	public void verifyEditPopupDefaultElements(String companyName,String eventDate,String eventTime,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				soft.assertTrue(webcastDetailsLabel.get(i).isDisplayed(), "Edit Popup webcast details label is not displayed");
				soft.assertTrue(dailinDetailsLabel.get(i).isDisplayed(), "Edit Popup dailin details label is not displayed");
				soft.assertEquals(edit_webcast_link_label.get(i).getText(),"Webcastlink link","Webcastlink link label in edit popup is not matched");
				soft.assertTrue(edit_webcast_link.get(i).isDisplayed(), "Webcastlink link textbox is not displayed");
				soft.assertEquals(edit_password_label.get(i).getText(),"Password","Password label in edit popup is not matched");
				soft.assertTrue(edit_password.get(i).isDisplayed(), "Password textbox is not displayed");
				soft.assertEquals(edit_meeting_id_label.get(i).getText(),"Meeting ID","Meeting ID label in edit popup is not matched");
				soft.assertTrue(edit_meeting_id.get(i).isDisplayed(), "Meeting ID textbox is not displayed");
				soft.assertEquals(edit_control_number_label.get(i).getText(),"Control number","Control number label in edit popup is not matched");
				soft.assertTrue(edit_control_number.get(i).isDisplayed(), "Control number textbox is not displayed");
				soft.assertEquals(edit_live_phone_us_label.get(i).getText(),"US Phone (live)","US Phone (live) label in edit popup is not matched");
				soft.assertTrue(edit_live_phone_us.get(i).isDisplayed(), "US Phone (live) textbox is not displayed");
				soft.assertEquals(edit_live_passcode_us_label.get(i).getText(),"US Passcode (live)","US Passcode (live) label in edit popup is not matched");
				soft.assertTrue(edit_live_passcode_us.get(i).isDisplayed(), "US Passcode (live) textbox is not displayed");
				soft.assertEquals(edit_live_phone_international_label.get(i).getText(),"International phone (live)","International phone (live) label in edit popup is not matched");
				soft.assertTrue(edit_live_phone_international.get(i).isDisplayed(), "International phone (live) textbox is not displayed");
				soft.assertEquals(edit_live_passcode_international_label.get(i).getText(),"International passcode","International passcode label in edit popup is not matched");
				soft.assertTrue(edit_live_passcode_international.get(i).isDisplayed(), "International passcode textbox is not displayed");
				soft.assertEquals(edit_registration_phone_label.get(i).getText(),"Registration phone","Registration phone label in edit popup is not matched");
				soft.assertTrue(edit_registration_phone.get(i).isDisplayed(), "Registration phone textbox is not displayed");
				soft.assertEquals(edit_registration_passcode_label.get(i).getText(),"Registration passcode","Registration passcode label in edit popup is not matched");
				soft.assertTrue(edit_registration_passcode.get(i).isDisplayed(), "Registration passcode textbox is not displayed");
				soft.assertTrue(edit_save_button.get(i).isDisplayed(),"Save button in edit popup is not displayed");
				soft.assertTrue(edit_cancel_button.get(i).isDisplayed(),"Cancel button in edit popup is not displayed");
			}
		}
	}
	public void enterWebcastLink(String companyName,String eventDate,String eventTime,String timeZone,String webcastLink) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_webcast_link.get(i).sendKeys(Keys.CONTROL +"a");
				edit_webcast_link.get(i).sendKeys(Keys.DELETE);
				edit_webcast_link.get(i).sendKeys(webcastLink);
			}
		}
	}
	public void enterPassword(String companyName,String eventDate,String eventTime,String timeZone,String password) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_password.get(i).sendKeys(Keys.CONTROL +"a");
				edit_password.get(i).sendKeys(Keys.DELETE);
				edit_password.get(i).sendKeys(password);
			}
		}
	}
	public void enterMeetingId(String companyName,String eventDate,String eventTime,String timeZone,String meetingId) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_meeting_id.get(i).sendKeys(Keys.CONTROL +"a");
				edit_meeting_id.get(i).sendKeys(Keys.DELETE);
				edit_meeting_id.get(i).sendKeys(meetingId);
			}
		}
	}
	public void enterControlNumber(String companyName,String eventDate,String eventTime,String timeZone,String controlNumber) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_control_number.get(i).sendKeys(Keys.CONTROL +"a");
				edit_control_number.get(i).sendKeys(Keys.DELETE);
				edit_control_number.get(i).sendKeys(controlNumber);
			}
		}
	}
	public void enterLivePhoneUs(String companyName,String eventDate,String eventTime,String timeZone,String livePhoneUs) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_live_phone_us.get(i).sendKeys(Keys.CONTROL +"a");
				edit_live_phone_us.get(i).sendKeys(Keys.DELETE);
				edit_live_phone_us.get(i).sendKeys(livePhoneUs);
			}
		}
	}
	public void enterLivePasscodeUs(String companyName,String eventDate,String eventTime,String timeZone,String livePasscodeUs) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_live_passcode_us.get(i).sendKeys(Keys.CONTROL +"a");
				edit_live_passcode_us.get(i).sendKeys(Keys.DELETE);
				edit_live_passcode_us.get(i).sendKeys(livePasscodeUs);
			}
		}
	}
	public void enterLivePhoneInternational(String companyName,String eventDate,String eventTime,String timeZone,String livePhoneInternational) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_live_phone_international.get(i).sendKeys(Keys.CONTROL +"a");
				edit_live_phone_international.get(i).sendKeys(Keys.DELETE);
				edit_live_phone_international.get(i).sendKeys(livePhoneInternational);
			}
		}
	}
	public void enterLivePasscodeInternational(String companyName,String eventDate,String eventTime,String timeZone,String livePasscodeInternational) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_live_passcode_international.get(i).sendKeys(Keys.CONTROL +"a");
				edit_live_passcode_international.get(i).sendKeys(Keys.DELETE);
				edit_live_passcode_international.get(i).sendKeys(livePasscodeInternational);
			}
		}
	}
	public void enterRegistrationPhone(String companyName,String eventDate,String eventTime,String timeZone,String registrationPhone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_registration_phone.get(i).sendKeys(Keys.CONTROL +"a");
				edit_registration_phone.get(i).sendKeys(Keys.DELETE);
				edit_registration_phone.get(i).sendKeys(registrationPhone);
			}
		}
	}
	public void enterRegistrationPasscode(String companyName,String eventDate,String eventTime,String timeZone,String registrationPasscode) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_registration_passcode.get(i).sendKeys(Keys.CONTROL +"a");
				edit_registration_passcode.get(i).sendKeys(Keys.DELETE);
				edit_registration_passcode.get(i).sendKeys(registrationPasscode);
			}
		}
	}
	public void clickSaveButton(String companyName,String eventDate,String eventTime,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_save_button.get(i).click();
				waitForExpectedElement(update_success_toaster_message).isDisplayed();
			}
		}
	}
	public void clickCancelButton(String companyName,String eventDate,String eventTime,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for(int i=0;i<table_columns_short_id.size();i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				edit_cancel_button.get(i).click();
			}
		}
	}
}
