package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigateCmds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String appURL = "http://www.DemoQA.com";
		driver.navigate().to(appURL);
		Thread.sleep(10000);
		
		// Click on the registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		Thread.sleep(10000);
		
		// Navigates back to home page
		driver.navigate().back();
		Thread.sleep(10000);
		
		//Go forward to registration page
		driver.navigate().forward();
		Thread.sleep(10000);
		
		// Go back to the home page
		driver.navigate().to(appURL);
		Thread.sleep(10000);
		
		// Refreshes the page
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		// Closes all browser
		driver.close();

	}

}
