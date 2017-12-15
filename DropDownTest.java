package automationFramework;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		
		// Open the url.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		WebElement dropDownTest = driver.findElement(By.id("continents"));
		Select dropDownSelect = new Select(dropDownTest);
		
		// Select Europe from the list.
		dropDownSelect.selectByIndex(1);
		
		//Thread.sleep(10000);
		
		// select Africa from the drop down.
		dropDownSelect.selectByVisibleText("Africa");
		
		
		
		List<WebElement> allOptions = dropDownSelect.getOptions();
		
		for (int i = 0; i< allOptions.size(); i++) {
			
			WebElement oneOption = allOptions.get(i);
			String value = oneOption.getAttribute("value");
			System.out.println(value);
			// if value is North America select it.
			
			if (value.equalsIgnoreCase("North America")) {
				dropDownSelect.selectByIndex(i);
			}
			
		}
		
		driver.quit();

	}

}
