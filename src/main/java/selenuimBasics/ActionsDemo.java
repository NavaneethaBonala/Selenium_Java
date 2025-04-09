package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	// Actions class is for mouse and keyboard related events

	public static void main(String[] args) {
		 mouseCLicks();
		 keyboardEvents();
		 copyPaste();
		 scrolling();
		dragDrop();
	}

	public static void mouseCLicks() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement pass = driver.findElement(By.name("pass"));
		Actions act = new Actions(driver);
		// act.sendKeys(pass, "username").perform();
		// this is for right click

		// act.contextClick(pass).perform();
		pass.sendKeys("testpassword");
		act.doubleClick(pass).perform();
	}

	public static void keyboardEvents() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		// WebElement pass = driver.findElement(By.name("pass"));
		Actions act = new Actions(driver);
		act.sendKeys(email, "testemail").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("password").perform();
		// use send keys on email field
		// select and copy the value from email
		// navigate to password field
		// paste the value in password field

	}

	public static void copyPaste() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement email = driver.findElement(By.name("email"));
		// WebElement pass = driver.findElement(By.name("pass"));
		Actions act = new Actions(driver);
		act.sendKeys(email, "testemail").doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
				.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

	public static void scrolling() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		// 1st parameter - horizontal scroll (-ve <> left, +ve <> right)
		// 2nd parameter - vertical scroll (-ve <> up, +ve <> down)
		// act.scrollByAmount(0, 600).perform();

		WebElement target = driver.findElement(By.xpath("//h2[text()='No Cost EMI']"));
		act.scrollToElement(target).perform();

	}

	public static void dragDrop() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		// identify source
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		// in Actions class >> dragandDrop
		act.dragAndDrop(source, target).perform();
	}

}
