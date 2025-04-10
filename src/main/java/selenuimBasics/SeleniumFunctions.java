package selenuimBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
	}
}
