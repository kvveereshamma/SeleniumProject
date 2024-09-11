package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;
import com.myntrajio.generic.javalibrary.JavaLibrary;

@Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
public class RegisterTest extends BaseTest {

	@Test()
	public void register_validData() {

		// Create The Report
		test = report.createTest("register_validData");

		test.log(Status.INFO, "register_validData Started");

		Reporter.log("----register_validData----", true);

		String name = excelobj.readdata("Registerdetails", 1, 0);
		String email = excelobj.readdata("Registerdetails", 1, 1);
		String password = excelobj.readdata("Registerdetails", 1, 2);
		String mobileno = excelobj.readdata("Registerdetails", 1, 3);
		String feedback = excelobj.readdata("Registerdetails", 1, 5);

		test.log(Status.INFO, "Data Taken From Excel File Success");

		// Waiting Statement
		javaobj.pause(5000);

		// verify the register page
		webdriverobj.waitUntilElementFound();

		String exptitle = "LearningSelenium";
		String acttitle = webdriverobj.driver.getTitle();
		

		// Step1: verify the registerpage
		Assert.assertEquals(exptitle, acttitle);
		test.log(Status.PASS, "Verified-Title Register Page is Displayed");

		// create object for registerpage
		RegisterPage regpage = new RegisterPage(webdriverobj.driver);

		// register page getter method calling through the registerpage
		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getNametextfield().isDisplayed();

		// Step2: verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTXTField Webelement-it is displayed");
		test.log(Status.PASS, "Step2:Verified the NameTextField,It is Displayed");

		// Step3: perform action clear
		regpage.getNametextfield().clear();
		test.log(Status.PASS, "Step3:NameTextField Cleared Success");

		// Step4:perform action_ _ enter name
		regpage.getNametextfield().sendKeys(name);
		test.log(Status.PASS, "Step4:Entered UesrName in NameTestField Success");

		// perform action clear
		regpage.getEmailtextfield().clear();
		// perform action_ _ enter email
		regpage.getEmailtextfield().sendKeys(email);
		test.log(Status.PASS, "Step5:Entered UesrName in EmailTextField Success");

		// perform action clear
		regpage.getPasswordtextfield().clear();
		// perform action_ _ enter password
		regpage.getPasswordtextfield().sendKeys(password);
		test.log(Status.PASS, "Step6:Entered UesrName in PasswordTestField Success");

		// perform action clear
		regpage.getMobiletextfield().clear();
		// perform action_ _ enter mobile
		regpage.getMobiletextfield().sendKeys(mobileno);
		test.log(Status.PASS, "Step7:Entered UesrName in MobileTextField Success");

		// perform action_ _ enter feedback
		regpage.getFeedbacktextfield().clear();
		regpage.getFeedbacktextfield().sendKeys(feedback);
		test.log(Status.PASS, "Step8:Entered FeedBack in FeedbackArea Success");

		test.log(Status.INFO, "Step9:-----Registerwith valid data Sucessfully Completed----");
		Reporter.log("Registerwith valid data Sucess", true);
	}

	@Test
	public void registerValidateRegisterButtonSize() {

		// Create The Report
		test = report.createTest("registerValidateRegisterButtonSize");

		test.log(Status.INFO, "registerValidateRegisterButtonSize");
		Reporter.log("----registerValidateRegisterButtonSizeCompleted----");

		webdriverobj.waitUntilElementFound();

		String exptitle = "LearningSelenium";

		String acttitle = webdriverobj.driver.getTitle();
		System.out.println(acttitle);

		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle, "verified Register Page");

		// Create an object for Register Page
		RegisterPage regpage = new RegisterPage(webdriverobj.driver);

		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getRegisterButton().isDisplayed();

		// Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTextField Webelement -It is Displayed");
		org.openqa.selenium.Dimension size = regpage.getRegisterButton().getSize();

		int width = size.getWidth();

		int height = size.getHeight();

		System.out.println("Width :" + width);

		System.out.println("Height  :" + height);
		Reporter.log("RegisterButtonSize Validated", true);

	}

	@Test
	public void registerValidateRegisterButtonPosition() {

		// Create The Report
		test = report.createTest("registerValidateRegisterButtonPosition");

		test.log(Status.INFO, "registerValidateRegisterButtonPosition");

		Reporter.log("----registerValidateRegisterButtonPositionCompleted----");

		webdriverobj.waitUntilElementFound();

		String exptitle = "LearningSelenium";

		String acttitle = webdriverobj.driver.getTitle();
		System.out.println(acttitle);

		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle, "verified Register Page");

		// Create an object for Register Page
		RegisterPage regpage = new RegisterPage(webdriverobj.driver);

		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getRegisterButton().isDisplayed();

		// Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTextField Webelement -It is Displayed");
		org.openqa.selenium.Point location = regpage.getRegisterButton().getLocation();

		int x = location.getX();

		int y = location.getY();

		System.out.println("x axis :" + x);

		System.out.println("y axis  :" + y);
		Reporter.log("RegisterButtonPosition Validated", true);

	}

	@Test
	public void registerValidateRegisterButtonColor() {

		// Create The Report
		test = report.createTest("registerValidateRegisterButtonColor");

		test.log(Status.INFO, "registerValidateRegisterButtonColor");
		Reporter.log("----registerValidateRegisterButtonColorCompleted----");

		webdriverobj.waitUntilElementFound();

		String exptitle = "LearningSelenium";

		String acttitle = webdriverobj.driver.getTitle();
		System.out.println(acttitle);

		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle, "verified Register Page");

		// Create an object for Register Page
		RegisterPage regpage = new RegisterPage(webdriverobj.driver);

		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getRegisterButton().isDisplayed();

		// Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTextField Webelement -It is Displayed");

		String color = regpage.getRegisterButton().getCssValue("color");

		System.out.println("color of webelement is " + color);

		Reporter.log("RegisterButtonColor Validated", true);

	}
}
