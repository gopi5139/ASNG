package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.AssertLogUtils;
import utils.CucumberReporterUtils;

public final class WebDriverHelper{
	public static WebDriver dr;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static ThreadLocal<AssertLogUtils> soft = ThreadLocal.withInitial(() -> new AssertLogUtils());
	public static WebDriver getDriver() {
		return driver.get();
	}
	private static void setWebDriver(WebDriver dr) {
		driver.set(dr);
	}
	public static SoftAssert getSoftAssert() {
		return soft.get();
	}
    public static void user_launches_application(String browser){
    	try{
    		if(browser.equalsIgnoreCase("chrome")){
        		WebDriverManager.chromedriver().setup();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--incognito");
//                dr = new ChromeDriver(options);
        		dr = new ChromeDriver();
        	}
        	else if(browser.equalsIgnoreCase("firefox")){
        		WebDriverManager.firefoxdriver().setup();
        		dr = new FirefoxDriver();
        	}
        	else if(browser.equalsIgnoreCase("safari")){
        		WebDriverManager.safaridriver().setup();
        		dr = new SafariDriver();
        	}
        	else if(browser.equalsIgnoreCase("edge")){
        		WebDriverManager.edgedriver().setup();
        		dr = new EdgeDriver();
        	}
        	setWebDriver(dr);
            getDriver().manage().window().maximize();
    	}catch(Exception e){
    		CucumberReporterUtils.log_exception(e);
    	}
    }
	
    public static void close_the_browser(){
    	try {
    		getSoftAssert().assertAll();
    		getDriver().quit();
        } catch (AssertionError t) {
        	getDriver().quit();
        	//ExtentCucumberAdapter.getCurrentStep().fail(t.getMessage());
        	Assert.assertTrue(false,t.getMessage());
        }
    }
}
