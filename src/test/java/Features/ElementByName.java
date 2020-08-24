package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementByName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.google.co.in");
		
		WebElement search = driver.findElement(By.name("name"));
		search.sendKeys("Java tutorial");
		
		Thread.sleep(4000);
		
		WebElement searchButton = driver.findElement(By.name("button"));
		searchButton.click();
		
		Thread.sleep(4000);

		System.out.println("The Page Title is : " + driver.getTitle());
		
		driver.quit();
	}

}
