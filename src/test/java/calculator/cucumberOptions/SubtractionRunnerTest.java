package calculator.cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Subtraction.feature",
plugin = { "pretty", "html:target/cucumber-reports" },monochrome = true,
glue = {"classpath:calculator.stepdefinition"})
public class SubtractionRunnerTest {

}
