package com.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase{
	
	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By btnForgotPassword = By.xpath("//p[text()='Forgot Your Password? ']");
	
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage loginPF() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		return new DashboardPage();
	}
		
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public DashboardPage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}
	
	public DashboardPage loginVar() {
		driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		driver.findElement(txtPassword).sendKeys(prop.getProperty("password"));
		driver.findElement(btnLogin).click();
		return new DashboardPage();
	}
	
	public void clickForgotPassword() {
		driver.findElement(By.xpath("//p[text()='Forgot Your Password? ']")).click();
	}
	
	
}
