package asai.ui.steps;

import asai.ui.pages.Footer;
import asai.ui.pages.Header;
import asai.ui.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
	LoginPage login =  new LoginPage();
	Header header =  new Header();
	Footer footer = new Footer();
	
    @And ("^I enter email (.+) in ASAI$")
	public void enterUserNameAndPassword(String email){
    	login.enterUsername(email);
	}
    
    @And ("^I enter password (.+) in ASAI$")
	public void enterPassword(String password){
   	 	login.enterPassword(password);
	}
    
    @And ("I click Login button in ASAI")
	public void clickLogin(){
    	login.clickLogin();
	}
    
    @And ("I click Forgot Password Link in ASAI Login Page")
	public void clickForgotPassword(){
    	login.clickForgotPassword();
	}
    
    @And ("I click Register button in ASAI Login Page")
	public void clickRegister(){
    	login.clickRegister();
	}
    
    @Then ("I Verify login page default contents")
	public void verifyLoginPageDefaultElements(){
    	header.verifyLoginPageDefaultElements();
    	footer.verifyLoginPageDefaultElements();
	}
}
