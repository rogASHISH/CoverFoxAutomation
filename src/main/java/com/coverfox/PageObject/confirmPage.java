package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmPage {

	WebDriver driver;

	public confirmPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'50 matching Health Insurance Plans')]")
	WebElement pageConfirmation;
	
	public WebElement pageConfirmation() {
		String message=pageConfirmation.getText();
		if(message.equalsIgnoreCase("50 matching Health Insurance Plans")) {
			System.out.println("you have successfully executed all test cases!");
		}else {
			System.out.println("you failed executed all test cases!");
		}
		
		return pageConfirmation;
	}
}
