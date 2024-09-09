package com.myntrajio.KidsproductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class KidsProductTest {
	@Listeners(com.myntrajio.generic.listnerlibrary.ListenerImplementation.class)
	public class RegisterTest {

		@Test(groups= {"FT","RT"})
		public void addproduct() {
			Reporter.log("Kids Product Added Sucess",true);
			
		}
		@Test(groups={"IT","RT"})
		public void removeProduct() {
			Reporter.log("Kids Product Removed Sucess",true);
		}
		@Test(groups={"ST","RT"})
		public void updateProduct1() {
			Reporter.log("Kids Product Updated Sucess",true);
		}
}

}
