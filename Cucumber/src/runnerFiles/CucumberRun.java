package runnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	  glue={"stepDefinitions"},
	  features="src/main/resources/featureFiles",
	  tags={"@createCustomer"}
  )


public class CucumberRun {

}
