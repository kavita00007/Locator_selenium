package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementByClassName {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Page title : " + driver.getTitle());
		
		WebElement logInButton = driver.findElement(By.className("Login"));
		
		logInButton.click();
		
		Thread.sleep(4000);
		
		System.out.println("The page title after log in : " + driver.getTitle());
	}

}
