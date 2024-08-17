package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class detailsPage {

	WebDriver driver;

	public detailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder=\"6 Digit Pincode\"]")
	WebElement enterPincode;

	@FindBy(id = "want-expert")
	WebElement enterMobNum;

	@FindBy(xpath = "//div[contains(text(),'Continue')]")
	WebElement clkContinue;

	public WebElement enterPincode() {

		enterPincode.sendKeys("734008");
		return enterPincode;
	}

	public WebElement enterMobNum() {

		enterMobNum.sendKeys("9234567890");
		return enterMobNum;
	}

	public WebElement clkContinue() {

		clkContinue.click();
		return clkContinue;
	}

}
