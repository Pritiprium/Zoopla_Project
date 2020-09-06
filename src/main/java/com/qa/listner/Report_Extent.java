package com.qa.listner;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report_Extent {
	public static ExtentReports report;
	public static ExtentTest logger;

	public static ExtentReports generate_Report() {
		String dateNTime = new SimpleDateFormat("'DisplayDate_'yyyyMMddHHmm''").format(new Date());
		String filePath = System.getProperty("user.dir") + "//ExtentReport//Report_" + dateNTime + ".html";
		return report = new ExtentReports(filePath);
	}

	public void creat_Test(String testcase) {
		logger = report.startTest(testcase);
	}

	public void end_Test() {
		report.endTest(logger);
	}

	public void flush_Test() {
		report.flush();
	}
	
	
	
	
}
