package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main(String[] args) {
		
		/*
		 * isDisplayed
		 * isEnabled
		 * isSelected
		 * 
		 * 
		 * https://practicetestautomation.com/practice-test-login/
		 * 
		 * https://the-internet.herokuapp.com/
		 * 
		 * 
		 */
		
		//open url
		//identify the 2checkboxes and save thnen in veriable
		//apply all the 3 methods on cb1 and print the boolena result . Exp o/p: T,T, F
		//apply all the 3 methods on cb2 and print the boolena result . Exp o/p: T,T, T
		
		
		//click on cb1
		//apply all the 3 methods on cb1 and print the boolean result , exp o/p : T,T,T
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		
		
	}

}
