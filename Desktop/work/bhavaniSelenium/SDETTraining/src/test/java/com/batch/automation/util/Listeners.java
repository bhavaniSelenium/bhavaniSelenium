package com.batch.automation.util;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.batch.automation.base.BaseTest;

public class Listeners  implements ITestListener {
	BaseTest test = new BaseTest();
 
 String filepath = "C:\\Users\\JVM REDDY\\Desktop\\gitsample\\bhavaniSelenium\\Desktop\\work\\bhavaniSelenium\\SDETTraining\\screenshot\\screenshot1.png";
 @Override
 public void onFinish(ITestContext arg0) {   }
 
 @Override
 public void onStart(ITestContext arg0) {  }

 @Override
 public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {  }

 @Override
 public void onTestSkipped(ITestResult arg0) {   }
   
 @Override
 public void onTestStart(ITestResult arg0) {   }

 @Override
 public void onTestSuccess(ITestResult arg0) {   }

 @Override
 public void onTestFailure(ITestResult arg0) {
	 
	 		 TakesScreenshot scrShot =((TakesScreenshot)test.driver);
             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
             File DestFile=new File(filepath);
             try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 }
 }