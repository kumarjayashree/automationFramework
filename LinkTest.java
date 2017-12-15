package automationFramework;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		// Open the url.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		// Get the link that says "Partial Link Test" and press click.
		try {
		WebElement partialLinkTest = driver.findElement(By.partialLinkText("Partial"));
		partialLinkTest.click();
		
		} catch (Exception e) {
		System.out.println("Exception occured when trying to get Partial Link Test");	
		}
		
		Thread.sleep(10000);
		

		//Get the submit button by tag name.
	
		try {
			WebElement submitButton = driver.findElement(By.tagName("button"));
			System.out.println(submitButton.getTagName());
		}catch (Exception e) {
		System.out.println("Exception occured during Tag Name");	
		}
		Thread.sleep(10000);
		
		
		
		try {
			WebElement linkTest = driver.findElement(By.linkText("Link Test"));
			linkTest.click();
		}catch (Exception e) {
		System.out.println("Exception occured link test");	
		}
		Thread.sleep(10000);
		
		driver.quit();
		}


}
