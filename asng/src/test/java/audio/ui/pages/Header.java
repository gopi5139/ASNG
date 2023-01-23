package audio.ui.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import audio.ui.pages.menu.FileMenu;
import audio.ui.pages.menu.ManageMenu;
import audio.ui.pages.menu.UsernameMenu;
import audio.ui.pages.menu.ViewMenu;
import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class Header extends PageObjectUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	@FindBy(xpath="//div[@class='asng-header']")
	private WebElement navbar;
	
	@FindBy(xpath="//a[normalize-space(text())='File']")
	private WebElement file_menu;
	
	@FindBy(xpath="//a[normalize-space(text())='View']")
	private WebElement view_menu;
	
	@FindBy(xpath="//a[normalize-space(text())='Manage']")
	private WebElement manage_menu;
	
	@FindBy(xpath="//div[@class='asng-header']//h2[text()='AUDIO RECORDING SERVICE']")
	private WebElement title;
	
	@FindBy(xpath="//a[@class='notification']")
	private WebElement notification_icon;
	
	@FindBy(xpath="//span[@class='us-letter']")
	private WebElement username_letter;
	
	@FindBy(xpath="//a[@class='us-name']")
	private WebElement username;
	
	@FindBy(xpath="//span[@class='sub-name']")
	private WebElement operator_type;
	
	public Header() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	public void navigate_to_file_menu(){
		moveToElement(file_menu).perform();
	}
	public void navigate_to_view_menu(){
		moveToElement(view_menu).perform();
	}
	public void navigate_to_manage_menu(){
		moveToElement(manage_menu).perform();
	}
	public String[] seperate_username_and_operator(String username) {
		String[] username_array = username.split("\\n");
		return username_array;
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
	public void username_dropdown_click() {
		waitForExpectedElement(username_letter).click();
	}
	public void notification_icon_click() {
		waitForExpectedElement(notification_icon).click();
	}
	public void verify_default_elements(String userName,String operatorType) {
		UsernameMenu username_menu = new UsernameMenu();
		FileMenu fileMenu = new FileMenu();
		ViewMenu viewMenu = new ViewMenu();
		ManageMenu manageMenu = new ManageMenu();
		waitForExpectedElement(navbar).isDisplayed();
		sleep(4000);
		soft.assertTrue(navbar.isDisplayed(),"Nav Bar is not displayed");
		soft.assertTrue(title.isDisplayed(),"Title is not displayed");
		soft.assertTrue(file_menu.isDisplayed(),"File Menu is not displayed");
		soft.assertTrue(view_menu.isDisplayed(),"View Menu is not displayed");
		soft.assertTrue(manage_menu.isDisplayed(),"Manage Menu is not displayed");
		//soft.assertTrue(notification_icon.isDisplayed(),"Notification Icon is not displayed");
		fileMenu.is_file_items_displayed();
		viewMenu.is_view_items_displayed();
		manageMenu.is_manage_items_displayed();
		username_menu.is_username_dropdown_items_displayed();
		is_username_letter_dislayed(userName);
		is_username_dislayed(userName);
		is_operator_type_dislayed(operatorType);
	}
}
