package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {
	
	/* 
	 * Face book Login feature
	 * steps
	 * 1. open the browser
	 * 2. open the URL
	 * 3. Enter emial id
	 * 4. enter password
	 * 5. click on login button
	 * 6. close the browser
	 * 
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("testemail@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("testpassword");
		driver.findElement(By.name("login")).click();
		
	
	
	}

}
