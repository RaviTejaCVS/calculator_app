package calculator.cucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import calculator.TestComponents.BaseTest;
import calculator.TestComponents.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Addition.feature",
plugin = { "pretty", "html:target/cucumber-reports" },monochrome = true,
glue = {"classpath:calculator.stepdefinition"})
public class AdditonRunnerTest {

	
	
}
