package com.batch.automation.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.batch.automation.base.BaseTest;
import com.batch.automation.page.ProvidentFundCalculatorPage;

public class ProvidentFundCalculatorTest extends BaseTest{
	
	

	//TestCase 1:Fill all the fields
	@Test
	public void ProvidentFundCalculatorTest() {
		ProvidentFundCalculatorPage providentFundCalculatorPage = new ProvidentFundCalculatorPage(driver);
		providentFundCalculatorPage.navigateToPFCalculator();
		providentFundCalculatorPage.providentFundCalculator();
	
	}
	
	

	private void navigateToPFCalculator() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	

}
