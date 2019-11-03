package training.sapient.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/main/resources/training/sapient/features"}, 
		glue = {"training.sapient.steps"}, 
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/json-report"}, 
		tags = {"@Sanity"}, 
		monochrome = true
)
public class TestRunner {

}
