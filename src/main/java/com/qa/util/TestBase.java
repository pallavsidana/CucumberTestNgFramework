package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop; 
	static String projectPath=System.getProperty("user.dir");
	public static EventFiringWebDriver e_driver;

	//here created base class construtor which will create an object of properties file
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\pallav.sidana\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	//initilizint webdriver here
	public static  void  Initilization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			e_driver =new EventFiringWebDriver(driver);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
}
