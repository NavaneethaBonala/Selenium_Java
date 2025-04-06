package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("testemail@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("testpassword");
		driver.findElement(By.id("submit")).click();
		
	
	
		
	}

}
