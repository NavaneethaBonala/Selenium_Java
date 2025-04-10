package selenuimBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		//at this point, there is only 1 window
		String pwid = driver.getWindowHandle();
		System.out.println("Parent Window ID ==>> "+pwid);
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent Window Title ==>> " + parentWindowTitle);

		driver.findElement(By.linkText("Click Here")).click();
		//at this point, there are 2 window
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		it.next();
		String cwid = it.next();
		System.out.println("Child Window ID ==>> "+cwid);
		
		//to get the title of the child window, first we need to switch
		driver.switchTo().window(cwid);
		String childWindowTitle = driver.getTitle();
		System.out.println("Child Window Title ==>> " + childWindowTitle);
		
		//switching back to parent window
		driver.switchTo().window(pwid);
		String ww = driver.getTitle();
		System.out.println("Parent Window Title ==>> " + ww);
		
		//driver.close(); //will close the current window
		driver.quit();

		
	}
}
