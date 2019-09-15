package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel 
{
  public static void main(String[] args) throws Exception   
  { 
	String path="D:\\automationrepository\\basiccorejava\\src\\filehandling\\TestData.xls";
	FileInputStream file=new FileInputStream(path); //Constructor, instance veritable
	HSSFWorkbook wb=new HSSFWorkbook(file);//Access out of package file,then we have to import
	HSSFSheet sheet=wb.getSheet("Sheet1");
	HSSFRow row=sheet.getRow(0);
	HSSFCell Cell=row.getCell(0);
	String data=Cell.getStringCellValue();
	System.out.println(data);
	ReadExcel ab=test();
	
}
  
  
  
  
  
  
  
  
  
  public static ReadExcel test()
  {
	  return new ReadExcel();
  }
}
