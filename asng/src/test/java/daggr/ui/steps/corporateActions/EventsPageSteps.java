package daggr.ui.steps.corporateActions;

import org.openqa.selenium.ElementClickInterceptedException;

import daggr.ui.pages.HomePage;
import daggr.ui.pages.LoginPage;
import daggr.ui.pages.corporateActions.EventsPage;
import framework.WebDriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventsPageSteps {

	private LoginPage loginPage;
	private HomePage homePage;
	private EventsPage eventsPage;

	public EventsPageSteps(LoginPage loginPage, HomePage homePage, EventsPage eventsPage) {
		this.loginPage = loginPage;
		this.homePage = homePage;
		this.eventsPage = eventsPage;
	}
	
	@Then("Select Corporate Actions")
	public void select_corporate_actions() throws Throwable {
		eventsPage.is_corporate_actions_selected();
		Thread.sleep(5000);
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		loginPage.enterUsername(string);
		loginPage.enterPassword(string2);
	}

	@When("I click Daggr Signin button")
	public void i_click_login_button() {
		loginPage.clickSignin();
	}

	@When("I navigate to File > Manual Job")
	public void i_navigate_to_file_manual_job() {
		homePage.is_navigate_file_manual_job();
	}

	@Then("I verify the form default as {string}")
	public void i_verify_the_form_default_as(String string) {
		eventsPage.is_corporate_actions_selected();
	}

	@When("I select article_link as {string}")
	public void i_select_article_link_as(String string) {
		eventsPage.enter_article_link(string);
	}

	@When("I select Article Relevancy as {string}")
	public void i_select_article_relevancy_as(String string) {
		eventsPage.select_article_relevancy_radiobtn(string);

	}
	
	@When("I select Upload Document as {string}")
	public void i_select_upload_document_as(String string) {
		if (string.equalsIgnoreCase("Yes")) {
			eventsPage.upload_document();
		}
	}

	@When("I enter Company Name as {string}")
	public void i_enter_company_name_as(String string) {
		eventsPage.enter_company_name(string);

	}

	@When("I select Event Type as {string}")
	public void i_select_event_type_as(String string) {
		eventsPage.enter_event_type(string);

	}

	@When("I select Announcement Date as {string}")
	public void i_select_announcement_date_as(String string) {
		eventsPage.select_announcement_date(string);
	}

	@When("I enter agenda as {string}")
	public void i_enter_agenda_as(String string) {
		eventsPage.enter_agenda(string);
	}

	@When("I select status as {string}")
	public void i_select_status_as(String string) {
		eventsPage.select_status(string);

	}

	@When("I select event date as {string}")
	public void i_select_event_date_as(String string) {
		eventsPage.select_event_date(string);
	}
	
	@Then("I verify invalid event date error message")
	public void i_verify_invalid_event_date_error_message() {
		eventsPage.verify_invalid_event_date_error_message("event_date should be greater than or equal to announcement_date");
	}

	@When("I select release date as {string}")
	public void i_select_release_date_as(String string) {
		eventsPage.select_release_date(string);
	}

	@When("I select time provided as {string}")
	public void i_select_time_provided_as(String string) {
		if (string.equalsIgnoreCase("No")) {
			eventsPage.select_time_provided();
		}
	}

	@When("I select event time as {string} time provided as {string}")
	public void i_select_event_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enterEventTimeHH(string.split(":")[0]);
			eventsPage.enterEventTimeMM(string.split(":")[1]);
			eventsPage.clickAmPm(string.split(":")[2]);
		}

	}

	@When("I select release time as {string} time provided as {string}")
	public void i_select_release_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enterEventTimeHH(string.split(":")[0]);
			eventsPage.enterEventTimeMM(string.split(":")[1]);
			eventsPage.clickAmPm(string.split(":")[2]);
		}

	}

	@When("I select time zone as {string} time provided as {string}")
	public void i_select_time_zone_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_time_zone(string);
		}

	}

	@When("I select financial quarter {string}")
	public void i_select_financial_quarter(String quarter) {
		try {
			eventsPage.select_financial_quarter(quarter);
		} catch (ElementClickInterceptedException e) {
			eventsPage.skip_edit_popup();
			eventsPage.select_financial_quarter(quarter);
		}
	}
	
	@When("I select time period as {string}")
	public void i_select_time_period_as(String period) {
		try {
			eventsPage.select_time_period(period);
		} catch (ElementClickInterceptedException e) {
			eventsPage.skip_edit_popup();
			eventsPage.select_time_period(period);
		}
	}

	@When("I select financial year as {string}")
	public void i_select_financial_year_as(String string) {
		try {
			eventsPage.select_financial_year(string);
		} catch (ElementClickInterceptedException e) {
			eventsPage.skip_edit_popup();
			eventsPage.select_financial_year(string);
		}
	}
	
	@When("I select calendar year {string}")
	public void i_select_calendar_year(String string) {
		try {
			eventsPage.select_Calendar_year(string);
		} catch (ElementClickInterceptedException e) {
			eventsPage.skip_edit_popup();
			eventsPage.select_Calendar_year(string);
		}
	}

	@When("I select period end date as {string}")
	public void i_select_period_end_date_as(String string) {
		eventsPage.select_period_end_date(string);
	}
	
	@Then("I verify invalid period end date error message")
	public void i_verify_invalid_period_end_date_error_message() {
		eventsPage.verify_invalid_period_end_date_error_message("period_end_date should be less than announcement_date");
	}

	@When("I enter title as {string}")
	public void i_enter_title_as(String string) {
		eventsPage.enter_the_title(string);
	}

	@When("I enter live phone-us as {string}")
	public void i_enter_live_phone_us_as(String string) {
		eventsPage.enter_live_phone_us(string);
	}

	@When("I enter live passcode-us as {string}")
	public void i_enter_live_passcode_us_as(String string) {
		eventsPage.enter_live_passcode_us(string);
	}

	@When("I enter live phone international as {string}")
	public void i_enter_live_phone_international_as(String string) {
		eventsPage.enter_live_phone_international(string);
	}

	@When("I enter live passcode international as {string}")
	public void i_enter_live_passcode_international_as(String string) {
		eventsPage.enter_live_passcode_international(string);
	}

	@When("I enter replay phone-us as {string}")
	public void i_enter_replay_phone_us_as(String string) {
		eventsPage.enter_replay_phone_us(string);
	}

	@When("I enter replay passcode-us as {string}")
	public void i_enter_replay_passcode_us_as(String string) {
		eventsPage.enter_replay_passcode_us(string);
	}

	@When("I enter replay phone international as {string}")
	public void i_enter_replay_phone_international_as(String string) {
		eventsPage.enter_replay_phone_international(string);
	}

	@When("I enter replay passcode international as {string}")
	public void i_enter_replay_passcode_international_as(String string) {
		eventsPage.enter_replay_passcode_international(string);
	}

	@When("I enter registration phone as {string}")
	public void i_enter_registration_phone_as(String string) {
		eventsPage.enter_registration_phone(string);
	}

	@When("I enter registration passcode as {string}")
	public void i_enter_registration_passcode_as(String string) {
		eventsPage.enter_registration_passcode(string);

	}

	@When("I enter live webcast url as {string}")
	public void i_enter_live_webcast_url_as(String string) {
		eventsPage.enter_live_webcast_url(string);
	}

	@When("I enter replay webcast url as {string}")
	public void i_enter_replay_webcast_url_as(String string) {
		eventsPage.enter_replay_webcast_url(string);
	}

	@When("I enter event description {string}")
	public void i_enter_event_description(String string) {
		eventsPage.enter_event_description(string);
	}

	@When("I enter event link {string}")
	public void i_enter_event_link(String string) {
		eventsPage.enter_event_link(string);
	}

	@When("I enter registration link {string}")
	public void i_enter_registration_link(String string) {
		eventsPage.enter_registration_link(string);
	}

	@When("I enter schedule link {string}")
	public void i_enter_schedule_link(String string) {
		eventsPage.enter_schedule_link(string);
	}

	@When("I enter replay beginning date as {string}")
	public void i_enter_replay_beginning_date_as(String string) {
		eventsPage.select_replay_beginning_date(string);
	}

	@When("I enter replay end date as {string}")
	public void i_enter_replay_end_date_as(String string) {
		eventsPage.select_replay_end_date(string);
	}

	@When("I enter comments as {string}")
	public void i_enter_comments_as(String string) {
		eventsPage.enter_comments(string);
	}

	@When("I click submit")
	public void i_click_submit() {
		eventsPage.click_submit_button();
	}

	@Then("I verify event created successfully {string} {string}")
	public void i_verify_event_created_successfully(String string, String string2) {
		eventsPage.check_event_success_popup_text(string);
		eventsPage.check_event_success_popup_text(string2);
	}

	@When("I click pick a new job {string}")
	public void i_click_pick_a_new_job(String string) {
		eventsPage.click_pick_new_job(string);
	}

	@Then("I verify current page {string} and {string}")
	public void i_verify_current_page_and(String string, String string2) {
		WebDriverHelper.getDriver().getTitle().equals(string);
		WebDriverHelper.getDriver().getCurrentUrl().equals(string2);
	}

	@When("I select release_segment as {string}")
	public void i_select_release_segment_as(String string) {
		eventsPage.select_release_segment(string);
	}

	@When("I select projected release date as {string}")
	public void i_select_projected_release_date_as(String string) {
		eventsPage.select_projected_release_date(string);
	}

	@When("I select projected release time as {string} time provided as {string}")
	public void i_select_projected_release_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enterEventTimeHH(string.split(":")[0]);
			eventsPage.enterEventTimeMM(string.split(":")[1]);
			eventsPage.clickAmPm(string.split(":")[2]);
		}
	}

	@When("I enter earnings date status as {string}")
	public void i_enter_earnings_date_status_as(String string) {
		eventsPage.select_earnings_date_status(string);
	}

	@When("I enter seminar name as {string}")
	public void i_enter_seminar_name_as(String string) {
		eventsPage.enter_seminar_name(string);
	}

	@When("I enter forum name as {string}")
	public void i_enter_forum_name_as(String string) {
		eventsPage.enter_forum_name(string);
	}

	@When("I enter summit meeting name as {string}")
	public void i_enter_summit_meeting_name_as(String string) {
		eventsPage.enter_summit_name(string);
	}

	@When("I enter work shop name as {string}")
	public void i_enter_work_shop_name_as(String string) {
		eventsPage.enter_work_shop_name(string);
	}

	@When("I enter trade show name as {string}")
	public void i_enter_trade_show_name_as(String string) {
		eventsPage.enter_trade_show_name(string);
	}

	@When("I enter event organizer as {string}")
	public void i_enter_event_organizer_as(String string) {
		eventsPage.enter_event_organizer(string);
	}

	@When("I select event start date as {string}")
	public void i_select_event_start_date_as(String string) {
		eventsPage.select_event_start_date(string);
	}

	@When("I select event end date as {string}")
	public void i_select_event_end_date_as(String string) {
		eventsPage.select_event_end_date(string);
	}

	@When("I select start date as {string}")
	public void i_select_start_date_as(String string) {
		eventsPage.select_start_date(string);
	}

	@When("I select end date as {string}")
	public void i_select_end_date_as(String string) {
		eventsPage.select_end_date(string);
	}

	@When("I select start time as {string} time provided as {string}")
	public void i_select_start_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_start_time_HH(string.split(":")[0]);
			eventsPage.enter_start_time_MM(string.split(":")[1]);
			eventsPage.click_start_time_am_pm(string.split(":")[2]);
		}
	}

	@When("I select end time as {string} time provided as {string}")
	public void i_select_end_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_end_time_HH(string.split(":")[0]);
			eventsPage.enter_end_time_MM(string.split(":")[1]);
			eventsPage.click_end_time_am_pm(string.split(":")[2]);
		}
	}

	@When("I select event start time as {string} time provided as {string}")
	public void i_select_event_start_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_event_start_time_HH(string.split(":")[0]);
			eventsPage.enter_event_start_time_MM(string.split(":")[1]);
			eventsPage.click_event_start_time_am_pm(string.split(":")[2]);
		}
	}

	@When("I select event end time as {string} time provided as {string}")
	public void i_select_event_end_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_event_end_time_HH(string.split(":")[0]);
			eventsPage.enter_event_end_time_MM(string.split(":")[1]);
			eventsPage.click_event_end_time_am_pm(string.split(":")[2]);
		}
	}

	@When("I select registration deadline as {string}")
	public void i_select_registration_deadline_as(String string) {
		eventsPage.enter_registration_deadline(string);
	}

	@When("I enter venue as {string}")
	public void i_enter_venue_as(String string) {
		eventsPage.enter_venue(string);
	}

	@When("I enter address as {string}")
	public void i_enter_address_as(String string) {
		eventsPage.enter_address(string);
	}

	@When("I select country as {string}")
	public void i_select_country_as(String string) {
		eventsPage.enter_country(string);
	}

	@When("I select state as {string}")
	public void i_select_state_as(String string) {
		eventsPage.enter_state(string);
	}

	@When("I select city as {string}")
	public void i_select_city_as(String string) {
		eventsPage.enter_city(string);
	}

	@When("I enter event link as {string}")
	public void i_enter_event_link_as(String string) {
		eventsPage.enter_event_link(string);
	}

	@When("I enter registration link as {string}")
	public void i_enter_registration_link_as(String string) {
		eventsPage.enter_registration_link(string);
	}

	@When("I enter schedule link as {string}")
	public void i_enter_schedule_link_as(String string) {
		eventsPage.enter_schedule_link(string);
	}

	@When("I enter seminar passcode as {string}")
	public void i_enter_seminar_passcode_as(String string) {
		eventsPage.enter_seminar_passcode(string);
	}

	@When("I enter contact person name as {string}")
	public void i_enter_contact_person_name_as(String string) {
		eventsPage.enter_contact_person_name(string);
	}

	@When("I enter designation as {string}")
	public void i_enter_designation_as(String string) {
		eventsPage.enter_designation(string);
	}

	@When("I enter phone number as {string}")
	public void i_enter_phone_number_as(String string) {
		eventsPage.enter_phone_number(string);
	}

	@When("I enter email as {string}")
	public void i_enter_email_as(String string) {
		eventsPage.enter_email(string);
	}

	@When("I select change status as {string}")
	public void i_select_change_status_as(String string) {
		eventsPage.select_change_status(string);
	}

	@When("I select index as {string}")
	public void i_select_index_as(String string) {
		eventsPage.select_index(string);
	}

	@When("I select effective date as {string}")
	public void i_select_effective_date_as(String string) {
		eventsPage.select_effective_date(string);
	}

	@When("I enter company name added as {string}")
	public void i_enter_company_name_added_as(String string) {
		eventsPage.enter_company_name_added(string);
	}

	@When("I enter company name removed as {string}")
	public void i_enter_company_name_removed_as(String string) {
		eventsPage.enter_company_name_removed(string);
	}

	@When("I select record type as {string}")
	public void i_select_record_type_as(String string) {
		eventsPage.select_record_type(string);
	}

	@When("I select buyback status as {string}")
	public void i_select_buyback_status_as(String string) {
		eventsPage.select_buyback_status(string);
	}

	@When("I select buyback method as {string}")
	public void i_select_buyback_method_as(String string) {
		eventsPage.select_buyback_method(string);
	}

	@When("I select modification announcement date as {string}")
	public void i_select_modification_announcement_date_as(String string) {
		eventsPage.select_modification_announcement_date(string);
	}

	@When("I select approval date as {string}")
	public void i_select_approval_date_as(String string) {
		eventsPage.select_approval_date(string);
	}

	@When("I enter no of authorized shares as {string}")
	public void i_enter_no_of_authorized_shares_as(String string) {
		eventsPage.enter_no_of_authorized_shares(string);
	}

	@When("I enter authorized share value as {string}")
	public void i_enter_authorized_share_value_as(String string) {
		eventsPage.enter_authorized_share_value(string);
	}

	@When("I enter share value currency as {string}")
	public void i_enter_share_value_currency_as(String string) {
		eventsPage.enter_share_value_currency(string);
	}

	@When("I select buyback end date as {string}")
	public void i_select_buyback_end_date_as(String string) {
		eventsPage.select_buyback_end_date(string);
	}

	@When("I enter low end price range as {string}")
	public void i_enter_low_end_price_range_as(String string) {
		eventsPage.enter_low_end_price_range(string);
	}

	@When("I enter high end price range as {string}")
	public void i_enter_high_end_price_range_as(String string) {
		eventsPage.enter_high_end_price_range(string);
	}

	@When("I enter purchase price as {string}")
	public void i_enter_purchase_price_as(String string) {
		eventsPage.enter_purchase_price(string);
	}

	@When("I select tender expiration date as {string}")
	public void i_select_tender_expiration_date_as(String string) {
		eventsPage.select_tender_expiration_date(string);
	}

	@When("I select tender expiration time as {string} time provided as {string}")
	public void i_select_tender_expiration_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_tender_expiration_time_HH(string.split(":")[0]);
			eventsPage.enter_tender_expiration_time_MM(string.split(":")[1]);
			eventsPage.click_tender_expiration_time_am_pm(string.split(":")[2]);
		}
	}

	@When("I select meeting type as {string}")
	public void i_select_meeting_type_as(String string) {
		eventsPage.select_meeting_type(string);
	}

	@When("I enter meeting description as {string}")
	public void i_enter_meeting_description_as(String string) {
		eventsPage.enter_meeting_description(string);
	}

	@When("I select record date as {string}")
	public void i_select_record_date_as(String string) {
		eventsPage.select_record_date(string);
	}

	@When("I enter virtual shareholder meeting as {string}")
	public void i_enter_virtual_shareholder_meeting_as(String string) {
		eventsPage.enter_virtual_shareholder_meeting(string);
	}

	@When("I enter distance between head quarters and venue as {string}")
	public void i_enter_distance_between_head_quarters_and_venue_as(String string) {
		eventsPage.enter_distance_between_head_quarters_and_venue(string);
	}

	@When("I enter spin-off company name as {string}")
	public void i_enter_spin_off_company_name_as(String string) {
		eventsPage.enter_spin_off_company_name(string);
	}

	@When("I select transaction status as {string}")
	public void i_select_transaction_status_as(String string) {
		eventsPage.select_transaction_status(string);
	}

	@When("I enter parent company shares cutoff as {string}")
	public void i_enter_parent_company_shares_cutoff_as(String string) {
		eventsPage.enter_parent_company_shares_cutoff(string);
	}

	@When("I enter spin off company shares received as {string}")
	public void i_enter_spin_off_company_shares_received_as(String string) {
		eventsPage.enter_spin_off_company_shares_received(string);
	}

	@When("I select taxable as {string}")
	public void i_select_taxable_as(String string) {
		eventsPage.select_taxable(string);
	}

	@When("I select fractional payment type as {string}")
	public void i_select_fractional_payment_type_as(String string) {
		eventsPage.select_fractional_payment_type(string);
	}

	@When("I enter estimated market cap as {string}")
	public void i_enter_estimated_market_cap_as(String string) {
		eventsPage.enter_estimated_market_cap(string);
	}

	@When("I select distribution date as {string}")
	public void i_select_distribution_date_as(String string) {
		eventsPage.select_distribution_date(string);
	}

	@When("I select trade date as {string}")
	public void i_select_trade_date_as(String string) {
		eventsPage.select_trade_date(string);
	}

	@When("I select parent company trading when issued from date as {string}")
	public void i_select_parent_company_trading_when_issued_from_date_as(String string) {
		eventsPage.select_parent_company_trading_when_issued_from_date(string);
	}

	@When("I select parent company trading when issued to date as {string}")
	public void i_select_parent_company_trading_when_issued_to_date_as(String string) {
		eventsPage.select_parent_company_trading_when_issued_to_date(string);
	}

	@When("I select spin off company trading when issued from date as {string}")
	public void i_select_spin_off_company_trading_when_issued_from_date_as(String string) {
		eventsPage.select_spin_off_company_trading_when_issued_from_date(string);
	}

	@When("I select spin off company trading when issued to date as {string}")
	public void i_select_spin_off_company_trading_when_issued_to_date_as(String string) {
		eventsPage.select_spin_off_company_trading_when_issued_to_date(string);
	}

	@When("I select stock split type as {string}")
	public void i_select_stock_split_type_as(String string) {
		eventsPage.select_stock_split_type(string);
	}

	@When("I enter split ratio as {string}")
	public void i_enter_split_ratio_as(String string) {
		eventsPage.enter_split_ratio(string);
	}

	@When("I select revised stock trading date as {string}")
	public void i_select_revised_stock_trading_date_as(String string) {
		eventsPage.select_revised_stock_trading_date(string);
	}

	@When("I select split effective date as {string}")
	public void i_select_split_effective_date_as(String string) {
		eventsPage.select_split_effective_date(string);
	}

	@When("I enter dividend amount as {string}")
	public void i_enter_dividend_amount_as(String string) {
		eventsPage.enter_dividend_amount(string);
	}

	@When("I select currency as {string}")
	public void i_select_currency_as(String string) {
		eventsPage.select_currency(string);
	}

	@When("I select frequency as {string}")
	public void i_select_frequency_as(String string) {
		eventsPage.select_frequency(string);
	}

	@When("I select ex dividend date as {string}")
	public void i_select_ex_dividend_date_as(String string) {
		eventsPage.select_ex_dividend_date(string);
	}

	@When("I select pay date as {string}")
	public void i_select_pay_date_as(String string) {
		eventsPage.select_pay_date(string);
	}

	@When("I select dividend trend as {string}")
	public void i_select_dividend_trend_as(String string) {
		eventsPage.select_dividend_trend(string);
	}

	@When("I select dividend status as {string}")
	public void i_select_dividend_status_as(String string) {
		eventsPage.select_dividend_status(string);
	}

	@When("I select suspended\\/resumed date as {string}")
	public void i_select_suspended_resumed_date_as(String string) {
		eventsPage.select_suspended_resumed_date(string);
	}

	@When("I select lawsuit category as {string}")
	public void i_select_lawsuit_category_as(String string) {
		eventsPage.select_lawsuit_category(string);
	}

	@When("I select lawsuit stage as {string}")
	public void i_select_lawsuit_stage_as(String string) {
		eventsPage.select_lawsuit_stage(string);
	}

	@When("I enter lawsuit link as {string}")
	public void i_enter_lawsuit_link_as(String string) {
		eventsPage.enter_lawsuit_link(string);
	}

	@When("I enter lawsuit description as {string}")
	public void i_enter_lawsuit_description_as(String string) {
		eventsPage.enter_lawsuit_description(string);
	}

	@When("I enter plaintiff name as {string}")
	public void i_enter_plaintiff_name_as(String string) {
		eventsPage.enter_plaintiff_name(string);
	}

	@When("I enter plaintiff email as {string}")
	public void i_enter_plaintiff_email_as(String string) {
		eventsPage.enter_plaintiff_email(string);
	}

	@When("I enter plaintiff address as {string}")
	public void i_enter_plaintiff_address_as(String string) {
		eventsPage.enter_plaintiff_address(string);
	}

	@When("I enter plaintiff phone number as {string}")
	public void i_enter_plaintiff_phone_number_as(String string) {
		eventsPage.enter_plaintiff_phone_number(string);
	}

	@When("I enter lawfirm name as {string}")
	public void i_enter_lawfirm_name_as(String string) {
		eventsPage.enter_lawfirm_name(string);
	}

	@When("I enter lawfirm url as {string}")
	public void i_enter_lawfirm_url_as(String string) {
		eventsPage.enter_lawfirm_url(string);
	}

	@When("I select class action start date as {string}")
	public void i_select_class_action_start_date_as(String string) {
		eventsPage.select_class_action_start_date(string);
	}

	@When("I select class action end date as {string}")
	public void i_select_class_action_end_date_as(String string) {
		eventsPage.select_class_action_end_date(string);
	}

	@When("I select motion deadline as {string}")
	public void i_select_motion_deadline_as(String string) {
		eventsPage.select_motion_dead_line(string);
	}

	@When("I select filling date as {string}")
	public void i_select_filling_date_as(String string) {
		eventsPage.select_filling_date(string);
	}

	@When("I select offering date as {string}")
	public void i_select_offering_date_as(String string) {
		eventsPage.select_offering_date(string);
	}

	@When("I enter share price as {string}")
	public void i_enter_share_price_as(String string) {
		eventsPage.enter_share_price(string);
	}

	@When("I enter share offered as {string}")
	public void i_enter_share_offered_as(String string) {
		eventsPage.enter_share_offered(string);
	}

	@When("I enter offer amount as {string}")
	public void i_enter_offer_amount_as(String string) {
		eventsPage.enter_offer_amount(string);
	}

	@When("I enter low end share price as {string}")
	public void i_enter_low_end_share_price_as(String string) {
		eventsPage.enter_low_end_share_price(string);
	}

	@When("I enter high end share price as {string}")
	public void i_enter_high_end_share_price_as(String string) {
		eventsPage.enter_high_end_share_price(string);
	}

	@When("I enter lead managers as {string}")
	public void i_enter_lead_managers_as(String string) {
		eventsPage.enter_lead_managers(string);
	}

	@When("I select quiet period as {string}")
	public void i_select_quiet_period_as(String string) {
		eventsPage.select_quiet_period(string);
	}

	@When("I select lockup period as {string}")
	public void i_select_lockup_period_as(String string) {
		eventsPage.select_lockup_period(string);
	}

	@When("I select offering status as {string}")
	public void i_select_offering_status_as(String string) {
		eventsPage.select_offering_status(string);
	}

	@When("I select selling shareholder as {string}")
	public void i_select_selling_shareholder_as(String string) {
		eventsPage.select_selling_shareholder(string);
	}

	@When("I enter number of shares for sale as {string}")
	public void i_enter_number_of_shares_for_sale_as(String string) {
		eventsPage.enter_number_of_shares_for_sale(string);
	}

	@When("I select closing date as {string}")
	public void i_select_closing_date_as(String string) {
		eventsPage.select_closing_date(string);
	}

	@When("I enter proceeds received by company as {string}")
	public void i_enter_proceeds_received_by_company_as(String string) {
		eventsPage.enter_proceeds_received_by_company(string);
	}

	@When("I enter under writing manager as {string}")
	public void i_enter_under_writing_manager_as(String string) {
		eventsPage.enter_under_writing_manager(string);
	}

	@When("I enter prospectus link as {string}")
	public void i_enter_prospectus_link_as(String string) {
		eventsPage.enter_prospectus_link(string);
	}

	@When("I select preliminary guidance as {string}")
	public void i_select_preliminary_guidance_as(String string) {
		eventsPage.select_preliminary_guidance(string);
	}

	@When("I select guidance period as {string}")
	public void i_select_guidance_period_as(String string) {
		eventsPage.select_guidance_period(string);
	}

	@When("I select guidance quarter as {string}")
	public void i_select_guidance_quarter_as(String string) {
		eventsPage.select_guidance_quarter(string);
	}

	@When("I select guidance financial year as {string}")
	public void i_select_guidance_financial_year_as(String string) {
		eventsPage.select_guidance_financial_year(string);
	}

	@When("I select revenue range as {string}")
	public void i_select_revenue_range_as(String string) {
		eventsPage.select_revenue_range(string);
	}

	@When("I select revenue acct standard as {string} and revenue range as {string}")
	public void i_select_revenue_acct_standard_as_and_revenue_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_revenue_acct_standard(string);
		}
	}

	@When("I select revenue currency code as {string} and revenue range as {string}")
	public void i_select_revenue_currency_code_as_and_revenue_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_revenue_currency_code(string);
		}
	}

	@When("I enter revenue from as {string} and revenue  to as {string} and revenue range as {string}")
	public void i_enter_revenue_from_as_and_revenue_to_as_and_revenue_range_as(String string, String string2,
			String string3) {
		if (string3.equalsIgnoreCase("Yes")) {
			eventsPage.enter_revenue_from_as_and_revenue_to(string, string2);
		}
	}

	@When("I select revenue monetary unit as {string} and ebitda range as {string}")
	public void i_select_revenue_monetary_unit_as_and_ebitda_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_revenue_monetary_unit(string);
		}
	}

	@When("I select eps range as {string}")
	public void i_select_eps_range_as(String string) {
		eventsPage.select_eps_range(string);
	}

	@When("I select eps acct standard as {string} and eps range as {string}")
	public void i_select_eps_acct_standard_as_and_eps_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_eps_acct_standard(string);
		}
	}

	@When("I select eps currency code as {string} and eps range as {string}")
	public void i_select_eps_currency_code_as_and_eps_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_eps_currency_code(string);
		}
	}

	@When("I enter eps from as {string} and eps to as {string} and eps range as {string}")
	public void i_enter_eps_from_as_and_eps_to_as_and_eps_range_as(String string, String string2, String string3) {
		if (string3.equalsIgnoreCase("Yes")) {
			eventsPage.enter_eps_from_as_and_eps_to(string, string2);
		}
	}

	@When("I select ebitda range as {string}")
	public void i_select_ebitda_range_as(String string) {
		eventsPage.select_ebitda_range(string);
	}

	@When("I select ebitda acct standard as {string} and ebitda range as {string}")
	public void i_select_ebitda_acct_standard_as_and_ebitda_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_ebitda_acct_standard(string);
		}
	}

	@When("I select ebitda currency code as {string} and ebitda range as {string}")
	public void i_select_ebitda_currency_code_as_and_ebitda_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_ebitda_currency_code(string);
		}
	}

	@When("I enter ebitda from as {string} and ebitda to as {string} and ebitda range as {string}")
	public void i_enter_ebitda_from_as_and_ebitda_to_as_and_ebitda_range_as(String string, String string2,
			String string3) {
		if (string3.equalsIgnoreCase("Yes")) {
			eventsPage.enter_ebitda_from_as_and_ebitda_to(string, string2);
		}
	}

	@When("I select ebitda monetary unit as {string} and ebitda range as {string}")
	public void i_select_ebitda_monetary_unit_as_and_ebitda_range_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_ebitda_monetary_unit(string);
		}
	}

	@When("I select capital expenditure as {string}")
	public void i_select_capital_expenditure_as(String string) {
		eventsPage.select_capital_expenditure(string);
	}

	@When("I select capital expenditure currency code as {string} and capital expenditure as {string}")
	public void i_select_capital_expenditure_currency_code_as_and_capital_expenditure_as(String string,
			String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_capital_expenditure_currency_code(string);
		}
	}

	@When("I enter capital expenditure from as {string} and capital expenditure to as {string} and capital expenditure as {string}")
	public void i_enter_capital_expenditure_from_as_and_capital_expenditure_to_as_and_capital_expenditure_as(
			String string, String string2, String string3) {
		if (string3.equalsIgnoreCase("Yes")) {
			eventsPage.enter_capital_expenditure_from_as_and_capital_expenditure_to(string, string2);
		}
	}

	@When("I select capital expenditure monetary unit as {string} and capital expenditure as {string}")
	public void i_select_capital_expenditure_monetary_unit_as_and_capital_expenditure_as(String string,
			String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_capital_expenditure_monetary_unit(string);
		}
	}

	@When("I select operating expenses as {string}")
	public void i_select_operating_expenses_as(String string) {
		eventsPage.select_operating_expenses(string);
	}

	@When("I select operating expenses currency code as {string} and operating expenses as {string}")
	public void i_select_operating_expenses_currency_code_as_and_operating_expenses_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_operating_expenses_currency_code(string);
		}
	}

	@When("I enter operating expenses from as {string} and operating expenses to as {string} and operating expenses as {string}")
	public void i_enter_operating_expenses_from_as_and_operating_expenses_to_as_and_operating_expenses_as(String string,
			String string2, String string3) {
		if (string3.equalsIgnoreCase("Yes")) {
			eventsPage.enter_operating_expenses_from_as_and_operating_expenses_to(string, string2);
		}
	}

	@When("I select operating expenses monetary unit as {string} and operating expenses as {string}")
	public void i_select_operating_expenses_monetary_unit_as_and_operating_expenses_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.select_operating_expenses_monetary_unit(string);
		}
	}

	@When("I enter outlook info as {string}")
	public void i_enter_outlook_info_as(String string) {
		eventsPage.enter_outlook_info(string);
	}
	
	@When("I select recent earnings release")
	public void i_select_recent_earnings_release() {
	    eventsPage.select_recent_earnings_release();
	}

	@When("I select revised earnings_release_date as {string}")
	public void i_select_revised_earnings_release_date_as(String string) {
	  eventsPage.select_revised_earnings_release_date(string);
	}

	@When("I select revised earnings_release_time as {string} time provided as {string}")
	public void i_select_revised_earnings_release_time_as_time_provided_as(String string, String string2) {
		if (string2.equalsIgnoreCase("Yes")) {
			eventsPage.enter_revised_earnings_release_time_HH(string.split(":")[0]);
			eventsPage.enter_revised_earnings_release_time_MM(string.split(":")[1]);
			eventsPage.enter_revised_earnings_release_time_am_pm(string.split(":")[2]);
		}
	}
	
	@When("I click on white space")
	public void i_click_on_white_space() {
		eventsPage.click_on_white_space();
	}
	
	@When("I select new announcement date as {string}")
	public void i_select_new_announcement_date_as(String string) {
		eventsPage.select_new_announcement_date(string);
	}

	@When("I select new release_segment as {string}")
	public void i_select_new_release_segment_as(String string) {
		eventsPage.select_new_release_segment(string);
	}
}
