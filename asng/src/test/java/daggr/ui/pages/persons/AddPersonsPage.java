package daggr.ui.pages.persons;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class AddPersonsPage extends PageObjectUtils{
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_url_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_url_label;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//input[@placeholder='Enter person Name']")
	WebElement person_name;
	
	@FindBy(xpath = "(//label)[4]")
	WebElement person_name_label;
	
	@FindBy(xpath = "//p[text()='Gender']")
	WebElement gender_label;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[1]")
	WebElement gender_male;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[2]")
	WebElement gender_female;
	
	@FindBy(xpath = "(//input[@formcontrolname='gender'])[3]")
	WebElement gender_others;
	
	@FindBy(xpath = "//select[@formcontrolname='person_status']")
	WebElement person_status;
	
	@FindBy(xpath = "//select[@formcontrolname='person_status']/preceding-sibling::label")
	WebElement person_status_label;
	
	@FindBy(xpath = "//select[@formcontrolname='person_status']/option")
	List<WebElement> person_status_options;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement email_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='email']/preceding-sibling::label")
	WebElement email_textbox_label;
	
	@FindBy(xpath = "//input[@formcontrolname='date_of_birth']")
	WebElement date_of_birth;
	
	@FindBy(xpath = "//input[@formcontrolname='date_of_birth']/preceding-sibling::label")
	WebElement date_of_birth_label;
	
	@FindBy(xpath = "(//input[@formcontrolname='deceased'])[1]")
	WebElement deceased_yes;
	
	@FindBy(xpath = "(//input[@formcontrolname='deceased'])[2]")
	WebElement deceased_no;
	
	@FindBy(xpath = "//label[@class='mr-5']")
	WebElement deceased_label;
	
	@FindBy(xpath = "//input[@formcontrolname='deceased_date']")
	WebElement deceased_date;
	
	@FindBy(xpath = "//input[@formcontrolname='deceased_date']/preceding-sibling::label")
	WebElement deceased_date_label;
	
	@FindBy(xpath = "(//textarea[@formcontrolname='description'])[1]")
	WebElement biography_textarea;
	
	@FindBy(xpath = "(//textarea[@formcontrolname='description'])[1]/preceding-sibling::label")
	WebElement biography_textarea_label;
	
	@FindBy(xpath = "//input[@formcontrolname='resigned_date']")
	WebElement resigned_date;
	
	@FindBy(xpath = "//input[@formcontrolname='dismissed_date']")
	WebElement dismissed_date;
	
	@FindBy(xpath = "//input[@formcontrolname='retired_date']")
	WebElement retired_date;
	
	@FindBy(xpath = "//input[@formcontrolname='resigned_date']/preceding-sibling::label")
	WebElement resigned_label;
	
	@FindBy(xpath = "//input[@formcontrolname='dismissed_date']/preceding-sibling::label")
	WebElement dismissed_label;
	
	@FindBy(xpath = "//input[@formcontrolname='retired_date']/preceding-sibling::label")
	WebElement retired_label;
	
	@FindBy(xpath = "//label[text()='Add Education']/following-sibling::span")
	WebElement add_education;
	
	@FindBy(xpath = "//label[text()='Add Work History']/following-sibling::span")
	WebElement add_work_history;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit_button;
	
	public AddPersonsPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_add_persons_selected(){
		selectbyVisibleText(selectList, "Add Persons");
	}
	public void enter_the_article_url(String article_url){
		check_before_sending_keys(article_url_textbox, article_url_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_url_textbox).sendKeys(article_url);
		check_after_sending_keys(article_url_textbox, article_url, "Article Link");
	}
	public void enter_person_name(String personName){
		check_before_sending_keys(person_name, person_name_label, "Enter person Name", "Person Name", "Person Name");
		waitForExpectedElement(person_name).sendKeys(personName);
		waitForExpectedElement(select_from_dropdown);
		waitForExpectedElement(person_name).sendKeys(Keys.TAB);
		check_after_sending_keys(person_name, personName, "Person Name");
	}
	public void select_gender(String gender){
		check_before_selecting_gender(gender_male, gender_female, gender_others, gender_label, "Gender", "Gender");
		if(gender.equalsIgnoreCase("Male")) {
			waitForExpectedElement(gender_male).click();
		}else if(gender.equalsIgnoreCase("Female")) {
			waitForExpectedElement(gender_female).click();
		}else if(gender.equalsIgnoreCase("Others")) {
			waitForExpectedElement(gender_others).click();
		}
		check_after_selecting_gender(gender_male, gender_female, gender_others, gender, "Gender");
	}
	public void select_person_status(String status){
		check_before_select(person_status, person_status_label, "Status", "Status");
		selectbyVisibleText(person_status, status);
		check_after_select(person_status_options, person_status, status, "Status");
	}
	public void select_resigned_date(String resignedDate){
		check_before_sending_keys(resigned_date, resigned_label, "YYYY-MM-DD", "Resigned Date", "Resigned Date");
		waitForExpectedElement(resigned_date).click();
		datepickerDateSelect(resignedDate);
		check_after_sending_keys(resigned_date, resignedDate, "Resigned Date");
	}
	public void select_dismissed_date(String dismissedDate){
		check_before_sending_keys(dismissed_date, dismissed_label, "YYYY-MM-DD", "Dismissed Date", "Dismissed Date");
		waitForExpectedElement(dismissed_date).click();
		datepickerDateSelect(dismissedDate);
		check_after_sending_keys(dismissed_date, dismissedDate, "Dismissed Date");
	}
	public void select_retired_date(String retiredDate){
		check_before_sending_keys(retired_date, retired_label, "YYYY-MM-DD", "Retired Date", "Retired Date");
		waitForExpectedElement(retired_date).click();
		datepickerDateSelect(retiredDate);
		check_after_sending_keys(retired_date, retiredDate, "Retired Date");
	}
	public void enter_email(String email){
		check_before_sending_keys(email_textbox, email_textbox_label, "Enter email", "Email", "Email");
		waitForExpectedElement(email_textbox).sendKeys(email);
		check_after_sending_keys(email_textbox, email, "Email");
	}
	public void select_date_of_birth(String dateOfBirth){
		check_before_sending_keys(date_of_birth, date_of_birth_label, "YYYY-MM-DD", "Date Of Birth", "Date Of Birth");
		waitForExpectedElement(date_of_birth).click();
		datepickerDateSelect(dateOfBirth);
		check_after_sending_keys(date_of_birth, dateOfBirth, "Date Of Birth");
	}
	public void select_deceased(String deceased){
		check_before_radio_select(deceased_yes, deceased_no, deceased_label, "Deceased", "Deceased");
		if(deceased.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(deceased_yes).click();
		}else if(deceased.equalsIgnoreCase("No")) {
			waitForExpectedElement(deceased_no).click();
		}
		check_after_radio_select(deceased_yes, deceased_no, deceased, "Deceased");
	}
	public void select_deceased_date(String deceasedDate){
		check_before_sending_keys(deceased_date, deceased_date_label, "YYYY-MM-DD", "Deceased Date", "Deceased Date");
		waitForExpectedElement(deceased_date).click();
		datepickerDateSelect(deceasedDate);
		check_after_sending_keys(deceased_date, deceasedDate, "Deceased Date");
	}
	public void enter_biography(String biography){
		check_before_sending_keys(biography_textarea, biography_textarea_label, "Enter Description", "Biography", "Biography");
		waitForExpectedElement(biography_textarea).sendKeys(biography);
		check_after_sending_keys(biography_textarea, biography, "Biography");
	}
	public void click_add_education(){
		waitForExpectedElement(add_education).click();
	}
	public void click_add_work_history(){
		waitForExpectedElement(add_work_history).click();
	}
	public void click_submit_button(){
		waitForExpectedElement(submit_button).click();
	}
}
