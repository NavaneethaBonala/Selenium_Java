package selenuimBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dd = driver.findElement(By.id("dropdown"));		
		
		Select obj = new Select(dd);
		//obj.selectByIndex(1);
		//obj.selectByValue("1");
		//obj.selectByVisibleText("Option 2");
		
		//get all the options inside a dropdown
		List<WebElement> options = obj.getOptions();
		for (WebElement abc : options) {
			System.out.println(abc.getText());
		}
		
		//open https://www.orangehrm.com/en/contact-sales
		//get how many options in country dd
		//print text of each option
		
		

	}

}
