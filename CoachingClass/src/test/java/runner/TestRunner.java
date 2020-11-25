package runner;

/*import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
*/
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/register.feature"
		,glue="stepDefinitions"
		,plugin = {"html:target/Destination"}
			)

public class TestRunner extends AbstractTestNGCucumberTests {

}
