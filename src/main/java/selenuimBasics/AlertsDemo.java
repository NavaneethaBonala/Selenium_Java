package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(4000);
		//at this point, there is an alert which needs to be handled
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("ajay trainer");
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
