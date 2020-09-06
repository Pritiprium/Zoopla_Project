package com.qa.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utility.Browser_Utility;
import com.qa.utility.TestBase;

public class Verify_Agent extends TestBase {
	public Verify_Agent() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name']")
	WebElement namesOfProperty;

	@FindBy(xpath = "//*[@id=\"listings-agent\"]/div/p[1]/strong")
	WebElement verifyProperty;

	// Verifying Agent
	public void vrefying_selected_House() throws Exception {
		Browser_Utility.waitforVisiblity(namesOfProperty);
		System.out.println("Selected Property-->" + namesOfProperty.getText());
		String expectedStr = namesOfProperty.getText();
		namesOfProperty.click();
		Thread.sleep(2000);
		Browser_Utility.waitforVisiblity(verifyProperty);
		String actual = verifyProperty.getText();
		System.out.println("----XXXXXXXXXXXXX----");
		System.out.println(actual);
		Assert.assertEquals(actual, expectedStr);
		Thread.sleep(2000);

	}
}
