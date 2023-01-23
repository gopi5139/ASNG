package audio.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class LoginPage extends PageObjectUtils{
	@FindBy(xpath = "(//input[@id='signInFormUsername'])[2]")
	private WebElement email_textbox;
	
	@FindBy(xpath = "(//label[@for='signInFormUsername'])[2]")
	private WebElement email_label;
	
	@FindBy(xpath = "(//input[@id='signInFormPassword'])[2]")
	private WebElement password_textbox;
	
	@FindBy(xpath = "(//label[@for='signInFormPassword'])[2]")
	private WebElement password_label;
	
	@FindBy(xpath = "(//input[@name='signInSubmitButton'])[2]")
	private WebElement sign_in_button;
	
	public LoginPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void enterUsername(String email) {
		check_before_sending_keys(email_textbox, email_label, "name@host.com", "Email", "Email");
		waitForExpectedElement(email_textbox).sendKeys(email);
		check_after_sending_keys(email_textbox, email, "Email");
	}
	public void enterPassword(String password) {
		check_before_sending_keys(password_textbox, password_label, "Password", "Password", "Password");
		waitForExpectedElement(password_textbox).sendKeys(password);
		check_after_sending_keys(password_textbox, password, "Password");
	}
	public void clickSignin() {
		check_button_displayed(sign_in_button, "Sigin");
		waitForExpectedElement(sign_in_button).click();
	}
	public void launch_audio_service_application() {
		WebDriverHelper.getDriver().manage().deleteAllCookies();
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverHelper.getDriver().get("https://recordings.dev.pg.alphastreet.io/");
	}
}
