package audio.ui.pages.menu;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import audio.ui.pages.Header;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class UsernameMenu extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//a[@class='nav-link']/following-sibling::div/a[text()='Log Out']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@class='nav-link']/following-sibling::div/a[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[@class='nav-link']/following-sibling::div/a[text()='Font']")
	private WebElement font;
	
	Header header = new Header();
	public UsernameMenu() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void navigate_to_logout(){
		header.username_dropdown_click();
		waitForExpectedElement(logout).click();
	}
	public void navigate_to_dashboard(){
		header.username_dropdown_click();
		waitForExpectedElement(dashboard).click();
	}
	public void navigate_to_font(){
		header.username_dropdown_click();
		waitForExpectedElement(font).click();
	}
	public void is_username_dropdown_items_displayed(){
		header.username_dropdown_click();
		soft.assertTrue(dashboard.isDisplayed(),"Dashboard in username menu is not displayed");
		soft.assertTrue(font.isDisplayed(),"Font in username menu is not displayed");
		soft.assertTrue(logout.isDisplayed(),"Logout in username menu is not displayed");
		header.username_dropdown_click();
	}
}
