package com.myntrajio.WomensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


	@Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
	public class WomensProductTest {

		@Test(groups= {"FT","RT"})
		public void addproduct() {
			Reporter.log("Womens Product Added Sucess",true);
			
		}
		@Test(groups={"IT","RT"})
		public void removeProduct() {
			Reporter.log("Womens Product Removed Sucess",true);
		}
		@Test(groups={"ST","RT"})
		public void updateProduct1() {
			Reporter.log("Womens Product Updated Sucess",true);
		}
}

