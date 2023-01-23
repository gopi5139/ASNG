package daggr.ui.runners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import framework.WebDriverHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ConfigFileReaderUtils;

@CucumberOptions(features = "src/test/resources/features/daggr/ui", glue = { "daggr.ui.steps","utils" }, plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:test-output-html/cucumber-report-html.html",
		"timeline:test-output-thread/report/" }, tags = "@smoke_analyst_or_investor_conference", dryRun = false, monochrome = true)
public class DaggrRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeMethod
	private void initialize() {
		ConfigFileReaderUtils cfr = new ConfigFileReaderUtils();
		String flag = cfr.getBrowserFlag();
		if (null != flag && !flag.isEmpty()) {
			WebDriverHelper.user_launches_application(flag);
		}
	}

	@AfterMethod
	private void close() {
		WebDriverHelper.close_the_browser();
	}
}
