package com.batch.automation.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.batch.automation.base.BaseTest;
import com.batch.automation.page.LoginToMoneyControl;
import com.batch.automation.page.MoneyControlHomePage;

public class LoginToMoneyControlTest extends BaseTest {
	
//	public static void main(String[] args) {
	@Test
	//Test Case 1:- Login to moneycontrol Application
	public void loginTest() {
		
		LoginToMoneyControl login = new LoginToMoneyControl(driver);
		login.navigateToMoneyControl();
		login.clickOnMoneyControlLink();
		login.login();
	}	
	
	//Test Case 2: Navigate to find funds page
	@Test
	public void findFunds() {
		LoginToMoneyControl loginToMoneyControl = new LoginToMoneyControl(driver);
		loginToMoneyControl.navigateToMoneyControl();
		loginToMoneyControl.clickOnMoneyControlLink();
		//loginToMoneyControl.login();
        MoneyControlHomePage  moneyControlHomePage = new MoneyControlHomePage(driver);
        moneyControlHomePage.navigateToFindFunds();        
	}

}
