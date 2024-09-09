package com.myntrajio.generic.listnerlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.commonlibrary.BaseTest;

public class ListenerImplementation extends BaseTest implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Taking screenshot --started--: "+name+"", true);
		//perform typecasting -webdrivertype to takescreenshot
		TakesScreenshot trsef = (TakesScreenshot)webdriverobj.static_driver;
		//call the screenshot method and save in temp path
		File temp = trsef.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./src/test/resources/Screenshot/"+name+".png");
      //copy the file from temp to permanent
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Taking screenshot completed: "+name+"", true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
}
