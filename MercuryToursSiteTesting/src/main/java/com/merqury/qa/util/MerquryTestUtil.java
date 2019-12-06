package com.merqury.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.merqury.qa.base.MerquryTestBase;

public class MerquryTestUtil extends MerquryTestBase {
	
	 public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest logger;
	
	public static long PAGE_LOAD_TIMEOUT=10;
    public static long PAGE_IMPICIT_WAIT=10;
   

	public static void CapturScreenShot() {
		// TODO Auto-generated method stub

    	try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShot/Mercury.png"));
			System.out.println("screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking sceenshot"+e.getMessage());
		}
		
	}
	public static void ExtendReport()
	{
		ExtentHtmlReporter reporter =new ExtentHtmlReporter("./Reports/reports1.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ligin test");
		logger.log(Status.INFO, "loigin to mercury");
		logger.log(Status.PASS, "successfull login");
		extent.flush();
		
	
	}

}
