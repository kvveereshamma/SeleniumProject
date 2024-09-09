package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;


//@Listeners(com.myntrajio.generic.listenerlibrary.Listeners.class)
@Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
public class RegisterTest extends BaseTest {
	@Test()
	public void register_validData() {
		String name=excelobj.readdata("Registerdetails",1,0);
		String email=excelobj.readdata("Registerdetails",1,1);
		String password=excelobj.readdata("Registerdetails",1,2);
		String mobileno=excelobj.readdata("Registerdetails",1,3);
		
		String feedback=excelobj.readdata("Registerdetails",1,5);
		
		
		
//		try {
//			Thread.sleep(300);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
		javaobj.pause(5000);
		//verify the register page
		webdriverobj.waitUntilElementFound();
		String exptitle="LearningSelenium";
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		
		//verify the registerpage
		Assert.assertEquals(exptitle, acttitle,"Verified Register Page");
		
		
		//call the base class and load object library-@test chronological order it will execute
		//create object for registerpage
		RegisterPage regpage = new RegisterPage(webdriverobj.driver);
		
		
		//register page getter method calling through the registerpage
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getNametextfield().isDisplayed();
		
		//verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition, "Verified NameTXTField Webelement-it is displayed");
		//perform action clear
		regpage.getNametextfield().clear();
		//perform action_ _ enter name
		regpage.getNametextfield().sendKeys(name);
				//perform action clear
		regpage.getEmailtextfield().clear();
		//perform action_ _ enter email
		regpage.getEmailtextfield().sendKeys(email);
		//perform action clear
		regpage.getPasswordtextfield().clear();
		//perform action_ _ enter password
		regpage.getPasswordtextfield().sendKeys(password);
		//perform action clear
		regpage.getMobiletextfield().clear();
		//perform action_ _ enter mobile
		regpage.getMobiletextfield().sendKeys(mobileno);
		regpage.getFeedbacktextfield().clear();
		regpage.getFeedbacktextfield().sendKeys(feedback);
		//perform action_ _ enter feedback
		Reporter.log("Registerwith valid data Sucess", true);
	}
@Test
public void registerValidateRegisterButtonSize() {
	 webdriverobj.waitUntilElementFound();
		
		String exptitle="LearningSelenium";
		
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
		
		//Create an object for Register Page
		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
		
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
		
		//Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
org.openqa.selenium.Dimension size=regpage.getRegisterButton().getSize();
	
	int width=size.getWidth();
	
	int height=size.getHeight();
	
	
	System.out.println("Width :"+width);
	
	System.out.println("Height  :"+height);
Reporter.log("RegisterButtonSize Validated",true);
	
}
@Test
public void registerValidateRegisterButtonPosition() {
	 webdriverobj.waitUntilElementFound();
		
		String exptitle="LearningSelenium";
		
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
		
		//Create an object for Register Page
		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
		
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
		
		//Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
org.openqa.selenium.Point location= regpage.getRegisterButton().getLocation();
	
	int x=location.getX();
	
	int y=location.getY();
	
	
	System.out.println("x axis :"+x);
	
	System.out.println("y axis  :"+y);
	Reporter.log("RegisterButtonPosition Validated",true);
	
}
@Test
public void registerValidateRegisterButtonColor() {
	{
	       webdriverobj.waitUntilElementFound();
			
			String exptitle="LearningSelenium";
			
			String acttitle=webdriverobj.driver.getTitle();
			System.out.println(acttitle);
			
			// Step 1: Verify Register page using Assert
			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
			
			//Create an object for Register Page
			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
			
			//Step 2: Verify the element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
		    
			String color=regpage.getRegisterButton().getCssValue("color");
			
			System.out.println("color of webelement is "+color);
			

			Reporter.log("RegisterButtonColor Validated",true);	

		

	}
}
	
	
	
	/*@Test
	public void createUser_invalidData() {

		Reporter.log("createUser_InvalidData for Register Test", true);
	}*/

}