package automationFramework;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCheckBoxTest {
	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String value = new String();
		// Open the url.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		try {
		
		List<WebElement> oRadioButtonSex = driver.findElements(By.name("sex"));
		
		// this is just to check whether it is 'Male' or Female
		value = oRadioButtonSex.get(0).getAttribute("Value");
		
		
		if (value.contains("Female")) {
			
			oRadioButtonSex.get(0).click();
			
		}else {
		
			oRadioButtonSex.get(1).click();
		}
		

		
		} catch (Exception e) {
			System.out.println("Exception caught in executing radio selection element sex");	
		}
		
		// select the 3rd from the years of experience.
		
		WebElement yearsOfExp = driver.findElement(By.id("exp-2"));
		yearsOfExp.click();
		
		// find the check box for automation tester.
		
		List<WebElement> testCheckBox = driver.findElements(By.name("profession"));
		for (int i = 0; i< testCheckBox.size(); i++) {
			if (testCheckBox.get(i).getAttribute("value").equalsIgnoreCase("Automation Tester")) {
				testCheckBox.get(i).click();
				System.out.println("Automation checked for profession category");
				break;
			}
		}
	
		// find the check box for automation tool that matches with "Selenium IDE"
		
		WebElement testAutomationTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		testAutomationTool.click();
		
		
		driver.quit();
		
		
		}
}
	

	
	
	






