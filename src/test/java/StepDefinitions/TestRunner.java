package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/bhagy/eclipse-workspace/CucumberJava/src/test/resources/Features",
		glue= {"StepDefinitions"},
		monochrome=true,
		plugin= {"junit:target/JUnitReports.xml"}
)
		
public class TestRunner {

}
