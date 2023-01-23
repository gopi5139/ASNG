package audio.ui.steps.commonPool;

import audio.ui.pages.commonPool.CommonPoolPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CommonPoolSteps {
	CommonPoolPage common_pool_page = new CommonPoolPage();
	@And ("^I Select Common Pool Search Filter Type Is (.+) And Search Keyword Is (.+)$")
	public void select_search_filter_key(String searchFilterKey,String searchFilterValue) {
		common_pool_page.select_search_filter_key(searchFilterKey);
		common_pool_page.enter_search_filter_value(searchFilterKey, searchFilterValue);
	}
	@Then ("^I Verify Search Results In Common Pool (.+),(.+)$")
	public void verify_common_pool_jobs_based_on_filters(String searchFilterKey,String searchFilterValue) {
		common_pool_page.verify_searchResults_in_jobsStatusTable(searchFilterKey,searchFilterValue);
	}
	@And ("^I Click Pick Job (.+),(.+),(.+),(.+)$")
	public void click_pick_job(String companyName,String eventDate,String eventTime,String timeZone) {
		common_pool_page.click_pick_job(companyName,eventDate,eventTime,timeZone);
	}
	@And ("I Click Common Pool Apply Filter")
	public void click_apply_filter() {
		common_pool_page.click_apply_filter();
	}
	@And ("I Click Common Pool Clear Filter")
	public void click_clear_filter() {
		common_pool_page.click_clear_filter();
	}
	@And ("^I Verify Picked Job In Common Pool (.+),(.+),(.+),(.+)$")
	public void verify_picked_job_is_not_displayed(String companyName,String eventDate,String eventTime,String timeZone) {
		common_pool_page.verify_picked_job_is_not_displayed(companyName,eventDate,eventTime,timeZone);
	}
	@And ("^I Verify Job Details In Common Pool (.+),(.+),(.+),(.+),\"(.*)\",(.+),(.+)$")
	public void verify_job_details(String companyName,String eventDate,String eventTime,String ticker,String livePasscodeUs,String jobType,String timeZone) {
		common_pool_page.verify_job_details_in_table(companyName, eventDate, eventTime, ticker, livePasscodeUs,jobType,timeZone);
	}
	@And ("^I Verify Event Details In Common Pool (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
	public void verify_event_details(String companyName,String eventDate,String eventTime,String eventTitle,String eventType,String eventAddedDate,String eventAddedTime,String productType,String timeZone) {
		common_pool_page.verify_event_details(companyName, eventDate, eventTime, eventTitle, eventType, eventAddedDate, eventAddedTime, productType,timeZone);
	}
	@And ("^I Verify Live Details In Common Pool (.+),(.+),(.+),\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",(.+)$")
	public void verify_live_details(String companyName,String eventDate,String eventTime,String liveWebcast,String liveWebcastPasscode,String livePhoneUs,String livePasscodeUs,String livePhoneInternational,String livePasscodeInternational,String registrationPhone,String registrationPasscode,String timeZone) {
		common_pool_page.verify_live_details(companyName, eventDate, eventTime, liveWebcast, liveWebcastPasscode, livePhoneUs, livePasscodeUs,livePhoneInternational,livePasscodeInternational,registrationPhone,registrationPasscode,timeZone);
	}
	@And ("^I Verify Replay Details In Common Pool (.+),(.+),(.+),\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",(.+)$")
	public void verify_replay_details(String companyName,String eventDate,String eventTime,String replayWebcast,String replayWebcastPasscode,String replayPhoneUs,String replayPasscodeUs,String replayPhoneInternational,String replayPasscodeInternational,String timeZone) {
		common_pool_page.verify_replay_details(companyName, eventDate, eventTime, replayWebcast, replayWebcastPasscode, replayPhoneUs, replayPasscodeUs,replayPhoneInternational,replayPasscodeInternational,timeZone);
	}
}
