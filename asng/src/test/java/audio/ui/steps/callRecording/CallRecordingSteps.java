package audio.ui.steps.callRecording;


import audio.ui.pages.callRecording.CallRecordingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CallRecordingSteps {
	CallRecordingPage call_recording_page = new CallRecordingPage();
	@And ("^I Click Edit In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_edit(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.clickEdit(companyName, eventDate, eventTime, timeZone);
	}
	@Then ("^I Verify Search Results In Call Recording (.+),(.+),(.+),(.+),(.+)$")
	public void verify_search_results_in_call_recording(String callStatus,String fromDate,String toDate,String searchFilterKey,String searchFilterValue) {
		call_recording_page.verify_searchResults_in_jobsStatusTable(callStatus, fromDate, toDate, searchFilterKey, searchFilterValue);
	}
	@And ("^I Select Call Status In Call Recording (.+)$")
	public void select_call_status(String callStatus) {
		call_recording_page.select_call_status(callStatus);
	}
	
	@And ("^I Select From Date In Call Recording (.+)$")
	public void select_from_date(String fromDate) {
		call_recording_page.select_from_date(fromDate);
	}
	
	@And ("^I Select To Date In Call Recording (.+)$")
	public void select_to_date(String toDate) {
		call_recording_page.select_to_date(toDate);
	}
	@And ("I Click Call Recording Apply Filter")
	public void click_apply_filter() {
		call_recording_page.click_apply_filter();
	}
	@And ("I Click Call Recording Clear Filter")
	public void click_clear_filter() {
		call_recording_page.click_clear_filter();
	}
	@And ("^I Select Call Recording Search Filter Type Is (.+) And Search Keyword Is (.+)$")
	public void select_search_filter_key(String searchFilterKey,String searchFilterValue) {
		call_recording_page.select_search_filter_key(searchFilterKey);
		call_recording_page.enter_search_filter_value(searchFilterKey, searchFilterValue);
	}
	@And ("^I Click Webcast Link In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_webcast_link(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_webcast_link(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Enable Preload Browser In Call Recording (.+),(.+),(.+),(.+)$")
	public void enable_preload_browser(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.enable_preload_browser(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Select Webcast Link To Capture In Call Recording (.+)$")
	public void select_webcastLink_toCapture(String jobType) {
		call_recording_page.select_webcastLink_toCapture(jobType);
	}
	@And ("I Click Try To Auto Capture CheckBox In Call Recording")
	public void click_try_to_auto_capture_checkbox() {
		call_recording_page.click_try_to_auto_capture_checkbox();
	}
	@And ("I Click Launch Browser In VNC In Call Recording")
	public void click_launch_browser_in_vnc() {
		call_recording_page.click_launch_browser_in_vnc();
	}
	@And ("I Close Webcast Popup In Call Recording")
	public void close_webcast_popup() {
		call_recording_page.close_webcast_popup();
	}
	@And ("^I Click Start Recording In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_start_recording(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_recording(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Click Stop Recording In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_stop_recording(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_recording(eventDate,eventTime,companyName,timeZone);
	}
	@Then ("I Verify Recording Started Toaster Message In Call Recording")
	public void check_recording_started_toaster_message() {
		call_recording_page.check_recording_started_toaster_message();
	}
	@Then ("I Verify Recording Stopped Toaster Message In Call Recording")
	public void check_recording_stopped_toaster_message() {
		call_recording_page.check_recording_stopped_toaster_message();
	}
	@And ("^I Click Refresh Data In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_refresh_data(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_refresh_data(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Click Close Job In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_close_job(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_close_job(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Verify Audio Player In Call Recording (.+),(.+),(.+),(.+)$")
	public void check_audio_player(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.check_audio_player(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Click Container URL New Tab In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_container_url_new_tab(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_container_url_new_tab(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Click Container URL Copy In Call Recording (.+),(.+),(.+),(.+)$")
	public void click_container_url_copy(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.click_container_url_copy(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Verify Closed Job In Call Recording (.+),(.+),(.+),(.+)$")
	public void verify_closed_job_is_not_displayed(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.verify_closed_job_is_not_displayed(eventDate,eventTime,companyName,timeZone);
	}
	@And ("^I Verify Job Details In Call Recording (.+),(.+),(.+),(.+),\"(.*)\",(.+),(.+)$")
	public void verify_job_details(String companyName,String eventDate,String eventTime,String ticker,String livePasscodeUs,String jobType,String timeZone) {
		call_recording_page.verify_job_details_in_table(companyName, eventDate, eventTime, ticker, livePasscodeUs,jobType,timeZone);
	}
	@And ("^I Verify Event Details In Call Recording (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
	public void verify_event_details(String companyName,String eventDate,String eventTime,String eventTitle,String eventType,String eventAddedDate,String eventAddedTime,String productType,String timeZone) {
		call_recording_page.verify_event_details(companyName, eventDate, eventTime, eventTitle, eventType, eventAddedDate, eventAddedTime, productType,timeZone);
	}
	@And ("^I Verify Live Details In Call Recording (.+),(.+),(.+),\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",(.+)$")
	public void verify_live_details(String companyName,String eventDate,String eventTime,String liveWebcast,String liveWebcastPasscode,String livePhoneUs,String livePasscodeUs,String livePhoneInternational,String livePasscodeInternational,String registrationPhone,String registrationPasscode,String timeZone) {
		call_recording_page.verify_live_details(companyName, eventDate, eventTime, liveWebcast, liveWebcastPasscode, livePhoneUs, livePasscodeUs,livePhoneInternational,livePasscodeInternational,registrationPhone,registrationPasscode,timeZone);
	}
	@And ("^I Verify Replay Details In Call Recording (.+),(.+),(.+),\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",(.+)$")
	public void verify_replay_details(String companyName,String eventDate,String eventTime,String replayWebcast,String replayWebcastPasscode,String replayPhoneUs,String replayPasscodeUs,String replayPhoneInternational,String replayPasscodeInternational,String timeZone) {
		call_recording_page.verify_replay_details(companyName, eventDate, eventTime, replayWebcast, replayWebcastPasscode, replayPhoneUs, replayPasscodeUs,replayPhoneInternational,replayPasscodeInternational,timeZone);
	}
	@And ("^I Enter Webcast Link In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_webcast_link(String eventDate,String eventTime,String companyName,String timeZone,String webcastLink) {
		call_recording_page.enterWebcastLink(companyName, eventDate, eventTime, timeZone, webcastLink);
	}
	@And ("^I Enter Password In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_password(String eventDate,String eventTime,String companyName,String timeZone,String password) {
		call_recording_page.enterPassword(companyName, eventDate, eventTime, timeZone, password);
	}
	@And ("^I Enter Meeting ID In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_meeting_id(String eventDate,String eventTime,String companyName,String timeZone,String meetingId) {
		call_recording_page.enterMeetingId(companyName, eventDate, eventTime, timeZone, meetingId);
	}
	@And ("^I Enter Control Number In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_control_number(String eventDate,String eventTime,String companyName,String timeZone,String controlNumber) {
		call_recording_page.enterControlNumber(companyName, eventDate, eventTime, timeZone, controlNumber);
	}
	@And ("^I Enter Live Phone Us In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_live_phone_us(String eventDate,String eventTime,String companyName,String timeZone,String livePhoneUs) {
		call_recording_page.enterLivePhoneUs(companyName, eventDate, eventTime, timeZone, livePhoneUs);
	}
	@And ("^I Enter Live Passcode Us In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_live_passcode_us(String eventDate,String eventTime,String companyName,String timeZone,String livePasscodeUs) {
		call_recording_page.enterLivePasscodeUs(companyName, eventDate, eventTime, timeZone, livePasscodeUs);
	}
	@And ("^I Enter Live Phone International In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_live_phone_international(String eventDate,String eventTime,String companyName,String timeZone,String livePhoneUs) {
		call_recording_page.enterLivePhoneInternational(companyName, eventDate, eventTime, timeZone, livePhoneUs);
	}
	@And ("^I Enter Live International Us In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_live_passcode_international(String eventDate,String eventTime,String companyName,String timeZone,String livePasscodeInternational) {
		call_recording_page.enterLivePasscodeInternational(companyName, eventDate, eventTime, timeZone, livePasscodeInternational);
	}
	@And ("^I Enter Registration Phone In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_registration_phone(String eventDate,String eventTime,String companyName,String timeZone,String registrationPhone) {
		call_recording_page.enterRegistrationPhone(companyName, eventDate, eventTime, timeZone, registrationPhone);
	}
	@And ("^I Enter Registration Passcode In Call Recording Edit Popup (.+),(.+),(.+),(.+),\"(.*)\"$")
	public void enter_registration_passcode(String eventDate,String eventTime,String companyName,String timeZone,String registrationPasscode) {
		call_recording_page.enterRegistrationPasscode(companyName, eventDate, eventTime, timeZone, registrationPasscode);
	}
	@And ("^I Click Save In Call Recording Edit Popup (.+),(.+),(.+),(.+)$")
	public void click_save_button(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.clickSaveButton(companyName, eventDate, eventTime, timeZone);
	}
	@And ("^I Click Cancel In Call Recording Edit Popup (.+),(.+),(.+),(.+)$")
	public void click_cancel_button(String eventDate,String eventTime,String companyName,String timeZone) {
		call_recording_page.clickCancelButton(companyName, eventDate, eventTime, timeZone);
	}
}
