package daggr.ui.pages.persons;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class AddPersons_Education extends PageObjectUtils{
	
	@FindBy(xpath = "//input[@formcontrolname='educational_institution']")
	WebElement educational_institution;
	
	@FindBy(xpath = "//input[@formcontrolname='educational_institution']/preceding-sibling::label")
	WebElement educational_institution_label;
	
	@FindBy(xpath = "//input[@formcontrolname='educational_qualification']")
	WebElement educational_qualification;
	
	@FindBy(xpath = "//input[@formcontrolname='educational_qualification']/preceding-sibling::label")
	WebElement educational_qualification_label;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//textarea[@formcontrolname='description']")
	WebElement educational_description;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//textarea[@formcontrolname='description']/preceding-sibling::label")
	WebElement educational_description_label;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='start_date']")
	WebElement educational_start_date;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='start_date']/preceding-sibling::label")
	WebElement educational_start_date_label;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='end_date']")
	WebElement educational_end_date;
	
	@FindBy(xpath = "//div[@formarrayname='educations']//input[@formcontrolname='end_date']/preceding-sibling::label")
	WebElement educational_end_date_label;
	
	public AddPersons_Education() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void enter_educational_institution(String educationalInstitution){
		check_before_sending_keys(educational_institution, educational_institution_label, "Enter Institution", "Educational Institution *", "Educational Institution");
		waitForExpectedElement(educational_institution).sendKeys(educationalInstitution);
		check_after_sending_keys(educational_institution, educationalInstitution, "Educational Institution");
	}
	public void enter_educational_qualification(String educationalQualification){
		check_before_sending_keys(educational_qualification, educational_qualification_label, "Enter Qualification", "Educational Qualification", "Educational Qualification");
		waitForExpectedElement(educational_qualification).sendKeys(educationalQualification);
		check_after_sending_keys(educational_qualification, educationalQualification, "Educational Qualification");
	}
	public void enter_educational_description(String educationalDescription){
		check_before_sending_keys(educational_description, educational_description_label, "Enter Description", "Description", "Description");
		waitForExpectedElement(educational_description).sendKeys(educationalDescription);
		check_after_sending_keys(educational_description, educationalDescription, "Description");
	}
	public void select_educational_start_date(String educationalStartDate){
		check_before_sending_keys(educational_start_date, educational_start_date_label, "YYYY-MM-DD", "Start date", "Start date");
		waitForExpectedElement(educational_start_date).click();
		datepickerDateSelect(educationalStartDate);
		check_after_sending_keys(educational_start_date, educationalStartDate, "Start date");
	}
	public void select_educational_end_date(String educationalEndDate){
		check_before_sending_keys(educational_end_date, educational_end_date_label, "YYYY-MM-DD", "End date", "End date");
		waitForExpectedElement(educational_end_date).click();
		datepickerDateSelect(educationalEndDate);
		check_after_sending_keys(educational_end_date, educationalEndDate, "End date");
	}
}
