package com.CoverFox.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.coverfox.PageObject.ageSelect;
import com.coverfox.PageObject.confirmPage;
import com.coverfox.PageObject.detailsPage;
import com.coverfox.PageObject.genderSelect;
import com.coverfox.PageObject.landingPage;
import com.coverfox.base.base;

public class landingPageTest extends base {

	WebDriver driver;
	base bs = new base();
	landingPage lp;
	genderSelect gs;
	ageSelect as;
	detailsPage dp;
	confirmPage cp;

	@BeforeMethod
	public void configbrowser() {

		driver = bs.configInit();

	}

	@Test
	public void openlandingPage() {
		//for landingPage
		lp = new landingPage(driver);
		lp.getStarted();
		
		//for genderSelect Page
		gs= new genderSelect(driver);
		gs.clkNext();
		
		//for ageSelect Page
		as = new ageSelect(driver);
		as.enterAge();
		as.ageClkNext();
		
		//for details page
		dp = new detailsPage(driver);
		dp.enterPincode();
		dp.enterMobNum();
		dp.clkContinue();
		
		//for verify page
		cp = new confirmPage(driver);
		cp.pageConfirmation();
	}

	@AfterMethod
	public void closure() throws InterruptedException {
		bs.tearDown();
	}

}
