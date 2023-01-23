package audio.ui.steps.jobStatus;

import audio.ui.pages.jobStatus.JobStatusPage;
import io.cucumber.java.en.And;

public class JobStatusSteps {
	JobStatusPage job_status_page = new JobStatusPage();

	@And("^I Select Job Status In Job Status (.+)$")
	public void select_job_status(String jobStatus) {
		job_status_page.select_job_status(jobStatus);
	}

	@And("^I Select From Date In Job Status (.+)$")
	public void select_from_date(String fromDate) {
		job_status_page.select_from_date(fromDate);
	}

	@And("^I Select To Date In Job Status (.+)$")
	public void select_to_date(String toDate) {
		job_status_page.select_to_date(toDate);
	}

	@And("I Click Job Status Apply Filter")
	public void click_apply_filter() {
		job_status_page.click_apply_filter();
	}

	@And("I Click Job Status Clear Filter")
	public void click_clear_filter() {
		job_status_page.click_clear_filter();
	}

	@And("^I Select Search Filter Key (.+) And Search Value (.+) In Job Status$")
	public void select_search_filter(String searchFilter, String searchValue) {
		job_status_page.select_search_filter_key(searchFilter);
		job_status_page.enter_search_filter_value(searchFilter, searchValue);
	}

	@And("I Click Job Status Next")
	public void click_next() {
		job_status_page.click_next();
	}

	@And("I Click Job Status Previous")
	public void click_previous() {
		job_status_page.click_previous();
	}

	@And("^I Verify Search Results In Job Status \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
	public void verify_jobs_based_on_search_filters(String jobStatus, String fromDate, String toDate,String uploadStatus, String searchFilterKey, String searchValue,String eventDate,String eventTime,String companyName,String eventTitle,String callStatus,String recordedBy,String ticker,String jobDate,String timeZone) {
		job_status_page.verify_searchResults_in_jobsStatusTable(jobStatus, fromDate, toDate, uploadStatus, searchFilterKey, searchValue, eventDate, eventTime, companyName, eventTitle, callStatus, recordedBy, ticker, jobDate, timeZone);
	}
}
