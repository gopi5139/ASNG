package daggr.ui.steps.companyDataSource;

import daggr.ui.pages.companyDataSource.CompanyDatasourceListPage;
import daggr.ui.pages.companyDataSource.CompanyDatasourceUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyDatasourceListSteps {
	CompanyDatasourceListPage datasource_list_page =  new CompanyDatasourceListPage();
	CompanyDatasourceUpdatePage company_datasource_update_view_page =  new CompanyDatasourceUpdatePage();
	
	@Then ("^Search By Datasource Company Name (.+)$")
	public void search_by_company_name(String company_name){
		datasource_list_page.search_company_name_in_list(company_name);
	}
	@And ("^Click Datasource Action (.+)$")
	public void click_action_button(String tracking_url){
		datasource_list_page.click_edit_button(tracking_url);
	}
	@Then ("^Check Mandatory Datasource Company Name (.+)$")
	public void click_company_name(String company_name){
		company_datasource_update_view_page.check_company_name(company_name);
	}
	@And ("^Check Mandatory Datasource Tracking Type (.+)$")
	public void click_tracking_type(String tracking_type){
		company_datasource_update_view_page.check_tracking_type(tracking_type);
	}
	@And ("^Check Mandatory Datasource Tracking Link (.+)$")
	public void click_tracking_link(String tracking_link){
		company_datasource_update_view_page.check_tracking_link(tracking_link);
	}
	@And ("^Check Mandatory Datasource Status (.+)$")
	public void click_status(String status){
		company_datasource_update_view_page.check_status(status);
	}
	@And ("^Check Mandatory Datasource Scraping Frequency (.+)$")
	public void click_scraping_frequency(String scraping_frequency){
		company_datasource_update_view_page.check_scraping_frequency(scraping_frequency);
	}
	@And ("^Check Mandatory/Optional Datasource Comments \"(.*)\"$")
	public void click_comments(String comments){
		company_datasource_update_view_page.check_comments(comments);
	}
}
