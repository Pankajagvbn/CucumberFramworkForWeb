package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		monochrome = true,
		features = "src/test/java/features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue = "stepDefinitions",
		tags="@Google"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}

