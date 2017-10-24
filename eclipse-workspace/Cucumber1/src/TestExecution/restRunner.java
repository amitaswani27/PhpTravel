package TestExecution;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "TestScenarios",
				glue = "testScript"
			)
public class restRunner {

}
