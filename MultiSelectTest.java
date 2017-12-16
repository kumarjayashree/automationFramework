package automationFramework;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// This is Exercise two of toolsqa drop down and multi select operations
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		WebElement seleniumCommands = driver.findElement(By.name("selenium_commands"));
		Select selectOptions = new Select(seleniumCommands);
		Thread.sleep(6);
		
		// select browser commands as the first option
		selectOptions.selectByIndex(0);
		Thread.sleep(6);
		selectOptions.deselectByIndex(0);
		
		// select navigate commands as the next option
		Thread.sleep(6);
		selectOptions.selectByVisibleText("Navigation Commands");
		
		// pause so that the changes can be visible.
		
		Thread.sleep(6);
		
		//Test whether the selected option is correct.
		
		//WebElement selectedOption = selectOptions.getFirstSelectedOption();
		//String navString = selectedOption.getText();
		//assert is not working???? equals needs to be overridden
		//assert(navString.equals("Navigation Commands"));
		
		
		// Select all options in the multi select options
		List <WebElement> getAllOptions = selectOptions.getOptions();
		for (int i =0; i < getAllOptions.size(); i++) {
			selectOptions.selectByIndex(i);
		}
		Thread.sleep(6);
		
		// Deselect all options in the multi select options.
		for (int i =0; i < getAllOptions.size(); i++) {
			selectOptions.deselectByIndex(i);
		}
		
		
		driver.quit();
		
		

	}
	
	
}


