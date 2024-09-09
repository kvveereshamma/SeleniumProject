package com.myntrajio.ElectronicproductTest;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


 @Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
 public class ElectronicProductTest {

		@Test(groups= {"FT","RT"})
		public void addProduct() {
			Reporter.log("Electronic Product Added Sucess",true);
			
		}
		@Test(groups={"IT","RT"})
		public void removeProduct() {
			Reporter.log("Electronic Product Removed Sucess",true);
		}
		@Test(groups={"ST","RT"})
		public void updateProduct1() {
			Reporter.log("Electronic Product Updated Sucess",true);
		}
}
 
