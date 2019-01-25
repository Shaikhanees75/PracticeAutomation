package com.practiceautomation.TestScripts;



import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practiceautomation.Utility.Helper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class LoginTest
{

		WebDriver driver;
		ExtentReports report;
		ExtentTest logger;

		@BeforeMethod
		public void setUP() {
			report = new ExtentReports(".\\Reports\\PracticeAutomation.html", true);
			logger = report.startTest("PracticeAutomation Loging and status post Test ");
			driver = com.practiceautomation.factory.BrowserFactory.startBrowser("chrome");
			driver.get(com.practiceautomation.factory.DataProviderFactory.getConfig().getApplicationUrl());
			logger.log(LogStatus.PASS, "Step-1", "Application is up and running.");
		}
		
		
		@AfterMethod
		public void tearDown(ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				String path = Helper.captureScreenshot(driver, result.getName());
				logger.log(LogStatus.FAIL, logger.addScreenCapture(path));
			}
		}
		
		
}
