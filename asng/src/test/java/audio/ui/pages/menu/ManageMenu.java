package audio.ui.pages.menu;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import audio.ui.pages.Header;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class ManageMenu extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//a[@id='manage']/following-sibling::div/a[text()='Manage Job Scheduler']")
	private WebElement manage_job_scheduler;
	
	@FindBy(xpath="//a[@id='manage']/following-sibling::div/a[text()='Job Assignment']")
	private WebElement job_assignment;
	
	@FindBy(xpath="//a[@id='manage']/following-sibling::div/a[text()='Shortcut Keys']")
	private WebElement shortcut_keys;
	
	Header header= new Header();
	public ManageMenu() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void navigate_to_manage_job_scheduler(){
		header.navigate_to_manage_menu();
		waitForExpectedElement(manage_job_scheduler).click();
	}
	public void navigate_to_job_assignment(){
		header.navigate_to_manage_menu();
		waitForExpectedElement(job_assignment).click();
	}
	public void navigate_to_shortcut_keys(){
		header.navigate_to_manage_menu();
		waitForExpectedElement(shortcut_keys).click();
	}
	public void is_manage_items_displayed() {
		header.navigate_to_manage_menu();
		//soft.assertTrue(manage_job_scheduler.isDisplayed(),"Manage Job Scheduler in manage menu is not displayed");
		//soft.assertTrue(job_assignment.isDisplayed(),"Job Assignment in manage menu is not displayed");
		//soft.assertTrue(shortcut_keys.isDisplayed(),"Shortcut Keys in manage menu is not displayed");
	}
}
