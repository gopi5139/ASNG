package asai.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class PreLoginPage extends PageObjectUtils{
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	private WebElement startButton;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[1]")
	private WebElement login;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[2]")
	private WebElement register;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[3]")
	private WebElement testDrive;
	
	@FindBy(xpath = "//div[@class='ai_header']/nav/div/a/img")
	private WebElement asaiHeaderLogo;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	public PreLoginPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void launch_asai_application() {
		WebDriverHelper.getDriver().manage().deleteAllCookies();
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverHelper.getDriver().get("https://asai-demo.pg.alphastreet.io/home");
	}
	
	public void clickStartButton() {
		check_button_displayed(startButton, "Start");
		waitForExpectedElement(startButton).click();
	}
	
	public void navigateToASAILoginPage() {
		check_button_displayed(login, "Log in");
		waitForExpectedElement(login).click();
	}
	
	public void verifyStaticPageDefaultElements() {
		check_button_displayed(login, "Log in");
		waitForExpectedElement(login).click();
	}
	
	public void verifyStaticPageCurrentUrl() {
		soft.assertEquals(WebDriverHelper.getDriver().getCurrentUrl(),"https://asai-demo.pg.alphastreet.io/home", "Application URL is not matched");
	}
	
	public void verifyStaticPageTitle() {
		soft.assertEquals(WebDriverHelper.getDriver().getTitle(),"ASAI", "Application Title is not matched");
	}
}
