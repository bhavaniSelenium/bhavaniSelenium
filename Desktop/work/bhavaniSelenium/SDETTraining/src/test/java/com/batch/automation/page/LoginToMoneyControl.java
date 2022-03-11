package com.batch.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.batch.automation.util.WebElementActions;

public class LoginToMoneyControl {

	@FindBy(xpath = "//a[text()='moneycontrol.com']")
	WebElement moneyControlLink;

	@FindBy(xpath = "//a[@title='Hello, Login']")
	WebElement helloLogin;

	@FindBy(xpath = "//a[@title='Log In']")
	WebElement loginButtonInHomepage;
	
	@FindBy(xpath = "(//input[@id='email'])[2]")
	WebElement email;

	@FindBy(xpath = "(//input[@id='pwd'])[2]")
	WebElement passord;

	@FindBy(xpath = "//button[@id='ACCT_LOGIN_SUBMIT']")
	WebElement loginbutton;

	// By moneyControlLink = By.xpath("//a[text()='moneycontrol.com']");

//    @FindBy(how=How.XPATH, using="//a[text()='moneycontrol.com']")
//    WebElement moneyControlLink3;

	WebDriver driver;
	WebElementActions actions;

	public LoginToMoneyControl(WebDriver driver) {
		this.driver = driver;
		this.actions = new WebElementActions(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateToMoneyControl() {
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
	}

	public void clickOnMoneyControlLink() {
		try {
			moneyControlLink.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void login(String username, String pwd) {
		Actions action = new Actions(driver);
		action.moveToElement(helloLogin).build().perform();
		actions.moveToElement(helloLogin);
		loginButtonInHomepage.click();
		driver.switchTo().frame("myframe");
	    email.click();
		email.sendKeys("harshitakanikanti@gmail.com");
		passord.click();
		passord.sendKeys("Harshita@1234");
		loginbutton.click();
	}

}
