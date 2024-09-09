package com.myntrajio.generic.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.myntrajio.generic.commonlibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {
	public FileInputStream fis=null;
	public FileOutputStream fos=null;
	public Workbook wb=null;

	public String readdata(String sheet, int row, int column) {
		// convert the Physical Excel File Into Java readable/Undersatable by using fileinputstream
        try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// UsingWokbook go to Sheet,row,column and cell fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
     try {
	wb.close();
     }
catch (IOException e) {
	e.printStackTrace();
}
		return data;
	}

	public void writedata(String sheet, int row, int cell){
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create A New Column and Write Datafor upadate the existing data in excel on it.
	 String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 try {
		 wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	 
       // Convert Java data into Physical File
		try {
			fos = new FileOutputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Write the Data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Close the Workbook
		try {
	 wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void displaydata(String sheet, int row, int cell)  {
		// convert the Physical Excel File Into Java Undersatable
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		}
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// UsingWokbook go to Sheet,row,column and cell fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		// Print The Data
		System.out.println(data);
	try {
		wb.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void readmultipledata(String sheet, int row,int cell) {
		// convert the Physical Excel File Into Java Undersatable
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		// UsingWokbook go to Sheet
		//Sheet sht = wb.getSheet(sheet);

		int count = wb.getSheet(sheet).getLastRowNum();

		for (int i = 1; i <= count; i++) 
		{

			// optimized code
			String data = wb.getSheet(sheet).getRow(i).getCell(cell).getStringCellValue();
			System.out.println(data);
		}
		try {
			wb.close();
		} catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}
	}
