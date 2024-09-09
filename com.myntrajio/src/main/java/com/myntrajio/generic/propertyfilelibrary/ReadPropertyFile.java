package com.myntrajio.generic.propertyfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//import java.testNG.Reporter;

import com.myntrajio.generic.commonlibrary.BaseTest;
import com.myntrajio.generic.commonlibrary.FrameworkConstant;

public class ReadPropertyFile extends BaseTest implements FrameworkConstant{
FileInputStream fis=null;
FileOutputStream fos=null;
Properties p=null;
public String readdata(String key) {
	//step1: Convert the Physical file into Java Understandable
			try {
		
			fis = new FileInputStream(propertyPath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			//step2 creating Instance for Properties class
			p = new Properties();

			// load the all Common Data
			try {
				p.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// fetch the data from propertyfile
			String data = p.getProperty(key);

			return data;
		}

		public void writeData(String key, String value){
			// enter the data
			p.put(key, value);

			// create instance for FILE output Stream
			try {
			fos = new FileOutputStream(propertyPath);
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			// store the Data
			try {
			p.store(fos, "Updated the New Key-value Sucessfully");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void displaydata(String key) {
			// Convert the Physical file into Java Understandable
			try {
				fis = new FileInputStream(propertyPath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			// creating Instance for Properties class
			p = new Properties();

			// load the all Common Data
			try {
				p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// fetch the data
			String data = p.getProperty(key);
			
			//Print on Console
			System.out.println(data);

		}}
