package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	@FindBy (xpath="//span[contains(text(),'pallavsidana')]")
	WebElement userNameLabel;

	

	@FindBy (xpath="(//a[@class='fedora-navbar-link navbar-link'])[1]")
	WebElement myCourse;


	public HomePage() {

		PageFactory.initElements(e_driver, this);

	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean UserNameLable() {
		return userNameLabel.isDisplayed();
	}
	public void  verifyMyCourseLinkClick() {
		myCourse.click();	
	}
}
