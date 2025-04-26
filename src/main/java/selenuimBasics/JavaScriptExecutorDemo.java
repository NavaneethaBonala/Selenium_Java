package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

//scroll by some pixels
		js.executeScript("window.scrollBy(0,200)");

//scroll to a web element
		WebElement target = driver.findElement(By.linkText("Video"));
		js.executeScript("arguments[0].scrollIntoView()", target);

//bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

//clicking

		js.executeScript("arguments[0].click()", target);

//we can execute any type of java script feature in Java using JavaSript executor
		js.executeScript("alert('Hi, I am an Alert')");

	}

}
