package runner;

import org.junit.runner.RunWith;

/**
 * This class execute the feature file with JUnit and create an HTML report
 * 
 * @author Amit Aswani
 * 
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue = "testDefinition",
		plugin = {"html:target/cucumber-html-report"}
		)

public class TestRunner {
}
