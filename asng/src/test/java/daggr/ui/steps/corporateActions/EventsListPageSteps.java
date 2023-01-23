package daggr.ui.steps.corporateActions;

import daggr.ui.pages.HomePage;
import daggr.ui.pages.corporateActions.EventsListPage;
import io.cucumber.java.en.Then;
import utils.PageObjectUtils;

public class EventsListPageSteps extends PageObjectUtils {
	private EventsListPage eventListPage;
	private HomePage homePage;

	public EventsListPageSteps(EventsListPage eventListPage, HomePage homePage) {
		this.homePage = homePage;
		this.eventListPage = eventListPage;
	}

	@Then("Search By Event Type {string}")
	public synchronized void search_by_event_type(String string) {
		eventListPage.search_by_event_type(string);
	}

	@Then("Navigate To Event List Page")
	public void navigate_to_event_list_page() {
		homePage.is_navigate_edit_events();
	}

	@Then("I Click Event Popup {string},{string},{string},{string},{string}")
	public void click_event_table_by_title_and_event_date(String string, String string2,String string3,String string4,String string5) {
		eventListPage.click_event_popup(string, string2,string3,string4,string5);
	}

	@Then("Click Event Table by {string} and {string}")
	public void click_event_table_by_and(String string, String string2,String string3,String string4,String string5) {
		eventListPage.click_event_popup(string, string2,string3,string4,string5);
	}
	
	@Then("Click Event Table by title : {string} and release date : {string}")
	public void click_event_table_by_title_and_release_date(String string, String string2,String string3,String string4,String string5) {
		eventListPage.click_event_popup(string, string2,string3,string4,string5);
	}

	@Then("I verify Company Name as {string}")
	public void i_verify_company_name_as(String string) {
		eventListPage.check_company_name(string);
	}

	@Then("I verify Event Type as {string}")
	public void i_verify_event_type_as(String string) {
		eventListPage.check_event_type(string);
	}

	@Then("I verify Announcement Date as {string}")
	public void i_verify_announcement_date_as(String string) {
		eventListPage.check_announcement_date(string);
	}

	@Then("I verify status as {string}")
	public void i_verify_status_as(String string) {
		eventListPage.select_status(string);
	}

	@Then("I verify agenda as {string}")
	public void i_verify_agenda_as(String string) {
		eventListPage.select_agenda(string);
	}

	@Then("I verify event date as {string}")
	public void i_verify_event_date_as(String string) {
		eventListPage.select_event_date(string);
	}

	@Then("I verify release date as {string}")
	public void i_verify_release_date_as(String string) {
		eventListPage.select_release_date(string);
	}

	@Then("I verify time provided as {string}")
	public void i_verify_time_provided_as(String string) {

	}

	@Then("I verify event time as {string}")
	public void i_verify_event_time_as(String string) {
		eventListPage.enterEventTime(string);
	}

	@Then("I verify time zone as {string}")
	public void i_verify_time_zone_as(String string) {
		eventListPage.enter_time_zone(string);
	}

	@Then("I verify financial quarter {string}")
	public void i_verify_financial_quarter(String quarter) {
		eventListPage.select_financial_quarter(quarter);
	}

	@Then("I verify financial year as {string}")
	public void i_verify_financial_year_as(String year) {
		eventListPage.select_financial_year(year);
	}
	
	@Then("I verify calendar year {string}")
	public void i_verify_calendar_year(String year) {
		eventListPage.select_calendar_year(year);
	}

	@Then("I verify period end date as {string}")
	public void i_verify_period_end_date_as(String string) {
		eventListPage.select_period_end_date(string);
	}

	@Then("I verify title as {string}")
	public void i_verify_title_as(String string) {
		eventListPage.enter_the_title(string);
	}

	@Then("I verify live phone-us as {string}")
	public void i_verify_live_phone_us_as(String string) {
		eventListPage.enter_live_phone_us(string);
	}

	@Then("I verify live passcode-us as {string}")
	public void i_verify_live_passcode_us_as(String string) {
		eventListPage.enter_live_passcode_us(string);
	}

	@Then("I verify live phone international as {string}")
	public void i_verify_live_phone_international_as(String string) {
		eventListPage.enter_live_phone_international(string);
	}

	@Then("I verify live passcode international as {string}")
	public void i_verify_live_passcode_international_as(String string) {
		eventListPage.enter_live_passcode_international(string);
	}

	@Then("I verify replay phone-us as {string}")
	public void i_verify_replay_phone_us_as(String string) {
		eventListPage.enter_replay_phone_us(string);
	}

	@Then("I verify replay passcode-us as {string}")
	public void i_verify_replay_passcode_us_as(String string) {
		eventListPage.enter_replay_passcode_us(string);
	}

	@Then("I verify replay phone international as {string}")
	public void i_verify_replay_phone_international_as(String string) {
		eventListPage.enter_replay_phone_international(string);
	}

	@Then("I verify replay passcode international as {string}")
	public void i_verify_replay_passcode_international_as(String string) {
		eventListPage.enter_replay_passcode_international(string);
	}

	@Then("I verify registration phone as {string}")
	public void i_verify_registration_phone_as(String string) {
		eventListPage.enter_registration_phone(string);
	}

	@Then("I verify registration passcode as {string}")
	public void i_verify_registration_passcode_as(String string) {
		eventListPage.enter_registration_passcode(string);
	}

	@Then("I verify live webcast url as {string}")
	public void i_verify_live_webcast_url_as(String string) {
		eventListPage.enter_live_webcast_url(string);
	}

	@Then("I verify replay webcast url as {string}")
	public void i_verify_replay_webcast_url_as(String string) {
		eventListPage.enter_replay_webcast_url(string);
	}

	@Then("I verify event description {string}")
	public void i_verify_event_description(String string) {
		eventListPage.enter_event_description(string);
	}

	@Then("I verify replay beginning date as {string}")
	public void i_verify_replay_beginning_date_as(String string) {

	}

	@Then("I verify replay end date as {string}")
	public void i_verify_replay_end_date_as(String string) {

	}

	@Then("I verify event link {string}")
	public void i_verify_event_link(String string) {
		eventListPage.enter_event_link(string);
	}

	@Then("I verify registration link {string}")
	public void i_verify_registration_link(String string) {
		eventListPage.enter_registration_link(string);
	}

	@Then("I verify schedule link {string}")
	public void i_verify_schedule_link(String string) {
		eventListPage.enter_schedule_link(string);
	}

	@Then("I verify comments as {string}")
	public void i_verify_comments_as(String string) {
		eventListPage.enter_comments(string);
	}

	@Then("I verify release time as {string}")
	public void i_verify_release_time_as(String string) {
		eventListPage.enter_release_time(timeConversion(string));
	}

	@Then("I verify release_segment as {string}")
	public void i_verify_release_segment_as(String string) {
		eventListPage.enter_release_segment(string);
	}

	@Then("I verify projected release date as {string}")
	public void i_verify_projected_release_date_as(String string) {
		eventListPage.select_projected_release_date(string);
	}

	@Then("I verify projected release time as {string}")
	public void i_verify_projected_release_time_as(String string) {
		eventListPage.enter_projected_release_time(timeConversion(string));
	}

	@Then("Click Event Table by earnings date status : {string} and release date : {string}")
	public void click_event_table_by_earnings_date_status_and_release_date(String string, String string2,String string3,String string4,String string5) {
		eventListPage.click_event_popup(string, string2,string3,string4,string5);
	}

	@Then("I verify earnings date status as {string}")
	public void i_verify_earnings_date_status_as(String string) {
		eventListPage.select_earnings_date_status(string);
	}

	@Then("I verify seminar name as {string}")
	public void i_verify_seminar_name_as(String string) {
		eventListPage.verify_seminar_name(string);
	}

	@Then("I verify forum name as {string}")
	public void i_verify_forum_name_as(String string) {
		eventListPage.verify_forum_name(string);
	}

	@Then("I verify summit meeting name as {string}")
	public void i_verify_summit_meeting_name_as(String string) {
		eventListPage.verify_summit_name(string);
	}

	@Then("I verify work shop name as {string}")
	public void i_verify_work_shop_name_as(String string) {
		eventListPage.verify_work_shop_name(string);
	}

	@Then("I verify trade show name as {string}")
	public void i_verify_trade_show_name_as(String string) {
		eventListPage.verify_trade_show_name(string);
	}

	@Then("I verify event organizer as {string}")
	public void i_verify_event_organizer_as(String string) {
		eventListPage.enter_event_organizer(string);
	}

	@Then("I verify event start date as {string}")
	public void i_verify_event_start_date_as(String string) {
		eventListPage.enter_event_start_date(string);
	}

	@Then("I verify event end date as {string}")
	public void i_verify_event_end_date_as(String string) {
		eventListPage.enter_event_end_date(string);
	}

	@Then("I verify event start time as {string}")
	public void i_verify_event_start_time_as(String string) {
		eventListPage.enter_event_start_time(timeConversion(string));
	}

	@Then("I verify event end time as {string}")
	public void i_verify_event_end_time_as(String string) {
		eventListPage.enter_event_end_time(timeConversion(string));
	}

	@Then("I verify start date as {string}")
	public void i_verify_start_date_as(String string) {
		eventListPage.enter_start_date(string);
	}

	@Then("I verify end date as {string}")
	public void i_verify_end_date_as(String string) {
		eventListPage.enter_end_date(string);
	}

	@Then("I verify start time as {string}")
	public void i_verify_start_time_as(String string) {
		eventListPage.enter_start_time(timeConversion(string));
	}

	@Then("I verify end time as {string}")
	public void i_verify_end_time_as(String string) {
		eventListPage.enter_end_time(timeConversion(string));
	}

	@Then("I verify registration deadline as {string}")
	public void i_verify_registration_deadline_as(String string) {
		eventListPage.enter_registration_deadline(string);
	}

	@Then("I verify venue as {string}")
	public void i_verify_venue_as(String string) {
		eventListPage.enter_venue(string);
	}

	@Then("I verify address as {string}")
	public void i_verify_address_as(String string) {
		eventListPage.enter_address(string);
	}

	@Then("I verify country as {string}")
	public void i_verify_country_as(String string) {
		eventListPage.enter_country(string);
	}

	@Then("I verify state as {string}")
	public void i_verify_state_as(String string) {
		eventListPage.enter_state(string);
	}

	@Then("I verify city as {string}")
	public void i_verify_city_as(String string) {
		eventListPage.enter_city(string);
	}

	@Then("I verify event link as {string}")
	public void i_verify_event_link_as(String string) {
		eventListPage.enter_event_link(string);
	}

	@Then("I verify registration link as {string}")
	public void i_verify_registration_link_as(String string) {
		eventListPage.enter_registration_link(string);
	}

	@Then("I verify schedule link as {string}")
	public void i_verify_schedule_link_as(String string) {
		eventListPage.enter_schedule_link(string);
	}

	@Then("I verify seminar passcode as {string}")
	public void i_verify_seminar_passcode_as(String string) {
		eventListPage.enter_seminar_passcode(string);
	}

	@Then("I verify contact person name as {string}")
	public void i_verify_contact_person_name_as(String string) {
		eventListPage.enter_contact_person_name(string);
	}

	@Then("I verify designation as {string}")
	public void i_verify_designation_as(String string) {
		eventListPage.enter_designation(string);
	}

	@Then("I verify phone number as {string}")
	public void i_verify_phone_number_as(String string) {
		eventListPage.enter_phone_number(string);
	}

	@Then("I verify email as {string}")
	public void i_verify_email_as(String string) {
		eventListPage.enter_email(string);
	}

	@Then("I verify change status as {string}")
	public void i_verify_change_status_as(String string) {
		eventListPage.select_change_status(string);
	}

	@Then("I verify index as {string}")
	public void i_verify_index_as(String string) {
		eventListPage.select_index(string);
	}

	@Then("I verify effective date as {string}")
	public void i_verify_effective_date_as(String string) {
		eventListPage.enter_effective_date(string);
	}

	@Then("I verify company name added as {string}")
	public void i_verify_company_name_added_as(String string) {
		eventListPage.enter_company_name_added(string);
	}

	@Then("I verify company name removed as {string}")
	public void i_verify_company_name_removed_as(String string) {
		eventListPage.enter_company_name_removed(string);
	}

	@Then("I verify record type as {string}")
	public void i_verify_record_type_as(String string) {
		eventListPage.verify_record_type(string);
	}

	@Then("I verify buyback status as {string}")
	public void i_verify_buyback_status_as(String string) {
		eventListPage.verify_buyback_status(string);
	}

	@Then("I verify buyback method as {string}")
	public void i_verify_buyback_method_as(String string) {
		eventListPage.verify_buyback_method(string);
	}

	@Then("I verify modification announcement date as {string}")
	public void i_verify_modification_announcement_date_as(String string) {
		eventListPage.verify_modification_announcement_date(string);
	}

	@Then("I verify approval date as {string}")
	public void i_verify_approval_date_as(String string) {
		eventListPage.verify_approval_date(string);
	}

	@Then("I verify no of authorized shares as {string}")
	public void i_verify_no_of_authorized_shares_as(String string) {
		eventListPage.verify_no_of_authorized_shares(string);
	}

	@Then("I verify authorized share value as {string}")
	public void i_verify_authorized_share_value_as(String string) {
		eventListPage.verify_authorized_share_value(string);
	}

	@Then("I verify share value currency as {string}")
	public void i_verify_share_value_currency_as(String string) {
		eventListPage.verify_share_value_currency(string);
	}
	
	@Then("I verify buyback end date as {string}")
	public void i_verify_buyback_end_date_as(String string) {
		eventListPage.verify_buyback_end_date(string);
	}

	@Then("I verify low end price range as {string}")
	public void i_verify_low_end_price_range_as(String string) {
		eventListPage.verify_low_end_price_range(string);
	}

	@Then("I verify high end price range as {string}")
	public void i_verify_high_end_price_range_as(String string) {
		eventListPage.verify_high_end_price_range(string);
	}

	@Then("I verify purchase price as {string}")
	public void i_verify_purchase_price_as(String string) {
		eventListPage.verify_purchase_price(string);
	}

	@Then("I verify tender expiration date as {string}")
	public void i_verify_tender_expiration_date_as(String string) {
		eventListPage.verify_tender_expiration_date(string);
	}

	@Then("I verify tender expiration time as {string}")
	public void i_verify_tender_expiration_time_as(String string) {
		eventListPage.verify_tender_expiration_time(timeConversion(string));
	}

	@Then("I verify meeting type as {string}")
	public void i_verify_meeting_type_as(String string) {
		eventListPage.verify_meeting_type(string);
	}

	@Then("I verify meeting description as {string}")
	public void i_verify_meeting_description_as(String string) {
		eventListPage.verify_meeting_description(string);
	}

	@Then("I verify record date as {string}")
	public void i_verify_record_date_as(String string) {
		eventListPage.verify_record_date(string);
	}

	@Then("I verify virtual shareholder meeting as {string}")
	public void i_verify_virtual_shareholder_meeting_as(String string) {
		eventListPage.verify_virtual_shareholder_meeting(string);
	}

	@Then("I verify distance between head quarters and venue as {string}")
	public void i_verify_distance_between_head_quarters_and_venue_as(String string) {
		eventListPage.verify_distance_between_head_quarters_and_venue(string);
	}

	@Then("I verify spin-off company name as {string}")
	public void i_verify_spin_off_company_name_as(String string) {
		eventListPage.verify_spin_off_company_name(string);
	}

	@Then("I verify transaction status as {string}")
	public void i_verify_transaction_status_as(String string) {
		eventListPage.verify_transaction_status(string);
	}

	@Then("I verify parent company shares cutoff as {string}")
	public void i_verify_parent_company_shares_cutoff_as(String string) {
		eventListPage.verify_parent_company_shares_cutoff(string);
	}

	@Then("I verify spin off company shares received as {string}")
	public void i_verify_spin_off_company_shares_received_as(String string) {
		eventListPage.verify_spin_off_company_shares_received(string);
	}

	@Then("I verify taxable as {string}")
	public void i_verify_taxable_as(String string) {
		eventListPage.verify_taxable(string);
	}

	@Then("I verify fractional payment type as {string}")
	public void i_verify_fractional_payment_type_as(String string) {
		eventListPage.verify_fractional_payment_type(string);
	}

	@Then("I verify estimated market cap as {string}")
	public void i_verify_estimated_market_cap_as(String string) {
		eventListPage.verify_estimated_market_cap(string);
	}

	@Then("I verify distribution date as {string}")
	public void i_verify_distribution_date_as(String string) {
		eventListPage.verify_distribution_date(string);
	}

	@Then("I verify trade date as {string}")
	public void i_verify_trade_date_as(String string) {
		eventListPage.verify_trade_date(string);
	}

	@Then("I verify parent company trading when issued from date as {string}")
	public void i_verify_parent_company_trading_when_issued_from_date_as(String string) {
		eventListPage.verify_parent_company_trading_when_issued_from_date(string);
	}

	@Then("I verify parent company trading when issued to date as {string}")
	public void i_verify_parent_company_trading_when_issued_to_date_as(String string) {
		eventListPage.verify_parent_company_trading_when_issued_to_date(string);
	}

	@Then("I verify spin off company trading when issued from date as {string}")
	public void i_verify_spin_off_company_trading_when_issued_from_date_as(String string) {
		eventListPage.verify_spin_off_company_trading_when_issued_from_date(string);
	}

	@Then("I verify spin off company trading when issued to date as {string}")
	public void i_verify_spin_off_company_trading_when_issued_to_date_as(String string) {
		eventListPage.verify_spin_off_company_trading_when_issued_to_date(string);
	}

	@Then("I verify stock split type as {string}")
	public void i_verify_stock_split_type_as(String string) {
		eventListPage.verify_stock_split_type(string);
	}

	@Then("I verify split ratio as {string}")
	public void i_verify_split_ratio_as(String string) {
		eventListPage.verify_split_ratio(string);
	}

	@Then("I verify revised stock trading date as {string}")
	public void i_verify_revised_stock_trading_date_as(String string) {
		eventListPage.verify_revised_stock_trading_date(string);
	}

	@Then("I verify split effective date as {string}")
	public void i_verify_split_effective_date_as(String string) {
		eventListPage.verify_split_effective_date(string);
	}

	@Then("I verify dividend amount as {string}")
	public void i_verify_dividend_amount_as(String string) {
		eventListPage.verify_dividend_amount(string);
	}

	@Then("I verify currency as {string}")
	public void i_verify_currency_as(String string) {
		eventListPage.verify_currency(string);
	}

	@Then("I verify frequency as {string}")
	public void i_verify_frequency_as(String string) {
		eventListPage.verify_frequency(string);
	}

	@Then("I verify ex dividend date as {string}")
	public void i_verify_ex_dividend_date_as(String string) {
		eventListPage.verify_ex_dividend_date(string);
	}

	@Then("I verify pay date as {string}")
	public void i_verify_pay_date_as(String string) {
		eventListPage.verify_pay_date(string);
	}

	@Then("I verify dividend trend as {string}")
	public void i_verify_dividend_trend_as(String string) {
		eventListPage.verify_dividend_trend(string);
	}

	@Then("I verify dividend status as {string}")
	public void i_verify_dividend_status_as(String string) {
		eventListPage.verify_dividend_status(string);
	}

	@Then("I verify suspended\\/resumed date as {string}")
	public void i_verify_suspended_resumed_date_as(String string) {
		eventListPage.verify_suspended_or_resumed_date(string);
	}

	@Then("I verify lawsuit category as {string}")
	public void i_verify_lawsuit_category_as(String string) {
		eventListPage.verify_lawsuit_category(string);
	}

	@Then("I verify lawsuit stage as {string}")
	public void i_verify_lawsuit_stage_as(String string) {
		eventListPage.verify_lawsuit_stage(string);
	}

	@Then("I verify lawsuit link as {string}")
	public void i_verify_lawsuit_link_as(String string) {
		eventListPage.verify_lawsuit_link(string);
	}

	@Then("I verify lawsuit description as {string}")
	public void i_verify_lawsuit_description_as(String string) {
		eventListPage.verify_lawsuit_description(string);
	}

	@Then("I verify plaintiff name as {string}")
	public void i_verify_plaintiff_name_as(String string) {
		eventListPage.verify_plaintiff_name(string);
	}

	@Then("I verify plaintiff email as {string}")
	public void i_verify_plaintiff_email_as(String string) {
		eventListPage.verify_plaintiff_email(string);
	}

	@Then("I verify plaintiff address as {string}")
	public void i_verify_plaintiff_address_as(String string) {
		eventListPage.verify_plaintiff_address(string);
	}

	@Then("I verify plaintiff phone number as {string}")
	public void i_verify_plaintiff_phone_number_as(String string) {
		eventListPage.verify_plaintiff_phone_number(string);
	}

	@Then("I verify lawfirm name as {string}")
	public void i_verify_lawfirm_name_as(String string) {
		eventListPage.verify_lawfirm_name(string);
	}

	@Then("I verify lawfirm url as {string}")
	public void i_verify_lawfirm_url_as(String string) {
		eventListPage.verify_lawfirm_url(string);
	}

	@Then("I verify class action start date as {string}")
	public void i_verify_class_action_start_date_as(String string) {
		eventListPage.verify_class_action_start_date(string);
	}

	@Then("I verify class action end date as {string}")
	public void i_verify_class_action_end_date_as(String string) {
		eventListPage.verify_class_action_end_date(string);
	}

	@Then("I verify motion deadline as {string}")
	public void i_verify_motion_deadline_as(String string) {
		eventListPage.verify_motion_dead_line(string);
	}
	
	@Then("I verify filling date as {string}")
	public void i_verify_filling_date_as(String string) {
		eventListPage.verify_filling_date(string);
	}

	@Then("I verify offering date as {string}")
	public void i_verify_offering_date_as(String string) {
		eventListPage.verify_offering_date(string);
	}

	@Then("I verify share price as {string}")
	public void i_verify_share_price_as(String string) {
		eventListPage.verify_share_price(string);
	}

	@Then("I verify share offered as {string}")
	public void i_verify_share_offered_as(String string) {
		eventListPage.verify_share_offered(string);
	}

	@Then("I verify offer amount as {string}")
	public void i_verify_offer_amount_as(String string) {
		eventListPage.verify_offer_amount(string);
	}

	@Then("I verify low end share price as {string}")
	public void i_verify_low_end_share_price_as(String string) {
		eventListPage.verify_low_end_share_price(string);
	}

	@Then("I verify high end share price as {string}")
	public void i_verify_high_end_share_price_as(String string) {
		eventListPage.verify_high_end_share_price(string);
	}

	@Then("I verify lead managers as {string}")
	public void i_verify_lead_managers_as(String string) {
		eventListPage.verify_lead_managers(string);
	}

	@Then("I verify quiet period as {string}")
	public void i_verify_quiet_period_as(String string) {
		eventListPage.verify_quiet_period(string);
	}

	@Then("I verify lockup period as {string}")
	public void i_verify_lockup_period_as(String string) {
		eventListPage.verify_lockup_period(string);
	}
	
	@Then("I verify offering status as {string}")
	public void i_verify_offering_status_as(String string) {
		eventListPage.verify_offering_status(string);
	}

	@Then("I verify selling shareholder as {string}")
	public void i_verify_selling_shareholder_as(String string) {
		eventListPage.verify_selling_shareholder(string);
	}

	@Then("I verify number of shares for sale as {string}")
	public void i_verify_number_of_shares_for_sale_as(String string) {
		eventListPage.verify_number_of_shares_for_sale(string);
	}

	@Then("I verify closing date as {string}")
	public void i_verify_closing_date_as(String string) {
		eventListPage.verify_closing_date(string);
	}

	@Then("I verify proceeds received by company as {string}")
	public void i_verify_proceeds_received_by_company_as(String string) {
		eventListPage.verify_proceeds_received_by_company(string);
	}

	@Then("I verify under writing manager as {string}")
	public void i_verify_under_writing_manager_as(String string) {
		eventListPage.verify_under_writing_manager(string);
	}

	@Then("I verify prospectus link as {string}")
	public void i_verify_prospectus_link_as(String string) {
		eventListPage.verify_prospectus_link(string);
	}

	@Then("I verify preliminary guidance as {string}")
	public void i_verify_preliminary_guidance_as(String string) {
		eventListPage.verify_preliminary_guidance(string);
	}

	@Then("I verify guidance period as {string}")
	public void i_verify_guidance_period_as(String string) {
		eventListPage.verify_guidance_period(string);
	}

	@Then("I verify guidance quarter as {string}")
	public void i_verify_guidance_quarter_as(String string) {
		eventListPage.verify_guidance_quarter(string);
	}

	@Then("I verify guidance financial year as {string}")
	public void i_verify_guidance_financial_year_as(String string) {
		eventListPage.verify_guidance_financial_year(string);
	}

	@Then("I verify revenue range as {string}")
	public void i_verify_revenue_range_as(String string) {
		eventListPage.verify_revenue_range(string);
	}

	@Then("I verify revenue acct standard as {string}")
	public void i_verify_revenue_acct_standard_as(String string) {
		eventListPage.verify_revenue_acct_standard(string);
	}

	@Then("I verify revenue currency code as {string}")
	public void i_verify_revenue_currency_code_as(String string) {
		eventListPage.verify_revenue_currency_code(string);
	}

	@Then("I verify revenue from as {string} and revenue  to as {string}")
	public void i_verify_revenue_from_as_and_revenue_to_as(String string, String string2) {
		eventListPage.verify_revenue_from_as_and_revenue_to(string,string2);	
	}

	@Then("I verify revenue monetary unit as {string}")
	public void i_verify_revenue_monetary_unit_as(String string) {
		eventListPage.verify_revenue_monetary_unit(string);
	}
	
	@Then("I verify eps range as {string}")
	public void i_verify_eps_range_as(String string) {
		eventListPage.verify_eps_range(string);
	}

	@Then("I verify eps acct standard as {string}")
	public void i_verify_eps_acct_standard_as(String string) {
		eventListPage.verify_eps_acct_standard(string);
	}

	@Then("I verify eps currency code as {string}")
	public void i_verify_eps_currency_code_as(String string) {
		eventListPage.verify_eps_currency_code(string);
	}

	@Then("I verify eps from as {string} and eps to as {string}")
	public void i_verify_eps_from_as_and_eps_to_as(String string, String string2) {
		eventListPage.verify_eps_from_as_and_eps_to(string, string2);;
	}

	@Then("I verify ebitda range as {string}")
	public void i_verify_ebitda_range_as(String string) {
		eventListPage.verify_ebitda_range(string);
	}

	@Then("I verify ebitda acct standard as {string}")
	public void i_verify_ebitda_acct_standard_as(String string) {
		eventListPage.verify_ebitda_acct_standard(string);
	}

	@Then("I verify ebitda currency code as {string}")
	public void i_verify_ebitda_currency_code_as(String string) {
		eventListPage.verify_ebitda_currency_code(string);
	}

	@Then("I verify ebitda from as {string} and ebitda to as {string}")
	public void i_verify_ebitda_from_as_and_ebitda_to_as(String string, String string2) {
		eventListPage.verify_ebitda_from_as_and_ebitda_to(string,string2);
	}

	@Then("I verify ebitda monetary unit as {string}")
	public void i_verify_ebitda_monetary_unit_as(String string) {
		eventListPage.verify_ebitda_monetary_unit(string);
	}

	@Then("I verify capital expenditure as {string}")
	public void i_verify_capital_expenditure_as(String string) {
		eventListPage.verify_capital_expenditure(string);
	}

	@Then("I verify capital expenditure currency code as {string}")
	public void i_verify_capital_expenditure_currency_code_as(String string) {
		eventListPage.verify_capital_expenditure_currency_code(string);
	}

	@Then("I verify capital expenditure from as {string} and capital expenditure to as {string}")
	public void i_verify_capital_expenditure_from_as_and_capital_expenditure_to_as(String string, String string2) {
		eventListPage.verify_capital_expenditure_from_as_and_capital_expenditure_to(string, string2);;
	}

	@Then("I verify capital expenditure monetary unit as {string}")
	public void i_verify_capital_expenditure_monetary_unit_as(String string) {
		eventListPage.verify_capital_expenditure_monetary_unit(string);
	}

	@Then("I verify operating expenses as {string}")
	public void i_verify_operating_expenses_as(String string) {
		eventListPage.verify_operating_expenses(string);
	}

	@Then("I verify operating expenses currency code as {string}")
	public void i_verify_operating_expenses_currency_code_as(String string) {
		eventListPage.verify_operating_expenses_currency_code(string);
	}

	@Then("I verify operating expenses from as {string} and operating expenses to as {string}")
	public void i_verify_operating_expenses_from_as_and_operating_expenses_to_as(String string, String string2) {
		eventListPage.verify_operating_expenses_from_as_and_operating_expenses_to(string, string2);;
	}

	@Then("I verify operating expenses monetary unit as {string}")
	public void i_verify_operating_expenses_monetary_unit_as(String string) {
		eventListPage.verify_operating_expenses_monetary_unit(string);
	}

	@Then("I verify outlook info as {string}")
	public void i_verify_outlook_info_as(String string) {
		eventListPage.verify_outlook_info(string);
	}
	
	@Then("I verify revised earnings_release_date as {string}")
	public void i_verify_revised_earnings_release_date_as(String string) {
	    eventListPage.verify_revised_earnings_release_date(string);
	}

	@Then("I verify revised earnings_release_time as {string}")
	public void i_verify_revised_earnings_release_time_as(String string) {
	   eventListPage.verify_revised_earnings_release_time(timeConversion(string));
	}

}
