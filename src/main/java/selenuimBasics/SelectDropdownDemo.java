package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get(" https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
	
	
	
	
	
	
	
	
	
	}

}
