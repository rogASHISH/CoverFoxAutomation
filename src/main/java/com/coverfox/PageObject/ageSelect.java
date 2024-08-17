package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ageSelect {
	WebDriver driver;

	public ageSelect(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Age-You")
	WebElement enterAge;

	@FindBy(xpath = "//div[contains(text(),'Next')]")
	WebElement ageClkNext;
	

	public WebElement enterAge() {
		
		Select select = new Select(enterAge);
		select.selectByValue("26y");
		return enterAge;
	}
	
	public WebElement ageClkNext() {
		
		ageClkNext.click();
		return ageClkNext;
	}
	

}
