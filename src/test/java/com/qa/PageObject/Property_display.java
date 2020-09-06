package com.qa.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utility.Browser_Utility;
import com.qa.utility.TestBase;

public class Property_display extends TestBase {
	public Property_display() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='results_sort']")
	WebElement dropdown;

	@FindBy(xpath = "//a[@class=\"listing-results-price text-price\"]")
	List<WebElement> priceList;

	public void select_dropdown_N_sort_the_Price() throws Exception {
		Select selct = new Select(dropdown);
		selct.selectByVisibleText("Lowest price");
		Thread.sleep(3000);
	}

	public void price_List_of_house() throws Exception {
		Browser_Utility.waitofListOfElements(priceList);

		System.out.println(priceList.size());
		System.out.println("---------------------");
		System.out.println(priceList.get(4).getText());
		System.out.println("--------------------");
		for (int i = 0; i < priceList.size(); i++) {
			System.out.println("All Property for Sale -->" + priceList.get(i).getText());
		}
		Thread.sleep(2000);
		priceList.get(4).click();
		Thread.sleep(2000);

	}

}
