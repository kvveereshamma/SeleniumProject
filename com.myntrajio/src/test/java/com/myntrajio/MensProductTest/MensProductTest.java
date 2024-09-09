package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class MensProductTest {
	@Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
	public class RegisterTest {

		@Test(groups= {"FT","RT"})
		public void addproduct() {
			Reporter.log("Mens Product Added Sucess",true);
			
		}
		@Test(groups={"IT","RT"})
		public void removeProduct() {
			Reporter.log("Mens Product Removed Sucess",true);
		}
		@Test(groups={"ST","RT"})
		public void updateProduct1() {
			Reporter.log("Mens Product Updated Sucess",true);
		}
}
}
