package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
	/*
	 * locators 
	 * 
	 * id
	 * name
	 * 
	 * 
	 * css
	 * xpath
	 * 
	 * classname
	 * tagname  : to find all the elements of the specific tag
	 * 
	 * 
	 * linktext : will wrk for only url text , exact match <a href=dfhdhfuisdhf.com > Linktext </a>
	 * partial link text : will wrk , if from whole text one work can match
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.findElements(By.tagName("input"));// if multiple matching elements, it will return u 1st tag name
		driver.findElements(By.linkText("input"));
		//No such elementexception // when selenium cannot identify the element
		
				
	
	
	
	}

}
