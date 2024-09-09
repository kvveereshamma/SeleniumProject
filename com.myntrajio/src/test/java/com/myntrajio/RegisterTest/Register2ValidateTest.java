package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;
import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;

public class Register2ValidateTest extends BaseTest{
	
	@Test
	public void register() {
		
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
	}

}
