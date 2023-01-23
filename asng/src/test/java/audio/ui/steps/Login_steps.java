package audio.ui.steps;

import audio.ui.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	LoginPage login =  new LoginPage();
    @When ("^I Enter Username (.+) and Password (.+)$")
	public void login_in_data_table(String email,String password){
    	login.enterUsername(email);
   	 	login.enterPassword(password);
	}
    @Then ("I Click Audio Service Signin")
	public void click_signin(){
    	login.clickSignin();
	}
    @Given ("I Launch Audio Service Application")
    public void launch_audio_service_application() {
    	login.launch_audio_service_application();
    }
}
