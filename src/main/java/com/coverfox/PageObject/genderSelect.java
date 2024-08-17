package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class genderSelect {
	WebDriver driver;
	public genderSelect(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Next')]")
	WebElement clkNext;
	
	public WebElement clkNext() {

		clkNext.click();
		return clkNext;
	}

}
