package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		// opens this in a new window
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		// this closes just the current window.
		//driver.close();
		
		// this closes both windows.
		driver.quit();

	}

}
