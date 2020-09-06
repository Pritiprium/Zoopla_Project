package com.qa.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.utility.Common_utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Listner extends Report_Extent implements ITestListener {
	
	public Common_utility cmn = new Common_utility();
	Report_Extent rprt = new Report_Extent();
	public static ExtentReports report = Report_Extent.generate_Report();
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + "--->Test Started");
		logger = report.startTest(result.getMethod().getMethodName() + " --->Test Strted");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + "---> Test Successs");
		logger.log(LogStatus.INFO, result.getMethod().getMethodName() + "----> test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			logger.log(LogStatus.FAIL, result.getMethod().getMethodName() + "--->Test Faiiled"
					+ logger.addScreenCapture(cmn.takescreenShot()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.getMethod().getMethodName()+"---> Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"-----> Test Skipped");
		logger.log(LogStatus.SKIP, result.getMethod().getMethodName()+"--->Test Failed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"---> Suite Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		end_Test();
		flush_Test();

	}

	
	
	
}
