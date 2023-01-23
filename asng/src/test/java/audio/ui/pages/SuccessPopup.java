package audio.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class SuccessPopup extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//div[@class='modal-dialog']")
	private WebElement commonPool_success_popup;
	
	@FindBy(xpath="//div[@class='modal-dialog']//button")
	private WebElement commonPool_success_popup_close;
	
	@FindBy(xpath="//div[@class='modal-dialog']/div/div/div/div/label[3]")
	private WebElement commonPool_success_popup_requested_by;
	
	@FindBy(xpath="//div[@class='modal-dialog']/div/div/div/div/label[1]")
	private WebElement commonPool_success_popup_ticker;
	
	@FindBy(xpath="//div[@class='modal-dialog']/div/div/div/div/label[2]")
	private WebElement commonPool_success_popup_recording_id;
	
	public SuccessPopup() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void check_common_pool_success_popup(String username,String ticker) {
		waitForExpectedElement(commonPool_success_popup).isDisplayed();
		String[] username_split = waitForExpectedElement(commonPool_success_popup_requested_by).getText().split(":");
		String[] ticker_split = waitForExpectedElement(commonPool_success_popup_ticker).getText().split(":");
		String[] recording_id_split = waitForExpectedElement(commonPool_success_popup_recording_id).getText().split(":");
		String usernameValue = username_split[1];
		String tickerValue = ticker_split[1];
		String recordingIdValue = recording_id_split[1];
		soft.assertEquals(usernameValue, username, "Requested By is not matched");
		soft.assertEquals(tickerValue, ticker, "Ticker is not matched");
		soft.assertNotNull(recordingIdValue, "Recording Id is null");
	}
	public void click_close_success_popup_in_common_pool() {
		waitForExpectedElement(commonPool_success_popup_close).click();
		sleep(3000);
	}
}
