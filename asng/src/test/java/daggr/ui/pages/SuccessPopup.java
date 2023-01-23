package daggr.ui.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class SuccessPopup extends PageObjectUtils{
	
	@FindBy(xpath = "//modal-container//h3")
	WebElement success_popup;
	
	@FindBy(xpath = "//modal-container//h3[text()='Would you like to pick a new job? ']")
	WebElement new_job_alert_message;
	
	@FindBy(xpath = "//modal-container//button[text()='Yes']")
	WebElement yes_button;
	
	@FindBy(xpath = "//modal-container//button[text()='No']")
	WebElement no_button;
	
	@FindBy(xpath = "//modal-container//h3[text()='INFORMATION UPDATED ']")
	WebElement updated_message;
	
	@FindBy(xpath = "//h3[text()='TRACKING INFORMATION SUBMITTED SUCCESSFULLY']")
	WebElement data_source_updated_message;
	
	@FindBy(xpath="//table//thead//tr//th[1]")
	public WebElement popup_close;
	
	@FindBy(xpath="//app-work-items/ngx-spinner/div/div[1]/div[2]")
	private List<WebElement> full_page_spinner;
	
	public SuccessPopup() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void get_success_message(){
		int retry = 0;
		while(full_page_spinner.size()!=0 && retry < 10){
			sleep(1000);
			retry++;
		}
		waitForExpectedElement(success_popup).isDisplayed();
		new_job_alert_message.isDisplayed();
		yes_button.isDisplayed();
		no_button.isDisplayed();
	}
	public void get_update_success_message() {
		waitForExpectedElement(success_popup).isDisplayed();
		waitForExpectedElement(updated_message).isDisplayed();
		moveToElement(popup_close).click().perform();
	}
	public void get_datasource_update_success_message() {
		waitForExpectedElement(success_popup).isDisplayed();
		waitForExpectedElement(data_source_updated_message).isDisplayed();
		moveToElement(popup_close).click().perform();
	}
}
