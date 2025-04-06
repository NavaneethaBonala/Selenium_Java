package selenuimBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		/*
		 * Xpath 
		 * Relative - starts anywhere in the middle
		 * //*[@id="email"]
		 * 		 * --starts with double slash

		 * 
		 * Aboslute - this starts from the root location ie html
		 * --starts with single slash
		 * 
		 * syntax for xpath
		 * 1. basic xpath
		 *    //htmltag[@attribute='value']
		 *    //input[@id='email']
		 *    
		 *  2. using AND, OR
		 *  
		 *  QA env : id = qalogin
		 *  UAT env : id = uatlogin
		 *  
		 *  //input[@id ='qalogin' or @id = 'uatlogin' ]
		 *  
		 *  id = qalogin name = abc
		 *  id = uatlogin
		 *  //input[@id ='qalogin' and @name = 'abc' ]
		 *  
		 *  3. text is not a webelement so use ()
		 *  //a[text()='Forgotten password']
		 *  
		 *  
		 *  4. xpath axis
		 *  
		 *  	div(id = abc)
		 *  		button (id=a)
		 *  
		 *  //div[@id='abc']
		 *  //button[@id='a']
		 *  
		 *  	div(id = abc)
		 *  		button ()
		 *  		button()
		 *  
		 *  child
		 *  parent to child
		 *  
		 *  1. //div[@id='abc']/button
		 *  2. //div[@id='abc']/child::button
		 *  3. //div[@id='abc']/button[2]
		 *  
		 *  
		 *  Parent
		 *  child to parent
		 *  
		 *  div()
		 *  button(@id = 'abc')
		 *  button()
		 *  //button[@id = 'abc']/parent::div	
		 *  
		 *  
		 *  Siblings
		 *  
		 *  div()
		 *  button()
		 *  button(@id = 'abc')
		 *  button()
		 *  
		 *  //button[@id='abc']/following-sibling::button

		 *  //button[@id='abc']/preceding-sibling::button
		 *  
		 *  form username to password in same xpath
		 *  //input[@name='email']/parent::div/following-sibling::div/div/input
		 *  
		 *  
		 *  from password to username in same xpath
		 *  //input[@id='password']/parent::div//following-sibling::div/input
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("uatlogin")).click();

	}

}
