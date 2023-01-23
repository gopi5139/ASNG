package daggr.ui.pages.corporateActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.CucumberReporterUtils;
import utils.PageObjectUtils;

public class EventsPage extends PageObjectUtils {
	@FindBy(xpath = "//*[@formcontrolname='url']")
	WebElement article_url;
	
	@FindBy(xpath="//input[@placeholder='Upload Document Here']")
	WebElement upload_file;

	@FindBy(xpath = "//*[@formgroupname='job_state']//label")
	List<WebElement> article_relevancy;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	List<WebElement> companyName_textbox;

	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;

	@FindBy(xpath = "//select")
	WebElement selectList;

	@FindBy(xpath = "(//label[contains(text(),'Event Type')])[2]//following::div[1]//input")
	WebElement eventType_textbox;

	@FindBy(xpath = "//input[@formcontrolname='announcement_date']")
	WebElement announcement_date;

	@FindBy(xpath = "//div[@class='form-group invalid']//*[@formcontrolname='announcement_date']")
	WebElement new_announcement_date;
	
	@FindBy(xpath = "//select[@formcontrolname='status']")
	WebElement status_dropdown;

	@FindBy(xpath = "//input[@formcontrolname='event_date']")
	WebElement event_date;

	@FindBy(xpath = "//label[@class='form-swich']")
	WebElement time_provided;

	@FindBy(xpath = "//*[@class='swich-form ng-star-inserted']")
	WebElement switch_toggle;

	@FindBy(xpath = "//input[@placeholder='HH']")
	WebElement select_event_time_hours;

	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement select_event_time_mins;

	@FindBy(css = "button.btn.btn-default.text-center[type='button']")
	WebElement select_am_pm;

	@FindBy(xpath = "//ng-autocomplete[@formcontrolname='time_zone']//input")
	WebElement timeZone_textbox;

	@FindBy(xpath = "//select[@formcontrolname='financial_quarter']")
	WebElement select_financial_quarter;
	
	@FindBy(xpath = "//select[@formcontrolname='time_period']")
	WebElement time_period;

	@FindBy(xpath = "//select[@formcontrolname='financial_year']")
	WebElement select_financial_year;

	@FindBy(xpath = "//select[@formcontrolname='calendar_year']")
	WebElement select_calendar_year;
	
	@FindBy(xpath = "//table[@class='table table-fixed bg-white']")
	WebElement select_edit_popup;

	@FindBy(xpath = "//input[@formcontrolname='period_end_date']")
	WebElement period_end_date;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	WebElement title_textbox;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_us']")
	WebElement live_phone_us_textbox;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_us']")
	WebElement live_passcode_us_textbox;

	@FindBy(xpath = "//input[@formcontrolname='live_phone_international']")
	WebElement live_phone_international_textbox;

	@FindBy(xpath = "//input[@formcontrolname='live_passcode_international']")
	WebElement live_passcode_international_textbox;

	@FindBy(xpath = "//input[@formcontrolname='replay_phone_us']")
	WebElement replay_phone_us_textbox;

	@FindBy(xpath = "//input[@formcontrolname='replay_passcode_us']")
	WebElement replay_passcode_us_textbox;

	@FindBy(xpath = "//input[@formcontrolname='replay_phone_international']")
	WebElement replay_phone_international_textbox;

	@FindBy(xpath = "//input[@formcontrolname='replay_passcode_international']")
	WebElement replay_passcode_international_textbox;

	@FindBy(xpath = "//input[@formcontrolname='registration_phone']")
	WebElement registration_phone_textbox;

	@FindBy(xpath = "//input[@formcontrolname='registration_passcode']")
	WebElement registration_passcode_textbox;

	@FindBy(xpath = "//textarea[@formcontrolname='live_webcast_url']")
	WebElement live_webcast_url;

	@FindBy(xpath = "//textarea[@formcontrolname='replay_webcast_url']")
	WebElement replay_webcast_url;

	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement comments_textarea;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;

	@FindBy(xpath = "//textarea[@formcontrolname='event_description']")
	WebElement event_description;

	@FindBy(xpath = "//textarea[@formcontrolname='event_link']")
	WebElement event_link;

	@FindBy(xpath = "//textarea[@formcontrolname='registration_link']")
	WebElement registration_link;

	@FindBy(xpath = "//textarea[@formcontrolname='schedule_link']")
	WebElement schedule_link;

	@FindBy(xpath = "//input[@formcontrolname='replay_beginning_date']")
	WebElement replay_beginning_date;

	@FindBy(xpath = "//input[@formcontrolname='replay_end_date']")
	WebElement replay_end_date;

	@FindBy(xpath = "//*[@class='title ng-star-inserted']/h3")
	WebElement event_success_popup_text;

	@FindBy(xpath = "//*[@class='popUp']/h3")
	WebElement pick_new_job_popup_text;

	@FindBy(xpath = "//*[@class='popUp']//button")
	List<WebElement> pick_new_job_popup;

	@FindBy(xpath = "//*[@id='trancedata']/tr/td[11]")
	WebElement event_edit_popup;

	@FindBy(xpath = "//select[@formcontrolname='updated_status']")
	WebElement updated_status;

	@FindBy(xpath = "//*[@formcontrolname='cancelled_event_date']")
	WebElement cancelled_event_date;

	@FindBy(xpath = "//*[@formcontrolname='cancelled_event_time_zone']")
	WebElement cancelled_event_time_zone;

	@FindBy(xpath = "//*[@formcontrolname='cancelled_event_time_zone']//a")
	WebElement cancelled_event_time_zone_option;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_date']")
	WebElement rescheduled_event_date;

	@FindBy(xpath = "//app-template2-events//div[7]//*[@class='form-swich']")
	WebElement rescheduled_time_provider;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_time']//*[@placeholder='HH']")
	WebElement rescheduled_event_time_hour;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_time']//*[@placeholder='MM']")
	WebElement rescheduled_event_time_minute;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_time']//button")
	WebElement rescheduled_event_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_time_zone']")
	WebElement rescheduled_event_time_zone;

	@FindBy(xpath = "//*[@formcontrolname='rescheduled_event_time_zone']//a[1]")
	WebElement rescheduled_event_time_zone_option;

	@FindBy(xpath = "//*[@formcontrolname='release_date']")
	WebElement release_date;
	@FindBy(xpath = "//*[@formcontrolname='projected_release_date']")
	WebElement projected_release_date;

	@FindBy(xpath = "//*[@formcontrolname='release_segment']")
	WebElement release_segment;
	
	@FindBy(xpath = "//div[@class='form-group valid']//*[@formcontrolname='release_segment']")
	WebElement new_release_segment;

	@FindBy(xpath = "//select[@formcontrolname='earnings_date_status']")
	WebElement earnings_date_status;

	@FindBy(xpath = "//*[@formcontrolname='seminar_name']")
	WebElement seminar_name;

	@FindBy(xpath = "//*[@formcontrolname='summit_name']")
	WebElement summit_name;

	@FindBy(xpath = "//*[@formcontrolname='work_shop_name']")
	WebElement work_shop_name;

	@FindBy(xpath = "//*[@formcontrolname='forum_name']")
	WebElement forum_name;

	@FindBy(xpath = "//*[@formcontrolname='trade_show_name']")
	WebElement trade_show_name;

	@FindBy(xpath = "//*[@formcontrolname='event_organizer']")
	WebElement event_organizer;
	@FindBy(xpath = "//*[@formcontrolname='event_start_date']")
	WebElement event_start_date;

	@FindBy(xpath = "//*[@formcontrolname='event_end_date']")
	WebElement event_end_date;

	@FindBy(xpath = "//*[@formcontrolname='start_date']")
	WebElement start_date;

	@FindBy(xpath = "//*[@formcontrolname='end_date']")
	WebElement end_date;

	@FindBy(xpath = "//*[@formcontrolname='event_start_time']//input[@placeholder='HH']")
	WebElement event_start_time_HH;

	@FindBy(xpath = "//*[@formcontrolname='event_start_time']//input[@placeholder='MM']")
	WebElement event_start_time_MM;

	@FindBy(xpath = "//*[@formcontrolname='event_start_time']//button")
	WebElement event_start_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='event_end_time']//input[@placeholder='HH']")
	WebElement event_end_time_HH;

	@FindBy(xpath = "//*[@formcontrolname='event_end_time']//input[@placeholder='MM']")
	WebElement event_end_time_MM;

	@FindBy(xpath = "//*[@formcontrolname='event_end_time']//button")
	WebElement event_end_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='start_time']//input[@placeholder='HH']")
	WebElement start_time_HH;

	@FindBy(xpath = "//*[@formcontrolname='start_time']//input[@placeholder='MM']")
	WebElement start_time_MM;

	@FindBy(xpath = "//*[@formcontrolname='start_time']//button")
	WebElement start_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='end_time']//input[@placeholder='HH']")
	WebElement end_time_HH;

	@FindBy(xpath = "//*[@formcontrolname='end_time']//input[@placeholder='MM']")
	WebElement end_time_MM;

	@FindBy(xpath = "//*[@formcontrolname='end_time']//button")
	WebElement end_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='registration_deadline']")
	WebElement registration_deadline;

	@FindBy(xpath = "//*[@formcontrolname='venue']")
	WebElement venue;

	@FindBy(xpath = "//*[@formcontrolname='address']")
	WebElement address;

	@FindBy(xpath = "//*[@placeholder='Select country']")
	WebElement country;

	@FindBy(xpath = "//*[@id='autocomplete']//a")
	WebElement autoComplete;

	@FindBy(xpath = "//*[@placeholder='Select state']")
	WebElement state;

	@FindBy(xpath = "//*[@placeholder='Select city']")
	WebElement city;

	@FindBy(xpath = "//*[@formcontrolname='seminar_passcode']")
	WebElement seminar_passcode;

	@FindBy(xpath = "//*[@formcontrolname='designation']")
	WebElement designation;

	@FindBy(xpath = "//*[@formcontrolname='contact_person_name']")
	WebElement contact_person_name;

	@FindBy(xpath = "//*[@formcontrolname='phone_number']")
	WebElement phone_number;

	@FindBy(xpath = "//*[@formcontrolname='email']")
	WebElement email;

	@FindBy(xpath = "//*[@formcontrolname='agenda']")
	WebElement agenda;

	@FindBy(xpath = "//*[@formcontrolname='change_status']")
	WebElement change_status;

	@FindBy(xpath = "//*[@formcontrolname='index']")
	WebElement index;

	@FindBy(xpath = "//*[@formcontrolname='effective_date']")
	WebElement effective_date;

	@FindBy(xpath = "//*[text()='Enter Company Name']")
	WebElement enter_company_name_added;

	@FindBy(xpath = "//*[text()='Enter Company Name']")
	WebElement enter_company_name_removed;

	@FindBy(xpath = "//*[@formcontrolname='record_type']")
	WebElement record_type;

	@FindBy(xpath = "//*[@formcontrolname='buy_back_status']")
	WebElement buy_back_status;

	@FindBy(xpath = "//*[@formcontrolname='buy_back_method']")
	WebElement buy_back_method;

	@FindBy(xpath = "//*[@formcontrolname='modification_announcement_date']")
	WebElement modification_announcement_date;

	@FindBy(xpath = "//*[@formcontrolname='approval_date']")
	WebElement approval_date;

	@FindBy(xpath = "//*[@formcontrolname='no_of_authorized_shares']")
	WebElement no_of_authorized_shares;

	@FindBy(xpath = "//*[@formcontrolname='authorized_share_value']")
	WebElement authorized_share_value;

	@FindBy(xpath = "//*[@formcontrolname='share_value_currency']")
	WebElement share_value_currency;

	@FindBy(xpath = "//*[@formcontrolname='buy_back_end_date']")
	WebElement buy_back_end_date;

	@FindBy(xpath = "//*[@formcontrolname='low_end_price_range']")
	WebElement low_end_price_range;

	@FindBy(xpath = "//*[@formcontrolname='high_end_price_range']")
	WebElement high_end_price_range;

	@FindBy(xpath = "//*[@formcontrolname='purchase_price']")
	WebElement purchase_price;

	@FindBy(xpath = "//*[@formcontrolname='tender_expiration_date']")
	WebElement tender_expiration_date;

	@FindBy(xpath = "//timepicker[@formcontrolname='tender_expiration_time']//input[@placeholder='HH']")
	WebElement tender_expiration_time_HH;

	@FindBy(xpath = "//timepicker[@formcontrolname='tender_expiration_time']//input[@placeholder='MM']")
	WebElement tender_expiration_time_MM;

	@FindBy(xpath = "//timepicker[@formcontrolname='tender_expiration_time']//button")
	WebElement tender_expiration_time_am_pm;

	@FindBy(xpath = "//*[@formcontrolname='meeting_type']")
	WebElement meeting_type;

	@FindBy(xpath = "//*[@formcontrolname='meeting_description']")
	WebElement meeting_description;

	@FindBy(xpath = "//*[@formcontrolname='record_date']")
	WebElement record_date;

	@FindBy(xpath = "//*[@formcontrolname='virtual_shareholder_meeting']")
	WebElement virtual_shareholder_meeting;

	@FindBy(xpath = "//*[@formcontrolname='distance_between_head_quarters_and_venue']")
	WebElement distance_between_head_quarters_and_venue;

	@FindBy(xpath = "//div[@class='form-group invalid ng-star-inserted']//input[@placeholder='Enter Company Name']")
	WebElement spin_off_company_name;

	@FindBy(xpath = "//*[@formcontrolname='transaction_status']")
	WebElement transaction_status;

	@FindBy(xpath = "//*[@formcontrolname='parent_company_shares_cutoff']")
	WebElement parent_company_shares_cutoff;

	@FindBy(xpath = "//*[@formcontrolname='spin_off_company_shares_received']")
	WebElement spin_off_company_shares_received;

	@FindBy(xpath = "//*[@formcontrolname='taxable']")
	WebElement taxable;

	@FindBy(xpath = "//*[@formcontrolname='fractional_payment_type']")
	WebElement fractional_payment_type;

	@FindBy(xpath = "//*[@formcontrolname='estimated_market_cap']")
	WebElement estimated_market_cap;

	@FindBy(xpath = "//*[@formcontrolname='distribution_date']")
	WebElement distribution_date;

	@FindBy(xpath = "//*[@formcontrolname='trade_date']")
	WebElement trade_date;

	@FindBy(xpath = "//*[@formcontrolname='parent_company_trading_when_issued_from_date']")
	WebElement parent_company_trading_when_issued_from_date;

	@FindBy(xpath = "//*[@formcontrolname='parent_company_trading_when_issued_to_date']")
	WebElement parent_company_trading_when_issued_to_date;

	@FindBy(xpath = "//*[@formcontrolname='spin_off_company_trading_when_issued_from_date']")
	WebElement spin_off_company_trading_when_issued_from_date;

	@FindBy(xpath = "//*[@formcontrolname='spin_off_company_trading_when_issued_to_date']")
	WebElement spin_off_company_trading_when_issued_to_date;

	@FindBy(xpath = "//*[@formcontrolname='stock_split_type']")
	WebElement stock_split_type;

	@FindBy(xpath = "//*[@formcontrolname='split_ratio']")
	WebElement split_ratio;

	@FindBy(xpath = "//*[@formcontrolname='revised_stock_trading_date']")
	WebElement revised_stock_trading_date;

	@FindBy(xpath = "//*[@formcontrolname='split_effective_date']")
	WebElement split_effective_date;

	@FindBy(xpath = "//*[@formcontrolname='dividend_amount']")
	WebElement dividend_amount;

	@FindBy(xpath = "//*[@formcontrolname='currency']//input")
	WebElement currency;

	@FindBy(xpath = "//*[@formcontrolname='currency']//li//a")
	List<WebElement> currency_select;

	@FindBy(xpath = "//*[@formcontrolname='frequency']")
	WebElement frequency;

	@FindBy(xpath = "//*[@formcontrolname='ex_dividend_date']")
	WebElement ex_dividend_date;

	@FindBy(xpath = "//*[@formcontrolname='pay_date']")
	WebElement pay_date;

	@FindBy(xpath = "//*[@formcontrolname='dividend_trend']")
	WebElement dividend_trend;

	@FindBy(xpath = "//*[@formcontrolname='dividend_status']")
	WebElement dividend_status;

	@FindBy(xpath = "//*[@formcontrolname='suspended_or_resumed_date']")
	WebElement suspended_or_resumed_date;

	@FindBy(xpath = "//*[@formcontrolname='lawsuit_category']")
	WebElement lawsuit_category;

	@FindBy(xpath = "//*[@formcontrolname='lawsuit_stage']")
	WebElement lawsuit_stage;

	@FindBy(xpath = "//*[@formcontrolname='lawsuit_link']")
	WebElement lawsuit_link;

	@FindBy(xpath = "//*[@formcontrolname='lawsuit_description']")
	WebElement lawsuit_description;

	@FindBy(xpath = "//*[@formcontrolname='plaintiff_name']")
	WebElement plaintiff_name;

	@FindBy(xpath = "//*[@formcontrolname='plaintiff_email']")
	WebElement plaintiff_email;

	@FindBy(xpath = "//*[@formcontrolname='plaintiff_address']")
	WebElement plaintiff_address;

	@FindBy(xpath = "//*[@formcontrolname='plaintiff_phone_no']")
	WebElement plaintiff_phone_no;

	@FindBy(xpath = "//*[@formcontrolname='lawfirm_name']")
	WebElement lawfirm_name;

	@FindBy(xpath = "//*[@formcontrolname='lawfirm_url']")
	WebElement lawfirm_url;

	@FindBy(xpath = "//*[@formcontrolname='class_action_start_date']")
	WebElement class_action_start_date;

	@FindBy(xpath = "//*[@formcontrolname='class_action_end_date']")
	WebElement class_action_end_date;

	@FindBy(xpath = "//*[@formcontrolname='motion_dead_line']")
	WebElement motion_dead_line;

	@FindBy(xpath = "//*[@formcontrolname='filling_date']")
	WebElement filling_date;

	@FindBy(xpath = "//*[@formcontrolname='offering_date']")
	WebElement offering_date;

	@FindBy(xpath = "//*[@formcontrolname='share_price']")
	WebElement share_price;

	@FindBy(xpath = "//*[@formcontrolname='shares_offered']")
	WebElement shares_offered;

	@FindBy(xpath = "//*[@formcontrolname='offer_amount']")
	WebElement offer_amount;

	@FindBy(xpath = "//*[@formcontrolname='low_end_share_price']")
	WebElement low_end_share_price;

	@FindBy(xpath = "//*[@formcontrolname='high_end_share_price']")
	WebElement high_end_share_price;

	@FindBy(xpath = "//*[@formcontrolname='lead_managers']")
	WebElement lead_managers;

	@FindBy(xpath = "//*[@formcontrolname='quiet_period']")
	WebElement quiet_period;

	@FindBy(xpath = "//*[@formcontrolname='lockup_period']")
	WebElement lockup_period;

	@FindBy(xpath = "//*[@formcontrolname='offering_status']")
	WebElement offering_status;

	@FindBy(xpath = "//*[@formcontrolname='selling_shareholder']")
	WebElement selling_shareholder;

	@FindBy(xpath = "//*[@formcontrolname='number_of_shares_for_sale']")
	WebElement number_of_shares_for_sale;

	@FindBy(xpath = "//*[@formcontrolname='closing_date']")
	WebElement closing_date;

	@FindBy(xpath = "//*[@formcontrolname='proceeds_received_by_company']")
	WebElement proceeds_received_by_company;

	@FindBy(xpath = "//*[@formcontrolname='under_writing_manager']")
	WebElement under_writing_manager;

	@FindBy(xpath = "//*[@formcontrolname='prospectus_link']")
	WebElement prospectus_link;

	@FindBy(xpath = "//input[@formcontrolname='preliminary_guidance']")
	List<WebElement> preliminary_guidance_check;

	@FindBy(xpath = "//input[@formcontrolname='preliminary_guidance']/following-sibling::label")
	List<WebElement> preliminary_guidance_checktext;

	@FindBy(xpath = "//*[@formcontrolname='guidance_period']")
	WebElement guidance_period;

	@FindBy(xpath = "//*[@formcontrolname='guidance_quarter']")
	WebElement guidance_quarter;

	@FindBy(xpath = "//*[@formcontrolname='guidance_financial_year']")
	WebElement guidance_financial_year;

	@FindBy(xpath = "//*[@formcontrolname='revenue_range']/following-sibling::span")
	WebElement revenue_range;

	@FindBy(xpath = "//*[@formcontrolname='revenue_range_acct_standard']")
	WebElement revenue_range_acct_standard;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0']//label[text()='Currency Code']/following-sibling::app-currency//*[text()='Select One']")
	WebElement revenue_range_currency_code;

	// div[@class='form-group pl-2 invalid']//li/div
	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0']//label[text()='Currency Code']/following-sibling::app-currency//li/div")
	List<WebElement> revenue_range_currency_code_select;

	@FindBy(xpath = "//*[@formcontrolname='revenue_range_from']")
	WebElement revenue_range_from;

	@FindBy(xpath = "//*[@formcontrolname='revenue_range_to']")
	WebElement revenue_range_to;

	@FindBy(xpath = "//*[@formcontrolname='revenue_range_monetary_unit']")
	WebElement revenue_range_monetary_unit;

	@FindBy(xpath = "//*[@class='swich-item eps-drp d-flex justify-content-between']")
	WebElement eps_range;

	@FindBy(xpath = "//*[@formcontrolname='eps_range_acct_standard']")
	WebElement eps_range_acct_standard;

	@FindBy(xpath = "//*[@class = 'swich-item eps-drp d-flex justify-content-between']/following-sibling::div//label[text()='Currency Code']/following-sibling::app-currency//*[text()='Select One']")
	WebElement eps_range_currency_code;

	@FindBy(xpath = "//*[@class = 'swich-item eps-drp d-flex justify-content-between']/following-sibling::div//label[text()='Currency Code']/following-sibling::app-currency//li/div")
	List<WebElement> eps_range_currency_code_select;

	@FindBy(xpath = "//*[@formcontrolname='eps_range_from']")
	WebElement eps_range_from;

	@FindBy(xpath = "//*[@formcontrolname='eps_range_to']")
	WebElement eps_range_to;

	@FindBy(xpath = "//*[@formcontrolname='ebitda_range']/following-sibling::span")
	WebElement ebitda_range;

	@FindBy(xpath = "//*[@formcontrolname='ebitda_range_acct_standard']")
	WebElement ebitda_range_acct_standard;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0 mt-0']//div[@class='swich-form']//div[@class='form-timefields fy-year']//div[@class='form-group pl-2 invalid']//app-currency//ng-multiselect-dropdown[@class='ng-untouched ng-valid ng-dirty']//div[@class='multiselect-dropdown']//div//span[@class='ng-star-inserted'][normalize-space()='Select One']")
	WebElement ebitda_range_currency_code;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0 mt-0']//div[@class='form-group pl-2 invalid']//li/div")
	List<WebElement> ebitda_range_currency_code_select;

	@FindBy(xpath = "//*[@formcontrolname='ebitda_range_from']")
	WebElement ebitda_range_from;

	@FindBy(xpath = "//*[@formcontrolname='ebitda_range_to']")
	WebElement ebitda_range_to;

	@FindBy(xpath = "//*[@formcontrolname='ebitda_range_monetary_unit']")
	WebElement ebitda_range_monetary_unit;

	@FindBy(xpath = "//*[@formcontrolname='capital_expenditure']/following-sibling::span")
	WebElement capital_expenditure;

	// get index(3) capital_expenditure_currency_code
	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0 mt-0']//div[@class='swich-form']//div[@class='form-timefields fy-year']//div[@class='form-group pr-2 valid']//app-currency//ng-multiselect-dropdown[@class='ng-untouched ng-valid ng-dirty']//div[@class='multiselect-dropdown']//div//span[@class='ng-star-inserted'][normalize-space()='Select One']")
	WebElement capital_expenditure_currency_code;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mb-0 mt-0']//div[@class='form-group pr-2 valid']//li/div")
	List<WebElement> capital_expenditure_currency_code_select;

	@FindBy(xpath = "//*[@formcontrolname='capital_expenditure_from']")
	WebElement capital_expenditure_from;

	@FindBy(xpath = "//*[@formcontrolname='capital_expenditure_to']")
	WebElement capital_expenditure_to;

	@FindBy(xpath = "//*[@formcontrolname='capital_expenditure_monetary_unit']")
	WebElement capital_expenditure_monetary_unit;

	@FindBy(xpath = "//*[@formcontrolname='operating_expenses']/following-sibling::span")
	WebElement operating_expenses;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mt-0']//div[@class='swich-form']//div[@class='form-timefields fy-year']//div[@class='form-group pr-2 valid']//app-currency//ng-multiselect-dropdown[@class='ng-untouched ng-valid ng-dirty']//div[@class='multiselect-dropdown']//div//span[@class='ng-star-inserted'][normalize-space()='Select One']")
	WebElement operating_expenses_currency_code;

	@FindBy(xpath = "//div[@class='dg-swich-toggle mt-0']//li/div")
	List<WebElement> operating_expenses_currency_code_select;

	@FindBy(xpath = "//*[@formcontrolname='operating_expenses_from']")
	WebElement operating_expenses_from;

	@FindBy(xpath = "//*[@formcontrolname='operating_expenses_to']")
	WebElement operating_expenses_to;

	@FindBy(xpath = "//*[@formcontrolname='operating_expenses_monetary_unit']")
	WebElement operating_expenses_monetary_unit;

	@FindBy(xpath = "//*[@formcontrolname='outlook_info']")
	WebElement outlook_info;
	
	@FindBy(xpath="//label[text()='Recent Earnings Release']/following-sibling::div//span")
	WebElement recent_earnings_release;
	
	@FindBy(xpath="//p[text()='Add event details in Earnings Release']")
	WebElement earnings_release_caution_msg;
	
	@FindBy(xpath="//li[@id]")
	WebElement recent_earnings_release_select;
	
	@FindBy(xpath="//span[text()='Event Title: Earnings Release Change']")
	WebElement recent_earnings_release_change_default;

	@FindBy(xpath="//*[@formcontrolname='revised_earnings_release_date']")
	WebElement revised_earnings_release_date;

	@FindBy(xpath = "//*[@formcontrolname='revised_earnings_release_time']//input[@placeholder='HH']")
	WebElement revised_earnings_release_time_HH;

	@FindBy(xpath = "//*[@formcontrolname='revised_earnings_release_time']//input[@placeholder='MM']")
	WebElement revised_earnings_release_time_MM;

	@FindBy(xpath = "//*[@formcontrolname='revised_earnings_release_time']//button")
	WebElement revised_earnings_release_time_am_pm;
	
	@FindBy(xpath = "//*[@formcontrolname='event_date']/following-sibling::div/span")
	WebElement event_date_error_message;
	
	@FindBy(xpath = "//*[@formcontrolname='period_end_date']/following-sibling::div/span")
	WebElement period_end_date_error_message;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	public EventsPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}

	public void is_corporate_actions_selected() {
		selectbyVisibleText(selectList, "Corporate Actions");
	}

	public void enter_company_name(String companyName) {
		waitForExpectedElement(companyName_textbox.get(0)).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void enter_event_type(String eventType) {
		waitForExpectedElement(eventType_textbox).sendKeys(eventType);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void select_announcement_date(String announcementDate) {
		waitForExpectedElement(announcement_date).click();
		datepickerDateSelect(announcementDate);
	}
	
	public void select_new_announcement_date(String announcementDate) {
		waitForExpectedElement(new_announcement_date).click();
		datepickerDateSelect(announcementDate);
	}

	public void select_status(String status) {
		selectbyVisibleText(status_dropdown, status);
	}

	public void select_event_date(String eventDate) {
		waitForExpectedElement(event_date).click();
		datepickerDateSelect(eventDate);
	}

	public void select_time_provided() {
		waitForExpectedElement(time_provided).click();
	}

	public void enterEventTimeHH(String hours) {
		waitForExpectedElement(select_event_time_hours).sendKeys(hours);
	}

	public void enterEventTimeHH_Reschedule(String hours) {
		waitForExpectedElement(rescheduled_event_time_hour).sendKeys(hours);
	}

	public void enterEventTimeMM(String mins) {
		waitForExpectedElement(select_event_time_mins).sendKeys(mins);

	}

	public void enterEventTimeMM_Reschedule(String mins) {
		waitForExpectedElement(rescheduled_event_time_minute).sendKeys(mins);
	}

	public void clickAmPm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(select_am_pm).click();
			soft.assertTrue(waitForExpectedElement(select_am_pm).getText().trim().equals(am_or_pm),"Failed not changed to PM");
		}
	}

	public void clickAmPm_Reschedule(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(rescheduled_event_time_am_pm).click();
		}
	}

	public void enter_time_zone(String timeZone) {
		waitForExpectedElement(timeZone_textbox).sendKeys(timeZone);
		sleep(500);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void enter_time_zone_reschedule(String timeZone) {
		waitForExpectedElement(rescheduled_event_time_zone).sendKeys(timeZone);
		sleep(500);
		waitForExpectedElement(rescheduled_event_time_zone_option).click();
	}

	public void enter_time_zone_cancelled(String timeZone) {
		waitForExpectedElement(cancelled_event_time_zone).sendKeys(timeZone);
		sleep(500);
		waitForExpectedElement(cancelled_event_time_zone_option).click();
	}

	public void select_financial_quarter(String financialQuarter) {
		selectbyVisibleText(select_financial_quarter, financialQuarter);
	}
	public void select_time_period(String timePeriod) {
		selectbyVisibleText(time_period, timePeriod);
	}
	public void select_financial_year(String financialYear) {
		selectbyVisibleText(select_financial_year, financialYear);
	}
	
	public void select_Calendar_year(String calendar_year) {
		selectbyVisibleText(select_calendar_year, calendar_year);
	}

	public void select_period_end_date(String periodEndDate) {
		if (!periodEndDate.isEmpty()) {
		waitForExpectedElement(period_end_date).click();
		datepickerDateSelect(periodEndDate);
		}
	}

	public void select_event_date_cancelled(String date) {
		waitForExpectedElement(cancelled_event_date).click();
		datepickerDateSelect(date);
	}

	public void select_event_date_reschedule(String date) {
		waitForExpectedElement(rescheduled_event_date).click();
		datepickerDateSelect(date);
	}

	public void enter_the_title(String title) {
		waitForExpectedElement(title_textbox).sendKeys(title);
	}

	public void enter_live_phone_us(String livePhoneUs) {
		waitForExpectedElement(live_phone_us_textbox).sendKeys(livePhoneUs);
	}

	public void select_update_status(String string) {
		selectbyVisibleText(updated_status, string);
	}

	public void enter_live_passcode_us(String livePasscodeUs) {
		waitForExpectedElement(live_passcode_us_textbox).sendKeys(livePasscodeUs);
	}

	public void enter_live_phone_international(String livePhoneInternational) {
		waitForExpectedElement(live_phone_international_textbox).sendKeys(livePhoneInternational);
	}

	public void enter_live_passcode_international(String livePasscodeInternational) {
		waitForExpectedElement(live_passcode_international_textbox).sendKeys(livePasscodeInternational);
	}

	public void enter_replay_phone_us(String replayPhoneUs) {
		waitForExpectedElement(replay_phone_us_textbox).sendKeys(replayPhoneUs);
	}

	public void enter_replay_passcode_us(String replayPasscodeUs) {
		waitForExpectedElement(replay_passcode_us_textbox).sendKeys(replayPasscodeUs);
	}

	public void enter_replay_phone_international(String replayPhoneInternational) {
		waitForExpectedElement(replay_phone_international_textbox).sendKeys(replayPhoneInternational);
	}

	public void enter_replay_passcode_international(String replayPasscodeInternational) {
		waitForExpectedElement(replay_passcode_international_textbox).sendKeys(replayPasscodeInternational);
	}

	public void enter_registration_phone(String registrationPhone) {
		waitForExpectedElement(registration_phone_textbox).sendKeys(registrationPhone);
	}

	public void enter_registration_passcode(String registrationPasscode) {
		waitForExpectedElement(registration_passcode_textbox).sendKeys(registrationPasscode);
	}

	public void enter_live_webcast_url(String liveWebcastUrl) {
		waitForExpectedElement(live_webcast_url).sendKeys(liveWebcastUrl);
	}

	public void enter_replay_webcast_url(String replayWebcastUrl) {
		if (!replayWebcastUrl.isEmpty()){
			waitForExpectedElement(replay_webcast_url).clear();
			waitForExpectedElement(replay_webcast_url).sendKeys(replayWebcastUrl);
		}else {
			waitForExpectedElement(replay_webcast_url).sendKeys(Keys.CONTROL+"a");
			waitForExpectedElement(replay_webcast_url).sendKeys(Keys.DELETE);
		}
	}

	public void enter_comments(String comments) {
		waitForExpectedElement(comments_textarea).sendKeys(comments);
	}

	public void click_submit_button() {
		waitForExpectedElement(submit_button).click();
	}

	public void enter_event_description(String eventDescription) {
		waitForExpectedElement(event_description).sendKeys(eventDescription);
	}

	public void enter_event_link(String eventLink) {
		waitForExpectedElement(event_link).sendKeys(eventLink);
	}

	public void enter_registration_link(String registrationLink) {
		waitForExpectedElement(registration_link).sendKeys(registrationLink);
	}

	public void enter_schedule_link(String scheduleLink) {
		waitForExpectedElement(schedule_link).sendKeys(scheduleLink);
	}

	public void select_replay_beginning_date(String replayBeginningDate) {
		if (!replayBeginningDate.isEmpty()) {
		waitForExpectedElement(replay_beginning_date).click();
		datepickerDateSelect(replayBeginningDate);
		}
	}

	public void select_replay_end_date(String replayEndDate) {
		if (!replayEndDate.isEmpty()) {
		waitForExpectedElement(replay_end_date).click();
		datepickerDateSelect(replayEndDate);
		}
	}

	public void enter_article_link(String string) {
		waitForExpectedElement(article_url).sendKeys(string);
	}

	public void select_article_relevancy_radiobtn(String string) {
		for (WebElement element : presenceOfAllElementsLocatedBy(article_relevancy)) {
			if (element.getText().equalsIgnoreCase(string)) {
				element.click();
			}
		}
	}

	public void check_event_success_popup_text(String string) {
		Assert.assertTrue(waitForExpectedElement(event_success_popup_text).getText().equals(string),
				"invalid_success_popup_text");
	}

	public void check_pick_new_job_popup_text(String string) {
		Assert.assertTrue(waitForExpectedElement(pick_new_job_popup_text).getText().equals(string),
				"invalid_pick_new_job_popup_text");
	}

	public void click_pick_new_job(String string) {
		sleep(7000);
		for (WebElement element : presenceOfAllElementsLocatedBy(pick_new_job_popup)) {
			if (element.getText().equalsIgnoreCase(string)) {
				element.click();
				sleep(500);
			}
		}
	}

	public void select_release_date(String releasedate) {
		waitForExpectedElement(release_date).click();
		datepickerDateSelect(releasedate);
	}

	public void select_release_segment(String string) {
		if(!string.isEmpty()) {
			selectbyVisibleText(release_segment, string);
		}
	}
	
	public void select_new_release_segment(String string) {
		if(!string.isEmpty()) {
		selectbyVisibleText(new_release_segment, string);
		}
	}

	public void select_earnings_date_status(String string) {
		if(!string.isEmpty()) {
		selectbyVisibleText(earnings_date_status, string);
		}
	}

	public void select_projected_release_date(String releasedate) {
		waitForExpectedElement(projected_release_date).click();
		datepickerDateSelect(releasedate);
	}

	public void enter_seminar_name(String string) {
		waitForExpectedElement(seminar_name).sendKeys(string);
	}

	public void enter_summit_name(String string) {
		waitForExpectedElement(summit_name).sendKeys(string);
	}

	public void enter_work_shop_name(String string) {
		waitForExpectedElement(work_shop_name).sendKeys(string);
	}

	public void enter_forum_name(String string) {
		waitForExpectedElement(forum_name).sendKeys(string);
	}

	public void enter_trade_show_name(String string) {
		waitForExpectedElement(trade_show_name).sendKeys(string);
	}

	public void enter_event_organizer(String string) {
		waitForExpectedElement(event_organizer).sendKeys(string);
	}

	public void select_event_start_date(String string) {
		waitForExpectedElement(event_start_date).click();
		datepickerDateSelect(string);
	}

	public void select_event_end_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(event_end_date).click();
			datepickerDateSelect(string);
		}

	}

	public void select_start_date(String string) {
		waitForExpectedElement(start_date).click();
		datepickerDateSelect(string);
	}

	public void select_end_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(end_date).click();
			datepickerDateSelect(string);
		}

	}

	public void enter_event_start_time_HH(String hours) {
		waitForExpectedElement(event_start_time_HH).sendKeys(hours);
	}

	public void enter_event_start_time_MM(String minute) {
		waitForExpectedElement(event_start_time_MM).sendKeys(minute);
	}

	public void click_event_start_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(event_start_time_am_pm).click();
		}
	}

	public void enter_event_end_time_HH(String hours) {
		waitForExpectedElement(event_end_time_HH).sendKeys(hours);
	}

	public void enter_event_end_time_MM(String minute) {
		waitForExpectedElement(event_end_time_MM).sendKeys(minute);
	}

	public void click_event_end_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(event_end_time_am_pm).click();
		}
	}

	public void enter_start_time_HH(String hours) {
		waitForExpectedElement(start_time_HH).sendKeys(hours);
	}

	public void enter_start_time_MM(String minute) {
		waitForExpectedElement(start_time_MM).sendKeys(minute);
	}

	public void click_start_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(start_time_am_pm).click();
		}
	}

	public void enter_end_time_HH(String hours) {
		waitForExpectedElement(end_time_HH).sendKeys(hours);
	}

	public void enter_end_time_MM(String minute) {
		waitForExpectedElement(end_time_MM).sendKeys(minute);
	}

	public void click_end_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(end_time_am_pm).click();
		}
	}

	public void enter_registration_deadline(String string) {
		waitForExpectedElement(registration_deadline).sendKeys(string);
	}

	public void enter_venue(String string) {
		waitForExpectedElement(venue).sendKeys(string);
	}

	public void enter_address(String string) {
		waitForExpectedElement(address).sendKeys(string);
	}

	public void enter_country(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(country).sendKeys(string);
			waitForExpectedElement(autoComplete).click();
		}
	}

	public void enter_state(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(state).sendKeys(string);
			waitForExpectedElement(autoComplete).click();
		}
	}

	public void enter_city(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(city).sendKeys(string);
			waitForExpectedElement(autoComplete).click();
		}
	}

	public void enter_seminar_passcode(String string) {
		waitForExpectedElement(seminar_passcode).sendKeys(string);
	}

	public void enter_contact_person_name(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(contact_person_name).sendKeys(string);
		}
	}

	public void enter_designation(String string) {
		waitForExpectedElement(designation).sendKeys(string);
	}

	public void enter_phone_number(String string) {
		waitForExpectedElement(phone_number).sendKeys(string);
	}

	public void enter_email(String string) {
		waitForExpectedElement(email).sendKeys(string);
	}

	public void skip_edit_popup() {
		if (waitForExpectedElement(select_edit_popup).isDisplayed()) {
			new Actions(WebDriverHelper.getDriver()).moveByOffset(700, 300).build().perform();
		}
	}

	public void enter_agenda(String string) {
		waitForExpectedElement(agenda).sendKeys(string);
	}

	public void select_change_status(String string) {
		selectbyVisibleText(change_status, string);
	}

	public void select_index(String string) {
		selectbyVisibleText(index, string);
	}

	public void select_effective_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(effective_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_company_name_added(String companyName) {
		waitForExpectedElement(companyName_textbox.get(1)).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void enter_company_name_removed(String companyName) {
		waitForExpectedElement(companyName_textbox.get(2)).sendKeys(companyName);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void select_record_type(String string) {
		selectbyVisibleText(record_type, string);
	}

	public void select_buyback_status(String string) {
		selectbyVisibleText(buy_back_status, string);
	}

	public void select_buyback_method(String string) {
		selectbyVisibleText(buy_back_method, string);
	}

	public void select_modification_announcement_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(modification_announcement_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_approval_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(approval_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_no_of_authorized_shares(String string) {
		waitForExpectedElement(no_of_authorized_shares).sendKeys(string);
	}

	public void enter_authorized_share_value(String string) {
		waitForExpectedElement(authorized_share_value).sendKeys(string);
	}

	public void select_buyback_end_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(buy_back_end_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_low_end_price_range(String string) {
		waitForExpectedElement(low_end_price_range).sendKeys(string);
	}

	public void enter_high_end_price_range(String string) {
		waitForExpectedElement(high_end_price_range).sendKeys(string);
	}

	public void enter_purchase_price(String string) {
		waitForExpectedElement(purchase_price).sendKeys(string);
	}

	public void select_tender_expiration_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(tender_expiration_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_tender_expiration_time_HH(String hour) {
		waitForExpectedElement(tender_expiration_time_HH).sendKeys(hour);
	}

	public void enter_tender_expiration_time_MM(String minute) {
		waitForExpectedElement(tender_expiration_time_MM).sendKeys(minute);
	}

	public void click_tender_expiration_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(tender_expiration_time_am_pm).click();
		}
	}

	public void select_meeting_type(String string) {
		selectbyVisibleText(meeting_type, string);
	}

	public void enter_meeting_description(String string) {
		waitForExpectedElement(meeting_description).sendKeys(string);
	}

	public void select_record_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(record_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_virtual_shareholder_meeting(String string) {
		waitForExpectedElement(virtual_shareholder_meeting).sendKeys(string);
	}

	public void enter_distance_between_head_quarters_and_venue(String string) {
		waitForExpectedElement(distance_between_head_quarters_and_venue).sendKeys(string);
	}

	public void enter_spin_off_company_name(String string) {
		waitForExpectedElement(spin_off_company_name).sendKeys(string);
		waitForExpectedElement(select_from_dropdown).click();
	}

	public void select_transaction_status(String string) {
		selectbyVisibleText(transaction_status, string);
	}

	public void enter_parent_company_shares_cutoff(String string) {
		waitForExpectedElement(parent_company_shares_cutoff).sendKeys(string);
	}

	public void enter_spin_off_company_shares_received(String string) {
		waitForExpectedElement(spin_off_company_shares_received).sendKeys(string);
	}

	public void select_taxable(String string) {
		if (!string.isEmpty()) {
			selectbyVisibleText(taxable, string);
		}
	}

	public void select_fractional_payment_type(String string) {
		if (!string.isEmpty()) {
			selectbyVisibleText(fractional_payment_type, string);
		}
	}

	public void enter_estimated_market_cap(String string) {
		waitForExpectedElement(estimated_market_cap).sendKeys(string);
	}

	public void select_distribution_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(distribution_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_trade_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(trade_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_parent_company_trading_when_issued_from_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(parent_company_trading_when_issued_from_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_parent_company_trading_when_issued_to_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(parent_company_trading_when_issued_to_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_spin_off_company_trading_when_issued_from_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(spin_off_company_trading_when_issued_from_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_spin_off_company_trading_when_issued_to_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(spin_off_company_trading_when_issued_to_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_stock_split_type(String string) {
		selectbyVisibleText(stock_split_type, string);
	}

	public void enter_split_ratio(String string) {
		waitForExpectedElement(split_ratio).sendKeys(string);
	}

	public void select_revised_stock_trading_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(revised_stock_trading_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_split_effective_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(split_effective_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_dividend_amount(String string) {
		waitForExpectedElement(dividend_amount).sendKeys(string);
	}

	public void select_currency(String string) {
		waitForExpectedElement(currency).sendKeys(string);

		for (WebElement element : currency_select) {
			if (element.getText().trim().equals(string)) {
				sleep(1000);
				element.click();
				break;
			}
		}
	}

	public void select_frequency(String string) {
		selectbyVisibleText(frequency, string);
	}

	public void select_ex_dividend_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(ex_dividend_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_pay_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(pay_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_dividend_trend(String string) {
		if (!string.isEmpty()) {
			selectbyVisibleText(dividend_trend, string);
		}
	}

	public void select_dividend_status(String string) {
		selectbyVisibleText(dividend_status, string);
	}

	public void select_suspended_resumed_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(suspended_or_resumed_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_lawsuit_category(String string) {
		selectbyVisibleText(lawsuit_category, string);
	}

	public void select_lawsuit_stage(String string) {
		selectbyVisibleText(lawsuit_stage, string);
	}

	public void enter_lawsuit_link(String string) {
		waitForExpectedElement(lawsuit_link).sendKeys(string);
	}

	public void enter_lawsuit_description(String string) {
		waitForExpectedElement(lawsuit_description).sendKeys(string);
	}

	public void enter_plaintiff_name(String string) {
		waitForExpectedElement(plaintiff_name).sendKeys(string);
	}

	public void enter_plaintiff_email(String string) {
		waitForExpectedElement(plaintiff_email).sendKeys(string);
	}

	public void enter_plaintiff_address(String string) {
		waitForExpectedElement(plaintiff_address).sendKeys(string);
	}

	public void enter_plaintiff_phone_number(String string) {
		waitForExpectedElement(plaintiff_phone_no).sendKeys(string);
	}

	public void enter_lawfirm_name(String string) {
		waitForExpectedElement(lawfirm_name).sendKeys(string);
	}

	public void enter_lawfirm_url(String string) {
		waitForExpectedElement(lawfirm_url).sendKeys(string);
	}

	public void select_class_action_start_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(class_action_start_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_class_action_end_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(class_action_end_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_motion_dead_line(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(motion_dead_line).click();
			datepickerDateSelect(string);
		}
	}

	public void select_filling_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(filling_date).click();
			datepickerDateSelect(string);
		}
	}

	public void select_offering_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(offering_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_share_price(String string) {
		waitForExpectedElement(share_price).sendKeys(string);
	}

	public void enter_share_offered(String string) {
		waitForExpectedElement(shares_offered).sendKeys(string);
	}

	public void enter_offer_amount(String string) {
		waitForExpectedElement(offer_amount).sendKeys(string);
	}

	public void enter_low_end_share_price(String string) {
		waitForExpectedElement(low_end_share_price).sendKeys(string);
	}

	public void enter_high_end_share_price(String string) {
		waitForExpectedElement(high_end_share_price).sendKeys(string);
	}

	public void enter_lead_managers(String string) {
		waitForExpectedElement(lead_managers).sendKeys(string);
	}

	public void select_quiet_period(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(quiet_period).click();
			datepickerDateSelect(string);
		}
	}

	public void select_lockup_period(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(lockup_period).click();
			datepickerDateSelect(string);
		}
	}

	public void select_offering_status(String string) {
		selectbyVisibleText(offering_status, string);
	}

	public void select_selling_shareholder(String string) {
		if (!string.isEmpty()) {
			selectbyVisibleText(selling_shareholder, string);
		}
	}

	public void enter_number_of_shares_for_sale(String string) {
		waitForExpectedElement(number_of_shares_for_sale).sendKeys(string);
	}

	public void select_closing_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(closing_date).click();
			datepickerDateSelect(string);
		}
	}

	public void enter_proceeds_received_by_company(String string) {
		waitForExpectedElement(proceeds_received_by_company).sendKeys(string);
	}

	public void enter_under_writing_manager(String string) {
		waitForExpectedElement(under_writing_manager).sendKeys(string);
	}

	public void enter_prospectus_link(String string) {
		waitForExpectedElement(prospectus_link).sendKeys(string);
	}

	public void select_preliminary_guidance(String string) {
		for (int i = 0; i < preliminary_guidance_checktext.size(); i++) {
			if (preliminary_guidance_checktext.get(i).getText().trim().equalsIgnoreCase(string)) {
				waitForExpectedElement(preliminary_guidance_check.get(i)).click();
			}
		}
	}

	public void select_guidance_period(String string) {
		selectbyVisibleText(guidance_period, string);
	}

	public void select_guidance_quarter(String string) {
		selectbyVisibleText(guidance_quarter, string);
	}

	public void select_guidance_financial_year(String string) {
		selectbyVisibleText(guidance_financial_year, string);
	}

	public void select_revenue_range(String string) {
		if (string.equals("Yes")) {
			waitForExpectedElement(revenue_range).click();
		}
	}

	public void select_revenue_acct_standard(String string) {
		selectbyVisibleText(revenue_range_acct_standard, string);
	}

	public void select_revenue_currency_code(String string) {
		waitForExpectedElement(revenue_range_currency_code).click();
		for (WebElement element : revenue_range_currency_code_select) {
			if (element.getText().trim().equals(string)) {
				element.click();
			}
		}
	}

	public void enter_revenue_from_as_and_revenue_to(String from, String to) {
		waitForExpectedElement(revenue_range_from).sendKeys(from);
		waitForExpectedElement(revenue_range_to).sendKeys(to);
	}
	
	public void select_revenue_monetary_unit(String string) {
		selectbyVisibleText(revenue_range_monetary_unit, string);
	}

	public void select_eps_range(String string) {
		if (string.equals("Yes")) {
			waitForExpectedElement(eps_range).click();
		}
	}

	public void select_eps_acct_standard(String string) {
		selectbyVisibleText(eps_range_acct_standard, string);
	}

	public void select_eps_currency_code(String string) {
		waitForExpectedElement(eps_range_currency_code).click();
		for (WebElement element : eps_range_currency_code_select) {
			if (element.getText().trim().equals(string)) {
				element.click();
			}
		}
	}

	public void enter_eps_from_as_and_eps_to(String from, String to) {
		waitForExpectedElement(eps_range_from).sendKeys(from);
		waitForExpectedElement(eps_range_to).sendKeys(to);
	}

	public void select_ebitda_range(String string) {
		if (string.equals("Yes")) {
			waitForExpectedElement(ebitda_range).click();
		}
	}

	public void select_ebitda_acct_standard(String string) {
		selectbyVisibleText(ebitda_range_acct_standard, string);
	}

	public void select_ebitda_currency_code(String string) {
		waitForExpectedElement(ebitda_range_currency_code).click();
		for (WebElement element : ebitda_range_currency_code_select) {
			if (element.getText().trim().equals(string)) {
				element.click();
			}
		}
	}

	public void enter_ebitda_from_as_and_ebitda_to(String from, String to) {
		waitForExpectedElement(ebitda_range_from).sendKeys(from);
		waitForExpectedElement(ebitda_range_to).sendKeys(to);
	}

	public void select_ebitda_monetary_unit(String string) {
		selectbyVisibleText(ebitda_range_monetary_unit, string);
	}

	public void select_capital_expenditure(String string) {
		if (string.equals("Yes")) {
			waitForExpectedElement(capital_expenditure).click();
		}
	}

	public void select_capital_expenditure_currency_code(String string) {
		waitForExpectedElement(capital_expenditure_currency_code).click();
		for (WebElement element : capital_expenditure_currency_code_select) {
			if (element.getText().trim().equals(string)) {
				element.click();
			}
		}
	}

	public void enter_capital_expenditure_from_as_and_capital_expenditure_to(String from, String to) {
		waitForExpectedElement(capital_expenditure_from).sendKeys(from);
		waitForExpectedElement(capital_expenditure_to).sendKeys(to);
	}

	public void select_capital_expenditure_monetary_unit(String string) {
		selectbyVisibleText(capital_expenditure_monetary_unit, string);
	}

	public void select_operating_expenses(String string) {
		if (string.equals("Yes")) {
			waitForExpectedElement(operating_expenses).click();
		}
	}

	public void select_operating_expenses_currency_code(String string) {
		waitForExpectedElement(operating_expenses_currency_code).click();
		for (WebElement element : operating_expenses_currency_code_select) {
			if (element.getText().trim().equals(string)) {
				element.click();
			}
		}
	}

	public void enter_operating_expenses_from_as_and_operating_expenses_to(String from, String to) {
		waitForExpectedElement(operating_expenses_from).sendKeys(from);
		waitForExpectedElement(operating_expenses_to).sendKeys(to);
	}

	public void select_operating_expenses_monetary_unit(String string) {
		selectbyVisibleText(operating_expenses_monetary_unit, string);
	}

	public void enter_outlook_info(String string) {
		waitForExpectedElement(outlook_info).sendKeys(string);
	}

	public void enter_share_value_currency(String string) {
		waitForExpectedElement(share_value_currency).sendKeys(string);
	}

	public void select_recent_earnings_release() {
		int retry = 0;
		while(waitForExpectedElement(earnings_release_caution_msg).isDisplayed() & retry == 10) {
			sleep(500);
			retry++;
		}
		if(waitForExpectedElement(recent_earnings_release).getText().trim().equalsIgnoreCase("Select One")) {
			waitForExpectedElement(recent_earnings_release).click();
			waitForExpectedElement(recent_earnings_release_select).click();	
		}
	}

	public void select_revised_earnings_release_date(String string) {
		if (!string.isEmpty()) {
			waitForExpectedElement(revised_earnings_release_date).click();
			datepickerDateSelect(string);
		}
	}
	
	public void enter_revised_earnings_release_time_HH(String hours) {
		waitForExpectedElement(revised_earnings_release_time_HH).sendKeys(hours);
	}

	public void enter_revised_earnings_release_time_MM(String mins) {
		waitForExpectedElement(revised_earnings_release_time_MM).sendKeys(mins);

	}

	public void enter_revised_earnings_release_time_am_pm(String am_or_pm) {
		if (am_or_pm.equalsIgnoreCase("PM")) {
			waitForExpectedElement(revised_earnings_release_time_am_pm).click();
		}
	}
	
	public void click_on_white_space() {
	  new Actions(WebDriverHelper.getDriver()).moveByOffset(100,100).click().build().perform();
	}
	
	public void verify_invalid_event_date_error_message(String string) {
		isErrorMessage(event_date_error_message,"#e06666",string);
	}
	
	public void verify_invalid_period_end_date_error_message(String string) {
		isErrorMessage(period_end_date_error_message,"#e06666",string);
	}
		
	private void isErrorMessage(WebElement element, String textColor,String errorText) {
		SoftAssert sa = new SoftAssert();
		try {
			sa.assertTrue(waitForExpectedElement(element).isDisplayed());
			sa.assertEquals(waitForExpectedElement(element).getCssValue("color"),textColor);
			sa.assertEquals(waitForExpectedElement(element).getText(),errorText);
			
		} catch (Exception e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
	public void upload_document() {
		waitForExpectedElement(upload_file).click();
		sleep(2000);
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\dummy.pdf";
		try {
			fileUpload(path);
			waitForExpectedElement(upload_file).getAttribute("title").equalsIgnoreCase(findText(path));
		} catch (AWTException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	private void fileUpload (String path) throws AWTException {
		StringSelection strSelection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);
		Robot robot = new Robot();
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public String findText(final String string) {
		Pattern pattern = Pattern.compile("(?<=\\\\?)\\w*.pdf");
		Matcher matcher = pattern.matcher(string);
		String text = null;
		if (matcher.find()) {
			text = matcher.group();

		}
		return text;
	}
}
