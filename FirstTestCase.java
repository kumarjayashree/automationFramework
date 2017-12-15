package automationFramework;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.store.demoqa.com");
		System.out.println("Successfully opened web site demo qa");
		Thread.sleep(5);
		driver.quit();
		
		
	}

}
