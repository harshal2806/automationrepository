package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {



	public static void main(String[] args) throws Exception {
		DataDriven2 d2=new DataDriven2();
		System.out.println(d2.Readxl(0, 1, 1));
	

	}
	
	public String Readxl(int sheet,int row , int cell) throws Exception
	{
           //Java.io
		
			FileInputStream fis=new FileInputStream("D:\\Harshal\\DataDriven.xlsx");		//Throw exception
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(sheet);
			XSSFRow row1=sheet1.getRow(row);
			XSSFCell cell1=row1.getCell(cell);
			String str=cell1.getStringCellValue();
			
			return str;
			
		
	}
	

}
