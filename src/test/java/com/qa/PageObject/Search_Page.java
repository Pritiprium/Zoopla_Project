package com.qa.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utility.Browser_Utility;
import com.qa.utility.TestBase;

public class Search_Page extends TestBase {

	public Search_Page() {
		// TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	WebElement cookies;

	@FindBy(xpath = "//input[@id='search-input-location']")
	WebElement searchBox;

	public void accept_Cookies() {
		Browser_Utility.waitforVisiblity(cookies);
		cookies.click();
	}

	public void get_Title_N_searchCity() {

		String ExpectedTitle = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, ExpectedTitle);
		Browser_Utility.waitforVisiblity(searchBox);
		searchBox.sendKeys("London");
		searchBox.sendKeys(Keys.ENTER);
	}

}
