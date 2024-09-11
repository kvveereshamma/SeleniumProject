package com.myntrajio.generic.commonlibrary;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyFile;
import com.myntrajio.generic.webdriverlibrary.WebdriverLibrary;


public class ObjectLibrary implements FrameworkConstant{
	public ReadExcelFile excelobj;
	public JavaLibrary javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverLibrary webdriverobj;
	public WebDriver driver;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	public void creatobject() {
	 excelobj= new ReadExcelFile();
	 javaobj = new JavaLibrary();
	 propertyobj = new ReadPropertyFile();
	 webdriverobj = new WebdriverLibrary();
	 
	 //Create the ExtentReport
	 spark = new ExtentSparkReporter(reportpath);
	 
	 //Create the Extent Report
	 report=new ExtentReports();
	 

}
}
