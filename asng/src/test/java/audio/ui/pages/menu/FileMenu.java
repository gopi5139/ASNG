package audio.ui.pages.menu;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import audio.ui.pages.Header;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class FileMenu extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//a[@id='file']/following-sibling::div/a[text()='Get Job']")
	private WebElement get_job;
	
	Header header = new Header();
	public FileMenu() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void navigate_to_get_job(){
		header.navigate_to_file_menu();
		waitForExpectedElement(get_job).click();
	}
	public void is_file_items_displayed() {
		header.navigate_to_file_menu();
		//soft.assertTrue(get_job.isDisplayed(),"Get Job in file menu is not displayed");
	}
}
