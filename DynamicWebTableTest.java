package automationFramework;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebTableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();		
		
		// Open the url.
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		// Get the dubai from the row 1 and column 2 
		
		WebElement tableColumnDesired= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]"));
		System.out.println(tableColumnDesired.getText());
		
		// click on details link on the last column of the first row.
		
		WebElement detailsLink = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a"));
		String detailValue = detailsLink.getText();
		System.out.println(detailValue);
		detailsLink.click();
		Thread.sleep(6);

		driver.quit();
	}

}
