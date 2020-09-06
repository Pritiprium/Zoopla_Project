package com.qa.Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.PageObject.Property_display;
import com.qa.utility.TestBase;

public class Script_Property extends TestBase {
	
	Property_display prop;
	@BeforeTest
	public void setup() {
		prop = new Property_display();
	}
	@Test(priority = 1)
	public void select_dropdown() throws Exception {
		prop.select_dropdown_N_sort_the_Price();
	}
	@Test(priority = 2)
	public void properties_List() throws Exception {
		prop.price_List_of_house();
	}

}
