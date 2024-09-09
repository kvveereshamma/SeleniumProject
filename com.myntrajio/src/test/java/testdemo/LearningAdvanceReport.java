package testdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
public static void main(String[] args) {
	//Create the SparkReport
ExtentSparkReporter	spark=new ExtentSparkReporter("./AdvanceReports/report.html");
//Configure the spark Report information
spark.config().setDocumentTitle("Regression Testing for the RegisterPage");

spark.config().setReportName("RegressionSuite");

spark.config().setTheme(Theme.DARK);

//Create the ExtentReport
ExtentReports report=new ExtentReports();
//Attach the spark report and extent report
report.attachReporter(spark);
//Create the system information in Extent report by attaching
report.setSystemInfo("DEvice Name", "Veera");
report.setSystemInfo("OS", "WINDOWS 11");
report.setSystemInfo("Browser", "Chrome");
report.setSystemInfo("BrowserVersion", "chrome-Version 127.0.6533.120 ");

//Create the test information 
  ExtentTest test=report.createTest("Regressiontest");

  //Steps Information
  test.log(Status.INFO, "Step1: Launching the Browser Successful");
  test.log(Status.INFO, "Step2: Navigating To Application via URL Successful");
  test.log(Status.PASS, "Step3: Verified the Webpage Successfull");
  
  if(true==true) {
	  test.log(Status.PASS, "Step4: Verified the Webelement id Displayed Successful");	  
  }else {
	  test.log(Status.FAIL, "Step4: Element is Not Displayed");
	 // test.addScreenCaptureFromBase64String("Base64","Screenshot Taken -- Element Not Displayed");
  }
  
  test.log(Status.SKIP, "Step5: Element is Hidden");
  
  
  //Flush the Report information
  report.flush();
  System.out.println("Execution Done");
}
}
