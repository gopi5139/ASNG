package daggr.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class LoginPage extends PageObjectUtils{
	public LoginPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	@FindBy(xpath = "(//input[@id='signInFormUsername'])[2]")
	WebElement email_textbox;
	@FindBy(xpath = "(//input[@id='signInFormPassword'])[2]")
	WebElement password_textbox;
	@FindBy(xpath = "(//input[@name='signInSubmitButton'])[2]")
	WebElement sign_in_button;
	
	public void enterUsername(String email) {
		waitForExpectedElement(email_textbox).sendKeys(email);
	}
	public void enterPassword(String password) {
		waitForExpectedElement(password_textbox).sendKeys(password);
	}
	public void clickSignin() {
		waitForExpectedElement(sign_in_button).click();
	}
	public void launch_daggr_application() {
		WebDriverHelper.getDriver().manage().deleteAllCookies();
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverHelper.getDriver().get("https://daggr.dev.pg.alphastreet.io/");
	}
}
