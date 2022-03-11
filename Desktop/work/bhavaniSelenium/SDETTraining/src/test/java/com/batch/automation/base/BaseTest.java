package com.batch.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
public WebDriver driver;
//Launch the Browser
@BeforeMethod	
public void launchdriver() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandhya\\GitRepo\\bhavaniSelenium\\Desktop\\work\\bhavaniSelenium\\SDETTraining\\Driver\\chromedriver.exe");
    driver= new ChromeDriver();
    
}
@AfterMethod
public void closedriver() {
	driver.close();
}
}
