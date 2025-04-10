package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	//open https://demo.automationtesting.in/Frames.html
	//enter your name in the text box
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		//switching to iframe
		//name
		//driver.switchTo().frame("SingleFrame");
		//driver.switchTo().frame("singleframe");
		//div[@id='Single']/iframe
		WebElement frame =  driver.findElement(By.xpath("//div[@id='Single']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajay");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}
	
}
