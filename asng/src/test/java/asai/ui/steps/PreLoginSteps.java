package asai.ui.steps;

import asai.ui.pages.Footer;
import asai.ui.pages.Header;
import asai.ui.pages.PreLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreLoginSteps {
	Header header =  new Header();
	Footer footer = new Footer();
	PreLoginPage preLoginPage = new PreLoginPage();
	
	@Given ("I Launch ASAI Application")
    public void launch_audio_service_application() {
		preLoginPage.launch_asai_application();
    }
    @Then ("I Verify static page default contents")
	public void verifyStaticPageDefaultElements(){
    	header.verifyStaticPageDefaultElements();
    	footer.verifyStaticPageDefaultElements();
	}
    @When ("I Click start button")
	public void clickStartButton(){
    	header.clickStartButton();
	}
    @And ("I Navigate to ASAI Login page by clicking login under start button")
	public void navigateToASAILoginPage(){
    	header.navigateToASAILoginPage();
	}
    
}
