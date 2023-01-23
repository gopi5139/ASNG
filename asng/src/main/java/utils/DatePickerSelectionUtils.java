package utils;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DatePickerSelectionUtils {
	@FindBy(xpath="//bs-calendar-layout//table//tbody")
	private WebElement table;
	
	@FindBy(xpath="//button[@class='current ng-star-inserted']")
	private WebElement monthSelection;
	
	@FindBy(xpath="//button[@class='current']")
	private WebElement yearSelection;
	
	@FindBy(xpath="//button[@class='previous']")
	private WebElement datepickerPeviousButton;
	
	@FindBy(xpath="//button[@class='next']")
	private WebElement datepickerNextButton;
	
	public String[] event_time_conversion(String event_time) {
		String time[] = new String[3];
		try {
			   SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
	           SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm:a");
	           Date _24HourDt = _24HourSDF.parse(event_time);
	           String dateArray[]= _12HourSDF.format(_24HourDt).split(":"); 
	           time[0] = dateArray[0];
	           time[1] = dateArray[1];
	           time[2] = dateArray[2].toUpperCase();
		}catch(Exception e) {
			CucumberReporterUtils.log_exception(e);
			Assert.assertFalse(true, "Event Time not converted");
		}
		return time;
	}
	
	public void datepickerDateSelect(String dot) {
		String dateArray[]= dot.split("-");
		int date=Integer.parseInt(dateArray[2]);
		int month=Integer.parseInt(dateArray[1]);
		int year=Integer.parseInt(dateArray[0]);
		try {
			Month calMonth = Month.of(month);
			String mon = calMonth.toString();
			getYear(year);
			getMonth(mon);
			getDate(date);
			
		}catch(Exception e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
	
	private void getYear(int year) {
		try {
			yearSelection.click();
			int yearVal;
			boolean isClicked = true;
			do {
				List<WebElement> rows,cols;
				rows=table.findElements(By.tagName("tr"));
				ArrayList<Integer> yearsList = new ArrayList<Integer>();
				for (int i = 0; i < rows.size(); i++) 
				{
					cols=rows.get(i).findElements(By.tagName("td"));
					for (int k = 0; k < cols.size(); k++) 
					{
						yearVal=Integer.parseInt(cols.get(k).getText());
						yearsList.add(yearVal);
						if(yearVal==year) {
							cols.get(k).click();
							isClicked = false;
							return;
						}
					}
				}
				if(yearsList.get(0)>year) {
					datepickerPeviousButton.click();
				}else {
					datepickerNextButton.click();
				}
				
			}while(isClicked);
		}catch(Exception ex) {
			CucumberReporterUtils.log_exception(ex);
		}
		
	}
	
	private void getDate(int date) {
		try {
			int caldt;
			List<WebElement> rows,cols;
			rows=table.findElements(By.tagName("tr"));
			for (int i = 0; i < rows.size(); i++) 
			{
				cols=rows.get(i).findElements(By.tagName("td"));
				for (int k = 0; k < cols.size(); k++) 
				{
					caldt=Integer.parseInt(cols.get(k).getText());
					String s = (cols.get(k).findElements(By.tagName("span"))).get(0).getAttribute("class");
					if(!s.equals("is-other-month ng-star-inserted")&&!s.equals("is-other-month")) {
						if (caldt==date)
						{
							cols.get(k).click();
							return;
						}
					}
				}
			}
		}catch(Exception e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
	private void getMonth(String mon) {
		List<WebElement> rows,cols;
		rows=table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int k = 0; k < cols.size(); k++) 
			{
				String x=cols.get(k).getText();
				if (x.equalsIgnoreCase(mon)) 
				{
					cols.get(k).click();
					return;
				}
			}
		}
		
	}
}
