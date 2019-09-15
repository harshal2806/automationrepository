package filehandling;

import java.io.IOException;

public class TestXls_Reader {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader xl=new Xls_Reader("D:\\automationrepository\\basiccorejava\\src\\filehandling\\TestData.xls");
		
		int row =xl.getRowCount("Sheet1");
		int cols=xl.getColumnCount("Sheet1");
		
		System.out.println(row);
		System.out.println(cols);
		System.out.println(xl.getCellData("Sheet1", 1, 1));
		for(int r=1; r<=row;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(xl.getCellData("Sheet1", r, c)+" ");
			}
			System.out.println();
		}


	}
}
	


