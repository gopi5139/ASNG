package daggr.ui.pages.persons;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class PersonsListPage extends PageObjectUtils{
	@FindBy(xpath="//input[@placeholder='Enter person Name']")
	public WebElement search_person_name;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_person;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement person_dropdown;
	
	@FindBy(xpath = "//table//tbody//tr//td[2]//p[text()]")
	WebElement company_name_in_table;
	
	@FindBy(xpath = "//table//tbody")
	WebElement table;
	
	@FindBy(xpath = "//img")
	WebElement editButton;
	
	public PersonsListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void search_person_name_in_list(String personName){
		waitForExpectedElement(search_person_name).sendKeys(personName);
		waitForExpectedElement(person_dropdown).isDisplayed();
		select_from_dropdown(select_person,personName);
	}
	public void click_edit_button(){
		waitForExpectedElement(editButton).click();
	}
}
