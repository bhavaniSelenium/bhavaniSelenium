package com.batch.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.batch.automation.base.BaseTest;
import com.batch.automation.page.ContinueToMoneyControlPage;
import com.batch.automation.page.LoginToMoneyControl;
import com.batch.automation.page.MoneyControlHomePage;

public class LoginToMoneyControlTest extends BaseTest {

//	public static void main(String[] args) {
	// Test Case 1:- Login to moneycontrol Application
	@Test
	public void login() {
		LoginToMoneyControl loginToMoneyControl = new LoginToMoneyControl(driver);
		loginToMoneyControl.navigateToMoneyControl();
		ContinueToMoneyControlPage continueToMoneyControlPage = new ContinueToMoneyControlPage(driver);
		continueToMoneyControlPage.clickOnMoneyControlLink();
		loginToMoneyControl.login("harshitakanikanti@gmail.com", "Harshita@1234");
		MoneyControlHomePage moneyControlHomePage = new MoneyControlHomePage(driver);
		String emailId = moneyControlHomePage.verifyEmailInHomePage();
		Assert.assertEquals(emailId, "harshitakanikanti@gmail.com");
	}

	// Testcase 2:login to MoneyControl application with invalidCredentials
	@Test
	public void invalidloginCredentials() {
		LoginToMoneyControl loginToMoneyControl = new LoginToMoneyControl(driver);
		loginToMoneyControl.navigateToMoneyControl();
		ContinueToMoneyControlPage continueToMoneyControlPage = new ContinueToMoneyControlPage(driver);
		continueToMoneyControlPage.clickOnMoneyControlLink();
		loginToMoneyControl.login("harshitakanikanti@gmail.com", "1234");
	}

	// Testcase 3: login to MoneyControl application with out passord
	@Test
	public void loginwithOutPassword() {
		LoginToMoneyControl loginToMoneyControl = new LoginToMoneyControl(driver);
		loginToMoneyControl.navigateToMoneyControl();
		ContinueToMoneyControlPage continueToMoneyControlPage = new ContinueToMoneyControlPage(driver);
		continueToMoneyControlPage.clickOnMoneyControlLink();
		loginToMoneyControl.login("harshitakanikanti@gmail.com", " ");
	}

//Test Case 2: Navigate to find funds page
	@Test
	public void findFunds() {
		LoginToMoneyControl loginToMoneyControl = new LoginToMoneyControl(driver);
		loginToMoneyControl.navigateToMoneyControl();
		loginToMoneyControl.clickOnMoneyControlLink();
		// loginToMoneyControl.login();
		MoneyControlHomePage moneyControlHomePage = new MoneyControlHomePage(driver);
		moneyControlHomePage.navigateToFindFunds();
	}

}
