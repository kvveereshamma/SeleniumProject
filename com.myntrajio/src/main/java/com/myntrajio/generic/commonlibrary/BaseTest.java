package com.myntrajio.generic.commonlibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseTest extends ObjectLibrary{
//public WebDriver driver=null;
//public static WebDriver driver_static=null;


@BeforeSuite
public void getSuiteConnections() {
	Reporter.log("Get SuiteConnections Done Sucessful", true);
}

@BeforeTest
public void precondition() {
	Reporter.log("precondition Done Sucessful", true);

}

@Parameters("browser")
@BeforeClass
public void browserSetup(String bname) {
creatobject();
webdriverobj.launchBrowser(bname);
//Fetch url sata property-file
String url = propertyobj.readdata("url");
webdriverobj.maximizeBrowser();
// Step 2 :Navigate to the Application via URL
//driver.get(URL);

//from the xml file
webdriverobj.navigateToApp(url);
//report and console printing statement
Reporter.log("BrowserSetup:"+bname+" Sucessful", true);

}

@BeforeMethod
public void login() {
	Reporter.log("login Sucessful", true);
}

@AfterMethod
public void Logout() {
	Reporter.log("Logout Sucessful", true);

}	
	
@AfterClass
public void closebrowser() {
	// Close The Browser
	//driver.close();
//webdriverlibrary.quitAllWindows();
	webdriverobj.closeWindow();
	Reporter.log("Closebrowser Sucessful", true);

}

@AfterTest
public void postcondition() {
	Reporter.log("postcondition Done Sucessful", true);

}


@AfterSuite
public void terminateSuiteconnection() {
	Reporter.log("Terminate Suiteconnection Done Sucessful", true);

}
@DataProvider(name="Register")
public Object[][] Registerdata(){
	Object[][] data=new Object[3][3];
	data[0][0]="Veera";
	data[0][1]="kvveereshamma@gmail.com";
	data[0][2]="Software TestEngineer";
	
	data[0][0]="omkar";
	data[0][1]="kuruvaomkar029@gmail.com";
	data[0][2]="Drafting Designer";
	
	data[0][0]="Lakshmi";
	data[0][1]="kvlakshmi2981@gmail.com";
	data[0][2]="Automation TestEngineer";
	return data;
	
}
}
