package saucedemo.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = "@login",
		glue = "saucedemo.automation.steps",
	    dryRun =  false,
	    monochrome = true,
	    plugin = {"pretty" , "html:target/cucumber-report.html"},
	    snippets = SnippetType.CAMELCASE
		)

public class Executa {

}
