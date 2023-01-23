package asai.ui.steps;

import asai.ui.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class DashboardSteps {
	DashboardPage dashboardPage =  new DashboardPage();
	
    @Then ("I Verify dashboard page default contents")
	public void verifyStaticPageDefaultElements(){
    	dashboardPage.verifyDashboardElements();
	}
}
