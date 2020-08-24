package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementByLinkText {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
		
		WebElement Link = driver.findElement(By.linkText("ID locator in Selenium"));
		
		Link.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
