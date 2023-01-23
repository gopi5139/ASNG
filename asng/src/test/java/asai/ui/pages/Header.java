package asai.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class Header extends PageObjectUtils{
	
	@FindBy(xpath = "//div[@id='header']/nav/div/a/img")
	private WebElement preLoginPageAlphastreetLogo;
	
	@FindBy(xpath = "//div[@class='ai_header']/nav/div/a/img")
	private WebElement loginPageAlphastreetLogo;
	
	@FindBy(xpath = "//div[@id='header']")
	private WebElement preLoginPageHeader;
	
	@FindBy(xpath = "//div[@class='ai_header']")
	private WebElement loginPageHeader;
	
	@FindBy(xpath = "//ul/li[1]")
	private WebElement solutionsSection;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/i")
	private WebElement solutionsSectionDownArrowIcon;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='IR Services']")
	private WebElement solutionsIRServices;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='IR Services']/img")
	private WebElement solutionsIRServicesImage;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='Data Feeds']")
	private WebElement solutionsDataFeeds;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='Data Feeds']/img")
	private WebElement solutionsDataFeedsImage;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='Expert Interviews']")
	private WebElement solutionsExpertInterviews;
	
	@FindBy(xpath = "//ul/li[1]/a[text()='Solutions']/following-sibling::div/a[text()='Expert Interviews']/img")
	private WebElement solutionsExpertInterviewsImage;
	
	@FindBy(xpath = "//ul/li[2]/a[text()='About']")
	private WebElement about;
	
	@FindBy(xpath = "//ul/li[3]/a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	private WebElement startButton;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[1]")
	private WebElement login;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[2]")
	private WebElement register;
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following::div[1]/a[3]")
	private WebElement testDrive;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	PreLoginPage preLoginPage = new PreLoginPage();
	LoginPage loginPage = new LoginPage();
	
	public Header() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verifyPreLoginPageAlphastreetLogo() {
		soft.assertTrue(preLoginPageAlphastreetLogo.isDisplayed(),"Alphastreet logo is not displayed");
	}
	
	public void verifyLoginPageAlphastreetLogo() {
		soft.assertTrue(loginPageAlphastreetLogo.isDisplayed(),"Alphastreet logo is not displayed");
	}
	
	public void navigateSolutionsSections(){
		moveToElement(solutionsSection).build().perform();
	}
	
	public void verifySolutionsSection() {
		soft.assertTrue(solutionsSection.isDisplayed(),"Solutions Section is not displayed");
		soft.assertTrue(solutionsSectionDownArrowIcon.isDisplayed(),"Solutions Section down arrow is not displayed");
		navigateSolutionsSections();
		soft.assertTrue(solutionsIRServices.isDisplayed(),"Solutions Section > IR Services is not displayed");
		soft.assertTrue(solutionsIRServicesImage.isDisplayed(),"Solutions Section > IR Services image is not displayed");
		soft.assertTrue(solutionsDataFeeds.isDisplayed(),"Solutions Section > Data Feeds is not displayed");
		soft.assertTrue(solutionsDataFeedsImage.isDisplayed(),"Solutions Section > Data Feeds image is not displayed");
		soft.assertTrue(solutionsExpertInterviews.isDisplayed(),"Solutions Section > Expert Interviews is not displayed");
		soft.assertTrue(solutionsExpertInterviewsImage.isDisplayed(),"Solutions Section > Expert Interviews image is not displayed");
	}
	
	public void verifyAboutSection() {
		soft.assertTrue(about.isDisplayed(),"About Section is not displayed");
	}
	
	public void verifyContactUsSection() {
		soft.assertTrue(contactUs.isDisplayed(),"Contact Us Section is not displayed");
	}
	
	public void verifyStartButtonSection() {
		soft.assertTrue(startButton.isDisplayed(),"Start Button is not displayed");
		waitForExpectedElement(startButton).click();
		soft.assertTrue(login.isDisplayed(),"Login under Start Button is not displayed");
		soft.assertTrue(register.isDisplayed(),"Register under Start Button is not displayed");
		soft.assertTrue(testDrive.isDisplayed(),"Test Drive under Start Button is not displayed");
		waitForExpectedElement(startButton).click();
	}
	
	public void verifyStaticPageDefaultElements() {
		waitForExpectedElement(preLoginPageHeader).isDisplayed();
		preLoginPage.verifyStaticPageCurrentUrl();
		preLoginPage.verifyStaticPageTitle();
		verifyPreLoginPageAlphastreetLogo();
		verifySolutionsSection();
		verifyAboutSection();
		verifyContactUsSection();
		verifyStartButtonSection();
	}
	
	public void verifyLoginPageDefaultElements() {
		waitForExpectedElement(loginPageHeader).isDisplayed();
		loginPage.verifyLoginPageCurrentUrl();
		loginPage.verifyLoginPageTitle();
		verifyLoginPageAlphastreetLogo();
		verifySolutionsSection();
		verifyAboutSection();
		verifyContactUsSection();
		//verifyStartButtonSection();
	}
	
	public void clickStartButton() {
		check_button_displayed(startButton, "Start");
		waitForExpectedElement(startButton).click();
	}
	
	public void navigateToASAILoginPage() {
		check_button_displayed(login, "Log in");
		waitForExpectedElement(login).click();
	}
}
