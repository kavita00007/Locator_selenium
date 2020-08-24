package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
		
		WebElement Link1 = driver.findElement(By.partialLinkText("Name locator")); 
		
		Link1.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
