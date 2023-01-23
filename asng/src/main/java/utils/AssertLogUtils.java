package utils;

import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class AssertLogUtils extends SoftAssert {

  @Override
  public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
//    String suffix = String.format("Expected [%s] but found [%s]",assertCommand.getExpected().toString(), assertCommand.getActual().toString());
//    CucumberReporterUtils.log_fail(assertCommand.getMessage() + " <FAILED>. " + suffix);
    CucumberReporterUtils.log_fail(ex.getMessage());
  }
}
