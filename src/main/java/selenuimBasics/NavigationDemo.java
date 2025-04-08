package selenuimBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NavigationDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1 = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().back();
		Thread.sleep(3000);

		driver1.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
	}

}
