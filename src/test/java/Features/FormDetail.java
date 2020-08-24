package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormDetail {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/text-box");
		
		WebElement fullNameTextBox = driver.findElement(By.id("userName"));
		fullNameTextBox.sendKeys("Kavita");

		WebElement userEmailId = driver.findElement(By.id("userEmail"));
		userEmailId.sendKeys("kavita2792@gmail.com");
		
		WebElement address = driver.findElement(By.id("userEmail"));
		userEmailId.sendKeys("Jalgaon");
		
		WebElement formSubmitButton = driver.findElement(By.id("submit"));
		formSubmitButton.click();

		WebElement nameEntry = driver.findElement(By.id("name"));
		String nameText = nameEntry.getText();
		System.out.println(nameText);

		WebElement emailEntry = driver.findElement(By.id("email"));
		String emailText = emailEntry.getText();
		System.out.println(emailText);
		
		WebElement addressEntry = driver.findElement(By.id("address"));
		String addressentry = addressEntry.getText();
		System.out.println(addressentry);
	}

}
