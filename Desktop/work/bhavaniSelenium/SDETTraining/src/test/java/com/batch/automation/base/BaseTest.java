package com.batch.automation.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
public WebDriver driver;
 //launching the browser
@BeforeMethod	
public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JVM REDDY\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
    driver= new ChromeDriver();
    
}
@AfterMethod
public void closeBrowser() {
	driver.close();
}
}