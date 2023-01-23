package daggr.ui.pages.corporateActions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class EventsListPage extends PageObjectUtils {
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath = "//input[@placeholder='start_data - end_date']")
	private WebElement search_event_added_date;

	@FindBy(xpath = "//input[@placeholder='Select']")
	private WebElement search_event_type;

	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement select_from_dropdown;

	@FindBy(xpath = "//table/tbody")
	private WebElement event_table;
	
	@FindBy(xpath = "//tbody/tr/td[3]/p")
	private List<WebElement> table_body_event_company_name;
	
	@FindBy(xpath = "//tbody/tr/td[4]/p")
	private List<WebElement> table_body_event_title;
	
	@FindBy(xpath = "//tbody/tr/td[8]/p")
	private List<WebElement> table_body_event_date;
	
	@FindBy(xpath = "//tbody/tr/td[2]/p")
	private List<WebElement> table_body_event_type;

	@FindBy(xpath = "//modal-container//table[1]")
	private WebElement details_popup;

	@FindBy(xpath = "//table//thead//tr//th")
	private WebElement popup_close;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[4]/td[2]")
	private WebElement popup_company_name;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[9]/td[2]")
	private WebElement popup_event_type;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[1]/td[2]")
	private WebElement popup_announcement_date;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[41]/td[2]")
	private WebElement popup_status;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[6]/td[2]")
	private WebElement popup_event_date;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[7]/td[2]")
	private WebElement popup_event_time;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[43]/td[2]")
	private WebElement popup_time_zone;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[13]/td[2]")
	private WebElement popup_financial_quarter;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[14]/td[2]")
	private WebElement popup_financial_year;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[25]/td[2]")
	private WebElement popup_period_end_date;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[44]/td[2]")
	private WebElement popup_title;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[21]/td[2]")
	private WebElement popup_live_phone_us;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[17]/td[2]")
	private WebElement popup_live_passcode_us;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[18]/td[2]")
	private WebElement popup_live_phone_international;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[16]/td[2]")
	private WebElement popup_live_passcode_international;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[33]/td[2]")
	private WebElement popup_replay_phone_us;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[29]/td[2]")
	private WebElement popup_replay_passcode_us;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[30]/td[2]")
	private WebElement popup_replay_phone_international;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[28]/td[2]")
	private WebElement popup_replay_passcode_international;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[27]/td[2]")
	private WebElement popup_registration_phone;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[26]/td[2]")
	private WebElement popup_registration_passcode;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[24]/td[2]")
	private WebElement popup_live_webcast_url;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[36]/td[2]")
	private WebElement popup_replay_webcast_url;

	@FindBy(xpath = "//modal-container/div/div/div/div/table/tr[2]/td[2]")
	private WebElement popup_comments;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next_button;

	@FindBy(xpath = "//*[@class='spinner-border']/span[@class='sr-only']")
	private WebElement loading;

	public EventsListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}

	public void search_by_event_type(String event_type) {
		waitForExpectedElement(search_event_type).clear();
		waitForExpectedElement(search_event_type).sendKeys(event_type);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void click_event_popup(String string, String string2,String string3,String string4,String string5) {
		sleep(3000);
		boolean isNotAvailable = true;
		if(!string3.equals("")&&!string4.equals("")) {
			string2 = getUtcConversion(string2, string3, string4);
		}
		do {
			for(int i=0;i<table_body_event_company_name.size();i++) {
				if(table_body_event_company_name.get(i).getText().equals(string)&&table_body_event_date.get(i).getText().equals(string2)&&table_body_event_type.get(i).getText().equals(string5)) {
					table_body_event_company_name.get(i).click();
					isNotAvailable = false;
					break;
				}
			}
			if(isNotAvailable == true) {
				if(next_button.isEnabled()) {
					waitForExpectedElement(next_button).click();
					sleep(4000);
				}
			}
		}while(isNotAvailable);
		
		waitForExpectedElement(details_popup);
	}

	public void check_company_name(String company_name) {
		String tableValue = getTableValueByKey("company_name:");
		soft.assertEquals(tableValue, company_name, "Company Name is not matched");
	}

	public void check_event_type(String eventType) {
		String tableValue = getTableValueByKey("event_type:");
		soft.assertEquals(tableValue, eventType, "Event Type is not matched");

	}

	public void check_announcement_date(String announcementDate) {
		String tableValue = getTableValueByKey("announcement_date:");
		soft.assertEquals(tableValue, announcementDate, "Announcement Date is not matched");
	}

	public void select_status(String status) {
		String tableValue = getTableValueByKey("status:");
		soft.assertEquals(tableValue, status.toUpperCase(), "Status is not matched");
	}

	public void select_event_date(String eventDate) {
		String tableValue = getTableValueByKey("event_date:");
		soft.assertEquals(tableValue, eventDate, "Event Date is not matched");
	}

	public void select_release_date(String eventDate) {
		String tableValue = getTableValueByKey("release_date:");
		soft.assertEquals(tableValue, eventDate, "Event Date is not matched");
	}

	public void select_projected_release_date(String eventDate) {
		String tableValue = getTableValueByKey("projected_release_date:");
		soft.assertEquals(tableValue, eventDate, "Event Date is not matched");
	}

	public void enterEventTimeHH(String hours) {
		String tableValue = getTableValueByKey("event_time:").split(":")[0];
		soft.assertEquals(tableValue, hours, "Hours is not matched");
	}

	public void enterEventTime(String eventTime) {
		String tableValue = getTableValueByKey("event_time:");
		if(eventTime.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_time is not matched");
		}else {
			soft.assertEquals(tableValue, timeConversion(eventTime), "event_time is not matched");
		}
	}

	public void enter_release_time(String releaseTime) {
		String tableValue = getTableValueByKey("release_time:");
		soft.assertEquals(tableValue, releaseTime, "ReleaseTime is not matched");
	}

	public void enter_projected_release_time(String releaseTime) {
		String tableValue = getTableValueByKey("projected_release_time:");
		soft.assertEquals(tableValue, releaseTime, "ReleaseTime is not matched");
	}

	public void enter_release_segment(String releaseSegment) {
		String tableValue = getTableValueByKey("release_segment:");
		if (releaseSegment.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ReleaseSegment is not matched");
		} else {
			soft.assertEquals(tableValue, releaseSegment.toUpperCase(), "ReleaseSegment is not matched");
		}
		
	}

	public void enterEventTimeAM_PM(String AM_PM) {
		String tableValue = getTableValueByKey("event_time:").split(":")[2];
		soft.assertEquals(tableValue, AM_PM, "AM/PM is not matched");
	}

	public void enter_time_zone(String timeZone) {
		String tableValue = getTableValueByKey("time_zone:");
		if(timeZone.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Time Zone is not matched");
		}else {
			soft.assertEquals(tableValue, timeZone, "Time Zone is not matched");
		}
	}

	public void select_financial_quarter(String financialQuarter) {
		String tableValue = getTableValueByKey("financial_quarter:");
		soft.assertEquals(tableValue, financialQuarter, "FinancialQuarter is not matched");
	}

	public void select_financial_year(String financialYear) {
		String tableValue = getTableValueByKey("financial_year:");
		soft.assertEquals(tableValue, financialYear, "FinancialYear is not matched");
	}

	public void select_calendar_year(String calendarYear) {
		String tableValue = getTableValueByKey("calendar_year:");
		soft.assertEquals(tableValue, calendarYear, "CalendarYear is not matched");
	}
	
	public void select_period_end_date(String periodEndDate) {
		String tableValue = getTableValueByKey("period_end_date:");
		if (periodEndDate.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Period End Date is not matched");
		} else {
			soft.assertEquals(tableValue, periodEndDate, "Period End Date is not matched");
		}

	}

	public void enter_the_title(String title) {
		String tableValue = getTableValueByKey("title:");
		soft.assertEquals(tableValue, title, "Title is not matched");
	}

	public void select_earnings_date_status(String title) {
		String tableValue = getTableValueByKey("earnings_date_status:");
		soft.assertEquals(tableValue, title, "Earnings Date Status is not matched");
	}

	public void enter_live_phone_us(String livePhoneUs) {
		String tableValue = getTableValueByKey("live_phone_us:");
		if (livePhoneUs.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Live Phone Us is not matched");
		} else {
			soft.assertEquals(tableValue, livePhoneUs, "Live Phone Us is not matched");
		}
		
	}

	public void enter_live_passcode_us(String livePasscodeUs) {
		String tableValue = getTableValueByKey("live_passcode_us:");
		if (livePasscodeUs.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Live Passcode Us is not matched");
		} else {
			soft.assertEquals(tableValue, livePasscodeUs, "Live Passcode Us is not matched");
		}
		
	}

	public void enter_live_phone_international(String livePhoneInternational) {
		String tableValue = getTableValueByKey("live_phone_international:");
		if (livePhoneInternational.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Live Phone International is not matched");
		} else {
			soft.assertEquals(tableValue, livePhoneInternational, "Live Phone International is not matched");
		}
	}

	public void enter_live_passcode_international(String livePasscodeInternational) {
		String tableValue = getTableValueByKey("live_passcode_international:");
		if (livePasscodeInternational.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Live Passcode International is not matched");
		} else {
			soft.assertEquals(tableValue, livePasscodeInternational, "Live Passcode International is not matched");
		}
	}

	public void enter_replay_phone_us(String replayPhoneUs) {
		String tableValue = getTableValueByKey("replay_phone_us:");
		if (replayPhoneUs.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Replay Phone Us is not matched");
		} else {
			soft.assertEquals(tableValue, replayPhoneUs, "Replay Phone Us is not matched");
		}

	}

	public void enter_replay_passcode_us(String replayPasscodeUs) {
		String tableValue = getTableValueByKey("replay_passcode_us:");
		if (replayPasscodeUs.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Replay Passcode Us is not matched");
		} else {
			soft.assertEquals(tableValue, replayPasscodeUs, "Replay Passcode Us is not matched");
		}
	}

	public void enter_replay_phone_international(String replayPhoneInternational) {
		String tableValue = getTableValueByKey("replay_phone_international:");
		if (replayPhoneInternational.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Replay Phone International is not matched");
		} else {
			soft.assertEquals(tableValue, replayPhoneInternational, "Replay Phone International is not matched");
		}

	}

	public void enter_replay_passcode_international(String replayPasscodeInternational) {
		String tableValue = getTableValueByKey("replay_passcode_international:");
		if (replayPasscodeInternational.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Replay Passcode International is not matched");
		} else {
			soft.assertEquals(tableValue, replayPasscodeInternational,"Replay Passcode International is not matched");
		}

	}

	public void enter_registration_phone(String registrationPhone) {
		String tableValue = getTableValueByKey("registration_phone:");
		if (registrationPhone.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Registration phone is not matched");
		} else {
			soft.assertEquals(tableValue, registrationPhone, "Registration Phone is not matched");
		}
	}

	public void enter_registration_passcode(String registrationPasscode) {
		String tableValue = getTableValueByKey("registration_passcode:");
		if (registrationPasscode.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Registration Passcode is not matched");
		} else {
			soft.assertEquals(tableValue, registrationPasscode, "Registration Passcode is not matched");
		}

	}

	public void enter_live_webcast_url(String liveWebcastUrl) {
		String tableValue = getTableValueByKey("live_webcast_url:");
		if (liveWebcastUrl.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Live Webcast Url is not matched");
		} else {
			soft.assertEquals(tableValue, liveWebcastUrl, "Live Webcast Url is not matched");
		}

	}

	public void enter_replay_webcast_url(String replayWebcastUrl) {
		String tableValue = getTableValueByKey("replay_webcast_url:");
		if (replayWebcastUrl.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Replay Webcast Url is not matched");
		} else {
			soft.assertEquals(tableValue, replayWebcastUrl, "Replay Webcast Url is not matched");
		}
	}

	public void enter_comments(String comments) {
		String tableValue = getTableValueByKey("comments:");
		if (comments.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "Comments is not matched");
		} else {
			soft.assertEquals(tableValue, comments, "Comments is not matched");
		}

	}

	public void popup_close() {
		waitForExpectedElement(popup_close).click();
	}

	public void verify_seminar_name(String string) {
		String tableValue = getTableValueByKey("seminar_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_name is not matched");
		}

	}

	public void verify_forum_name(String string) {
		String tableValue = getTableValueByKey("forum_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_name is not matched");
		}

	}

	public void verify_summit_name(String string) {
		String tableValue = getTableValueByKey("summit_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_name is not matched");
		}

	}

	public void verify_work_shop_name(String string) {
		String tableValue = getTableValueByKey("work_shop_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_name is not matched");
		}

	}

	public void verify_trade_show_name(String string) {
		String tableValue = getTableValueByKey("trade_show_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_name is not matched");
		}

	}

	public void enter_event_organizer(String string) {
		String tableValue = getTableValueByKey("event_organizer:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_organizer is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_organizer is not matched");
		}

	}

	public void enter_event_description(String string) {
		String tableValue = getTableValueByKey("event_description:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_description is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_description is not matched");
		}

	}

	public void enter_event_start_date(String string) {
		String tableValue = getTableValueByKey("event_start_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_start_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_start_date is not matched");
		}

	}

	public void enter_event_end_date(String string) {
		String tableValue = getTableValueByKey("event_end_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_end_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_end_date is not matched");
		}

	}

	public void enter_start_date(String string) {
		String tableValue = getTableValueByKey("start_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "start_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "start_date is not matched");
		}

	}

	public void enter_end_date(String string) {
		String tableValue = getTableValueByKey("end_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "end_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "end_date is not matched");
		}

	}

	public void enter_event_start_time(String string) {
		String tableValue = getTableValueByKey("event_start_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_start_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_start_time is not matched");
		}

	}

	public void enter_event_end_time(String string) {
		String tableValue = getTableValueByKey("event_end_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_end_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_end_time is not matched");
		}

	}

	public void enter_start_time(String string) {
		String tableValue = getTableValueByKey("start_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "start_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "start_time is not matched");
		}

	}

	public void enter_end_time(String string) {
		String tableValue = getTableValueByKey("end_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "end_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "end_time is not matched");
		}

	}

	public void enter_registration_deadline(String string) {
		String tableValue = getTableValueByKey("registration_deadline:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "registration_deadline is not matched");
		} else {
			soft.assertEquals(tableValue, string, "registration_deadline is not matched");
		}

	}

	public void enter_venue(String string) {
		String tableValue = getTableValueByKey("venue:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "venue is not matched");
		} else {
			soft.assertEquals(tableValue, string, "venue is not matched");
		}

	}

	public void enter_address(String string) {
		String tableValue = getTableValueByKey("address:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "address is not matched");
		} else {
			soft.assertEquals(tableValue, string, "address is not matched");
		}

	}

	public void enter_country(String string) {
		String tableValue = getTableValueByKey("country:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "country is not matched");
		} else {
			soft.assertEquals(tableValue, string, "country is not matched");
		}

	}

	public void enter_state(String string) {
		String tableValue = getTableValueByKey("state:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "state is not matched");
		} else {
			soft.assertEquals(tableValue, string, "state is not matched");
		}

	}

	public void enter_city(String string) {
		String tableValue = getTableValueByKey("city:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "city is not matched");
		} else {
			soft.assertEquals(tableValue, string, "city is not matched");
		}

	}

	public void enter_event_link(String string) {
		String tableValue = getTableValueByKey("event_link:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "event_link is not matched");
		} else {
			soft.assertEquals(tableValue, string, "event_link is not matched");
		}

	}

	public void enter_registration_link(String string) {
		String tableValue = getTableValueByKey("registration_link:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "registration_link is not matched");
		} else {
			soft.assertEquals(tableValue, string, "registration_link is not matched");
		}

	}

	public void enter_schedule_link(String string) {
		String tableValue = getTableValueByKey("schedule_link:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "schedule_link is not matched");
		} else {
			soft.assertEquals(tableValue, string, "schedule_link is not matched");
		}

	}

	public void enter_seminar_passcode(String string) {
		String tableValue = getTableValueByKey("seminar_passcode:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "seminar_passcode is not matched");
		} else {
			soft.assertEquals(tableValue, string, "seminar_passcode is not matched");
		}

	}

	public void enter_contact_person_name(String string) {
		String tableValue = getTableValueByKey("contact_person_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "contact_person_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "contact_person_name is not matched");
		}

	}

	public void enter_designation(String string) {
		String tableValue = getTableValueByKey("designation:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "designation is not matched");
		} else {
			soft.assertEquals(tableValue, string, "designation is not matched");
		}

	}

	public void enter_phone_number(String string) {
		String tableValue = getTableValueByKey("phone_number:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "phone_number is not matched");
		} else {
			soft.assertEquals(tableValue, string, "phone_number is not matched");
		}

	}

	public void enter_email(String string) {
		String tableValue = getTableValueByKey("email:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "email is not matched");
		} else {
			soft.assertEquals(tableValue, string, "email is not matched");
		}

	}

	public void select_agenda(String agenda) {
		String tableValue = getTableValueByKey("agenda:");
		if (agenda.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "agenda is not matched");
		} else {
			soft.assertEquals(tableValue, agenda, "agenda is not matched");
		}

	}

	public void enter_company_name_added(String string) {
		String tableValue = getTableValueByKey("company_name_added:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "company_name_added is not matched");
		} else {
			soft.assertEquals(tableValue, string, "company_name_added is not matched");
		}
	}

	public void enter_company_name_removed(String string) {
		String tableValue = getTableValueByKey("company_name_removed:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "company_name_removed is not matched");
		} else {
			soft.assertEquals(tableValue, string, "company_name_removed is not matched");
		}
	}

	public void enter_effective_date(String string) {
		String tableValue = getTableValueByKey("effective_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "effective_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "effective_date is not matched");
		}
	}

	public void select_change_status(String string) {
		String tableValue = getTableValueByKey("change_status:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "change_status is not matched");
		} else {
			soft.assertEquals(tableValue, string, "change_status is not matched");
		}
	}

	public void select_index(String string) {
		String tableValue = getTableValueByKey("index:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "index is not matched");
		} else {
			soft.assertEquals(tableValue, string, "index is not matched");
		}

	}

	public void verify_record_type(String string) {
		String tableValue = getTableValueByKey("record_type:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "record_type is not matched");
		} else {
			soft.assertEquals(tableValue, string, "record_type is not matched");
		}
	}

	public void verify_buyback_status(String string) {
		String tableValue = getTableValueByKey("buy_back_status:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "buy_back_status is not matched");
		} else {
			soft.assertEquals(tableValue, string, "buy_back_status is not matched");
		}
	}

	public void verify_buyback_method(String string) {
		String tableValue = getTableValueByKey("buy_back_method:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "buy_back_method is not matched");
		} else {
			soft.assertEquals(tableValue, string, "buy_back_method is not matched");
		}
	}

	public void verify_modification_announcement_date(String string) {
		String tableValue = getTableValueByKey("modification_announcement_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "modification_announcement_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "modification_announcement_date is not matched");
		}
	}

	public void verify_approval_date(String string) {
		String tableValue = getTableValueByKey("approval_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "approval_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "approval_date is not matched");
		}
	}

	public void verify_no_of_authorized_shares(String string) {
		String tableValue = getTableValueByKey("no_of_authorized_shares:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "no_of_authorized_shares is not matched");
		} else {
			soft.assertEquals(tableValue, string, "no_of_authorized_shares is not matched");
		}
	}

	public void verify_authorized_share_value(String string) {
		String tableValue = getTableValueByKey("authorized_share_value:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "authorized_share_value is not matched");
		} else {
			soft.assertEquals(tableValue, string, "authorized_share_value is not matched");
		}
	}

	public void verify_share_value_currency(String string) {
		String tableValue = getTableValueByKey("share_value_currency:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "share_value_currency is not matched");
		} else {
			soft.assertEquals(tableValue, string, "share_value_currency is not matched");
		}
	}

	public void verify_buyback_end_date(String string) {
		String tableValue = getTableValueByKey("buy_back_end_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "buy_back_end_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "buy_back_end_date is not matched");
		}
	}

	public void verify_low_end_price_range(String string) {
		String tableValue = getTableValueByKey("low_end_price_range:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "low_end_price_range is not matched");
		} else {
			soft.assertEquals(tableValue, string, "low_end_price_range is not matched");
		}
	}

	public void verify_high_end_price_range(String string) {
		String tableValue = getTableValueByKey("high_end_price_range:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "high_end_price_range is not matched");
		} else {
			soft.assertEquals(tableValue, string, "high_end_price_range is not matched");
		}
	}

	public void verify_purchase_price(String string) {
		String tableValue = getTableValueByKey("purchase_price:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "purchase_price is not matched");
		} else {
			soft.assertEquals(tableValue, string, "purchase_price is not matched");
		}
	}

	public void verify_tender_expiration_date(String string) {
		String tableValue = getTableValueByKey("tender_expiration_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "tender_expiration_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "tender_expiration_date is not matched");
		}
	}

	public void verify_tender_expiration_time(String string) {
		String tableValue = getTableValueByKey("tender_expiration_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "tender_expiration_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "tender_expiration_time is not matched");
		}
	}

	public void verify_meeting_type(String string) {
		String tableValue = getTableValueByKey("meeting_type:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "meeting_type is not matched");
		} else {
			soft.assertEquals(tableValue, string, "meeting_type is not matched");
		}
	}

	public void verify_meeting_description(String string) {
		String tableValue = getTableValueByKey("meeting_description:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "meeting_description is not matched");
		} else {
			soft.assertEquals(tableValue, string, "meeting_description is not matched");
		}
	}

	public void verify_record_date(String string) {
		String tableValue = getTableValueByKey("record_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "record_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "record_date is not matched");
		}
	}

	public void verify_virtual_shareholder_meeting(String string) {
		String tableValue = getTableValueByKey("virtual_shareholder_meeting:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "virtual_shareholder_meeting is not matched");
		} else {
			soft.assertEquals(tableValue, string, "virtual_shareholder_meeting is not matched");
		}
	}

	public void verify_distance_between_head_quarters_and_venue(String string) {
		String tableValue = getTableValueByKey("distance_between_head_quarters_and_venue:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "distance_between_head_quarters_and_venue is not matched");
		} else {
			soft.assertEquals(tableValue, string, "distance_between_head_quarters_and_venue is not matched");
		}
	}

	public void verify_spin_off_company_name(String string) {
		String tableValue = getTableValueByKey("spin_off_company_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "spin_off_company_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "spin_off_company_name is not matched");
		}
	}

	public void verify_transaction_status(String string) {
		String tableValue = getTableValueByKey("transaction_status:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "transaction_status is not matched");
		} else {
			soft.assertEquals(tableValue, string, "transaction_status is not matched");
		}
	}

	public void verify_parent_company_shares_cutoff(String string) {
		String tableValue = getTableValueByKey("parent_company_shares_cutoff:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "parent_company_shares_cutoff is not matched");
		} else {
			soft.assertEquals(tableValue, string, "parent_company_shares_cutoff is not matched");
		}
	}

	public void verify_spin_off_company_shares_received(String string) {
		String tableValue = getTableValueByKey("spin_off_company_shares_received:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "spin_off_company_shares_received is not matched");
		} else {
			soft.assertEquals(tableValue, string, "spin_off_company_shares_received is not matched");
		}
	}

	public void verify_taxable(String string) {
		String tableValue = getTableValueByKey("taxable:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "taxable is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "taxable is not matched");
		}
	}

	public void verify_fractional_payment_type(String string) {
		String tableValue = getTableValueByKey("fractional_payment_type:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "fractional_payment_type is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "fractional_payment_type is not matched");
		}
	}

	public void verify_estimated_market_cap(String string) {
		String tableValue = getTableValueByKey("estimated_market_cap:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "estimated_market_cap is not matched");
		} else {
			soft.assertEquals(tableValue, string, "estimated_market_cap is not matched");
		}
	}

	public void verify_distribution_date(String string) {
		String tableValue = getTableValueByKey("distribution_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "distribution_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "distribution_date is not matched");
		}
	}

	public void verify_trade_date(String string) {
		String tableValue = getTableValueByKey("trade_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "trade_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "trade_date is not matched");
		}
	}

	public void verify_parent_company_trading_when_issued_from_date(String string) {
		String tableValue = getTableValueByKey("parent_company_trading_when_issued_from_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "parent_company_trading_when_issued_from_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "parent_company_trading_when_issued_from_date is not matched");
		}
	}

	public void verify_parent_company_trading_when_issued_to_date(String string) {
		String tableValue = getTableValueByKey("parent_company_trading_when_issued_to_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "parent_company_trading_when_issued_to_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "parent_company_trading_when_issued_to_date is not matched");
		}
	}

	public void verify_spin_off_company_trading_when_issued_from_date(String string) {
		String tableValue = getTableValueByKey("spin_off_company_trading_when_issued_from_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "spin_off_company_trading_when_issued_from_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "spin_off_company_trading_when_issued_from_date is not matched");
		}
	}

	public void verify_spin_off_company_trading_when_issued_to_date(String string) {
		String tableValue = getTableValueByKey("spin_off_company_trading_when_issued_to_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "spin_off_company_trading_when_issued_to_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "spin_off_company_trading_when_issued_to_date is not matched");
		}
	}

	public void verify_stock_split_type(String string) {
		String tableValue = getTableValueByKey("stock_split_type:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "stock_split_type is not matched");
		} else {
			soft.assertEquals(tableValue, string, "stock_split_type is not matched");
		}
	}

	public void verify_split_ratio(String string) {
		String tableValue = getTableValueByKey("split_ratio:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "split_ratio is not matched");
		} else {
			soft.assertEquals(tableValue, string, "split_ratio is not matched");
		}
	}

	public void verify_revised_stock_trading_date(String string) {
		String tableValue = getTableValueByKey("revised_stock_trading_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revised_stock_trading_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revised_stock_trading_date is not matched");
		}
	}

	public void verify_split_effective_date(String string) {
		String tableValue = getTableValueByKey("split_effective_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "split_effective_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "split_effective_date is not matched");
		}
	}

	public void verify_dividend_amount(String string) {
		String tableValue = getTableValueByKey("dividend_amount:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "dividend_amount is not matched");
		} else {
			soft.assertEquals(tableValue, string, "dividend_amount is not matched");
		}
	}

	public void verify_currency(String string) {
		String tableValue = getTableValueByKey("currency:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "currency is not matched");
		} else {
			soft.assertEquals(tableValue, string, "currency is not matched");
		}
	}

	public void verify_frequency(String string) {
		String tableValue = getTableValueByKey("frequency:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "frequency is not matched");
		} else {
			soft.assertEquals(tableValue, string, "frequency is not matched");
		}
	}

	public void verify_ex_dividend_date(String string) {
		String tableValue = getTableValueByKey("ex_dividend_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ex_dividend_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "ex_dividend_date is not matched");
		}
	}

	public void verify_pay_date(String string) {
		String tableValue = getTableValueByKey("pay_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "pay_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "pay_date is not matched");
		}
	}

	public void verify_dividend_trend(String string) {
		String tableValue = getTableValueByKey("dividend_trend:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "dividend_trend is not matched");
		} else {
			soft.assertEquals(tableValue, string, "dividend_trend is not matched");
		}
	}

	public void verify_dividend_status(String string) {
		String tableValue = getTableValueByKey("dividend_status:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "dividend_status is not matched");
		} else {
			soft.assertEquals(tableValue, string, "dividend_status is not matched");
		}
	}

	public void verify_suspended_or_resumed_date(String string) {
		String tableValue = getTableValueByKey("suspended_or_resumed_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "suspended_or_resumed_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "suspended_or_resumed_date is not matched");
		}
	}

	public void verify_lawsuit_category(String string) {
		String tableValue = getTableValueByKey("lawsuit_category:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawsuit_category is not matched");
		} else {
			soft.assertEquals(tableValue, string.toLowerCase(), "lawsuit_category is not matched");
		}
	}

	public void verify_lawsuit_stage(String string) {
		String tableValue = getTableValueByKey("lawsuit_stage:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawsuit_stage is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "lawsuit_stage is not matched");
		}
	}

	public void verify_lawsuit_link(String string) {
		String tableValue = getTableValueByKey("lawsuit_link:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawsuit_link is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lawsuit_link is not matched");
		}
	}

	public void verify_lawsuit_description(String string) {
		String tableValue = getTableValueByKey("lawsuit_description:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawsuit_description is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lawsuit_description is not matched");
		}
	}

	public void verify_plaintiff_name(String string) {
		String tableValue = getTableValueByKey("plaintiff_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "plaintiff_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "plaintiff_name is not matched");
		}
	}

	public void verify_plaintiff_email(String string) {
		String tableValue = getTableValueByKey("plaintiff_email:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "plaintiff_email is not matched");
		} else {
			soft.assertEquals(tableValue, string, "plaintiff_email is not matched");
		}
	}

	public void verify_plaintiff_address(String string) {
		String tableValue = getTableValueByKey("plaintiff_address:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "plaintiff_address is not matched");
		} else {
			soft.assertEquals(tableValue, string, "plaintiff_address is not matched");
		}
	}

	public void verify_plaintiff_phone_number(String string) {
		String tableValue = getTableValueByKey("plaintiff_phone_no:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "plaintiff_phone_no is not matched");
		} else {
			soft.assertEquals(tableValue, string, "plaintiff_phone_no is not matched");
		}
	}

	public void verify_lawfirm_name(String string) {
		String tableValue = getTableValueByKey("lawfirm_name:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawfirm_name is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lawfirm_name is not matched");
		}
	}

	public void verify_lawfirm_url(String string) {
		String tableValue = getTableValueByKey("lawfirm_url:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lawfirm_url is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lawfirm_url is not matched");
		}
	}

	public void verify_class_action_start_date(String string) {
		String tableValue = getTableValueByKey("class_action_start_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "class_action_start_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "class_action_start_date is not matched");
		}
	}

	public void verify_class_action_end_date(String string) {
		String tableValue = getTableValueByKey("class_action_end_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "class_action_end_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "class_action_end_date is not matched");
		}
	}

	public void verify_motion_dead_line(String string) {
		String tableValue = getTableValueByKey("motion_dead_line:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "motion_dead_line is not matched");
		} else {
			soft.assertEquals(tableValue, string, "motion_dead_line is not matched");
		}
	}

	public void verify_filling_date(String string) {
		String tableValue = getTableValueByKey("filling_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "filling_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "filling_date is not matched");
		}
	}

	public void verify_offering_date(String string) {
		String tableValue = getTableValueByKey("offering_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "offering_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "offering_date is not matched");
		}
	}

	public void verify_share_price(String string) {
		String tableValue = getTableValueByKey("share_price:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "share_price is not matched");
		} else {
			soft.assertEquals(tableValue, string, "share_price is not matched");
		}
	}

	public void verify_share_offered(String string) {
		String tableValue = getTableValueByKey("shares_offered:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "shares_offered is not matched");
		} else {
			soft.assertEquals(tableValue, string, "shares_offered is not matched");
		}
	}

	public void verify_offer_amount(String string) {
		String tableValue = getTableValueByKey("offer_amount:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "offer_amount is not matched");
		} else {
			soft.assertEquals(tableValue, string, "offer_amount is not matched");
		}
	}

	public void verify_low_end_share_price(String string) {
		String tableValue = getTableValueByKey("low_end_share_price:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "low_end_share_price is not matched");
		} else {
			soft.assertEquals(tableValue, string, "low_end_share_price is not matched");
		}
	}

	public void verify_high_end_share_price(String string) {
		String tableValue = getTableValueByKey("high_end_share_price:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "high_end_share_price is not matched");
		} else {
			soft.assertEquals(tableValue, string, "high_end_share_price is not matched");
		}
	}

	public void verify_lead_managers(String string) {
		String tableValue = getTableValueByKey("lead_managers:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lead_managers is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lead_managers is not matched");
		}
	}

	public void verify_quiet_period(String string) {
		String tableValue = getTableValueByKey("quiet_period:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "quiet_period is not matched");
		} else {
			soft.assertEquals(tableValue, string, "quiet_period is not matched");
		}
	}

	public void verify_lockup_period(String string) {
		String tableValue = getTableValueByKey("lockup_period:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "lockup_period is not matched");
		} else {
			soft.assertEquals(tableValue, string, "lockup_period is not matched");
		}
	}

	public void verify_offering_status(String string) {
		String tableValue = getTableValueByKey("offering_status:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "offering_status is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "offering_status is not matched");
		}
	}

	public void verify_selling_shareholder(String string) {
		String tableValue = getTableValueByKey("selling_shareholder:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "selling_shareholder is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "selling_shareholder is not matched");
		}
	}

	public void verify_number_of_shares_for_sale(String string) {
		String tableValue = getTableValueByKey("number_of_shares_for_sale:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "number_of_shares_for_sale is not matched");
		} else {
			soft.assertEquals(tableValue, string, "number_of_shares_for_sale is not matched");
		}
	}

	public void verify_closing_date(String string) {
		String tableValue = getTableValueByKey("closing_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "closing_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "closing_date is not matched");
		}
	}

	public void verify_proceeds_received_by_company(String string) {
		String tableValue = getTableValueByKey("proceeds_received_by_company:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "proceeds_received_by_company is not matched");
		} else {
			soft.assertEquals(tableValue, string, "proceeds_received_by_company is not matched");
		}
	}

	public void verify_under_writing_manager(String string) {
		String tableValue = getTableValueByKey("under_writing_manager:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "under_writing_manager is not matched");
		} else {
			soft.assertEquals(tableValue, string, "under_writing_manager is not matched");
		}
	}

	public void verify_prospectus_link(String string) {
		String tableValue = getTableValueByKey("prospectus_link:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "prospectus_link is not matched");
		} else {
			soft.assertEquals(tableValue, string, "prospectus_link is not matched");
		}
	}

	public void verify_preliminary_guidance(String string) {
		String tableValue = getTableValueByKey("preliminary_guidance:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "preliminary_guidance is not matched");
		} else {
			soft.assertEquals(tableValue, string, "preliminary_guidance is not matched");
		}
	}

	public void verify_guidance_period(String string) {
		String tableValue = getTableValueByKey("guidance_period:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "guidance_period is not matched");
		} else {
			soft.assertEquals(tableValue, string, "guidance_period is not matched");
		}
	}

	public void verify_guidance_quarter(String string) {
		String tableValue = getTableValueByKey("guidance_quarter:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "guidance_quarter is not matched");
		} else {
			soft.assertEquals(tableValue, string, "guidance_quarter is not matched");
		}
	}

	public void verify_guidance_financial_year(String string) {
		String tableValue = getTableValueByKey("guidance_financial_year:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "guidance_financial_year is not matched");
		} else {
			soft.assertEquals(tableValue, string, "guidance_financial_year is not matched");
		}
	}

	public void verify_revenue_range(String string) {
		String tableValue = getTableValueByKey("revenue_range:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revenue_range is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revenue_range is not matched");
		}
	}

	public void verify_revenue_acct_standard(String string) {
		String tableValue = getTableValueByKey("revenue_range_acct_standard:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revenue_range_acct_standard is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revenue_range_acct_standard is not matched");
		}
	}

	public void verify_revenue_currency_code(String string) {
		String tableValue = getTableValueByKey("revenue_range_currency_code:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revenue_range_currency_code is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revenue_range_currency_code is not matched");
		}
	}

	public void verify_revenue_from_as_and_revenue_to(String string, String string2) {
		String tableValuefrom = getTableValueByKey("revenue_range_from:");
		String tableValueto = getTableValueByKey("revenue_range_to:");
		if (string.isEmpty() && string.isEmpty()) {
			soft.assertEquals(tableValuefrom, "N/A", "revenue_range_from is not matched");
			soft.assertEquals(tableValueto, "N/A", "revenue_range_to is not matched");
		} else {
			soft.assertEquals(tableValuefrom, string, "revenue_range_from is not matched");
			soft.assertEquals(tableValueto, string2, "revenue_range_to is not matched");
		}
	}

	public void verify_revenue_monetary_unit(String string) {
		String tableValue = getTableValueByKey("revenue_range_monetary_unit:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revenue_range_monetary_unit is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "revenue_range_monetary_unit is not matched");
		}
	}
	
	public void verify_eps_range(String string) {
		String tableValue = getTableValueByKey("eps_range:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "eps_range is not matched");
		} else {
			soft.assertEquals(tableValue, string, "eps_range is not matched");
		}
	}

	public void verify_eps_acct_standard(String string) {
		String tableValue = getTableValueByKey("eps_range_acct_standard:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "eps_range_acct_standard is not matched");
		} else {
			soft.assertEquals(tableValue, string, "eps_range_acct_standard is not matched");
		}
	}

	public void verify_eps_currency_code(String string) {
		String tableValue = getTableValueByKey("eps_range_currency_code:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "eps_range_currency_code is not matched");
		} else {
			soft.assertEquals(tableValue, string, "eps_range_currency_code is not matched");
		}
	}

	public void verify_eps_from_as_and_eps_to(String string, String string2) {
		String tableValuefrom = getTableValueByKey("eps_range_from:");
		String tableValueto = getTableValueByKey("eps_range_to:");
		if (string.isEmpty() && string.isEmpty()) {
			soft.assertEquals(tableValuefrom, "N/A", "eps_range_from is not matched");
			soft.assertEquals(tableValueto, "N/A", "eps_range_to is not matched");
		} else {
			soft.assertEquals(tableValuefrom, string, "eps_range_from is not matched");
			soft.assertEquals(tableValueto, string2, "eps_range_to is not matched");
		}
	}

	public void verify_ebitda_range(String string) {
		String tableValue = getTableValueByKey("ebitda_range:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ebitda_range is not matched");
		} else {
			soft.assertEquals(tableValue, string, "ebitda_range is not matched");
		}
	}

	public void verify_ebitda_acct_standard(String string) {
		String tableValue = getTableValueByKey("ebitda_range_acct_standard:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ebitda_range_acct_standard is not matched");
		} else {
			soft.assertEquals(tableValue, string, "ebitda_range_acct_standard is not matched");
		}
	}

	public void verify_ebitda_currency_code(String string) {
		String tableValue = getTableValueByKey("ebitda_range_currency_code:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ebitda_range_currency_code is not matched");
		} else {
			soft.assertEquals(tableValue, string, "ebitda_range_currency_code is not matched");
		}
	}

	public void verify_ebitda_from_as_and_ebitda_to(String string, String string2) {
		String tableValuefrom = getTableValueByKey("ebitda_range_from:");
		String tableValueto = getTableValueByKey("ebitda_range_to:");
		if (string.isEmpty() && string.isEmpty()) {
			soft.assertEquals(tableValuefrom, "N/A", "ebitda_range_from is not matched");
			soft.assertEquals(tableValueto, "N/A", "ebitda_range_to is not matched");
		} else {
			soft.assertEquals(tableValuefrom, string, "ebitda_range_from is not matched");
			soft.assertEquals(tableValueto, string2, "ebitda_range_to is not matched");
		}
	}

	public void verify_ebitda_monetary_unit(String string) {
		String tableValue = getTableValueByKey("ebitda_range_monetary_unit:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "ebitda_range_monetary_unit is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "ebitda_range_monetary_unit is not matched");
		}
	}

	public void verify_capital_expenditure(String string) {
		String tableValue = getTableValueByKey("capital_expenditure:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "capital_expenditure is not matched");
		} else {
			soft.assertEquals(tableValue, string, "capital_expenditure is not matched");
		}
	}

	public void verify_capital_expenditure_currency_code(String string) {
		String tableValue = getTableValueByKey("capital_expenditure_currency_code:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "capital_expenditure_currency_code is not matched");
		} else {
			soft.assertEquals(tableValue, string, "capital_expenditure_currency_code is not matched");
		}
	}

	public void verify_capital_expenditure_from_as_and_capital_expenditure_to(String string, String string2) {
		String tableValuefrom = getTableValueByKey("capital_expenditure_from:");
		String tableValueto = getTableValueByKey("capital_expenditure_to:");
		if (string.isEmpty() && string.isEmpty()) {
			soft.assertEquals(tableValuefrom, "N/A", "capital_expenditure_from is not matched");
			soft.assertEquals(tableValueto, "N/A", "capital_expenditure_to is not matched");
		} else {
			soft.assertEquals(tableValuefrom, string, "capital_expenditure_from is not matched");
			soft.assertEquals(tableValueto, string2, "capital_expenditure_to is not matched");
		}
	}

	public void verify_capital_expenditure_monetary_unit(String string) {
		String tableValue = getTableValueByKey("capital_expenditure_monetary_unit:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "capital_expenditure_monetary_unit is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "capital_expenditure_monetary_unit is not matched");
		}
	}

	public void verify_operating_expenses(String string) {
		String tableValue = getTableValueByKey("operating_expenses:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "operating_expenses is not matched");
		} else {
			soft.assertEquals(tableValue, string, "operating_expenses is not matched");
		}
	}

	public void verify_operating_expenses_currency_code(String string) {
		String tableValue = getTableValueByKey("operating_expenses_currency_code:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "operating_expenses_currency_code is not matched");
		} else {
			soft.assertEquals(tableValue, string, "operating_expenses_currency_code is not matched");
		}
	}

	public void verify_operating_expenses_from_as_and_operating_expenses_to(String string, String string2) {
		String tableValuefrom = getTableValueByKey("operating_expenses_from:");
		String tableValueto = getTableValueByKey("operating_expenses_to:");
		if (string.isEmpty() && string.isEmpty()) {
			soft.assertEquals(tableValuefrom, "N/A", "operating_expenses_from is not matched");
			soft.assertEquals(tableValueto, "N/A", "operating_expenses_to is not matched");
		} else {
			soft.assertEquals(tableValuefrom, string, "operating_expenses_from is not matched");
			soft.assertEquals(tableValueto, string2, "operating_expenses_to is not matched");
		}
	}

	public void verify_operating_expenses_monetary_unit(String string) {
		String tableValue = getTableValueByKey("operating_expenses_monetary_unit:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "operating_expenses_monetary_unit is not matched");
		} else {
			soft.assertEquals(tableValue, string.toUpperCase(), "operating_expenses_monetary_unit is not matched");
		}
	}

	public void verify_outlook_info(String string) {
		String tableValue = getTableValueByKey("outlook_info:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "outlook_info is not matched");
		} else {
			soft.assertEquals(tableValue, string, "outlook_info is not matched");
		}
	}
	
	public void verify_revised_earnings_release_date(String string) {
		String tableValue = getTableValueByKey("revised_earnings_release_date:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revised_earnings_release_date is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revised_earnings_release_date is not matched");
		}
	}

	public void verify_revised_earnings_release_time(String string) {
		String tableValue = getTableValueByKey("revised_earnings_release_time:");
		if (string.isEmpty()) {
			soft.assertEquals(tableValue, "N/A", "revised_earnings_release_time is not matched");
		} else {
			soft.assertEquals(tableValue, string, "revised_earnings_release_time is not matched");
		}
	}

}
