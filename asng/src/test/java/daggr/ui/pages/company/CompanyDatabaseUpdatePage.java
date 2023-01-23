package daggr.ui.pages.company;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class CompanyDatabaseUpdatePage extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	@FindBy(xpath = "//input[@formcontrolname='company_name']")
	WebElement companyName_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement companyName_textbox_company_database_update;
	
	@FindBy(xpath = "//select[@formcontrolname='company_type']")
	WebElement companytype_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='company_type']/option")
	List<WebElement> company_type_options;
	
	@FindBy(xpath = "//select[@formcontrolname='company_status']")
	WebElement company_status_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='company_status']/option")
	List<WebElement> company_status_options;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Website']")
	WebElement website_url;
	
	@FindBy(xpath = "//select")
	WebElement selectList;
	
	@FindBy(xpath = "//input[@formcontrolname='employees']")
	WebElement employees_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='start_date']")
	WebElement start_date;
	
	@FindBy(xpath = "//input[@formcontrolname='end_date']")
	WebElement end_date;
	
	@FindBy(xpath = "//select[@formcontrolname='sector']")
	WebElement sector_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='sector']/option")
	List<WebElement> sector_options;
	
	@FindBy(xpath = "//input[@formcontrolname='industry']")
	WebElement industry_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='country']")
	WebElement country_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='state']")
	WebElement state_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='city']")
	WebElement city_textbox;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement autocomplete_dropdown;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_from_autocomplete;
	
	@FindBy(xpath = "//textarea[@formcontrolname='address']")
	WebElement address_textarea;
	
	@FindBy(xpath = "//input[@formcontrolname='phone_number']")
	WebElement phone_number;
	
	@FindBy(xpath = "//textarea[@formcontrolname='company_desscription']")
	WebElement company_description;
	
	@FindBy(xpath = "//input[@formcontrolname='ISIN']")
	WebElement ISIN_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='CIK']")
	WebElement CIK_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='CUSIP']")
	WebElement CUSIP_textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='SEDOL']")
	WebElement SEDOL_textbox;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement next_button;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement back_button;
	
	@FindBy(xpath = "//textarea[@formcontrolname='ir_section_link']")
	WebElement ir_section_link;
	
	@FindBy(xpath = "//textarea[@formcontrolname='pr_section_link']")
	WebElement pr_section_link;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_name']")
	WebElement ir_name;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_desigantion']")
	WebElement ir_designation;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_phone_number']")
	WebElement ir_phone_number;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_email']")
	WebElement ir_email;
	
	@FindBy(xpath = "//label[text()='Add More IR Executives ']")
	WebElement add_more_ir_executives;
	
	@FindBy(xpath = "//input[@id='respondingToEmailRadioYes']")
	WebElement respondingToEmailRadioYes;
	
	@FindBy(xpath = "//input[@id='respondingToEmailRadioNo']")
	WebElement respondingToEmailRadioNo;
	
	@FindBy(xpath = "//input[@id='respondToCallRadioYes']")
	WebElement respondToCallRadioYes;
	
	@FindBy(xpath = "//input[@id='respondToCallRadioNo']")
	WebElement respondToCallRadioNo;
	
	@FindBy(xpath = "//textarea[@formcontrolname='executives_section_link']")
	WebElement executives_section_link;
	
	@FindBy(xpath = "//textarea[@formcontrolname='analyst_coverage_link']")
	WebElement analyst_coverage_link;
	
	@FindBy(xpath = "//textarea[@formcontrolname='events_section_link']")
	WebElement events_section_link;
	
	@FindBy(xpath = "//input[@id='earningsAnnouncementRadioYes']")
	WebElement earningsAnnouncementRadioYes;
	
	@FindBy(xpath = "//input[@id='earningsAnnouncementRadioNo']")
	WebElement earningsAnnouncementRadioNo;
	
	@FindBy(xpath = "//input[@id='earningsCallConductedRadioYes']")
	WebElement earningsCallConductedRadioYes;
	
	@FindBy(xpath = "//input[@id='earningsCallConductedRadioNo']")
	WebElement earningsCallConductedRadioNo;
	
	@FindBy(xpath = "//input[@aria-label='multiselect-item']")
	WebElement multiselect_dropdown_input;
	
	@FindBy(xpath = "//ul[@class='item2']/li[@class='multiselect-item-checkbox ng-star-inserted']")
	List<WebElement> multiselect_dropdown_list;
	
	@FindBy(xpath = "//ul[@class='item2']")
	WebElement multiselect_dropdown_specified;
	
	@FindBy(xpath = "//input[@aria-label='multiselect-search']")
	WebElement multiselect_dropdown_search;
	
	@FindBy(xpath = "//ng-multiselect-dropdown//ul[2]//li[1]")
	WebElement multiselect_dropdown_search_specified;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']")
	WebElement earnings_call_frequency_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']/option")
	List<WebElement> earnings_call_frequency_options;
	
	@FindBy(xpath = "//input[@id='emailAlertSetupRadioYes']")
	WebElement emailAlertSetupRadioYes;
	
	@FindBy(xpath = "//input[@id='emailAlertSetupRadioNo']")
	WebElement emailAlertSetupRadioNo;
	
	@FindBy(xpath = "//input[@id='addToCalendarOptionRadioYes']")
	WebElement addToCalendarOptionRadioYes;
	
	@FindBy(xpath = "//input[@id='addToCalendarOptionRadioNo']")
	WebElement addToCalendarOptionRadioNo;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	
	@FindBy(xpath="//div[@class='dg-form-steps ng-star-inserted']/p")
	public WebElement company_profile_steps;
	
	@FindBy(xpath = "//ng-multiselect-dropdown")
	WebElement multiselect_dropdown;
	
	@FindBy(xpath = "//ul[@class='item1']/li[1]")
	WebElement multiselect_dropdown_select_all;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Language'])[1]/following::span[1]")
	WebElement language_dropdown;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']")
	WebElement earnings_call_frequency;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update_button;
	
	public CompanyDatabaseUpdatePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_company_database_update_selected(){
		selectbyVisibleText(selectList, "Company Database Update");
	}
	public void check_company_name(String company_name){
		check_company_steps_label(company_profile_steps, "Company Profile (1/3 steps)","Company Profile Steps-1 In update view");
		String tableValue = waitForExpectedElement(companyName_textbox).getAttribute("value");
		soft.assertEquals(tableValue, company_name, "Company Name");
	}
	public void check_company_type(String company_type){
		String tableValue = getTextBySelect(company_type_options, companytype_dropdown);
		soft.assertEquals(tableValue, company_type, "Company Type");
	}
	public void check_company_status(String company_status){
		String tableValue = getTextBySelect(company_status_options, company_status_dropdown);
		soft.assertEquals(tableValue, company_status, "Company Status");
	}
	public void check_website_url(String websiteUrl){
		String tableValue = waitForExpectedElement(website_url).getAttribute("value");
		soft.assertEquals(tableValue, websiteUrl, "Website Url");
	}
	public void check_employees(String employees){
		String tableValue = waitForExpectedElement(employees_textbox).getAttribute("value");
		soft.assertEquals(tableValue, employees, "Employees");
	}
	public void check_start_date(String startDate){
		String tableValue = waitForExpectedElement(start_date).getAttribute("value");
		soft.assertEquals(tableValue, startDate, "Start Date");
	}
	public void check_end_date(String endDate){
		String tableValue = waitForExpectedElement(end_date).getAttribute("value");
		soft.assertEquals(tableValue, endDate, "End Date");
	}
	public void check_sector(String sector){
		String tableValue = getTextBySelect(sector_options, sector_dropdown);
		if(sector.equals("")){
			sector = "Select One";
		}
		soft.assertEquals(tableValue, sector, "Sector");
	}
	public void check_industry(String industry){
		String tableValue = waitForExpectedElement(industry_textbox).getAttribute("value");
		soft.assertEquals(tableValue, industry, "Industry");
	}
	public void check_country(String country){
		String tableValue = waitForExpectedElement(country_textbox).getAttribute("value");
		soft.assertEquals(tableValue, country, "Country");
	}
	public void check_state(String state){
		String tableValue = waitForExpectedElement(state_textbox).getAttribute("value");
		soft.assertEquals(tableValue, state, "State");
	}
	public void check_city(String city){
		String tableValue = waitForExpectedElement(city_textbox).getAttribute("value");
		soft.assertEquals(tableValue, city, "City");
	}
	public void check_address(String address){
		String tableValue = waitForExpectedElement(address_textarea).getAttribute("value");
		soft.assertEquals(tableValue, address, "Address");
	}
	public void check_phone_number(String phoneNumber){
		String tableValue = waitForExpectedElement(phone_number).getAttribute("value");
		soft.assertEquals(tableValue, phoneNumber, "Phone Number");
	}
	public void check_company_description(String companyDescription){
		String tableValue = waitForExpectedElement(company_description).getAttribute("value");
		soft.assertEquals(tableValue, companyDescription, "Company Description");
	}
	public void check_ISIN(String ISIN){
		String tableValue = waitForExpectedElement(ISIN_textbox).getAttribute("value");
		soft.assertEquals(tableValue, ISIN, "ISIN");
	}
	public void check_CIK(String CIK){
		String tableValue = waitForExpectedElement(CIK_textbox).getAttribute("value");
		soft.assertEquals(tableValue, CIK, "CIK");
	}
	public void check_CUSIP(String CUSIP){
		String tableValue = waitForExpectedElement(CUSIP_textbox).getAttribute("value");
		soft.assertEquals(tableValue, CUSIP, "CUSIP");
	}
	public void check_SEDOL(String SEDOL){
		String tableValue = waitForExpectedElement(SEDOL_textbox).getAttribute("value");
		soft.assertEquals(tableValue, SEDOL, "SEDOL");
	}
	public void check_ir_section_link(String irSectionLink){
		check_company_steps_label(company_profile_steps, "Company Profile (2/3 steps)","Company Profile Steps-2 In update view");
		String tableValue = waitForExpectedElement(ir_section_link).getAttribute("value");
		soft.assertEquals(tableValue, irSectionLink, "Ir Section Link");
	}
	public void check_pr_section_link(String prSectionLink){
		String tableValue = waitForExpectedElement(pr_section_link).getAttribute("value");
		soft.assertEquals(tableValue, prSectionLink, "Pr Section Link");
	}
	public void check_ir_name(String irName){
		String tableValue = waitForExpectedElement(ir_name).getAttribute("value");
		soft.assertEquals(tableValue, irName, "Ir Name");
	}
	public void check_ir_designation(String irDesignation){
		String tableValue = waitForExpectedElement(ir_designation).getAttribute("value");
		soft.assertEquals(tableValue, irDesignation, "Ir Designation");
	}
	public void check_ir_phone_number(String irPhoneNumber){
		String tableValue = waitForExpectedElement(ir_phone_number).getAttribute("value");
		soft.assertEquals(tableValue, irPhoneNumber, "Ir Phone Number");
	}
	public void check_ir_email(String irEmail){
		String tableValue = waitForExpectedElement(ir_email).getAttribute("value");
		soft.assertEquals(tableValue, irEmail, "Ir Email");
	}
	public void check_is_IR_Responding_to_Email(String is_IR_Responding_to_Email){
		String tableValue;
		if(waitForExpectedElement(respondingToEmailRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(respondingToEmailRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, is_IR_Responding_to_Email, "Is IR Responding to Email");
	}
	public void check_is_IR_Responding_to_Phone_Call(String is_IR_Responding_to_Phone_Call){
		String tableValue;
		if(waitForExpectedElement(respondToCallRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(respondToCallRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, is_IR_Responding_to_Phone_Call, "Is IR Responding to Phone Call");
	}
	public void check_executives_section_link(String executivesSectionLink){
		String tableValue = waitForExpectedElement(executives_section_link).getAttribute("value");
		soft.assertEquals(tableValue, executivesSectionLink, "Executives Section Link");
	}
	public void check_analyst_coverage_link(String analystCoverageLink){
		String tableValue = waitForExpectedElement(analyst_coverage_link).getAttribute("value");
		soft.assertEquals(tableValue, analystCoverageLink, "Analyst Coverage Link");
	}
	public void check_events_section_link(String eventsSectionLink){
		check_company_steps_label(company_profile_steps, "Company Profile (3/3 steps)","Company Profile Steps-3 In update view");
		String tableValue = waitForExpectedElement(events_section_link).getAttribute("value");
		soft.assertEquals(tableValue, eventsSectionLink, "Events Section Link");
	}
	public void check_earnings_announcement(String earnings_announcement){
		String tableValue;
		if(waitForExpectedElement(earningsAnnouncementRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(earningsAnnouncementRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, earnings_announcement, "Earnings Announcement");
	}
	public void check_earnings_call_conducted(String earnings_call_conducted){
		String tableValue;
		if(waitForExpectedElement(earningsCallConductedRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(earningsCallConductedRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, earnings_call_conducted, "Earnings Call Conducted");
	}
	public void check_earnings_call_frequency(String earnings_call_frequency){
		String tableValue = getTextBySelect(earnings_call_frequency_options, earnings_call_frequency_dropdown);
		if(earnings_call_frequency.equals("")){
			earnings_call_frequency = "Select One";
		}
		soft.assertEquals(tableValue, earnings_call_frequency, "Earnings Call Frequency");
	}
	public void check_email_alert_setup(String email_alert_setup){
		String tableValue;
		if(waitForExpectedElement(emailAlertSetupRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(emailAlertSetupRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, email_alert_setup, "Email Alert Setup");
	}
	public void check_add_calendar_to_option(String add_calendar_to_option){
		String tableValue;
		if(waitForExpectedElement(addToCalendarOptionRadioYes).isSelected()) {
			tableValue = "Yes";
		}
		else if(waitForExpectedElement(addToCalendarOptionRadioNo).isSelected()){
			tableValue = "No";
		}
		else {
			tableValue = "";
		}
		soft.assertEquals(tableValue, add_calendar_to_option, "Add Calendar to Option");
	}
	public void check_comments(String commentsValue){
		String tableValue = waitForExpectedElement(comments).getAttribute("value");
		soft.assertEquals(tableValue, commentsValue, "Comments Value");
	}
	public void check_languages(String languages){
		check_languages_in_multiselect(languages,multiselect_dropdown_specified,"Language");
	}
	public void enter_database_update_companyName(String compayName) {
		waitForExpectedElement(companyName_textbox_company_database_update).sendKeys(compayName);
		waitForExpectedElement(autocomplete_dropdown).isDisplayed();
		select_from_dropdown(select_from_autocomplete, compayName);
		//waitForExpectedElement(select_from_dropdown).click();
		sleep(3000);
		check_after_sending_keys(companyName_textbox_company_database_update, compayName, "Compay Name");
	}
	public void update_the_website(String webSite){
		check_company_steps_label(company_profile_steps, "Company Profile (1/3 steps)","Company Profile Steps-1 In update");
		waitForExpectedElement(website_url).clear();
		if(!webSite.equals("")){
			waitForExpectedElement(website_url).sendKeys(webSite);
		}
		check_after_sending_keys(website_url, webSite, "Updated website");
	}
	public void update_employees(String employees){
		waitForExpectedElement(employees_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(employees_textbox).sendKeys(Keys.DELETE);
		if(!employees.equals("")){
			waitForExpectedElement(employees_textbox).sendKeys(employees);
		}
		check_after_sending_keys(employees_textbox, employees, "Updated Employees");
	}
	public void update_start_date(String startDate){
		waitForExpectedElement(start_date).clear();
		if(!startDate.equals("")){
			waitForExpectedElement(start_date).click();
			datepickerDateSelect(startDate);
		}
		check_after_sending_keys(start_date, startDate, "Updated Start Date");
	}
	public void update_sector(String sector){
		if(!sector.equals("")){
			selectbyVisibleText(sector_dropdown, sector);
		}else{
			selectbyVisibleText(sector_dropdown, "Select One");
		}
		check_after_select(sector_options, sector_dropdown, sector, "Updated Sector");
	}
	public void update_industry(String industry){
		waitForExpectedElement(industry_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(industry_textbox).sendKeys(Keys.DELETE);
		if(!industry.equals("")){
			waitForExpectedElement(industry_textbox).sendKeys(industry);
		}
		check_after_sending_keys(industry_textbox, industry, "Updated Industry");
	}
	public void update_address(String address){
		waitForExpectedElement(address_textarea).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(address_textarea).sendKeys(Keys.DELETE);
		if(!address.equals("")){
			waitForExpectedElement(address_textarea).sendKeys(address);
		}
		check_after_sending_keys(address_textarea, address, "Updated Address");
	}
	public void update_phone_number(String phoneNumber){
		waitForExpectedElement(phone_number).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(phone_number).sendKeys(Keys.DELETE);
		if(!phoneNumber.equals("")){
			waitForExpectedElement(phone_number).sendKeys(phoneNumber);
		}
		check_after_sending_keys(phone_number, phoneNumber, "Updated Phone Number");
	}
	public void update_company_description(String companyDescription){
		waitForExpectedElement(company_description).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(company_description).sendKeys(Keys.DELETE);
		if(!companyDescription.equals("")){
			waitForExpectedElement(company_description).sendKeys(companyDescription);
		}
		check_after_sending_keys(company_description, companyDescription, "Updated Company Description");
	}
	public void update_ISIN(String ISIN){
		waitForExpectedElement(ISIN_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ISIN_textbox).sendKeys(Keys.DELETE);
		if(!ISIN.equals("")){
			waitForExpectedElement(ISIN_textbox).sendKeys(ISIN);
		}
		check_after_sending_keys(ISIN_textbox, ISIN, "Updated ISIN");
	}
	public void update_CIK(String CIK){
		waitForExpectedElement(CIK_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(CIK_textbox).sendKeys(Keys.DELETE);
		if(!CIK.equals("")){
			waitForExpectedElement(CIK_textbox).sendKeys(CIK);
		}
		check_after_sending_keys(CIK_textbox, CIK, "Updated CIK");
	}
	public void update_CUSIP(String CUSIP){
		waitForExpectedElement(CUSIP_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(CUSIP_textbox).sendKeys(Keys.DELETE);
		if(!CUSIP.equals("")){
			waitForExpectedElement(CUSIP_textbox).sendKeys(CUSIP);
		}
		check_after_sending_keys(CUSIP_textbox, CUSIP, "Updated CUSIP");
	}
	public void update_SEDOL(String SEDOL){
		waitForExpectedElement(SEDOL_textbox).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(SEDOL_textbox).sendKeys(Keys.DELETE);
		if(!SEDOL.equals("")){
			waitForExpectedElement(SEDOL_textbox).sendKeys(SEDOL);
		}
		check_after_sending_keys(SEDOL_textbox, SEDOL, "Updated SEDOL");
	}
	public void update_ir_section_link(String irSectionLink){
		check_company_steps_label(company_profile_steps, "Company Profile (2/3 steps)","Company Profile Steps-2 In update");
		waitForExpectedElement(ir_section_link).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ir_section_link).sendKeys(Keys.DELETE);
		if(!irSectionLink.equals("")){
			waitForExpectedElement(ir_section_link).sendKeys(irSectionLink);
		}
		check_after_sending_keys(ir_section_link, irSectionLink, "Updated IR Section Link");
	}
	public void update_pr_section_link(String prSectionLink){
		waitForExpectedElement(pr_section_link).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(pr_section_link).sendKeys(Keys.DELETE);
		if(!prSectionLink.equals("")){
			waitForExpectedElement(pr_section_link).sendKeys(prSectionLink);
		}
		check_after_sending_keys(pr_section_link, prSectionLink, "Updated PR Section Link");
	}
	public void update_ir_name(String irName){
		waitForExpectedElement(ir_name).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ir_name).sendKeys(Keys.DELETE);
		if(!irName.equals("")){
			waitForExpectedElement(ir_name).sendKeys(irName);
		}
		check_after_sending_keys(ir_name, irName, "Updated IR Name");
	}
	public void update_ir_designation(String irDesignation){
		waitForExpectedElement(ir_designation).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ir_designation).sendKeys(Keys.DELETE);
		if(!irDesignation.equals("")){
			waitForExpectedElement(ir_designation).sendKeys(irDesignation);
		}
		check_after_sending_keys(ir_designation, irDesignation, "Updated IR Designation");
	}
	public void update_ir_phone_number(String irPhoneNumber){
		waitForExpectedElement(ir_phone_number).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ir_phone_number).sendKeys(Keys.DELETE);
		if(!irPhoneNumber.equals("")){
			waitForExpectedElement(ir_phone_number).sendKeys(irPhoneNumber);
		}
		check_after_sending_keys(ir_phone_number, irPhoneNumber, "Updated IR Phone Number");
	}
	public void update_ir_email(String irEmail){
		waitForExpectedElement(ir_email).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(ir_email).sendKeys(Keys.DELETE);
		if(!irEmail.equals("")){
			waitForExpectedElement(ir_email).sendKeys(irEmail);
		}
		check_after_sending_keys(ir_email, irEmail, "Updated IR Email");
	}
	public void update_ir_responding_to_email(String ir_responding_to_email){
		if(ir_responding_to_email.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(respondingToEmailRadioYes).click();
		}
		else if(ir_responding_to_email.equalsIgnoreCase("No")){
			waitForExpectedElement(respondingToEmailRadioNo).click();
		}
		check_after_radio_select(respondingToEmailRadioYes, respondingToEmailRadioNo, ir_responding_to_email, "Updated IR Responding to Email");
	}
	public void update_ir_responding_to_call(String ir_responding_to_call){
		if(ir_responding_to_call.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(respondToCallRadioYes).click();
		}
		else if(ir_responding_to_call.equalsIgnoreCase("No")){
			waitForExpectedElement(respondToCallRadioNo).click();
		}
		check_after_radio_select(respondToCallRadioYes, respondToCallRadioNo, ir_responding_to_call, "Updated IR Responding to Phone Call");
	}
	public void update_executives_section_link(String executivesSectionLink){
		waitForExpectedElement(executives_section_link).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(executives_section_link).sendKeys(Keys.DELETE);
		if(!executivesSectionLink.equals("")){
			waitForExpectedElement(executives_section_link).sendKeys(executivesSectionLink);
		}
		check_after_sending_keys(executives_section_link, executivesSectionLink, "Updated Executives Section Link");
	}
	public void update_analyst_coverage_link(String analystCoverageLink){
		waitForExpectedElement(analyst_coverage_link).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(analyst_coverage_link).sendKeys(Keys.DELETE);
		if(!analystCoverageLink.equals("")){
			waitForExpectedElement(analyst_coverage_link).sendKeys(analystCoverageLink);
		}
		check_after_sending_keys(analyst_coverage_link, analystCoverageLink, "Updated Analyst Coverage Link");
	}
	public void update_events_section_link(String eventSectionLink){
		check_company_steps_label(company_profile_steps, "Company Profile (3/3 steps)","Company Profile Steps-3 In update");
		waitForExpectedElement(events_section_link).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(events_section_link).sendKeys(Keys.DELETE);
		if(!eventSectionLink.equals("")){
			waitForExpectedElement(events_section_link).sendKeys(eventSectionLink);
		}
		check_after_sending_keys(events_section_link, eventSectionLink, "Updated Events Section Link");
	}
	public void update_earnings_announcement(String earnings_announcement_radio){
		if(earnings_announcement_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(earningsAnnouncementRadioYes).click();
		}
		else if(earnings_announcement_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(earningsAnnouncementRadioNo).click();
		}
		check_after_radio_select(earningsAnnouncementRadioYes, earningsAnnouncementRadioNo, earnings_announcement_radio, "Updated Earnings Announcement");
	}
	public void update_earnings_call_conducted(String earnings_call_conducted_radio){
		if(earnings_call_conducted_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(earningsCallConductedRadioYes).click();
		}
		else if(earnings_call_conducted_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(earningsCallConductedRadioNo).click();
		}
		check_after_radio_select(earningsCallConductedRadioYes, earningsCallConductedRadioNo, earnings_call_conducted_radio, "Updated Earnings Call Conducted");
	}
	
	public void update_multiselect_dropdown(String languages){
		if(!languages.equals("")){
			waitForExpectedElement(multiselect_dropdown).click();
			waitForExpectedElement(multiselect_dropdown_select_all).click();
			waitForExpectedElement(multiselect_dropdown_select_all).click();
			String languageArray[]= languages.split(",");
			Arrays.sort(languageArray);
			List<WebElement> languageList=waitForExpectedElement(multiselect_dropdown_specified).findElements(By.tagName("li"));
			for (WebElement li : languageList) {
				for(int i=0 ;i<languageArray.length;i++) {
					if (li.getText().equalsIgnoreCase(languageArray[i])) {
						li.click();
					}
				}
			}
			waitForExpectedElement(language_dropdown).click();
		}else{
			waitForExpectedElement(language_dropdown).click();
			waitForExpectedElement(multiselect_dropdown_select_all).click();
			waitForExpectedElement(multiselect_dropdown_select_all).click();
			waitForExpectedElement(language_dropdown).click();
		}
		check_languages_after_sending_keys(multiselect_dropdown_specified, languages, "Updated Language");
	}
	public void update_the_earnings_call_frequency(String earningsCallFrequency){
		if(!earningsCallFrequency.equals("")){
			selectbyVisibleText(earnings_call_frequency, earningsCallFrequency);
		}else{
			selectbyVisibleText(earnings_call_frequency,"Select One");
		}
		check_after_select(earnings_call_frequency_options, earnings_call_frequency, earningsCallFrequency, "Updated Earnings Call Frequency");
	}
	public void update_email_alert_setup(String email_alert_setup_radio){
		if(email_alert_setup_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(emailAlertSetupRadioYes).click();
		}
		else if(email_alert_setup_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(emailAlertSetupRadioNo).click();
		}
		check_after_radio_select(emailAlertSetupRadioYes, emailAlertSetupRadioNo, email_alert_setup_radio, "Updated Email alerts set Up");
	}
	public void update_add_to_calendar_option(String add_to_calendar_option){
		if(add_to_calendar_option.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(addToCalendarOptionRadioYes).click();
		}
		else if(add_to_calendar_option.equalsIgnoreCase("No")){
			waitForExpectedElement(addToCalendarOptionRadioNo).click();
		}
		check_after_radio_select(addToCalendarOptionRadioYes, addToCalendarOptionRadioNo, add_to_calendar_option, "Updated Add to Calendar Option");
	}
	public void update_comments(String companyComments){
		waitForExpectedElement(comments).sendKeys(Keys.CONTROL + "a");
		waitForExpectedElement(comments).sendKeys(Keys.DELETE);
		if(!companyComments.equals("")){
			waitForExpectedElement(comments).sendKeys(companyComments);
		}
		check_after_sending_keys(comments, companyComments, "Updated Comments");
	}
	public void click_next_button(){
		waitForExpectedElement(next_button).click();
	}
	public void click_update_button(){
		waitForExpectedElement(update_button).click();
	}
}
