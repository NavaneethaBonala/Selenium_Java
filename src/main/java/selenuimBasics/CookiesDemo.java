package selenuimBasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// we can delete all cookies before starting any of the url

		driver.manage().deleteAllCookies();

		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie abc : cookies) {
			System.out.println(abc);
			System.out.println("......................................................");
		}

	}

}
