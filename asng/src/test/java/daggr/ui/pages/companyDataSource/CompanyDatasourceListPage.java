package daggr.ui.pages.companyDataSource;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CompanyDatasourceListPage extends PageObjectUtils{
	
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	public WebElement search_company_name;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//*[@id='trancedata']/tr[1]/td[8]/a")
	WebElement editButton;
	
	@FindBy(xpath = "//div[@class='modal-content']")
	WebElement confirmation_popup;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement confirmation_popup_yes;
	
	@FindBy(xpath = "//button[text()='No']")
	WebElement confirmation_popup_no;
	
	@FindBy(xpath = "//tbody[@id='trancedata']")
	WebElement table_data;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement next_button;
	
	public CompanyDatasourceListPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void search_company_name_in_list(String companyname){
		waitForExpectedElement(search_company_name).sendKeys(companyname);
		waitForExpectedElement(select_from_dropdown).click();
	}
	public void click_edit_button(String trackingUrl){
		waitForExpectedElement(editButton);
		boolean urlIsPresent = true;
		do {
			List<WebElement> rows = waitForExpectedElement(table_data).findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++) {
				List<WebElement> columns = table_data.findElements(By.tagName("tr")).get(i).findElements(By.tagName("td"));
				for(int j=0;j<columns.size();j++) {
					if(columns.get(j).getText().equals(trackingUrl)) {
						columns.get(7).findElement(By.tagName("a")).click();
						sleep(3000);
						urlIsPresent = false;
						return;
					}
				}
			}
			if(urlIsPresent == true) {
				next_button.click();
			}
		}while(urlIsPresent);
	}
}
