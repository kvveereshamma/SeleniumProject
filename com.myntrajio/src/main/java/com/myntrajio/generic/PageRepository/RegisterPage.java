package com.myntrajio.generic.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		//Initialize the page - to avoid the steal element reference exception-this is use for latest adress 
		PageFactory.initElements(driver,this);
	}
	
	//id attribute stored textfield
	@FindBy(id="name")
	private WebElement nametextfield;
	@FindBy(id="email")
	private WebElement emailtextfield;


	@FindBy(id="password")
	private WebElement passwordtextfield;

	@FindBy(id="mobile")
	private WebElement mobiletextfield;
	
	@FindBy(id="feedback")
	private WebElement feedbacktextfield;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement registerButton;

public WebElement getRegisterButton() {
		return registerButton;
	}

public WebElement getFeedbacktextfield() {
		return feedbacktextfield;
	}

//getter method to access to my testscript
public WebElement getNametextfield() {
	return nametextfield;
}

public WebElement getEmailtextfield() {
	return emailtextfield;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public WebElement getMobiletextfield() {
	return mobiletextfield;
}


}
