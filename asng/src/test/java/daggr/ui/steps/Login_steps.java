package daggr.ui.steps;

import daggr.ui.pages.LoginPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_steps {
	Scenario scenario;
	LoginPage login =  new LoginPage();
    @When ("^User logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login_in(String email,String password) throws Throwable{
    	login.enterUsername(email);
   	 	login.enterPassword(password);
   	 	login.clickSignin();
	}
    @When ("^User logged in using username as (.+) and password as (.+) from data table$")
	public void login_in_data_table(String email,String password) throws Throwable{
    	login.enterUsername(email);
   	 	login.enterPassword(password);
   	 	login.clickSignin();
	}
    @Given ("I Launch Daggr Application")
    public void launch_daggr_application() {
    	login.launch_daggr_application();
    }
}
