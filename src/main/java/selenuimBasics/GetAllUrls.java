package selenuimBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllUrls {
	
	public static void main(String[] args) {
		/*
		 * open facebook
		 * get all the urls on the page .findelelemts and save it 
		 * print the count of urlss present on the page
		 * print the text of each url
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebElement username = driver.findElement(By.id("username"));
//		username.getText();
		
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println("Count of URLS ="+urls.size());
		
		for(WebElement abc : urls)
		{
			System.out.println(abc.getText());
			System.out.println(abc.getDomAttribute("title"));// returns hover title
			
		}
	}

}
