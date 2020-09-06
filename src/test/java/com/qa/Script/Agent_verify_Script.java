package com.qa.Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.PageObject.Verify_Agent;
import com.qa.utility.TestBase;

public class Agent_verify_Script extends TestBase {
	Verify_Agent agent;
	@BeforeTest
	public void setup() {
		agent = new Verify_Agent();
	}
	@Test
	public void verify_property() throws Exception {
		agent.vrefying_selected_House();
		
	}

}
