package daggr.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class ConfirmationPopup extends PageObjectUtils{
	
	@FindBy(xpath = "//div[@class='modal-content']")
	WebElement confirmation_popup;
	
	@FindBy(xpath = "//modal-container//h3[text()='Are you sure you want to skip the job?']")
	WebElement skip_job_alert_message;
	
	@FindBy(xpath = "//modal-container//button[text()='Yes']")
	WebElement yes_button;
	
	@FindBy(xpath = "//modal-container//button[text()='No']")
	WebElement no_button;
	
	public ConfirmationPopup() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public boolean verify_skip_confirmation_popup(){
		boolean isAvailable = waitForExpectedElement(skip_job_alert_message).isDisplayed();
		return isAvailable;
	}
	public void click_yes_button() {
		waitForExpectedElement(yes_button).click();
		sleep(3000);
	}
	public boolean verify_confirmation_popup(){
		boolean isAvailable = waitForExpectedElement(confirmation_popup).isDisplayed();
		return isAvailable;
	}
}
