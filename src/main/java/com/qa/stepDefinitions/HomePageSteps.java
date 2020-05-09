package com.qa.stepDefinitions;

import org.openqa.selenium.Alert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends  TestBase{

	   HomePage hmObj = new HomePage();
	 LoginPage loginObj = new LoginPage();
	@Given("^user opens browsers$")
	public void user_opens_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// with the help testbase class calling initilization method
		TestBase.Initilization();
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(20000);
	//	 Alert alert = driver.switchTo().alert();
        loginObj.popup();
		loginObj.NoThanksClick();
	 Thread.sleep(5000);
	 //  loginObj.Loginlink();
	
	 
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   loginObj.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user click on Login Button$")
	public void user_click_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginObj.LoginButton();
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("home page displayed sucessfully");
	}

	@Then("^Validate home page title$")
	public void validate_home_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	   hmObj.verifyHomePageTitle();
	   System.out.println(hmObj.verifyHomePageTitle());
	}

	@Then("^Validate logged in usrname label is displayed$")
	public void validate_logged_in_usrname_label_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 hmObj.UserNameLable();
	 hmObj.verifyMyCourseLinkClick();
	}


}
