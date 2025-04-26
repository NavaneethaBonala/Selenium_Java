package selenuimBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {

	public static void captureScreenshot(String tcname) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// to save the screenshots , create a new folder in root with name screenshots,
		// and take path of it
		String path = "./ScreenShots/" + tcname + ".png";

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);

		Files.copy(temp, new File(path));

	}

	public static void main(String[] args) throws IOException {

		captureScreenshot("Login Page");

	}

}
