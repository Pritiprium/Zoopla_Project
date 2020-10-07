package com.qa.utility;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.qa.listner.Listner;
import com.qa.listner.Report_Extent;

@Listeners(com.qa.listner.Listner.class)
public class TestBase {
	public static WebDriver driver;
	Browser_Utility obbrwsr = new Browser_Utility();
	Common_utility  oncmn = new Common_utility();
	Report_Extent rprt = new Report_Extent();
	Listner listn = new Listner();
	
	@BeforeSuite
	public  void intial_setUp() {
		
		obbrwsr.launchbrwsr("chrome");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
