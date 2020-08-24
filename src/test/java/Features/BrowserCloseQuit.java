package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCloseQuit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // maximize browser window 
		driver.manage().deleteAllCookies(); // delete all cookies

		// Invoking the browser with given URL
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");

		// Finding the WebElement of Link for text "ID locator in Selenium"
		WebElement firstLink = driver.findElement(By.linkText("ID locator in Selenium"));

		// Clicking on the link
		firstLink.click();

		// Waiting for next page to load 
		Thread.sleep(5000);

		// Closing the current browser instance where WebDriver is pointing
		//driver.close();
		
		// Closing the all browser instances opened
		driver.quit();

	}

}
