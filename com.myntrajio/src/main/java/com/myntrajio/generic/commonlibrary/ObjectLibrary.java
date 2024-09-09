package com.myntrajio.generic.commonlibrary;


import org.openqa.selenium.WebDriver;

import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyFile;
import com.myntrajio.generic.webdriverlibrary.WebdriverLibrary;


public class ObjectLibrary {
	public ReadExcelFile excelobj;
	public JavaLibrary javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverLibrary webdriverobj;
	public WebDriver driver;

	public void creatobject() {
	 excelobj= new ReadExcelFile();
	 javaobj = new JavaLibrary();
	 propertyobj = new ReadPropertyFile();
	 webdriverobj = new WebdriverLibrary();

}
}
