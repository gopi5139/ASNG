package utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import framework.WebDriverHelper;


public class ReusableUtils extends DatePickerSelectionUtils{
	SoftAssert soft = WebDriverHelper.getSoftAssert();
	public void sleep(long seconds){
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			CucumberReporterUtils.log_exception(e);
		}
	}
	public String get_clip_board_value() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String copyFromClipboard = "";
		try {
			copyFromClipboard = (String) clipboard.getData(DataFlavor.stringFlavor);
		} catch (Exception e) {
			Assert.assertTrue(false,"Unable to copy data from clip board");
		}
		return copyFromClipboard;
	}
	public void check_before_sending_keys(WebElement field_element,WebElement label_element,String place_holder_expected,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String place_holder_actual = obj.waitForExpectedElement(field_element).getAttribute("placeholder").trim();
		soft.assertEquals(place_holder_actual, place_holder_expected, message+" Place Holder");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
		String iput_value_actual = obj.waitForExpectedElement(field_element).getAttribute("value");
		soft.assertEquals(iput_value_actual, "", message+" input empty before sending");
	}
	public void check_before_sending_keys(WebElement field_element,String place_holder_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String place_holder_actual = obj.waitForExpectedElement(field_element).getAttribute("placeholder").trim();
		soft.assertEquals(place_holder_actual, place_holder_expected, message+" Place Holder");
		String iput_value_actual = obj.waitForExpectedElement(field_element).getAttribute("value");
		soft.assertEquals(iput_value_actual, "", message+" input empty before sending");
	}
	public void check_after_sending_keys(WebElement element,String expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String actual = obj.waitForExpectedElement(element).getAttribute("value");
		soft.assertEquals(actual, expected, message+" after sending input");
	}
	public void check_before_select(WebElement field_element,WebElement label_element,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String default_value = obj.waitForExpectedElement(field_element).getAttribute("value").trim();
		if(default_value.isEmpty() || default_value.trim().equals("0:")){
			default_value = "Select One";
		}
		soft.assertEquals(default_value, "Select One", message+" Select One");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_after_select(List<WebElement> options,WebElement select,String expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String actual = obj.getTextBySelect(options, select);
		if(expected.equals("")){
			expected = "Select One";
		}
		soft.assertEquals(actual, expected, message+" after selecting");
	}
	public void check_before_radio_select(WebElement field_element_yes,WebElement field_element_no,WebElement label_element,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean actual_yes = obj.waitForExpectedElement(field_element_yes).isSelected();
		soft.assertEquals(String.valueOf(actual_yes), "false", message+" Yes selected by default");
		boolean actual_no = obj.waitForExpectedElement(field_element_no).isSelected();
		soft.assertEquals(String.valueOf(actual_no), "false", message+" No selected by default");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_before_radio_select_default_yes(WebElement field_element_yes,WebElement field_element_no,WebElement label_element,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean actual_yes = obj.waitForExpectedElement(field_element_yes).isSelected();
		soft.assertEquals(String.valueOf(actual_yes), "true", message+" Yes selected by default");
		boolean actual_no = obj.waitForExpectedElement(field_element_no).isSelected();
		soft.assertEquals(String.valueOf(actual_no), "false", message+" No selected by default");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_after_radio_select(WebElement field_element_yes,WebElement field_element_no,String expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		if(!expected.equals("")){
			if(expected.equalsIgnoreCase("Yes")){
				boolean actual_yes = obj.waitForExpectedElement(field_element_yes).isSelected();
				soft.assertEquals(String.valueOf(actual_yes), "true", message+" Yes not selected after click");
				boolean actual_no = obj.waitForExpectedElement(field_element_no).isSelected();
				soft.assertEquals(String.valueOf(actual_no), "false", message+" No not selected after click");
			}else{
				boolean actual_yes = obj.waitForExpectedElement(field_element_yes).isSelected();
				soft.assertEquals(String.valueOf(actual_yes), "false", message+" Yes not selected after click");
				boolean actual_no = obj.waitForExpectedElement(field_element_no).isSelected();
				soft.assertEquals(String.valueOf(actual_no), "true", message+" No not selected after click");
			}
		}else{
			boolean actual_yes = obj.waitForExpectedElement(field_element_yes).isSelected();
			soft.assertEquals(String.valueOf(actual_yes), "false", message+" Yes not selected after click");
			boolean actual_no = obj.waitForExpectedElement(field_element_no).isSelected();
			soft.assertEquals(String.valueOf(actual_no), "false", message+" No not selected after click");
		}
	}
	public void check_before_selecting_gender(WebElement field_element_male,WebElement field_element_female,WebElement field_element_others,WebElement label_element,String label_expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean actual_male = obj.waitForExpectedElement(field_element_male).isSelected();
		soft.assertEquals(String.valueOf(actual_male), "false", message+" Male selected by default");
		boolean actual_female = obj.waitForExpectedElement(field_element_female).isSelected();
		soft.assertEquals(String.valueOf(actual_female), "false", message+" Female selected by default");
		boolean actual_others = obj.waitForExpectedElement(field_element_others).isSelected();
		soft.assertEquals(String.valueOf(actual_others), "false", message+" Others selected by default");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_after_selecting_gender(WebElement field_element_male,WebElement field_element_female,WebElement field_element_others,String expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		if(expected.equalsIgnoreCase("Male")){
			boolean actual_male = obj.waitForExpectedElement(field_element_male).isSelected();
			soft.assertEquals(String.valueOf(actual_male), "true", message+" Male not selected after click");
			boolean actual_female = obj.waitForExpectedElement(field_element_female).isSelected();
			soft.assertEquals(String.valueOf(actual_female), "false", message+" Female not selected after click");
			boolean actual_others = obj.waitForExpectedElement( field_element_others).isSelected();
			soft.assertEquals(String.valueOf(actual_others), "false", message+" Others not selected after click");
		}else if(expected.equalsIgnoreCase("Female")){
			boolean actual_male = obj.waitForExpectedElement(field_element_male).isSelected();
			soft.assertEquals(String.valueOf(actual_male), "false", message+" Male not selected after click");
			boolean actual_others = obj.waitForExpectedElement(field_element_others).isSelected();
			soft.assertEquals(String.valueOf(actual_others), "false", message+" Others not selected after click");
			boolean actual_female = obj.waitForExpectedElement( field_element_female).isSelected();
			soft.assertEquals(String.valueOf(actual_female), "true", message+" Female not selected after click");
		}else{
			boolean actual_male = obj.waitForExpectedElement(field_element_male).isSelected();
			soft.assertEquals(String.valueOf(actual_male), "false", message+" Male not selected after click");
			boolean actual_manual = obj.waitForExpectedElement( field_element_female).isSelected();
			soft.assertEquals(String.valueOf(actual_manual), "false", message+" Female not selected after click");
			boolean actual_others = obj.waitForExpectedElement(field_element_others).isSelected();
			soft.assertEquals(String.valueOf(actual_others), "true", message+" Others not selected after click");
		}
	}
	public void check_before_selecting_tracking_type(WebElement field_element_html,WebElement field_element_rss,WebElement field_element_manual,WebElement label_element,String label_expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean actual_html = obj.waitForExpectedElement(field_element_html).isSelected();
		soft.assertEquals(String.valueOf(actual_html), "false", message+" HTML selected by default");
		boolean actual_rss = obj.waitForExpectedElement(field_element_rss).isSelected();
		soft.assertEquals(String.valueOf(actual_rss), "false", message+" RSS selected by default");
		boolean actual_manual = obj.waitForExpectedElement(field_element_manual).isSelected();
		soft.assertEquals(String.valueOf(actual_manual), "false", message+" RSS selected by default");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_after_selecting_tracking_type(WebElement field_element_html,WebElement field_element_rss,WebElement field_element_manual,String expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		if(expected.equalsIgnoreCase("RSS Feed") || expected.equalsIgnoreCase("RSS")){
			boolean actual_rss = obj.waitForExpectedElement(field_element_rss).isSelected();
			soft.assertEquals(String.valueOf(actual_rss), "true", message+" RSS not selected after click");
			boolean actual_html = obj.waitForExpectedElement(field_element_html).isSelected();
			soft.assertEquals(String.valueOf(actual_html), "false", message+" HTML not selected after click");
			boolean actual_manual = obj.waitForExpectedElement( field_element_manual).isSelected();
			soft.assertEquals(String.valueOf(actual_manual), "false", message+" Manual not selected after click");
		}else if(expected.equalsIgnoreCase("Manual")){
			boolean actual_rss = obj.waitForExpectedElement(field_element_rss).isSelected();
			soft.assertEquals(String.valueOf(actual_rss), "false", message+" RSS not selected after click");
			boolean actual_html = obj.waitForExpectedElement(field_element_html).isSelected();
			soft.assertEquals(String.valueOf(actual_html), "false", message+" HTML not selected after click");
			boolean actual_manual = obj.waitForExpectedElement( field_element_manual).isSelected();
			soft.assertEquals(String.valueOf(actual_manual), "true", message+" Manual not selected after click");
		}else{
			boolean actual_rss = obj.waitForExpectedElement(field_element_rss).isSelected();
			soft.assertEquals(String.valueOf(actual_rss), "false", message+" RSS not selected after click");
			boolean actual_manual = obj.waitForExpectedElement( field_element_manual).isSelected();
			soft.assertEquals(String.valueOf(actual_manual), "false", message+" Manual not selected after click");
			boolean actual_html = obj.waitForExpectedElement(field_element_html).isSelected();
			soft.assertEquals(String.valueOf(actual_html), "true", message+" HTML not selected after click");
		}
	}
	public void check_company_steps_label(WebElement element,String company_type,String label_expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		if(company_type.equalsIgnoreCase("Public")){
			String actual_label = obj.waitForExpectedElement(element).getText().trim();
			soft.assertEquals(actual_label, label_expected+"5 steps)", message+" label");
		}else{
			String actual_label = obj.waitForExpectedElement(element).getText().trim();
			soft.assertEquals(actual_label, label_expected+"4 steps)", message+" label");
		}
	}
	public void check_button_displayed(WebElement element,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean isAvailable = obj.waitForExpectedElement(element).isDisplayed();
		soft.assertTrue(isAvailable, message+" button is displayed");
		
	}
	public void check_company_steps_label(WebElement element,String label_expected,String message) {
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String actual_label = obj.waitForExpectedElement(element).getText().trim();
		soft.assertEquals(actual_label, label_expected, message+" label");
	}
	public void check_languages_before_sending_keys(WebElement field_element,WebElement label_element,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
		String[] lang = obj.waitForExpectedElement(field_element).getText().split(" ");
		if(lang.length == 2){
			String iput_value_actual = lang[0];
			soft.assertEquals(iput_value_actual, "English", message+" input empty before sending");
		}else{
			soft.assertTrue(false, "Languges by default english");
		}
	}
	public void check_languages_after_sending_keys(WebElement element,String expected,String message){
		check_languages_in_multiselect(expected,element,message);
	}
	public void check_multiselect_before_sending_keys(WebElement field_element,String expected_input,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		String lang = obj.waitForExpectedElement(field_element).getText();
		soft.assertEquals(lang, expected_input, message+" input empty before sending");
	}
	public void check_multiselect_after_sending_keys(WebElement element,String expected,String message){
		check_values_in_multiselect(expected,element,message);
	}
	public void check_values_in_multiselect(String languages,WebElement element,String message){
		String languagesTableValues = null;
		List<WebElement> lists;
		String in = null;
		ArrayList<String> languageArrayList=new ArrayList<String>();
		lists = element.findElements(By.tagName("li"));
		for(int i =0;i<lists.size();i++) {
			Boolean isTrue = lists.get(i).findElement(By.tagName("input")).isSelected();
			if(isTrue) {
				languageArrayList.add(lists.get(i).findElement(By.tagName("div")).getAttribute("innerText").trim());
			}
		}
		String str[] = new String[languageArrayList.size()];
        for (int j = 0; j < languageArrayList.size(); j++) {
            str[j] = languageArrayList.get(j);
        }
        languagesTableValues = String.join(",", str);
        in = languages.toString();
		String[] input = in.split(",");
		Arrays.sort(input);
		String[] output = languagesTableValues.toString().split(",");
		Arrays.sort(output);
		boolean isTrue = Arrays.equals(input, output);
		if(!isTrue){
			CucumberReporterUtils.log("Input: "+Arrays.asList(input));
			CucumberReporterUtils.log("Output: "+Arrays.asList(output));
		}
		soft.assertTrue(isTrue, message);
	}
	public void check_languages_in_multiselect(String languages,WebElement element,String message){
		String languagesTableValues = null;
		List<WebElement> lists;
		String in = null;
		ArrayList<String> languageArrayList=new ArrayList<String>();
		lists = element.findElements(By.tagName("li"));
		for(int i =0;i<lists.size();i++) {
			Boolean isTrue = lists.get(i).findElement(By.tagName("input")).isSelected();
			if(isTrue) {
				languageArrayList.add(lists.get(i).findElement(By.tagName("div")).getAttribute("innerText").trim());
			}
		}
		String str[] = new String[languageArrayList.size()];
        for (int j = 0; j < languageArrayList.size(); j++) {
            str[j] = languageArrayList.get(j);
        }
        languagesTableValues = String.join(",", str);
        if(languagesTableValues.contains("English")){
        	in = languages.toString().concat(languages.equals("")?"English":languagesTableValues.isEmpty()?"":",English");
        }
        else{
        	in = languages.toString();
        }
		String[] input = in.toUpperCase().split(",");
		Arrays.sort(input);
		String[] output = languagesTableValues.toString().toUpperCase().split(",");
		Arrays.sort(output);
		boolean isTrue = Arrays.equals(input, output);
		if(!isTrue){
			CucumberReporterUtils.log("Input: "+Arrays.asList(input));
			CucumberReporterUtils.log("Output: "+Arrays.asList(output));
		}
		soft.assertTrue(isTrue, message);
	}
	public void check_sector_coverage_in_multiselect(String sector_coverage,WebElement element,String message){
		String languagesTableValues = null;
		List<WebElement> lists;
		String in = null;
		ArrayList<String> languageArrayList=new ArrayList<String>();
		lists = element.findElements(By.tagName("li"));
		for(int i =0;i<lists.size();i++) {
			Boolean isTrue = lists.get(i).findElement(By.tagName("input")).isSelected();
			if(isTrue) {
				languageArrayList.add(lists.get(i).findElement(By.tagName("div")).getAttribute("innerText").trim());
			}
		}
		String str[] = new String[languageArrayList.size()];
        for (int j = 0; j < languageArrayList.size(); j++) {
            str[j] = languageArrayList.get(j);
        }
        languagesTableValues = String.join(",", str);
        in = sector_coverage.toString();
		String[] input = in.split(",");
		Arrays.sort(input);
		String[] output = languagesTableValues.toString().split(",");
		Arrays.sort(output);
		boolean isTrue = Arrays.equals(input, output);
		if(!isTrue){
			CucumberReporterUtils.log("Input: "+Arrays.asList(input));
			CucumberReporterUtils.log("Output: "+Arrays.asList(output));
		}
		soft.assertTrue(isTrue, message);
	}
	public void check_before_radio_status_select(WebElement field_element_active,WebElement field_element_inactive,WebElement label_element,String label_expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		boolean actual_active = obj.waitForExpectedElement(field_element_active).isSelected();
		soft.assertEquals(String.valueOf(actual_active), "false", message+" Active selected by default");
		boolean actual_inactive = obj.waitForExpectedElement(field_element_inactive).isSelected();
		soft.assertEquals(String.valueOf(actual_inactive), "false", message+" Inactive selected by default");
		String label_actual = obj.waitForExpectedElement(label_element).getText().trim();
		soft.assertEquals(label_actual, label_expected, message+" label");
	}
	public void check_after_radio_status_select(WebElement field_element_active,WebElement field_element_inactive,String expected,String message){
		PageObjectUtils obj = new PageObjectUtils() {
		};
		if(!expected.equals("")){
			if(expected.equalsIgnoreCase("Active")){
				boolean actual_active = obj.waitForExpectedElement(field_element_active).isSelected();
				soft.assertEquals(String.valueOf(actual_active), "true", message+" Active not selected after click");
				boolean actual_inactive = obj.waitForExpectedElement(field_element_inactive).isSelected();
				soft.assertEquals(String.valueOf(actual_inactive), "false", message+" Inactive not selected after click");
			}else{
				boolean actual_active = obj.waitForExpectedElement(field_element_active).isSelected();
				soft.assertEquals(String.valueOf(actual_active), "false", message+" Active not selected after click");
				boolean actual_inactive = obj.waitForExpectedElement(field_element_inactive).isSelected();
				soft.assertEquals(String.valueOf(actual_inactive), "true", message+" Inactive not selected after click");
			}
		}else{
			boolean actual_active = obj.waitForExpectedElement(field_element_active).isSelected();
			soft.assertEquals(String.valueOf(actual_active), "false", message+" Active not selected after click");
			boolean actual_inactive = obj.waitForExpectedElement(field_element_inactive).isSelected();
			soft.assertEquals(String.valueOf(actual_inactive), "false", message+" Inactive not selected after click");
		}
	}
	public void select_from_dropdown(List<WebElement> webElementList,String name) {
		boolean notFound = true;
		for(WebElement element: webElementList) {
			String x=element.getAttribute("text");
			if((x.equalsIgnoreCase(name))) {
				element.click();
				notFound = false;
				break;
			}
		}
		if(notFound == true) {
			soft.assertTrue(false, name +" is not there in dropdown");
		}
	}
	public String timeConversion(String string) {
		return LocalTime.parse(string, DateTimeFormatter.ofPattern("hh:mm:a", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}
	public boolean isAlertPresents() {
		try {
			WebDriverHelper.getDriver().switchTo().alert();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	public String getISTDateConversion(String string) {
		SimpleDateFormat d,f;
		String modifiedDate=null;
		try {
		    d = new SimpleDateFormat("yyyy-MM-dd");
		    f = new SimpleDateFormat("dd-MMM-yyyy");
		    Date temp = d.parse(string);
		    modifiedDate = f.format(temp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return modifiedDate;
	}
	public String getISTTimeConversion(String dateValue,String timeValue,String timeZone) {
		return LocalTime.parse(timeValue, DateTimeFormatter.ofPattern("hh:mm:a", Locale.US)).format(DateTimeFormatter.ofPattern("hh:mm a")).toString();
	}
	public static String getUtcConversion(String dateValue,String timeValue,String timeZone){
		String formatterUtcDateTime = null;
		String tim = LocalTime.parse(timeValue, DateTimeFormatter.ofPattern("hh:mm:a", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalDate datePart = LocalDate.parse(dateValue);
		LocalTime timePart = LocalTime.parse(tim);
		LocalDateTime dt = LocalDateTime.of(datePart, timePart);
		String datetime = dt.toString();
		ZoneId time_zone = ZoneId.of(timeZone);
		DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ZonedDateTime utcDateTime = LocalDateTime.parse(datetime).atZone(time_zone).withZoneSameInstant(ZoneId.of("UTC"));
		formatterUtcDateTime = utcDateTime.format(targetFormatter);
		return formatterUtcDateTime;
	}
	public String seperateUTCDateTime(String dateValue,String timeValue,String timeZone,String type) {
		String formatterUtcDateTime = getUtcConversion(dateValue, timeValue, timeZone);
		String[] arr1 = formatterUtcDateTime.split("T");
		String formattedDate = arr1[0];
		String modifiedDate=null;
		if(type.equalsIgnoreCase("date")) {
			SimpleDateFormat d,f;
			try {
				d = new SimpleDateFormat("yyyy-MM-dd");
			    f = new SimpleDateFormat("dd-MMM-yyyy");
			    Date temp = d.parse(formattedDate);
			    modifiedDate = f.format(temp); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			return modifiedDate;
		}
		else {
			String[] arr2 = arr1[1].split("Z");
			String formattedTime = LocalTime.parse(arr2[0], DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US)).format(DateTimeFormatter.ofPattern("hh:mm a"));
			return formattedTime;
		}
	}
	public String getCurrentTimezoneConversion(String dateValue,String timeValue,String timeZone) {
		String formatterUtcDateTime = getUtcConversion(dateValue, timeValue, timeZone);
		Instant s = Instant.parse(formatterUtcDateTime);
        LocalDateTime formattedIst = LocalDateTime.ofInstant(s, ZoneId.systemDefault());
        return formattedIst.toString();
	}
	public String getIstConversion(String dateValue,String timeValue,String timeZone) {
		String formatterUtcDateTime = getUtcConversion(dateValue, timeValue, timeZone);
		Instant s = Instant.parse(formatterUtcDateTime);
        LocalDateTime formattedIst = LocalDateTime.ofInstant(s, ZoneId.of("Asia/Kolkata"));
        return formattedIst.toString();
	}
	public String seperateISTTimezoneDateTime(String dateValue,String timeValue,String timeZone,String type) {
		String systemTimeZoneDateTime = getIstConversion(dateValue, timeValue, timeZone);
		String[] arr1 = systemTimeZoneDateTime.split("T");
		String formattedDate = arr1[0];
		String modifiedDate=null;
		if(type.equalsIgnoreCase("date")) {
			SimpleDateFormat d,f;
			try {
				d = new SimpleDateFormat("yyyy-MM-dd");
			    f = new SimpleDateFormat("dd-MMM-yyyy");
			    Date temp = d.parse(formattedDate);
			    modifiedDate = f.format(temp); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			return modifiedDate;
		}
		else {
			String formattedTime = LocalTime.parse(arr1[1], DateTimeFormatter.ofPattern("HH:mm", Locale.US)).format(DateTimeFormatter.ofPattern("hh:mm a")).toString();
			return formattedTime;
		}
	}
	public String seperateCurrentTimezoneDateTime(String dateValue,String timeValue,String timeZone,String type) {
		String systemTimeZoneDateTime = getCurrentTimezoneConversion(dateValue, timeValue, timeZone);
		String[] arr1 = systemTimeZoneDateTime.split("T");
		String formattedDate = arr1[0];
		String modifiedDate=null;
		if(type.equalsIgnoreCase("date")) {
			SimpleDateFormat d,f;
			try {
				d = new SimpleDateFormat("yyyy-MM-dd");
			    f = new SimpleDateFormat("dd-MMM-yyyy");
			    Date temp = d.parse(formattedDate);
			    modifiedDate = f.format(temp); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			return modifiedDate;
		}
		else {
			String formattedTime = LocalTime.parse(arr1[1], DateTimeFormatter.ofPattern("HH:mm", Locale.US)).format(DateTimeFormatter.ofPattern("hh:mm a")).toString();
			return formattedTime;
		}
	}
	public String getDateConversion(String dateValue) {
		String modifiedDate=null;
		SimpleDateFormat d,f;
		try {
			d = new SimpleDateFormat("yyyy-MM-dd");
		    f = new SimpleDateFormat("dd-MMM-yyyy");
		    Date temp = d.parse(dateValue);
		    modifiedDate = f.format(temp); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modifiedDate;
	}
	public String getTimeConversion(String timeValue) {
		return LocalTime.parse(timeValue, DateTimeFormatter.ofPattern("hh:mm:a", Locale.US)).format(DateTimeFormatter.ofPattern("hh:mm a")).toString();
	}
	
	public void sleep(long seconds, List<WebElement> element) {
		long limit  = seconds/500;
		long count = 0;
		while(!element.isEmpty() && count < limit){
			try {
				Thread.sleep(500);
				++count;
			} catch (InterruptedException e) {
				CucumberReporterUtils.log_exception(e);
				// Restore interrupted state...
			    Thread.currentThread().interrupt();

			}
		}
	}
}
