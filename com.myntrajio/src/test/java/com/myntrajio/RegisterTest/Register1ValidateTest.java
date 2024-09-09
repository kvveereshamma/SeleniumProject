package com.myntrajio.RegisterTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;
import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Register1ValidateTest extends BaseTest{
	
	@Test
	public void validateColorOfRegisterButton()
	
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
		

		

	

}
}
