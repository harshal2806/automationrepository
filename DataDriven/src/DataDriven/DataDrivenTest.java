package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception {
         
		File src=new File ("D:\\Harshal\\DataDriven.xlsx");//Java.io
		
		FileInputStream fis=new FileInputStream(src);		//Throw exception
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Registration=wb.getSheetAt(0);
		XSSFRow row=Registration.getRow(0);
		XSSFCell cell=row.getCell(0);
		String str=cell.getStringCellValue();
		wb.close();
		System.out.println(str);
/*		Workbook wb=WorkbookFactory.create(fis);
		Sheet s =wb.getSheetAt(0);
		Row r=s.getRow(0);
		Cell c = r.getCell(0);
		String retVal = c.getStringCellValue();
		System.out.println(retVal);*/
		
	}

}
