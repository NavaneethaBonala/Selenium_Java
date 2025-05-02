package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public  void dbconnection()
	{
		System.out.println("Connecting to DB");
	}
	
	@AfterSuite
	public  void sendReport()
	{
		System.out.println("Sending Status Report");
	}
	
	@BeforeMethod
	public  void browserSetup()
	{
		System.out.println("Setting Up Browser");
	}
	
	@Test
	public  void tc1()
	{
		System.out.println("FB login ");
	}
	
	
	@Test
	public  void SignUp()
	{
		System.out.println("FB SignUp");
	}
	
	@Test
	public  void closeBrowser()
	{
		System.out.println("Closing browser");
	}
}
