package asai.ui.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;
import utils.PageObjectUtils;

public class DashboardPage extends PageObjectUtils{
	
	@FindBy(xpath = "//div[@id='wrapper']")
	private WebElement sidebar;
	
	@FindBy(xpath = "//div[@id='wrapper']/div[1]/a[2]/img")
	private WebElement asaiLogo;
	
	@FindBy(xpath = "//form[@id='searchForm']/button[normalize-space('Filter')]")
	private WebElement globalSearchFilterButton;
	
	@FindBy(xpath = "//form[@id='searchForm']/button[normalize-space('Filter')]/i")
	private WebElement globalSearchFilterButtonIcon;
	
	@FindBy(xpath = "//form[@id='searchForm']/div[@class='global_input']/input")
	private WebElement globalSearchTextbox;
	
	@FindBy(xpath = "//form[@id='searchForm']/span/button[contains(@class,'search_icon')]")
	private WebElement globalSearchIcon;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]/img")
	private WebElement globalSearchExchangeIcon;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[2]/img")
	private WebElement globalSearchDateRangeIcon;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/button[contains(text(),'OK')]")
	private WebElement globalSearchFilterOkButton;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]//p-multiselect")
	private WebElement globalSearchExchangeMultiSelect;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]//label['Exchange']")
	private WebElement globalSearchExchangeLabel;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]//p-multiselect//div[contains(@class,'p-multiselect-filter')]/input")
	private WebElement globalSearchExchangeTextbox;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]//p-multiselect/div[1]/div[4]/div[1]/div[1]/div[contains(@class,'p-checkbox')]")
	private WebElement globalSearchExchangeSelectAllCheckbox;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[1]//p-multiselect/div[1]/div[4]//ul/p-multiselectitem/li/span")
	private List<WebElement> globalSearchExchangesCheckbox;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[2]//label['Date Range']")
	private WebElement globalSearchDateRangeLabel;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[2]//input[@placeholder='Starts']")
	private WebElement globalSearchDateRangeStart;
	
	@FindBy(xpath = "//div[@id='dropDownFilterTop']/div[2]//input[@placeholder='Ends']")
	private WebElement globalSearchDateRangeEnd;
	
	@FindBy(xpath = "(//*[name()='svg'][@class='notification_icon'])[1]")
	private WebElement notificationsIcon;
	
	@FindBy(xpath = "(//a[@id='dropdownMenuButton'])[@title='Profile']")
	private WebElement profileIcon;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[@class='asi_sidebar_menu']/div[1]/div/span['Pinned']")
	private WebElement pinnedLabel;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[@class='asi_sidebar_menu']/div[1]/div/img")
	private WebElement pinnedIcon;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[@class='asi_sidebar_menu']/div[1]/a/img")
	private WebElement collapseIcon;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[@class='asi_sidebar_menu_item']/a/label['Home']")
	private WebElement homePin;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[@class='add_pin']/span['Add new pin']")
	private WebElement addNewPin;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[3]/label['Favorites']")
	private WebElement favoritesLabel;
	
	@FindBy(xpath = "//div[@id='wrapper']//div[3]/img")
	private WebElement favoritesIcon;
	
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	
	public DashboardPage() {
		WebDriverHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public void verifyASAILogo() {
		soft.assertTrue(asaiLogo.isDisplayed(),"ASAI logo is not displayed");
	}
	
	public void verifyDashboardPageCurrentUrl() {
		soft.assertEquals(WebDriverHelper.getDriver().getCurrentUrl(),"https://asai-demo-app.pg.alphastreet.io/dashboard", "Dashboard URL is not matched");
	}
	
	public void verifyDashboardPageTitle() {
		soft.assertEquals(WebDriverHelper.getDriver().getTitle(),"AsAi", "Application Title is not matched");
	}
	
	public void verifyGlobalSearchBar() {
		soft.assertTrue(globalSearchFilterButton.isDisplayed(),"Global Search Filter button is not displayed");
		soft.assertTrue(globalSearchFilterButtonIcon.isDisplayed(),"Global Search Filter button icon is not displayed");
		soft.assertTrue(globalSearchTextbox.isDisplayed(),"Global Search Textbox is not displayed");
		soft.assertTrue(globalSearchIcon.isDisplayed(),"Global Search Filter button is not displayed");
	}
	
	public void verifyNotificationSection() {
		soft.assertTrue(notificationsIcon.isDisplayed(),"Notification Icon is not displayed");
	}
	
	public void verifyProfileSection() {
		soft.assertTrue(profileIcon.isDisplayed(),"Profile Icon is not displayed");
	}
	
	public void verifyPinSection() {
		soft.assertTrue(collapseIcon.isDisplayed(),"Collapse Icon is not displayed");
		soft.assertTrue(pinnedIcon.isDisplayed(),"Pinned Icon is not displayed");
		soft.assertTrue(pinnedLabel.isDisplayed(),"Pinned Label is not displayed");
		soft.assertTrue(addNewPin.isDisplayed(),"Add New Pin is not displayed");
	}
	
	public void verifyFavoriteSection() {
		soft.assertTrue(collapseIcon.isDisplayed(),"Collapse Icon is not displayed");
		soft.assertTrue(favoritesLabel.isDisplayed(),"Favorites Label is not displayed");
		soft.assertTrue(pinnedLabel.isDisplayed(),"Favorites Icon is not displayed");
	}
	
	public void verifyDashboardElements() {
		waitForExpectedElement(sidebar).isDisplayed();
		verifyDashboardPageCurrentUrl();
		verifyDashboardPageTitle();
		verifyASAILogo();
		verifyGlobalSearchBar();
		verifyNotificationSection();
		verifyProfileSection();
		verifyPinSection();
		verifyFavoriteSection();
	}
}
