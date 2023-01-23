package daggr.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class HomePage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//div[@id='navbarSupportedContent']")
	public WebElement navbar;
	
	@FindBy(xpath="//div[@id='navbarSupportedContent']/h2[text()='DAggr']")
	public WebElement title;
	
	@FindBy(xpath="//a[normalize-space()='File']")
	public WebElement fileMenu;
	
	@FindBy(xpath="//a[normalize-space()='Get Job']")
	public WebElement get_job;
	
	@FindBy(xpath="//a[normalize-space()='Manual Job']")
	public WebElement manual_job;
	
	@FindBy(xpath="//a[normalize-space()='Mark Relevancy']")
	public WebElement mark_relevancy;
	
	@FindBy(xpath="//a[normalize-space()='Broken Urls']")
	public WebElement broken_urls;
	
	@FindBy(xpath="//a[normalize-space()='Verify Company Actions']")
	public WebElement verify_company_actions;
	
	@FindBy(xpath="//a[normalize-space()='Edit']")
	public WebElement editMenu;
	
	@FindBy(xpath="//a[normalize-space()='Company']")
	public WebElement company;
	
	@FindBy(xpath="//a[normalize-space()='Events']")
	public WebElement events;
	
	@FindBy(xpath="//a[normalize-space()='Securities']")
	public WebElement securities;
	
	@FindBy(xpath="//a[normalize-space()='Company Actions']")
	public WebElement company_actions;
	
	@FindBy(xpath="//a[normalize-space()='Irrelevant']")
	public WebElement irrelevant;
	
	@FindBy(xpath="//a[normalize-space()='Persons List']")
	public WebElement personsList;
	
	@FindBy(xpath="//a[normalize-space()='Company data source']")
	public WebElement companyDataSource;
	
	@FindBy(xpath="//a[normalize-space()='Manage']")
	public WebElement manageMenu;
	
	@FindBy(xpath="//a[normalize-space()='Data source']")
	public WebElement data_source;
	
	@FindBy(xpath="//a[normalize-space()='Event Post Status']")
	public WebElement event_post_status;
	
	@FindBy(xpath="//a[normalize-space()='Jobs']")
	public WebElement jobs;
	
	@FindBy(xpath="//a[normalize-space()='Manage Keywords']")
	public WebElement manage_keywords;
	
	@FindBy(xpath="//a[normalize-space()='Job Priority']")
	public WebElement job_priority;
	
	@FindBy(xpath="//a[normalize-space()='Users']")
	public WebElement users;
	
	@FindBy(xpath="//a[normalize-space()='File Viewer']")
	public WebElement file_viewer;
	
	@FindBy(xpath="//a[normalize-space()='Help']")
	public WebElement helpMenu;
	
	@FindBy(xpath="//a[normalize-space()='FAQ']")
	public WebElement faq;
	
	@FindBy(xpath="//a[normalize-space()='User Manual']")
	public WebElement user_manual;
	
	@FindBy(xpath="//a[normalize-space()='Shortcut Keys']")
	public WebElement shortcut_keys;
	
	@FindBy(xpath="//a[normalize-space()='Log Out']")
	public WebElement logout;
	
	@FindBy(xpath="//a[normalize-space()='Dashboard']")
	public WebElement dashboard;
	
	@FindBy(xpath="//a[normalize-space()='Font']")
	public WebElement font;
	
	@FindBy(xpath="//a[@class='us-name']")
	public WebElement username;
	
	@FindBy(xpath="//span[@class='us-letter']")
	public WebElement username_letter;
	
	@FindBy(xpath="//span[@class='sub-name']")
	public WebElement operator_type;
	
	public HomePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_home_page_is_displayed()throws Exception{
		waitForExpectedElement(fileMenu);
	}
	public void is_navigate_file_get_job(){
		waitForExpectedElement(fileMenu);
		waitForExpectedElement(get_job).click();
	}
	public void is_navigate_file_manual_job(){
		waitForExpectedElement(fileMenu).click();
		waitForExpectedElement(manual_job).click();
	}
	public void is_navigate_file_mark_relevancy() {
		waitForExpectedElement(fileMenu).click();
		waitForExpectedElement(mark_relevancy).click();
	}
	public void is_navigate_file_broken_urls() {
		waitForExpectedElement(fileMenu).click();
		waitForExpectedElement(broken_urls).click();
	}
	public void is_navigate_file_verify_company_actions() {
		waitForExpectedElement(fileMenu).click();
		waitForExpectedElement(verify_company_actions).click();
	}
	public void is_navigate_edit_company(){
		waitForExpectedElement(editMenu).click();
		if(isAlertPresents()) {
			WebDriverHelper.getDriver().switchTo().alert().accept();
		}
		sleep(4000);
		waitForExpectedElement(company).click();
	}
	public void is_navigate_edit_events(){
		sleep(1000);
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(events).click();
	}
	public void is_navigate_edit_securities(){
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(securities).click();
	}
	public void is_navigate_edit_company_actions(){
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(company_actions).click();
	}
	public void is_navigate_edit_company_datasource(){
		waitForExpectedElement(editMenu).click();
		if(isAlertPresents()) {
			WebDriverHelper.getDriver().switchTo().alert().accept();
		}
		sleep(4000);
		waitForExpectedElement(companyDataSource).click();
	}
	public void is_navigate_manage_datasource(){
		waitForExpectedElement(manageMenu).click();
		waitForExpectedElement(data_source).click();
	}
	public void click_logout() {
		waitForExpectedElement(username_letter).click();
		waitForExpectedElement(logout).click();
		sleep(4000);
	}
	public void verify_default_elements(String userName,String operatorType) {
		waitForExpectedElement(navbar).isDisplayed();
		sleep(4000);
		soft.assertTrue(navbar.isDisplayed(),"Nav Bar is not displayed");
		soft.assertTrue(title.isDisplayed(),"Title is not displayed");
		soft.assertTrue(fileMenu.isDisplayed(),"File Menu is not displayed");
		soft.assertTrue(editMenu.isDisplayed(),"Edit Menu is not displayed");
		soft.assertTrue(manageMenu.isDisplayed(),"Manage Menu is not displayed");
		soft.assertTrue(helpMenu.isDisplayed(),"Manage Menu is not displayed");
		is_file_items_displayed();
		is_edit_items_displayed();
		is_manage_items_displayed();
		is_help_items_displayed();
		is_username_dropdown_items_displayed();
		is_username_letter_dislayed(userName);
		is_username_dislayed(userName);
		is_operator_type_dislayed(operatorType);
	}
	public void is_file_items_displayed() {
		navigate_to_file_menu();
		soft.assertTrue(get_job.isDisplayed(),"Get Job in file menu is not displayed");
		soft.assertTrue(manual_job.isDisplayed(),"Manual Job in file menu is not displayed");
		soft.assertTrue(mark_relevancy.isDisplayed(),"Mark Relevancy in file menu is not displayed");
		soft.assertTrue(broken_urls.isDisplayed(),"Broken Urls in file menu is not displayed");
		soft.assertTrue(verify_company_actions.isDisplayed(),"Verify Company Actions in file menu is not displayed");
	}
	public void is_edit_items_displayed() {
		navigate_to_edit_menu();
		soft.assertTrue(company.isDisplayed(),"Company in Edit menu is not displayed");
		soft.assertTrue(securities.isDisplayed(),"Securities in Edit menu is not displayed");
		soft.assertTrue(events.isDisplayed(),"Events in Edit menu is not displayed");
		soft.assertTrue(company_actions.isDisplayed(),"Company Actions in Edit menu is not displayed");
		soft.assertTrue(irrelevant.isDisplayed(),"Irrelevant in Edit menu is not displayed");
		soft.assertTrue(personsList.isDisplayed(),"Persons List in Edit menu is not displayed");
		soft.assertTrue(companyDataSource.isDisplayed(),"Company data source in Edit menu is not displayed");
	}
	public void is_manage_items_displayed() {
		navigate_to_manage_menu();
		soft.assertTrue(event_post_status.isDisplayed(),"Event Post Status in Manage menu is not displayed");
		soft.assertTrue(data_source.isDisplayed(),"Data source in Manage menu is not displayed");
		soft.assertTrue(jobs.isDisplayed(),"Jobs in Manage menu is not displayed");
		soft.assertTrue(manage_keywords.isDisplayed(),"Manage Keywords in Manage menu is not displayed");
		soft.assertTrue(job_priority.isDisplayed(),"Job Priority in Manage menu is not displayed");
		soft.assertTrue(users.isDisplayed(),"Users in Manage menu is not displayed");
		soft.assertTrue(file_viewer.isDisplayed(),"File Viewer in Manage menu is not displayed");
	}
	public void is_help_items_displayed() {
		navigate_to_help_menu();
		soft.assertTrue(faq.isDisplayed(),"FAQ in Help menu is not displayed");
		soft.assertTrue(user_manual.isDisplayed(),"User Manual in Help menu is not displayed");
		soft.assertTrue(shortcut_keys.isDisplayed(),"Shortcut Keys in Help menu is not displayed");
	}
	public void navigate_to_file_menu(){
		moveToElement(fileMenu).perform();
	}
	public void navigate_to_edit_menu(){
		moveToElement(editMenu).perform();
	}
	public void navigate_to_manage_menu(){
		moveToElement(manageMenu).perform();
	}
	public void navigate_to_help_menu(){
		moveToElement(helpMenu).perform();
	}
	public void is_username_letter_dislayed(String userName) {
		soft.assertTrue(username_letter.isDisplayed(),"User Name Letter is not displayed");
		char[] charArray = userName.toCharArray();
		soft.assertEquals(username_letter.getText(), String.valueOf(charArray[0]), "User Letter");
	}
	public void is_username_dislayed(String userName) {
		soft.assertTrue(username.isDisplayed(),"User Name is not displayed");
		String usernameValue = seperate_username_and_operator(username.getText())[0];
		soft.assertEquals(usernameValue, userName, "User Name");
	}
	public void is_operator_type_dislayed(String operatorType) {
		soft.assertTrue(operator_type.isDisplayed(),"Operator Type is not displayed");
		String usernameValue = seperate_username_and_operator(username.getText())[1];
		soft.assertEquals(usernameValue, operatorType, "Operator Type");
	}
	public String[] seperate_username_and_operator(String username) {
		String[] username_array = username.split("\\n");
		return username_array;
	}
	public void is_username_dropdown_items_displayed(){
		waitForExpectedElement(username_letter).click();
		soft.assertTrue(dashboard.isDisplayed(),"Dashboard in username menu is not displayed");
		soft.assertTrue(font.isDisplayed(),"Font in username menu is not displayed");
		soft.assertTrue(logout.isDisplayed(),"Logout in username menu is not displayed");
		waitForExpectedElement(username_letter).click();
	}
	public void is_navigate_edit_company(String value){
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(company).click();
		sleep(3000);
		if(!value.equals("")){
			ConfirmationPopup popup = new ConfirmationPopup();
			if(popup.verify_skip_confirmation_popup()){
				popup.click_yes_button();
			}
		}
	}
	public void is_navigate_edit_company_datasource(String value){
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(companyDataSource).click();
		sleep(3000);
		if(!value.equals("")){
			ConfirmationPopup popup = new ConfirmationPopup();
			if(popup.verify_skip_confirmation_popup()){
				popup.click_yes_button();
			}
		}
	}
	public void is_navigate_edit_persons_list(String value){
		waitForExpectedElement(editMenu).click();
		waitForExpectedElement(personsList).click();
		sleep(3000);
		if(!value.equals("")){
			ConfirmationPopup popup = new ConfirmationPopup();
			if(popup.verify_skip_confirmation_popup()){
				popup.click_yes_button();
			}
		}
	}
}
