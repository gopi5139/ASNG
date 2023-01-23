package asai.ui.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class LoginPage extends PageObjectUtils{
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement emailTextbox;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordTextbox;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='forgot']/a[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerButton;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	public LoginPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verifyLoginPageCurrentUrl() {
		soft.assertEquals(WebDriverHelper.getDriver().getCurrentUrl(),"https://asai-demo-app.pg.alphastreet.io/auth/login", "Application URL is not matched");
	}
	
	public void verifyLoginPageTitle() {
		soft.assertEquals(WebDriverHelper.getDriver().getTitle(),"AsAi", "Application Title is not matched");
	}
	
	public void enterUsername(String email) {
		check_before_sending_keys(emailTextbox, "Email", "Email");
		waitForExpectedElement(emailTextbox).sendKeys(email);
		check_after_sending_keys(emailTextbox, email, "Email");
	}
	public void enterPassword(String password) {
		check_before_sending_keys(passwordTextbox, "Password", "Password");
		waitForExpectedElement(passwordTextbox).sendKeys(password);
		check_after_sending_keys(passwordTextbox, password, "Password");
	}
	public void clickLogin() {
		check_button_displayed(loginButton, "Login");
		getJavascriptClickExecutor(loginButton);
		//sleep(10000);
	}
	public void clickForgotPassword() {
		check_button_displayed(forgotPassword, "Forgot Password");
		waitForExpectedElement(forgotPassword).click();
	}
	public void clickRegister() {
		check_button_displayed(registerButton, "Register");
		waitForExpectedElement(registerButton).click();
	}
}
