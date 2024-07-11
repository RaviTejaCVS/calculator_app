package calculator.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import calculator.TestComponents.BaseTest;
import freemarker.log.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition extends BaseTest {
	//public WebDriver driver;
//	public LandingPage landingpage;
	ExtentHtmlReporter htmlReporter; 
	ExtentReports extent;
	ExtentTest test;

	@Before
	public void initialize(Scenario s) throws IOException  {
		landingpage=launchApplication();
		 
	}

	@Given("^I landed in Calculator Web Application$")
	public void i_landed_in_calculator_application() {
		// Write code here that turns the phrase above into concrete actions
		try {
			landingpage=launchApplication();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Given("I want to (.+)$")
	public void i_want_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I enter the first number (.+)$")
	public void i_enter_the_first_number(int num1) {
		// Write code here that turns the phrase above into co
		
		landingpage.clickOnElementByValue(String.valueOf(num1));
	}

	@When("^I enter the second number (.+)$")
	public void i_enter_the_second_number(int num2) {
		landingpage.clickOnElementByValue(String.valueOf(num2));
	}

	@Then("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String method) {
		landingpage.clickOnElementByValue(method);
		//test.l
	}

	@Then("^I see the displayed sum is (.*?)$")
	public void i_see_the_displayed_sum_is(String expectedResult) {
		String actualResult=landingpage.getElementText();
		Assert.assertTrue("The expected and actual resutls matching is: ",expectedResult.equals(actualResult));
		

	}
	
	@After
	public void detach() throws IOException  {
	driver.close();
	}
}

