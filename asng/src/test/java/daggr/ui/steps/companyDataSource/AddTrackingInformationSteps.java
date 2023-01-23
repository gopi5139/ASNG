package daggr.ui.steps.companyDataSource;

import daggr.ui.pages.companyDataSource.AddTrackingInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddTrackingInformationSteps {
	AddTrackingInformationPage add_tracking_information_page =  new AddTrackingInformationPage();
	
	@Then ("Select Add Tracking Information")
	public void select_add_tracking_information(){
		add_tracking_information_page.is_add_tracking_information_selected();
	}
	@Then ("^Enter Mandatory Tracking Article Link (.+)$")
	public void enter_tracking_article_url(String article_link){
		add_tracking_information_page.enter_the_article_url(article_link);
	}
	
	@And ("^Enter Mandatory Tracking Company Name (.+)$")
	public void enter_tracking_company_name(String company_name){
		add_tracking_information_page.enter_company_name(company_name);
	}
	@And ("^Select Mandatory Tracking Traking Type (.+)$")
	public void select_tracking_type(String tracking_type){
		add_tracking_information_page.select_the_tracking_type(tracking_type);
	}
	@And ("^Enter Mandatory Tracking Tracking Link (.+)$")
	public void enter_tracking_link(String tracking_link){
		add_tracking_information_page.enter_the_tracking_url(tracking_link);
	}
	@And ("^Enter Mandatory Tracking Tracking Status (.+)$")
	public void enter_tracking_status(String tracking_status){
		add_tracking_information_page.select_the_status(tracking_status);
	}
	@And ("^Enter Mandatory Tracking Scraping Frequency (.+)$")
	public void enter_tracking_scraping_frequency(String scraping_frequency){
		add_tracking_information_page.enter_scraping_frequency(scraping_frequency);
	}
	@And ("^Enter Mandatory/Optional Tracking Comments \"(.*)\"$")
	public void enter_tracking_comments(String comments){
		add_tracking_information_page.enter_comments(comments);
	}
	@And ("Click Tracking Submit")
	public void click_submit(){
		add_tracking_information_page.click_submit_button();
	}
}
