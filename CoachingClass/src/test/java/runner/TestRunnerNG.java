package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/register.feature"
		,glue="stepDefinitions"
		,plugin = {"html:target/Destination"}
			)

public class TestRunnerNG extends AbstractTestNGCucumberTests {

}
