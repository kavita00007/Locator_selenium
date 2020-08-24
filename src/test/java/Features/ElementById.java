package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementById {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		WebElement User_Name = driver.findElement(By.id("email"));
		User_Name.sendKeys("kavitarpatil27@gmail.com");
		
		WebElement Button = driver.findElement(By.id("submit"));
		Button.click();
		
		String NextPage = driver.getTitle();
		
		System.out.println(NextPage);
	}

}
