package com.krn.actitime.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelLibrary {

	public String getExcelData( String sheetName ,int rowNum,int cellNum){
		String retVal=null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Chandrakant\\Downloads\\Data.xlsx");
			try {
				Workbook wb=WorkbookFactory.create(fis);
				Sheet s =wb.getSheet(sheetName);
				Row r=s.getRow(rowNum);
				org.apache.poi.ss.usermodel.Cell c = r.getCell(cellNum);
				retVal =c.getStringCellValue();
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
		

	}

}
