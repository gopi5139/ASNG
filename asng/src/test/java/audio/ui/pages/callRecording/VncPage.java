package audio.ui.pages.callRecording;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class VncPage extends PageObjectUtils{
	@FindBy(xpath = "//div[@class='connect']/h3")
	public WebElement vnc_label;
	
	@FindBy(xpath = "//div[@class='connect']/form/input[@value='Connect']")
	public WebElement connect_button;
	
	@FindBy(xpath = "//div[@class='connect']/form/h3")
	public WebElement connection_option_label;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[1]/div[1]/div/input")
	public WebElement reconnect_automatically_checkbox;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[1]/div[1]/div/label")
	public WebElement reconnect_automatically_label;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[1]/div[2]/div/input")
	public WebElement show_dot_when_no_cursor_checkbox;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[1]/div[2]/div/label")
	public WebElement show_dot_when_no_cursor_label;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[2]/div[2]/div/input")
	public WebElement view_only_checkbox;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[2]/div[2]/div/label")
	public WebElement view_only_label;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[2]/div[1]/div/input")
	public WebElement enable_bell_checkbox;
	
	@FindBy(xpath = "//div[@class='connect']/form/div[2]/div[1]/div/label")
	public WebElement enable_bell_label;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	public VncPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verify_default_elements() {
		soft.assertTrue(vnc_label.isDisplayed(), "VNC label is not displayed");
		soft.assertEquals(vnc_label.getText().trim(), "noVNC", "noVNC label is not matched");
		soft.assertTrue(connect_button.isDisplayed(), "Connect button is not displayed");
		soft.assertTrue(connection_option_label.isDisplayed(), "Connection Options label is not displayed");
		soft.assertEquals(connection_option_label.getText().trim(), "Connection Options", "Connection Options label is not matched");
		soft.assertTrue(Boolean.valueOf(reconnect_automatically_checkbox.getAttribute("checked")), "Reconnect automatically is not checked by default");
		soft.assertTrue(reconnect_automatically_label.isDisplayed(), "Reconnect automatically label is not displayed");
		soft.assertEquals(reconnect_automatically_label.getText().trim(), "Reconnect automatically", "Reconnect automatically label is not matched");
		soft.assertTrue(Boolean.valueOf(show_dot_when_no_cursor_checkbox.getAttribute("checked")), "Show dot when no cursor is not checked by default");
		soft.assertTrue(show_dot_when_no_cursor_label.isDisplayed(), "Show dot when no cursor label is not displayed");
		soft.assertEquals(show_dot_when_no_cursor_label.getText().trim(), "Show dot when no cursor", "Show dot when no cursor label is not matched");
		soft.assertFalse(Boolean.valueOf(enable_bell_checkbox.getAttribute("checked")), "Enable bell is checked by default");
		soft.assertTrue(enable_bell_label.isDisplayed(), "Enable bell label is not displayed");
		soft.assertEquals(enable_bell_label.getText().trim(), "Enable bell", "Enable bell label is not matched");
		soft.assertFalse(Boolean.valueOf(view_only_checkbox.getAttribute("checked")), "View only is checked by default");
		soft.assertTrue(view_only_label.isDisplayed(), "View only label is not displayed");
		soft.assertEquals(view_only_label.getText().trim(), "View only", "View only label is not matched");
	}
	public void click_connect_button() {
		verify_default_elements();
		waitForExpectedElement(connect_button).click();
		sleep(8000);
	}
	public void switch_tab() {
		String parentWindow = WebDriverHelper.getDriver().getWindowHandle();
		Set<String>windows = WebDriverHelper.getDriver().getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		for (int i = 0; i < list.size(); i++) 
		{
			if(!list.get(i).equals(parentWindow)) {
				WebDriverHelper.getDriver().switchTo().window(list.get(i));
				break;
			}
		}
	}
}
