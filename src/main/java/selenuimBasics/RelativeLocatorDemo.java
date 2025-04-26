package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("TestEmail");

		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));

		password.sendKeys("Testpassword");

		// here tag name should be used for which element we are tying to find
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();

	}

}
