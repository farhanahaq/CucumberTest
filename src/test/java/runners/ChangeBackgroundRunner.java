package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\14693\\eclipse-workspace-AutomationPracticalExam\\CucumberTest\\src\\test\\java\\features\\changeBackground.feature", glue = {
 "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )





public class ChangeBackgroundRunner {
	

}
