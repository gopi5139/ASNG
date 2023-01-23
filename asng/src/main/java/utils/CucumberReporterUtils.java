package utils;

import java.util.Arrays;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class CucumberReporterUtils {
	
	public static void print_log(String key,String value) {
		String extetntMarkup = value;
		String dropdownName = key+": ";
		String extetntMarkupMessage = "<b>" + "<font face=\"verdana\" color=\"#EC2164\">" + dropdownName + ":" + "</font>" + "</b >" + extetntMarkup + " \n";
		// test.get().info(extetntMarkupMessage);
		ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
	}
	
	public static void log(String message) {
		String info = message;
		String extetntMarkupMessage = "<b>" + "<font face=\"verdana\" color=\"#21C4D1\">" + info + "</font>" + "</b >";
		// test.get().info(extetntMarkupMessage);
		ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
	}

	public static void log(String log, String description) {
		try {
			String markupMessage = log;
			String dropdownName = description;
			String markupString = MarkupHelper.createCodeBlock(markupMessage).getMarkup();
			String extetntMarkupMessage = "<details>" + "<summary>" + "<b>" + "<font face=\"verdana\" color=\"#EC2164\">" + dropdownName + "</font>" + "</b >" + "</summary>" + markupString + "</details>" + " \n";
			ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
		} catch (Exception e) {
		}
	}

	public static void log_int(int log, String description) {
		try {
			int markupMessage = log;
			String dropdownName = description;
			// String markupString =
			// MarkupHelper.createCodeBlock(markupMessage).getMarkup();
			String extetntMarkupMessage = "<details>" + "<summary>" + "<b>" + "<font face=\"verdana\" color=\"#EC2164\">" + dropdownName + "</font>" + "</b >" + "</summary>" + markupMessage + "</details>" + " \n";
			ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
		} catch (Exception e) {
		}
	}

	public static void log(int message) {
		int info = message;
		ExtentCucumberAdapter.addTestStepLog(String.valueOf(info));
	}

	public static synchronized void log_exception(Exception e) {
		String extetntMarkupMessage = null;
		String dropdownName = "Exception Trace";
		String exceptionMessage;
		exceptionMessage = e.getMessage() + "," + Arrays.toString(e.getStackTrace());
		extetntMarkupMessage = "<details>" + "<summary>" + "<b>" + "<font face=\"verdana\">" + dropdownName + "</font>" + "</b >" + "</summary>" + exceptionMessage.replaceAll(",", "</br>") + "</details>" + " \n";
		ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
	}
	
	public static void log(AssertionError t) {
		String exceptionMessage;
		exceptionMessage = t.getMessage();
		ExtentCucumberAdapter.addTestStepLog(exceptionMessage);
	}

	public static synchronized void log_fail(String logfail) {
		String dropdownName = "Failed:";
		String extetntMarkupMessage = "<details style=\"background-color:white\">" + "<summary style=\"background-color:plum\">" + "<b>" + "<font face=\"verdana\" color=\"red\">" + dropdownName + "</font>" + "</b >" + "</summary>" + logfail + "</details>" + " \n";
//		ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
		ExtentCucumberAdapter.getCurrentStep().fail(extetntMarkupMessage);
	}

	public static synchronized void log_userID(String user_id) {
		try {
			String markupMessage = user_id;
			String dropdownName = "User_id: ";
			String markupString = MarkupHelper.createCodeBlock(markupMessage).getMarkup();
			String extetntMarkupMessage = "<details>" + "<summary>" + "<b>" + "<font face=\"verdana\" color=\"#EC2164\">" + dropdownName + "</font>" + "</b >" + "</summary>" + markupString + "</details>" + " \n";
			ExtentCucumberAdapter.addTestStepLog(extetntMarkupMessage);
		} catch (Exception e) {
		}
	}
}
