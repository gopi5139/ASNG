package asai.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class Footer extends PageObjectUtils{
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/div/img")
	private WebElement asaiLogo;
	
	@FindBy(xpath = "//section[@class='ai_footer']")
	private WebElement footer;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='About ']")
	private WebElement aboutSection;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='About ']/i")
	private WebElement aboutSectionDownArrowIcon;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='About Us']")
	private WebElement aboutSectionAboutUs;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Team']")
	private WebElement aboutSectionTeam;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='News Releases']")
	private WebElement aboutSectionNewsReleases;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Resources']")
	private WebElement resourcesSection;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Resources']/i")
	private WebElement resourcesSectionDownArrowIcon;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='View Sample Event']")
	private WebElement resourcesSectionViewSampleEvent;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='View Sample Transcript']")
	private WebElement resourcesSectionViewSampleTranscript;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Insights']")
	private WebElement resourcesSectionInsights;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Security']")
	private WebElement resourcesSectionSecurity;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Social ']")
	private WebElement socialSection;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Social ']/i")
	private WebElement socialSectionDownArrowIcon;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='LinkedIn']")
	private WebElement socialSectionLinkedin;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Twitter']")
	private WebElement socialSectionTwitter;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Facebook']")
	private WebElement socialSectionFacebook;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='YouTube']")
	private WebElement socialSectionYouTube;
	
	@FindBy(xpath = "//div[@class='row']/div/div/a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//p[@class='list_item footer_login']/a[text()='Register']")
	private WebElement registerLoginPage;
	
	@FindBy(xpath = "//p[@class='list_item footer_login']/a[text()='Register']/img")
	private WebElement registerIconLoginPage;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/div/p[contains(@class,'list_item')][text()='Register']")
	private WebElement registerPreLoginPage;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/div/p[contains(@class,'list_item')][text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/div/p[contains(@class,'list_item')][text()='Register']/img")
	private WebElement registerIconPreLoginPage;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/div/p[contains(@class,'list_item')][text()='Log in']/img")
	private WebElement loginIcon;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/a[text()='Terms of Service']")
	private WebElement termsOfService;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/span[text()=' © 2022 ']")
	private WebElement copyRightsYear;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/span/span[text()='AlphaStreet Inc.']")
	private WebElement copyRightsCompanyName;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div[text()=' © 2022 AlphaStreet Inc. ']")
	private WebElement copyRightsYearAndCompanyName;
	
	@FindBy(xpath = "//section[@class='ai_footer']/div/div/a[text()='All Rights Reserved']")
	private WebElement copyRights;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	public Footer() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verifyASAILogo() {
		soft.assertTrue(asaiLogo.isDisplayed(),"ASAI logo is not displayed");
	}
	
	public void verifyAboutSection() {
		soft.assertTrue(aboutSection.isDisplayed(),"About Section is not displayed");
		soft.assertTrue(aboutSectionDownArrowIcon.isDisplayed(),"About Section down arrow is not displayed");
		soft.assertTrue(aboutSectionAboutUs.isDisplayed(),"About Sections > About Us is not displayed");
		soft.assertTrue(aboutSectionTeam.isDisplayed(),"About Sections > Team is not displayed");
		soft.assertTrue(aboutSectionNewsReleases.isDisplayed(),"About Sections > News Releases is not displayed");
	}
	
	public void verifyResourcesSection() {
		soft.assertTrue(resourcesSection.isDisplayed(),"Resources Section is not displayed");
		soft.assertTrue(resourcesSectionDownArrowIcon.isDisplayed(),"Resources Section down arrow is not displayed");
		soft.assertTrue(resourcesSectionViewSampleEvent.isDisplayed(),"Resources Section > View Sample Event is not displayed");
		soft.assertTrue(resourcesSectionViewSampleTranscript.isDisplayed(),"Resources Section > View Sample Transcript is not displayed");
		soft.assertTrue(resourcesSectionInsights.isDisplayed(),"Resources Section > Insights is not displayed");
		soft.assertTrue(resourcesSectionSecurity.isDisplayed(),"Resources Section > Security is not displayed");
	}
	
	public void verifySocialSection() {
		soft.assertTrue(socialSection.isDisplayed(),"Social Section is not displayed");
		soft.assertTrue(socialSectionDownArrowIcon.isDisplayed(),"Social Section down arrow is not displayed");
		soft.assertTrue(socialSectionLinkedin.isDisplayed(),"Social Section > Linkedin is not displayed");
		soft.assertTrue(socialSectionTwitter.isDisplayed(),"Social Section > Twitter is not displayed");
		soft.assertTrue(socialSectionFacebook.isDisplayed(),"Social Section > Facebook is not displayed");
		soft.assertTrue(socialSectionYouTube.isDisplayed(),"Social Section > YouTube is not displayed");
	}
	
	public void verifyContactUsSection() {
		soft.assertTrue(contactUs.isDisplayed(),"Contact Us Section is not displayed");
	}
	
	public void verifyRegisterSectionLoginPage() {
		soft.assertTrue(registerLoginPage.isDisplayed(),"Register Link at Footer is not displayed");
		soft.assertTrue(registerIconLoginPage.isDisplayed(),"Register Icon at Footer is not displayed");
	}
	
	public void verifyRegisterSectionPreLoginPage() {
		soft.assertTrue(registerPreLoginPage.isDisplayed(),"Register Link at Footer is not displayed");
		soft.assertTrue(registerIconPreLoginPage.isDisplayed(),"Register Icon at Footer is not displayed");
	}
	
	public void verifyLoginSectionPreLoginPage() {
		soft.assertTrue(login.isDisplayed(),"Login Link at Footer is not displayed");
		soft.assertTrue(loginIcon.isDisplayed(),"Login Icon at Footer is not displayed");
	}
	
	public void verifyTermsOfService() {
		soft.assertTrue(termsOfService.isDisplayed(),"Terms of Service is not displayed");
	}
	
	public void verifyPrivacyPolicy() {
		soft.assertTrue(privacyPolicy.isDisplayed(),"Privacy Policy is not displayed");
	}
	
	public void clickRegisterLinkLoginPage() {
		waitForExpectedElement(registerLoginPage).click();
	}
	
	public void clickRegisterLinkPreLoginPage() {
		waitForExpectedElement(registerPreLoginPage).click();
	}
	
	public void clickLoginLink() {
		waitForExpectedElement(login).click();
	}
	
	public void clickTermsOfService() {
		waitForExpectedElement(termsOfService).click();
	}
	
	public void clickPrivacyPolicy() {
		waitForExpectedElement(privacyPolicy).click();
	}
	
	public void verifyLoginPageCopyRights() {
		soft.assertTrue(copyRightsYear.isDisplayed(),"Copy Rights Year is not displayed");
		soft.assertTrue(copyRightsCompanyName.isDisplayed(),"Copy Rights Company Name is not displayed");
		soft.assertTrue(copyRights.isDisplayed(),"Copy Rights is not displayed");
	}
	
	public void verifyPreLoginPageCopyRights() {
		soft.assertTrue(copyRightsYearAndCompanyName.isDisplayed(),"Copy Rights Year and Company Name is not displayed");
		soft.assertTrue(copyRights.isDisplayed(),"Copy Rights is not displayed");
	}
	
	public void verifyStaticPageDefaultElements() {
		waitForExpectedElement(footer).isDisplayed();
		verifyASAILogo();
		verifyAboutSection();
		verifySocialSection();
		verifyContactUsSection();
		verifyLoginSectionPreLoginPage();
		verifyRegisterSectionPreLoginPage();
		verifyTermsOfService();
		verifyPrivacyPolicy();
		verifyPreLoginPageCopyRights();
	}
	
	public void verifyLoginPageDefaultElements() {
		waitForExpectedElement(footer).isDisplayed();
		verifyASAILogo();
		verifyAboutSection();
		verifyResourcesSection();
		verifySocialSection();
		verifyContactUsSection();
		verifyRegisterSectionLoginPage();
		verifyTermsOfService();
		verifyPrivacyPolicy();
		verifyLoginPageCopyRights();
	}
}
