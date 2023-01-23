package daggr.ui.pages.company;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CompanyListPage extends PageObjectUtils{
	
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	public WebElement search_company_name;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement company_name_dropdown;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_company_name;
	
	@FindBy(xpath = "//table//tbody//tr//td[2]//p[text()]")
	WebElement company_name_in_table;
	
	@FindBy(xpath = "//table//tbody")
	WebElement table;
	
	@FindBy(xpath = "//img")
	WebElement editButton;
	
	public CompanyListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void search_company_name_in_list(String companyname){
		waitForExpectedElement(search_company_name).sendKeys(companyname);
		waitForExpectedElement(company_name_dropdown).isDisplayed();
		select_from_dropdown(select_company_name, companyname);
	}
	public void is_company_displayed(String companyName){
		sleep(3000);
		if(!waitForExpectedElement(company_name_in_table).getText().equals(companyName)) {
			Assert.assertFalse(true,"Company Not Matched");
		}
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		if(rows.size()!=1) {
			Assert.assertFalse(true,"Duplicate Company Found");
		}
	}
	public void click_edit_button(){
		waitForExpectedElement(editButton).click();
	}
}
