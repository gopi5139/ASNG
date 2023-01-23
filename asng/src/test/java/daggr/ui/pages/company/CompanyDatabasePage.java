package daggr.ui.pages.company;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.WebDriverHelper;
import utils.PageObjectUtils;


public class CompanyDatabasePage extends PageObjectUtils{
	
	@FindBy(xpath="//option[text()='Company Database']")
	public WebElement select_company_database;
	
	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement article_url_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement companyName_textbox;
	
	@FindBy(xpath = "//select[@formcontrolname='company_type']")
	WebElement company_type;
	
	@FindBy(xpath = "//select[@formcontrolname='company_status']")
	WebElement company_status;
	
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
	
	@FindBy(xpath = "//input[@formcontrolname='industry']")
	WebElement industry_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Select country']")
	WebElement country_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Select state']")
	WebElement state_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Select city']")
	WebElement city_textbox;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement select_from_dropdown;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	List<WebElement> select_autocomplete;
	
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
	
	@FindBy(xpath = "//ng-multiselect-dropdown")
	WebElement multiselect_dropdown;
	
	@FindBy(xpath = "//ng-multiselect-dropdown//ul[1]")
	WebElement multiselect_dropdown_all_language;
	
	@FindBy(xpath = "//span[@style='float:right !important;padding-right:4px']")
	WebElement language_dropdown_icon;
	
	@FindBy(xpath = "//ul[@class='item2']")
	WebElement multiselect_dropdown_specified;
	
	@FindBy(xpath = "//input[@aria-label='multiselect-search']")
	WebElement multiselect_dropdown_search;
	
	@FindBy(xpath = "//ng-multiselect-dropdown//ul[2]//li[1]")
	WebElement multiselect_dropdown_search_specified;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']")
	WebElement earnings_call_frequency;
	
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
	
	@FindBy(xpath = "//input[@id='enum_answer_rss']")
	WebElement enum_answer_rss;
	
	@FindBy(xpath = "//input[@id='enum_answer_html']")
	WebElement enum_answer_html;
	
	@FindBy(xpath = "//input[@id='enum_answer_manual']")
	WebElement enum_answer_manual;
	
	@FindBy(xpath = "//textarea[@formcontrolname='company_data_source_link']")
	WebElement company_data_source_link;
	
	@FindBy(xpath = "//select[@formcontrolname='company_data_source_status']")
	WebElement company_data_source_status;
	
	@FindBy(xpath = "//div[@class='input-container']//input[@placeholder='Select One']")
	WebElement scraping_frequency;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement scraping_frequency_select;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']")
	WebElement ticker;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']")
	WebElement exchange;
	
	@FindBy(xpath = "//div[@class='dg-content']//li[1]//div[1]//a[1]")
	WebElement exchange_select;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']")
	WebElement security_type;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']")
	WebElement security_category;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_start_date']")
	WebElement trading_start_date;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_end_date']")
	WebElement trading_end_date;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']")
	WebElement trading_status;
	
	@FindBy(xpath = "//input[@id='primaryTickerRadioYes']")
	WebElement primaryTickerRadioYes;
	
	@FindBy(xpath = "//input[@id='primaryTickerRadioNo']")
	WebElement primaryTickerRadioNo;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Save & Add New']")
	WebElement saveButton;
	
	@FindBy(xpath = "//input[@formcontrolname='url']/preceding-sibling::label")
	WebElement article_url_label;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']/ancestor::app-shared-company-search/preceding-sibling::label")
	WebElement company_name_label;
	
	@FindBy(xpath = "//select[@formcontrolname='company_type']/preceding-sibling::label")
	WebElement company_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='company_type']/option")
	List<WebElement> company_type_options;
	
	@FindBy(xpath = "//input[@id='respondingToEmailRadioYes']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement respondingToEmailRadioLabel;
	
	@FindBy(xpath = "//select[@formcontrolname='company_status']/preceding-sibling::label")
	WebElement company_status_label;
	
	@FindBy(xpath = "//select[@formcontrolname='company_status']/option")
	List<WebElement> company_status_options;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Website']/preceding-sibling::label")
	WebElement website_label;
	
	@FindBy(xpath = "//input[@formcontrolname='employees']/preceding-sibling::label")
	WebElement employees_label;
	
	@FindBy(xpath = "//input[@formcontrolname='start_date']/preceding-sibling::label")
	WebElement start_date_label;
	
	@FindBy(xpath = "//input[@formcontrolname='end_date']/preceding-sibling::label")
	WebElement end_date_label;
	
	@FindBy(xpath = "//select[@formcontrolname='sector']/preceding-sibling::label")
	WebElement sector_label;
	
	@FindBy(xpath = "//select[@formcontrolname='sector']/option")
	List<WebElement> sector_options;
	
	@FindBy(xpath = "//input[@formcontrolname='industry']/preceding-sibling::label")
	WebElement industry_label;
	
	@FindBy(xpath = "//input[@placeholder='Select country']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement country_label;
	
	@FindBy(xpath = "//input[@placeholder='Select state']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement state_label;
	
	@FindBy(xpath = "//input[@placeholder='Select city']/ancestor::app-country-state-city-search/preceding-sibling::label")
	WebElement city_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='address']/preceding-sibling::label")
	WebElement address_label;
	
	@FindBy(xpath = "//input[@formcontrolname='phone_number']/preceding-sibling::label")
	WebElement phone_number_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='company_desscription']/preceding-sibling::label")
	WebElement company_description_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ISIN']/preceding-sibling::label")
	WebElement ISIN_label;
	
	@FindBy(xpath = "//input[@formcontrolname='CIK']/preceding-sibling::label")
	WebElement CIK_label;
	
	@FindBy(xpath = "//input[@formcontrolname='CUSIP']/preceding-sibling::label")
	WebElement CUSIP_label;
	
	@FindBy(xpath = "//input[@formcontrolname='SEDOL']/preceding-sibling::label")
	WebElement SEDOL_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='ir_section_link']/preceding-sibling::label")
	WebElement ir_section_link_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='pr_section_link']/preceding-sibling::label")
	WebElement pr_section_link_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_name']/preceding-sibling::label")
	WebElement ir_name_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_desigantion']/preceding-sibling::label")
	WebElement ir_designation_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_phone_number']/preceding-sibling::label")
	WebElement ir_phone_number_label;
	
	@FindBy(xpath = "//input[@formcontrolname='ir_email']/preceding-sibling::label")
	WebElement ir_email_label;
	
	@FindBy(xpath = "//input[@id='respondToCallRadioYes']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement respondToCallRadioLabel;
	
	@FindBy(xpath = "//textarea[@formcontrolname='executives_section_link']/preceding-sibling::label")
	WebElement executives_section_link_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='analyst_coverage_link']/preceding-sibling::label")
	WebElement analyst_coverage_link_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='events_section_link']/preceding-sibling::label")
	WebElement events_section_link_label;
	
	@FindBy(xpath = "//input[@formcontrolname='earnings_announcement']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement earningsAnnouncementRadioLabel;
	
	@FindBy(xpath = "//input[@formcontrolname='earnings_call_conducted']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement earningsCallConductedRadioLabel;
	
	@FindBy(xpath = "//app-languages/preceding-sibling::label")
	WebElement languages_label;
	
	@FindBy(xpath = "//div[@class='multiselect-dropdown']/div[1]")
	WebElement get_languages;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']/preceding-sibling::label")
	WebElement earnings_call_frequency_label;
	
	@FindBy(xpath = "//select[@formcontrolname='earnings_call_frequency']/option")
	List<WebElement> earnings_call_frequency_options;
	
	@FindBy(xpath = "//input[@formcontrolname='email_alerts_set_up']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement emailAlertSetupRadioLabel;
	
	@FindBy(xpath = "//input[@formcontrolname='add_to_calendar_option']/parent::div/parent::div/parent::div/preceding-sibling::label")
	WebElement addToCalendarOptionRadioLabel;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']/preceding-sibling::label")
	WebElement comments_label;
	
	@FindBy(xpath = "//div[@formgroupname='rss_fields']//p")
	WebElement tracking_type_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='company_data_source_link']/preceding-sibling::label")
	WebElement traking_link_label;
	
	@FindBy(xpath = "//select[@formcontrolname='company_data_source_status']/preceding-sibling::label")
	WebElement traking_status_label;
	
	@FindBy(xpath = "//div[@class='input-container']/parent::div/parent::ng-autocomplete/preceding-sibling::label")
	WebElement scraping_frequency_label;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']/preceding-sibling::label")
	WebElement comments_datasource_label;
	
	@FindBy(xpath = "//select[@formcontrolname='company_data_source_status']/option")
	List<WebElement> tracking_status_options;
	
	@FindBy(xpath = "//input[@formcontrolname='ticker']/preceding-sibling::label")
	WebElement ticker_label;
	
	@FindBy(xpath = "//input[@placeholder='Select Exchange']/ancestor::app-exchange-search/preceding-sibling::label")
	WebElement exchanges_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']/preceding-sibling::label")
	WebElement security_type_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_type']/option")
	List<WebElement> security_type_options;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']/preceding-sibling::label")
	WebElement security_category_label;
	
	@FindBy(xpath = "//select[@formcontrolname='security_category']/option")
	List<WebElement> security_category_options;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_start_date']/preceding-sibling::label")
	WebElement trading_start_date_label;
	
	@FindBy(xpath = "//input[@formcontrolname='trading_end_date']/preceding-sibling::label")
	WebElement trading_end_date_label;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/preceding-sibling::label")
	WebElement trading_status_label;
	
	@FindBy(xpath = "//select[@formcontrolname='trading_status']/option")
	List<WebElement> trading_status_options;
	
	@FindBy(xpath = "//input[@formcontrolname='primary_ticker']/parent::div/parent::div/preceding-sibling::label")
	WebElement primary_ticker_label;
	
	@FindBy(xpath="//div[@class='dg-form-steps ng-star-inserted']/p")
	public WebElement company_profile_steps;
	
	String type;
	String tracking_type_value = null;
	public CompanyDatabasePage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void is_company_database_selected(){
		waitForExpectedElement(companyName_textbox);
		selectbyVisibleText(selectList, "Company Database");
	}
	public void enter_the_article_url(String article_url){
		check_before_sending_keys(article_url_textbox, article_url_label, "Enter Article Link", "Article Link", "Article Link");
		waitForExpectedElement(article_url_textbox).sendKeys(article_url);
		check_after_sending_keys(article_url_textbox, article_url, "Article Link");
	}
	public void enter_companyName(String companyname){
		check_company_steps_label(company_profile_steps, "Company Profile (1/4 steps)","Company Profile Steps-1");
		check_before_sending_keys(companyName_textbox, company_name_label, "Enter Company Name", "Company Name", "Company Name");
		waitForExpectedElement(companyName_textbox).sendKeys(companyname);
		waitForExpectedElement(select_from_dropdown);
		waitForExpectedElement(companyName_textbox).sendKeys(Keys.TAB);
		check_after_sending_keys(companyName_textbox, companyname, "Company Name");
	}
	public void select_companyType(String companyType){
		check_before_select(company_type, company_type_label, "Type", "Company Type");
		selectbyVisibleText(company_type, companyType);
		check_after_select(company_type_options, company_type, companyType,"Company Type");
		type = companyType;
		check_company_steps_label(company_profile_steps,type, "Company Profile (1/","Company Profile Steps-1");
	}
	public void select_companyStatus(String companyStatus){
		check_before_select(company_status, company_status_label, "Company Status", "Company Status");
		selectbyVisibleText(company_status, companyStatus);
		check_after_select(company_status_options, company_status, companyStatus, "Company Status");
	}
	public void enter_the_website(String webSite){
		check_before_sending_keys(website_url, website_label, "Enter Website", "Website", "Website Url");
		waitForExpectedElement(website_url).sendKeys(webSite);
		check_after_sending_keys(website_url, webSite, "Website Url");
	}
	public void enter_employees(String employees){
		check_before_sending_keys(employees_textbox, employees_label, "Enter Employees", "Employees", "Employees");
		waitForExpectedElement(employees_textbox).sendKeys(employees);
		check_after_sending_keys(employees_textbox, employees, "Employees");
	}
	public void select_start_date(String startDate){
		check_before_sending_keys(start_date, start_date_label, "YYYY-MM-DD", "Start date", "Start Date");
		if(!startDate.equals("")){
			waitForExpectedElement(start_date).click();
			datepickerDateSelect(startDate);
		}
		check_after_sending_keys(start_date, startDate, "Start Date");
	}
	public void select_end_date(String endDate){
		check_before_sending_keys(end_date, end_date_label, "YYYY-MM-DD", "End Date", "End Date");
		if(!endDate.equals("")){
			waitForExpectedElement(end_date).click();
			datepickerDateSelect(endDate);
		}
		check_after_sending_keys(end_date, endDate, "End Date");
	}
	public void select_sector(String sector){
		check_before_select(sector_dropdown, sector_label, "Sector", "Sector");
		if(!sector.equals("")){
			selectbyVisibleText(sector_dropdown, sector);
		}
		check_after_select(sector_options, sector_dropdown, sector, "Sector");
	}
	public void enter_industry(String industry){
		check_before_sending_keys(industry_textbox, industry_label, "Enter Industry", "Industry", "Industry");
		waitForExpectedElement(industry_textbox).sendKeys(industry);
		check_after_sending_keys(industry_textbox, industry, "Industry");
	}
	public void enter_country(String country){
		check_before_sending_keys(country_textbox, country_label, "Select country", "Country(Headquarters)", "Country");
		waitForExpectedElement(country_textbox).sendKeys(country);
		waitForExpectedElement(select_from_dropdown).isDisplayed();
		select_from_dropdown(select_autocomplete, country);
		check_after_sending_keys(country_textbox, country, "Country");
	}
	public void enter_state(String state){
		check_before_sending_keys(state_textbox, state_label, "Select state", "State", "State");
		if(!state.equals("")){
			waitForExpectedElement(state_textbox).sendKeys(state);
			waitForExpectedElement(select_from_dropdown).isDisplayed();
			select_from_dropdown(select_autocomplete, state);
		}
		check_after_sending_keys(state_textbox, state, "State");
	}
	public void enter_city(String city){
		check_before_sending_keys(city_textbox, city_label, "Select city", "City", "City");
		if(!city.equals("")){
			waitForExpectedElement(city_textbox).sendKeys(city);
			waitForExpectedElement(select_from_dropdown).isDisplayed();
			select_from_dropdown(select_autocomplete, city);
		}
		check_after_sending_keys(city_textbox, city, "City");
	}
	public void enter_address(String address){
		check_before_sending_keys(address_textarea, address_label, "Address", "Address", "Address");
		waitForExpectedElement(address_textarea).sendKeys(address);
		check_after_sending_keys(address_textarea, address, "Address");
	}
	public void enter_phone_number(String phoneNumber){
		check_before_sending_keys(phone_number, phone_number_label, "Enter Phone Number", "Phone Number", "Phone Number");
		waitForExpectedElement(phone_number).sendKeys(phoneNumber);
		check_after_sending_keys(phone_number, phoneNumber, "Phone Number");
	}
	public void enter_company_description(String companyDescription){
		check_before_sending_keys(company_description, company_description_label, "Company Description", "Company Description", "Company Description");
		waitForExpectedElement(company_description).sendKeys(companyDescription);
		check_after_sending_keys(company_description, companyDescription, "Company Description");
	}
	public void enter_ISIN(String ISIN){
		check_before_sending_keys(ISIN_textbox, ISIN_label, "Enter ISIN", "ISIN", "ISIN");
		waitForExpectedElement(ISIN_textbox).sendKeys(ISIN);
		check_after_sending_keys(ISIN_textbox, ISIN, "ISIN");
	}
	public void enter_CIK(String CIK){
		check_before_sending_keys(CIK_textbox, CIK_label, "Enter CIK", "CIK", "CIK");
		waitForExpectedElement(CIK_textbox).sendKeys(CIK);
		check_after_sending_keys(CIK_textbox, CIK, "CIK");
	}
	public void enter_CUSIP(String CUSIP){
		check_before_sending_keys(CUSIP_textbox, CUSIP_label, "Enter CUSIP", "CUSIP", "CUSIP");
		waitForExpectedElement(CUSIP_textbox).sendKeys(CUSIP);
		check_after_sending_keys(CUSIP_textbox, CUSIP, "CUSIP");
	}
	public void enter_SEDOL(String SEDOL){
		check_before_sending_keys(SEDOL_textbox, SEDOL_label, "Enter SEDOL", "SEDOL", "SEDOL");
		waitForExpectedElement(SEDOL_textbox).sendKeys(SEDOL);
		check_after_sending_keys(SEDOL_textbox, SEDOL, "SEDOL");
	}
	public void click_next_button(){
		waitForExpectedElement(next_button).click();
	}
	public void click_back_button(){
		waitForExpectedElement(back_button).click();
	}
	public void enter_ir_section_link(String irSectionLink){
		check_company_steps_label(company_profile_steps,type, "Company Profile (2/","Company Profile Steps-2");
		check_before_sending_keys(ir_section_link, ir_section_link_label, "Enter Ir section Link", "Ir section Link", "Ir section Link");
		waitForExpectedElement(ir_section_link).sendKeys(irSectionLink);
		check_after_sending_keys(ir_section_link, irSectionLink, "Ir section Link");
	}
	public void enter_pr_section_link(String prSectionLink){
		check_before_sending_keys(pr_section_link, pr_section_link_label, "Enter Pr section Link", "Pr Section Link", "Pr Section Link");
		waitForExpectedElement(pr_section_link).sendKeys(prSectionLink);
		check_after_sending_keys(pr_section_link, prSectionLink, "Pr Section Link");
	}
	public void enter_ir_name(String irName){
		check_before_sending_keys(ir_name, ir_name_label, "Enter IR Name", "IR Name", "IR Name");
		waitForExpectedElement(ir_name).sendKeys(irName);
		check_after_sending_keys(ir_name, irName, "IR Name");
	}
	public void enter_ir_designation(String irDesignation){
		check_before_sending_keys(ir_designation, ir_designation_label, "Enter IR Designation", "IR Designation", "IR Designation");
		waitForExpectedElement(ir_designation).sendKeys(irDesignation);
		check_after_sending_keys(ir_designation, irDesignation, "IR Designation");
	}
	public void enter_ir_phone_number(String irPhoneNumber){
		check_before_sending_keys(ir_phone_number, ir_phone_number_label, "Enter IR Phone Number", "IR Phone Number", "IR Phone Number");
		waitForExpectedElement(ir_phone_number).sendKeys(irPhoneNumber);
		check_after_sending_keys(ir_phone_number, irPhoneNumber, "IR Phone Number");
	}
	public void enter_ir_email(String irEmail){
		check_before_sending_keys(ir_email, ir_email_label, "Enter IR Email", "IR Email", "IR Email");
		waitForExpectedElement(ir_email).sendKeys(irEmail);
		check_after_sending_keys(ir_email, irEmail, "IR Email");
	}
	public void select_ir_responding_to_email(String ir_responding_to_email){
		check_before_radio_select(respondingToEmailRadioYes, respondingToEmailRadioNo, respondingToEmailRadioLabel, "IR Responding to Email", "IR Responding to Email");
		if(ir_responding_to_email.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(respondingToEmailRadioYes).click();
		}
		else if(ir_responding_to_email.equalsIgnoreCase("No")){
			waitForExpectedElement(respondingToEmailRadioNo).click();
		}
		check_after_radio_select(respondingToEmailRadioYes, respondingToEmailRadioNo, ir_responding_to_email, "IR Responding to Email");
	}
	public void select_ir_responding_to_call(String ir_responding_to_call){
		check_before_radio_select(respondToCallRadioYes, respondToCallRadioNo, respondToCallRadioLabel, "IR Responding to Phone Call", "IR Responding to Phone Call");
		if(ir_responding_to_call.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(respondToCallRadioYes).click();
		}
		else if(ir_responding_to_call.equalsIgnoreCase("No")){
			waitForExpectedElement(respondToCallRadioNo).click();
		}
		check_after_radio_select(respondToCallRadioYes, respondToCallRadioNo, ir_responding_to_call, "IR Responding to Phone Call");
	}
	public void enter_executives_section_link(String executivesSectionLink){
		check_before_sending_keys(executives_section_link, executives_section_link_label, "Enter Executives Section Link", "Executives Section Link", "Executives Section Link");
		waitForExpectedElement(executives_section_link).sendKeys(executivesSectionLink);
		check_after_sending_keys(executives_section_link, executivesSectionLink, "Executives Section Link");
	}
	public void enter_analyst_coverage_link(String analystCoverageLink){
		check_before_sending_keys(analyst_coverage_link, analyst_coverage_link_label, "Enter Analyst Coverage Link", "Analyst Coverage Link", "Analyst Coverage Link");
		waitForExpectedElement(analyst_coverage_link).sendKeys(analystCoverageLink);
		check_after_sending_keys(analyst_coverage_link, analystCoverageLink, "Analyst Coverage Link");
	}
	public void enter_events_section_link(String eventSectionLink){
		check_company_steps_label(company_profile_steps,type, "Company Profile (3/","Company Profile Steps-3");
		check_before_sending_keys(events_section_link, events_section_link_label, "Enter Events Section Link", "Events Section Link", "Events Section Link");
		waitForExpectedElement(events_section_link).sendKeys(eventSectionLink);
		check_after_sending_keys(events_section_link, eventSectionLink, "Events Section Link");
	}
	public void select_earnings_announcement(String earnings_announcement_radio){
		check_before_radio_select(earningsAnnouncementRadioYes, earningsAnnouncementRadioNo, earningsAnnouncementRadioLabel, "Earnings Announcement", "Earnings Announcement");
		if(earnings_announcement_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(earningsAnnouncementRadioYes).click();
		}
		else if(earnings_announcement_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(earningsAnnouncementRadioNo).click();
		}
		check_after_radio_select(earningsAnnouncementRadioYes, earningsAnnouncementRadioNo, earnings_announcement_radio, "Earnings Announcement");
	}
	public void select_earnings_call_conducted(String earnings_call_conducted_radio){
		check_before_radio_select(earningsCallConductedRadioYes, earningsCallConductedRadioNo, earningsCallConductedRadioLabel, "Earnings Call Conducted", "Earnings Call Conducted");
		if(earnings_call_conducted_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(earningsCallConductedRadioYes).click();
		}
		else if(earnings_call_conducted_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(earningsCallConductedRadioNo).click();
		}
		check_after_radio_select(earningsCallConductedRadioYes, earningsCallConductedRadioNo, earnings_call_conducted_radio, "Earnings Call Conducted");
	}
	public void enter_multiselect_dropdown_all(){
		waitForExpectedElement(multiselect_dropdown).click();
		waitForExpectedElement(multiselect_dropdown_all_language).click();
	}
	
	public void enter_multiselect_dropdown(String languages){
		check_languages_before_sending_keys(get_languages, languages_label, "Language", "Language");
		if(!languages.equals("")){
			waitForExpectedElement(multiselect_dropdown).click();
			String languageArray[]= languages.split(",");
			Arrays.sort(languageArray);
			List<WebElement> languageList=waitForExpectedElement(multiselect_dropdown_specified).findElements(By.tagName("li"));
			for (WebElement li : languageList) {
				for(int i=0 ;i<languageArray.length;i++) {
					if (li.getText().equals(languageArray[i])) {
						li.click();
					}
				}
			}
			waitForExpectedElement(language_dropdown_icon).click();
		}
		check_languages_after_sending_keys(multiselect_dropdown_specified, languages, "Language");
	}
	public void select_the_earnings_call_frequency(String earningsCallFrequency){
		check_before_select(earnings_call_frequency, earnings_call_frequency_label, "Earnings Call Frequency", "Earnings Call Frequency");
		if(!earningsCallFrequency.equals("")){
			selectbyVisibleText(earnings_call_frequency, earningsCallFrequency);
		}
		check_after_select(earnings_call_frequency_options, earnings_call_frequency, earningsCallFrequency, "Earnings Call Frequency");
	}
	public void select_email_alert_setup(String email_alert_setup_radio){
		check_before_radio_select(emailAlertSetupRadioYes, emailAlertSetupRadioNo, emailAlertSetupRadioLabel, "Email alerts set Up", "Email alerts set Up");
		if(email_alert_setup_radio.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(emailAlertSetupRadioYes).click();
		}
		else if(email_alert_setup_radio.equalsIgnoreCase("No")){
			waitForExpectedElement(emailAlertSetupRadioNo).click();
		}
		check_after_radio_select(emailAlertSetupRadioYes, emailAlertSetupRadioNo, email_alert_setup_radio, "Email alerts set Up");
	}
	public void select_add_to_calendar_option(String add_to_calendar_option){
		check_before_radio_select(addToCalendarOptionRadioYes, addToCalendarOptionRadioNo, addToCalendarOptionRadioLabel, "Add to Calendar Option", "Add to Calendar Option");
		if(add_to_calendar_option.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(addToCalendarOptionRadioYes).click();
		}
		else if(add_to_calendar_option.equalsIgnoreCase("No")){
			waitForExpectedElement(addToCalendarOptionRadioNo).click();
		}
		check_after_radio_select(addToCalendarOptionRadioYes, addToCalendarOptionRadioNo, add_to_calendar_option, "Add to Calendar Option");
	}
	public void enter_comments(String companyComments){
		check_before_sending_keys(comments, comments_label, "Comments", "Comments", "Comments");
		waitForExpectedElement(comments).sendKeys(companyComments);
		check_after_sending_keys(comments, companyComments, "Comments");
	}
	public void select_tracking_type(String trackingType){
		check_company_steps_label(company_profile_steps,type, "Company Profile (4/","Company Profile Steps-4");
		check_before_selecting_tracking_type(enum_answer_html, enum_answer_rss, enum_answer_manual, tracking_type_label, "Tracking Type", "Tracking Type");
		if(trackingType.equalsIgnoreCase("RSS Feed")) {
			waitForExpectedElement(enum_answer_rss).click();
		}
		else if(trackingType.equalsIgnoreCase("HTTP")) {
			waitForExpectedElement(enum_answer_html).click();
		}
		else if(trackingType.equalsIgnoreCase("Manual")){
			waitForExpectedElement(enum_answer_manual).click();
			tracking_type_value = "Manual";
		}
		check_after_selecting_tracking_type(enum_answer_html, enum_answer_rss, enum_answer_manual, trackingType, "Tracking Type");
	}
	public void enter_company_data_source_link(String companyDataSourceLink){
		check_before_sending_keys(company_data_source_link, traking_link_label, "Enter Tracking Link", "Tracking Link", "Tracking Link");
		waitForExpectedElement(company_data_source_link).sendKeys(companyDataSourceLink);
		check_after_sending_keys(company_data_source_link, companyDataSourceLink, "Tracking Link");
	}
	public void select_company_data_source_status(String dataSourceStatus){
		check_before_select(company_data_source_status, traking_status_label, "Status", "Traking Status");
		if(!dataSourceStatus.equals("")){
			selectbyVisibleText(company_data_source_status, dataSourceStatus);
		}
		check_after_select(tracking_status_options, company_data_source_status, dataSourceStatus, "Traking Status");
	}
	public void select_scrapping_frequency(String scrapingFrequency){
		if(tracking_type_value == null){
			check_before_sending_keys(scraping_frequency, scraping_frequency_label, "Select One", "Scraping Frequency", "Scraping Frequency");
		}else{
			check_before_sending_keys(scraping_frequency, scraping_frequency_label, "Select One", "Manual Check Frequency", "Manual Check Frequency");
		}
		if(!scrapingFrequency.equals("")){
			waitForExpectedElement(scraping_frequency).sendKeys(scrapingFrequency);
			waitForExpectedElement(scraping_frequency_select).click();
		}
		check_after_sending_keys(scraping_frequency, scrapingFrequency, "Scraping Frequency");
	}
	public void enter_datasource_comments(String datasourceComments){
		if(tracking_type_value == null){
			check_before_sending_keys(comments, comments_datasource_label, "Comments", "Comments", "Comments");
		}else{
			check_before_sending_keys(comments, comments_datasource_label, "Comments", "Comments *", "Comments");
		}
		waitForExpectedElement(comments).sendKeys(datasourceComments);
		check_after_sending_keys(comments, datasourceComments, "Comments");
	}
	public void enter_ticker(String tickerDetails){
		check_company_steps_label(company_profile_steps,type, "Company Profile (5/","Company Profile Steps-5");
		check_before_sending_keys(ticker, ticker_label, "Enter Ticker", "Ticker", "Ticker");
		waitForExpectedElement(ticker).sendKeys(tickerDetails);
		check_after_sending_keys(ticker, tickerDetails, "Ticker");
	}
	public void enter_exchange(String exchangeDetails){
		check_before_sending_keys(exchange, exchanges_label, "Select Exchange", "Exchanges", "Exchanges");
		if(!exchangeDetails.equals("")){
			waitForExpectedElement(exchange).sendKeys(exchangeDetails);
			waitForExpectedElement(exchange_select).click();
		}
		//check_after_sending_keys(exchange, exchangeDetails, "Exchanges");
	}
	public void select_security_type(String securityType){
		check_before_select(security_type, security_type_label, "Security Type", "Security Type");
		if(!securityType.equals("")){
			selectbyVisibleText(security_type, securityType);
		}
		check_after_select(security_type_options, security_type, securityType, "Security Type");
	}
	public void select_security_category(String securityCategory){
		check_before_select(security_category, security_category_label, "Security Category", "Security Category");
		if(!securityCategory.equals("")){
			selectbyVisibleText(security_category, securityCategory);
		}
		check_after_select(security_category_options, security_category, securityCategory, "Security Category");
	}
	public void select_trading_start_date(String tradingStartDate){
		check_before_sending_keys(trading_start_date, trading_start_date_label, "YYYY-MM-DD", "Trading Start Date", "Trading Start Date");
		if(!tradingStartDate.equals("")){
			waitForExpectedElement(trading_start_date).click();
			datepickerDateSelect(tradingStartDate);
		}
		check_after_sending_keys(trading_start_date, tradingStartDate, "Trading Start Date");
	}
	public void select_trading_end_date(String tradingEndDate){
		check_before_sending_keys(trading_end_date, trading_end_date_label, "YYYY-MM-DD", "Trading end Date", "Trading End Date");
		if(!tradingEndDate.equals("")){
			waitForExpectedElement(trading_end_date).click();
			datepickerDateSelect(tradingEndDate);
		}
		check_after_sending_keys(trading_end_date, tradingEndDate, "Trading End Date");
	}
	public void select_trading_status(String tradingStatus){
		check_before_select(trading_status, trading_status_label, "Trading Status", "Trading Status");
		selectbyVisibleText(trading_status, tradingStatus);
		check_after_select(trading_status_options, trading_status, tradingStatus, "Trading Status");
	}
	public void select_primary_ticker(String primaryTicker){
		check_before_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primary_ticker_label, "Primary Ticker", "Primary Ticker");
		if(primaryTicker.equalsIgnoreCase("Yes")) {
			waitForExpectedElement(primaryTickerRadioYes).click();
		}
		else if(primaryTicker.equalsIgnoreCase("No")){
			waitForExpectedElement(primaryTickerRadioNo).click();
		}
		check_after_radio_select(primaryTickerRadioYes, primaryTickerRadioNo, primaryTicker, "Primary Ticker");
	}
	public void click_submit_button(){
		waitForExpectedElement(submitButton).click();
	}
	public void click_save_and_add_new_button(){
		waitForExpectedElement(saveButton).click();
	}
	
}
