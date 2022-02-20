package com.batch.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoneyControlHomePage {

	WebDriver driver;
	
	public MoneyControlHomePage(WebDriver driver) {
		this.driver = driver;
	}
	//Test
	public void navigateToFindFunds() {
		
		WebElement findFund = driver.findElement(By.xpath("//li[@class='menu_l1  sub_nav']/a[@title='Mutual Funds']"));
		Actions action = new Actions(driver);
		action.moveToElement(findFund).build().perform();
		driver.findElement(By.xpath("//a[@title='Find Fund']")).click();
	}
}
