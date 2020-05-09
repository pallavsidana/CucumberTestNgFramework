package com.qa.pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
//	WebDriver driver;

	@FindBy (xpath="//p[contains(text(),'Join Our Newsletter')]")
	WebElement popup;
	
	@FindBy (xpath ="//button[contains(text(),'NO THANKS')]")
	WebElement noThanksClick;
	
//	@FindBy(xpath="//a[@class='theme-btn']")
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement Loginlink;

	@FindBy(xpath="//input[@name='user[email]']")
	WebElement username;

	@FindBy(xpath="//input[@name='user[password]']")
	WebElement password;

	@FindBy (xpath="//input[@name='commit']")
	WebElement loginButton;

//initilize the page objects	
	public LoginPage(){
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		

	}

	public void popup() {
		popup.click();
	}
	public void NoThanksClick() {
		noThanksClick.click();
	}
//Actions
	public void Loginlink() {
		Loginlink.click();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].click();", loginButton);
			return new HomePage();
			
	}
	public void LoginButton() {
		loginButton.click();
	}
//	public WebElement UserName(String un) {
//		username.sendKeys(un);
//		return Loginlink;
//	}
//	public WebElement Password(String pwd) {
//		password.sendKeys(pwd);
//		return Loginlink;
//	}
//	
//	public WebElement LoginButton() {
//		loginButton.click();
//	//	JavascriptExecutor js = (JavascriptExecutor) driver;
//		//js.executeScript("arguments[0].click();", loginButton);
//		return loginButton;
//	}

}
