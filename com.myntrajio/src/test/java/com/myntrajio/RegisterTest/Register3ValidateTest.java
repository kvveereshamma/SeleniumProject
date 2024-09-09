package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;

public class Register3ValidateTest extends BaseTest{

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
org.openqa.selenium.Dimension size=regpage.getRegisterButton().getSize();
		
		int width=size.getWidth();
		
		int height=size.getHeight();
		
		
		System.out.println("Width :"+width);
		
		System.out.println("Height  :"+height);
	}
}
