package daggr.ui.steps;

import daggr.ui.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Home_steps {
	HomePage home =  new HomePage();
	@Then ("Home Page is displayed")
	public void home_page() throws Throwable{
		home.is_home_page_is_displayed();
	}
	@Then ("Click Manual Job")
	public void click_manual_job() throws Throwable{
		home.is_navigate_file_manual_job();
	}
	@Then ("Navigate To Companies List Page")
	public void navigate_to_companies_list_page() throws Throwable{
		home.is_navigate_edit_company();
	}
	@And ("I Click Daggr Logout")
	public void click_logout() {
		home.click_logout();
	}
	@Then ("^I Verify Daggr Navbar (.+),(.+)$")
	public void verify_nav_bar_items(String userName, String operatorType) {
		home.verify_default_elements(userName, operatorType);
	}
	@Then ("^Navigate To Companies List Page \"(.*)\"$")
	public void navigate_to_companies_list_page(String company){
		home.is_navigate_edit_company(company);
	}
	@Then ("^Navigate To Company Datasource \"(.*)\"$")
	public void navigate_to_company_datasource(String value){
		home.is_navigate_edit_company_datasource(value);
	}
	@Then ("Navigate To Datasource")
	public void navigate_to_manage_datasource(){
		home.is_navigate_manage_datasource();
	}
	@Then ("Navigate To Securities List Page")
	public void navigate_to_secuirties_list_page(){
		home.is_navigate_edit_securities();
	}
	@Then ("^Navigate To Persons List Page \"(.*)\"$")
	public void navigate_to_persons_list_page(String value){
		home.is_navigate_edit_persons_list(value);
	}
	@Then ("Navigate To Company Actions")
	public void navigate_to_company_actions(){
		home.is_navigate_edit_company_actions();
	}
}
