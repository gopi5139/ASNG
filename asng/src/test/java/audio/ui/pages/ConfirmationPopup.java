package audio.ui.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class ConfirmationPopup extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//div[@class='modal-content']")
	private List<WebElement> commonPool_confirmation_popup;
	
	@FindBy(xpath="//div[@class='modal-content']/div/div[1]/h5['Confirmation Message']")
	private List<WebElement> commonPool_confirmation_popup_header;
	
	@FindBy(xpath="//div[@class='modal-content']/div/div[1]/p['Do you want to Pick this Job']")
	private List<WebElement> commonPool_confirmation_popup_message;
	
	@FindBy(xpath="//div[@class='modal-content']/div/div[2]/button[text()='Yes']")
	private List<WebElement> commonPool_confirmation_popup_yes;
	
	@FindBy(xpath="//div[@class='modal-content']/div/div[2]/button[text()='No']")
	private List<WebElement> commonPool_confirmation_popup_no;
	
	@FindBy(xpath = "//img[@alt='Record']/following-sibling::div[2]/div/div/div/div[2]/button[text()='Yes']")
	private List<WebElement> callRecording_confirmation_popup_yes;
	
	@FindBy(xpath = "//img[@alt='Record']/following-sibling::div[2]/div/div/div/div[2]/button[text()='Yes']")
	private List<WebElement> callRecording_confirmation_popup_no;
	
	@FindBy(xpath = "//img[@alt='Record']/following-sibling::div[2]/div/div/div/div[1]/h5['Confirmation Message']")
	private List<WebElement> callRecording_confirmation_popup_header;
	
	@FindBy(xpath = "//img[@alt='Record']/following-sibling::div[2]/div/div/div/div[1]/p['Would you like to continue in non-preffered mode ?']")
	private List<WebElement> callRecording_confirmation_popup_message;
	
	@FindBy(xpath = "//img[@alt='Record']/following-sibling::div[2]/div/div[@class='modal-content']")
	private List<WebElement> callRecording_confirmation_popup;
	
	@FindBy(xpath = "//div[@id='asng-audio-tables']//div/div[@id='jobId']/following-sibling::div[1]")
	private List<WebElement> table_columns_company_name;
	
	@FindBy(xpath = "//div[@id='asng-audio-tables']//div/div[@id='jobId']/following-sibling::div[4]")
	private List<WebElement> table_columns_event_time;
	
	@FindBy(xpath = "//div[@id='asng-audio-tables']//div/div[@id='jobId']/following-sibling::div[3]")
	private List<WebElement> table_columns_event_date;
	
	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='companyName']")
	private List<WebElement> callRecording_table_columns_company_name;
	
	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='eventTime']")
	private List<WebElement> callRecording_table_columns_event_time;
	
	@FindBy(xpath = "//div[@class='asng-table-data']//div/div[@id='eventDate']")
	private List<WebElement> callRecording_table_columns_event_date;

	
	public ConfirmationPopup() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void click_yes_in_commonPool_confirmation_popup(String companyName,String eventDate,String eventTime,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
//		String eventDateValue = getDateConversion(eventDate);
//		String eventTimeValue = getTimeConversion(eventTime);
		for (int i = 0; i < table_columns_company_name.size(); i++) {
			if(table_columns_company_name.get(i).getText().equals(companyName)&&table_columns_event_date.get(i).getText().equals(eventDateValue)&&table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				soft.assertTrue(waitForExpectedElement(commonPool_confirmation_popup.get(i)).isDisplayed(),"Confirmation popup is not displayed");
				soft.assertTrue(waitForExpectedElement(commonPool_confirmation_popup_header.get(i)).isDisplayed(),"Confirmation popup header is not displayed");
				soft.assertTrue(waitForExpectedElement(commonPool_confirmation_popup_message.get(i)).isDisplayed(),"Confirmation popup message is not displayed");
				soft.assertTrue(waitForExpectedElement(commonPool_confirmation_popup_yes.get(i)).isDisplayed(),"Confirmation popup yes button is not displayed");
				soft.assertTrue(waitForExpectedElement(commonPool_confirmation_popup_no.get(i)).isDisplayed(),"Confirmation popup no button is not displayed");
				waitForExpectedElement(commonPool_confirmation_popup_yes.get(i)).click();
			}
		}
	}
	
	public void click_yes_in_callRecording_confirmation_popup(String eventDate,String eventTime,String companyName,String timeZone) {
		String eventDateValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"date");
		String eventTimeValue = seperateCurrentTimezoneDateTime(eventDate,eventTime,timeZone,"time");
		for (int i = 0; i < callRecording_table_columns_company_name.size(); i++) {
			if(callRecording_table_columns_company_name.get(i).getText().equals(companyName)&&callRecording_table_columns_event_date.get(i).getText().equals(eventDateValue)&&callRecording_table_columns_event_time.get(i).getText().equals(eventTimeValue)) {
				soft.assertTrue(waitForExpectedElement(callRecording_confirmation_popup.get(i)).isDisplayed(),"Confirmation popup is not displayed");
				soft.assertTrue(waitForExpectedElement(callRecording_confirmation_popup_header.get(i)).isDisplayed(),"Confirmation popup header is not displayed");
				soft.assertTrue(waitForExpectedElement(callRecording_confirmation_popup_message.get(i)).isDisplayed(),"Confirmation popup message is not displayed");
				soft.assertTrue(waitForExpectedElement(callRecording_confirmation_popup_yes.get(i)).isDisplayed(),"Confirmation popup yes button is not displayed");
				soft.assertTrue(waitForExpectedElement(callRecording_confirmation_popup_no.get(i)).isDisplayed(),"Confirmation popup no button is not displayed");
				waitForExpectedElement(callRecording_confirmation_popup_yes.get(i)).click();
			}
		}
	}
}
