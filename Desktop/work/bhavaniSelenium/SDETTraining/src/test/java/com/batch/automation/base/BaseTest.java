package com.batch.automation.base;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
		
public static WebDriver driver;
String filePath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";

@BeforeMethod(alwaysRun = true)
@Parameters({ "browser" })	
public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver", filePath);
    driver= new ChromeDriver();
}
@AfterMethod
public void closeBrowser() {
	driver.close();
}
}
