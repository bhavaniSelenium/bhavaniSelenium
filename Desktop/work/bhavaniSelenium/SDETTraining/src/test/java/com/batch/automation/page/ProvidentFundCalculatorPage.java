package com.batch.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvidentFundCalculatorPage {

	@FindBy(xpath = "//input[@name='your_age']")
	WebElement age;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement basicsalarymonthly;

	@FindBy(xpath = "//input[@name='your_contribution']")
	WebElement contributiontoEPF;

	@FindBy(xpath = "//input[@name='employers_contribuion']")
	WebElement employerscontribuiontoEPF;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement Averageannualincreaseinsalary;

	@FindBy(xpath = "//input[@name='intend_to_retire']")
	WebElement Agewhenyouintendtoretire;

	@FindBy(xpath = "//input[@name='current_epf_balance']")
	WebElement CurrentEPFbalance;

	@FindBy(xpath = "//input[@name='current_interest_rate']")
	WebElement Currentinterestrate;

	WebDriver driver;

	public ProvidentFundCalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToPFCalculator() {
		driver.get("https://www.moneycontrol.com/personal-finance/tools/provident-fund-calculator.html?classic=true");
		driver.manage().window().maximize();
	}

	public void providentFundCalculator() {
		
		age.sendKeys("18");
		basicsalarymonthly.sendKeys("5000");
		contributiontoEPF.sendKeys("2");
		employerscontribuiontoEPF.sendKeys("5");
		Averageannualincreaseinsalary.sendKeys("10");
		Agewhenyouintendtoretire.sendKeys("58");
		CurrentEPFbalance.sendKeys("50,000");
		Currentinterestrate.sendKeys("50");

	}

}
