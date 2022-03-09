package com.batch.automation.page;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.batch.automation.util.WebElementActions;

public class LoginToMoneyControl { 
//		
    @FindBy(xpath = "//a[text()='moneycontrol.com']") 
    WebElement moneyControlLink;
    
    @FindBy(xpath="//a[@title='Hello, Login']")
    WebElement helloLogin;
   
   // By moneyControlLink = By.xpath("//a[text()='moneycontrol.com']");
    
//    @FindBy(how=How.XPATH, using="//a[text()='moneycontrol.com']")
//    WebElement moneyControlLink3;
    
    WebDriver driver; 
    WebElementActions actions; 
    public LoginToMoneyControl(WebDriver driver) {
    	this.driver = driver;
    	this.actions=new WebElementActions(driver);
    	PageFactory.initElements(driver, this);
    }
    
	public void navigateToMoneyControl() {
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
	}		
	public void clickOnMoneyControlLink() {
		//driver.findElement(By.xpath("//a[text()='moneycontrol.com']")).click();
		try {
		 moneyControlLink.click();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public void login() {		
		
		//WebElement login = driver.findElement(By.xpath("//a[@title='Hello, Login']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(login).build().perform();
		actions.moveToElement(helloLogin);
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		driver.switchTo().frame("myframe");
		driver.findElement(By.xpath("(//input[@id='email'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@id='email'])[]")).sendKeys();
		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).sendKeys();
	}
	
}

