package daggr.ui.steps.companyDataSource;

import daggr.ui.pages.companyDataSource.DataSourcePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DataSourceSteps {
	DataSourcePage data_source_page =  new DataSourcePage();
	
	@Then ("^Enter Mandatory Datasource Company Name (.+)$")
	public void enter_datasource_company_name(String company_name){
		data_source_page.enter_company_name(company_name);
	}
	@And ("^Select Mandatory Datasource Traking Type (.+)$")
	public void select_tracking_type(String tracking_type){
		data_source_page.select_the_tracking_type(tracking_type);
	}
	@And ("^Enter Mandatory Datasource Tracking Link (.+)$")
	public void enter_tracking_link(String tracking_link){
		data_source_page.enter_the_tracking_url(tracking_link);
	}
	@And ("^Enter Mandatory Datasource Tracking Status (.+)$")
	public void enter_tracking_status(String tracking_status){
		data_source_page.select_the_status(tracking_status);
	}
	@And ("^Enter Mandatory Datasource Scraping Frequency (.+)$")
	public void enter_scraping_frequency(String scraping_frequency){
		data_source_page.enter_scraping_frequency(scraping_frequency);
	}
	@And ("^Enter Mandatory/Optional Datasource Comments \"(.*)\"$")
	public void enter_data_source_comments(String comments){
		data_source_page.enter_comments(comments);
	}
	@And ("Click Datasource Submit")
	public void click_submit(){
		data_source_page.click_submit_button();
	}
}
