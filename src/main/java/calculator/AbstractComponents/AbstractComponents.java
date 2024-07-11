package calculator.AbstractComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractComponents {

	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	Properties prop;
	FileInputStream fis;
	String propFilePath = "\\src\\main\\java\\bobchos\\bar\\resources\\GlobalData.properties";
	String fullpath = System.getProperty("user.dir") + propFilePath;
	
	
	@FindBy(xpath = "//*[text()='Orders']")
	private WebElement orders;
	
	

	public void waitForElementtoAppear(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void staticWait(long milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt(); // set the interrupt flag
	        System.out.println("Thread was interrupted during sleep: " + e.getMessage());
	    }
	}
	
	public void highLightElement(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'background: none; border: 2px solid blue;');", element);
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		}
	

}
