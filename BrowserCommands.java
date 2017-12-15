package automationFramework;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com");
		Thread.sleep(5);
		String pageTitle = driver.getTitle();
		int pageLength = pageTitle.length();
		System.out.println("Page Title = " + pageTitle  + ". Its length = " + pageLength);
	
		String url = driver.getCurrentUrl();
		String pageSource = new String();
		int pageSourceLength = 0;
		
		if (url.contains("http://store.demoqa.com")) {
			pageSource = driver.getPageSource();
			pageSourceLength = pageSource.length();
			System.out.println("Page Source  = " + pageSource + "Its Length =" + pageSourceLength);
			
			
		}
		driver.close();
	}

}
