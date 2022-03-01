package test_Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:Reports/htmlReport.html",
				"json:Reports/jsonReport.json"},
		features="./src/test/resources/Features",
		glue="step_definitions",
		dryRun=false,
		tags="@TradeAppToolstab"
		)
public class TestRunner {

}