package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.WebDriverHelper;


public abstract class PageObjectUtils extends ReusableUtils{
	private static final long DRIVER_WAIT_TIME = 30;
    protected WebDriverWait wait;
    protected WebDriver webDriver;
    
	protected PageObjectUtils() {
        this.webDriver = WebDriverHelper.getDriver();
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(DRIVER_WAIT_TIME));
    }
	
	protected WebElement waitForExpectedElement(final WebElement webElement) {
        return wait.until(visibilityOfElementLocated(webElement));
    }
	
	private ExpectedCondition<WebElement> visibilityOfElementLocated(final WebElement webElement) throws NoSuchElementException {
        return driver -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            	CucumberReporterUtils.log_exception(e);
            }
            WebElement element = webElement;
            return element.isDisplayed() ? element : null;
        };
    }
	protected void selectbyVisibleText(WebElement webElement,String inputText) {
		new Select(waitForExpectedElement(webElement)).selectByVisibleText(inputText);
	}
	protected List<WebElement> presenceOfAllElementsLocatedBy(final List<WebElement> webElement) {
        return (new WebDriverWait(webDriver, Duration.ofSeconds(DRIVER_WAIT_TIME))).until(ExpectedConditions.visibilityOfAllElements(webElement));
    }
	protected String getTextBySelect(List<WebElement> options,WebElement select) {
		String tableValue = null;
    	for (WebElement element : presenceOfAllElementsLocatedBy(options)) {
			if(waitForExpectedElement(select).getAttribute("value").equals(element.getAttribute("value"))) {
				tableValue = element.getText();
				break;
			}
		}
    	return tableValue;
	}
	protected Actions moveToElement(WebElement element){
		wait.until(visibilityOfElementLocated(element));
		Actions actions = new Actions(webDriver);
		return actions.moveToElement(element);
	}
	
	protected void getJavascriptClickExecutor(WebElement element){
		wait.until(visibilityOfElementLocated(element));
		JavascriptExecutor js = ((JavascriptExecutor) WebDriverHelper.getDriver());
		js.executeScript("arguments[0].click();", element);
	}
	
	protected void getJavascriptMouseMoveExecutor(WebElement element){
		wait.until(visibilityOfElementLocated(element));
		JavascriptExecutor js = ((JavascriptExecutor) WebDriverHelper.getDriver());
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}
	
	/**
	 * Pass Two Unique Data to Click Table List and return string2 web element i.e."Facebook, inc" ,"2021-09-15"
	 * @param string
	 * @return 
	 */
	public WebElement interactListViewTable(String string,String string2){
		WebElement value = null;
		try {
			value = waitForExpectedElement(WebDriverHelper.getDriver().findElement(By.xpath("//*[contains(text(),'"+string+"')]//ancestor::tr//*[contains(text(),'"+string2+"')]")));	
		} catch (NoSuchElementException e) {
			if(WebDriverHelper.getDriver().findElement(By.xpath("//button[text()='Next']")).isEnabled()) {
				WebDriverHelper.getDriver().findElement(By.xpath("//button[text()='Next']")).click();
				value =	waitForExpectedElement(WebDriverHelper.getDriver().findElement(By.xpath("//*[contains(text(),'"+string+"')]//ancestor::tr//*[contains(text(),'"+string2+"')]")));
			}
		}
		return value;

	}
	
	/**
	 * getTableValueByKey return table value i.e. "event_time"  as key return "10:00:00" as value 
	 * @param key
	 * @return
	 */
	public String getTableValueByKey(String key) {
		return waitForExpectedElement(WebDriverHelper.getDriver().findElement(By.xpath("//*[@class='modal-content']//*[contains(text(),' "+key+"')]/following-sibling::td"))).getText().trim();		
	}
}
