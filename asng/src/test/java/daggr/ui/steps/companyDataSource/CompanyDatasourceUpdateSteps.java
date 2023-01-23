package daggr.ui.steps.companyDataSource;

import daggr.ui.pages.SuccessPopup;
import daggr.ui.pages.companyDataSource.CompanyDatasourceUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompanyDatasourceUpdateSteps {
	CompanyDatasourceUpdatePage company_datasource_update_page =  new CompanyDatasourceUpdatePage();
	@Then ("^Update Mandatory Status (.+)$")
	public void update_website_url(String status){
		company_datasource_update_page.update_status(status);
	}
	@And ("^Update Mandatory Scraping Frequency (.+)$")
	public void update_employees(String scrapingFrequency){
		company_datasource_update_page.update_scraping_frequency(scrapingFrequency);
	}
	@And ("Click Datasource Update")
	public void click_update_button(){
		company_datasource_update_page.click_update_button();
	}
	@Then ("Check Update Datasource Success Message")
	public void check_update_success_message(){
   	 	SuccessPopup success_popup =  new SuccessPopup();
   	 	success_popup.get_datasource_update_success_message();
	}
}
