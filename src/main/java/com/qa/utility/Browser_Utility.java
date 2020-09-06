package com.qa.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import com.qa.utility.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Utility {

	@Parameters("browser")
	
	public void launchbrwsr() {
		
		//if(sbrowser.contentEquals("chrome")) {
		WebDriverManager.chromedriver().setup();
			TestBase.driver = new ChromeDriver();
			TestBase.driver.get("https://www.zoopla.co.uk/");
			TestBase.driver.manage().window().maximize();
		//TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}else if (sbrowser.contentEquals("firefox")) {
//		WebDriverManager.firefoxdriver().setup();
//		TestBase.driver = new FirefoxDriver();
//		TestBase.driver.get("\"https://www.zoopla.co.uk/");
//		TestBase.driver.manage().window().maximize();
//	}else {
//		WebDriverManager.iedriver().setup();
//		TestBase.driver = new InternetExplorerDriver();
//		TestBase.driver.get("\"https://www.zoopla.co.uk/");
//		TestBase.driver.manage().window().maximize();
//	}
//		return TestBase.driver;
	}
	public static void waitforVisiblity(WebElement elefowait) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elefowait));
	}

	public static void waitofListOfElements(List<WebElement> element) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	public void Tearoff() {
		TestBase.driver.quit();
	}

}
