package com.batch.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinueToMoneyControlPage {

	WebDriver driver;

	public ContinueToMoneyControlPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMoneyControlLink() {
		try {
			driver.findElement(By.xpath("//a[text()='moneycontrol.com']")).click();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
