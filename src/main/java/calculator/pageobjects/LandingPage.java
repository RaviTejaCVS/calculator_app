package calculator.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import calculator.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='display']/div")
	private WebElement displayText;
	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	public void clickOnElementByValue(String value)
	{
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@value='"+value+"']")).click();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public String getElementText()
	{
		String text=null;
		try {
			 text=displayText.getText();
			}catch (Exception e) {
			// TODO: handle exception
		}
		return text;
	}
}
