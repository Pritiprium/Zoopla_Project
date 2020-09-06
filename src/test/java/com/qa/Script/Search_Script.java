package com.qa.Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.PageObject.Search_Page;
import com.qa.utility.TestBase;

public class Search_Script extends TestBase {

	Search_Page obserch;

	@BeforeTest
	public void setup() throws Exception {
		obserch = new Search_Page();
	}

	@Test(priority = 1)
	public void accept_Cookies() {
		obserch.accept_Cookies();

	}

	@Test(priority = 2)
	public void search_City() {
		obserch.get_Title_N_searchCity();
	}

}
