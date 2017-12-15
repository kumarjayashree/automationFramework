package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebElementTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		// Launch the tool sqa website.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

		// send first name to the first name text box.
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Jayashree");
		Thread.sleep(10000);
		
		
		//Send last name to the last name text box
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Kumar");
		Thread.sleep(10000);
		
		// click on the submit button
		WebElement submitName= driver.findElement(By.id("submit"));
		submitName.click();
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
