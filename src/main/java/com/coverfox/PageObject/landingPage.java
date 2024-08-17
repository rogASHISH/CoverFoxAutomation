package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverfox.base.base;

public class landingPage extends base{

	WebDriver driver;
	
	public landingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@title='Get Started']")
	private WebElement getStarted;
	
	public WebElement getStarted() {
		
		getStarted.click();
		return getStarted;
	}
}
