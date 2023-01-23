package audio.ui.pages.menu;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import audio.ui.pages.Header;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class ViewMenu extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//a[@id='view']/following-sibling::div/a[text()='Common Pool']")
	private WebElement common_pool;
	
	@FindBy(xpath="//a[@id='view']/following-sibling::div/a[text()='Call Recording']")
	private WebElement call_recording;
	
	@FindBy(xpath="//a[@id='view']/following-sibling::div/a[text()='Audio Events']")
	private WebElement audio_events;
	
	@FindBy(xpath="//a[@id='view']/following-sibling::div/a[text()='Audio List']")
	private WebElement audio_list;
	
	@FindBy(xpath="//a[@id='view']/following-sibling::div/a[text()='Job Status']")
	private WebElement job_status;
	
	Header header = new Header();
	public ViewMenu() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void navigate_to_common_pool(){
		header.navigate_to_view_menu();
		waitForExpectedElement(common_pool).click();
	}
	public void navigate_to_call_recording(){
		header.navigate_to_view_menu();
		waitForExpectedElement(call_recording).click();
	}
	public void navigate_to_audio_events(){
		header.navigate_to_view_menu();
		waitForExpectedElement(audio_events).click();
	}
	public void navigate_to_audio_list(){
		header.navigate_to_view_menu();
		waitForExpectedElement(audio_list).click();
	}
	public void navigate_to_job_status(){
		header.navigate_to_view_menu();
		waitForExpectedElement(job_status).click();
	}
	public void is_view_items_displayed() {
		header.navigate_to_view_menu();
		soft.assertTrue(common_pool.isDisplayed(),"Common Pool is not displayed");
		soft.assertTrue(call_recording.isDisplayed(),"Call Recording is not displayed");
		//soft.assertTrue(audio_events.isDisplayed(),"Audio Events is not displayed");
		//soft.assertTrue(audio_list.isDisplayed(),"Audio List is not displayed");
		soft.assertTrue(job_status.isDisplayed(),"Job Status is not displayed");
	}
}
