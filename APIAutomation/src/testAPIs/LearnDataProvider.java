package testAPIs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider
{
	@Test(dataProvider="getdata")
	public void login(String username,String password)
	{
		System.out.println("Launch browser");
		System.out.println("Nevigate to application");
		System.out.println("Enter username"+username);
		System.out.println("Enter password"+password);
		System.out.println("Click login");
	}
	
	@DataProvider
	public String [][] getdata()
	{
		String[][] data=new String[3][2];
		
		//row 1
		data[0][0]="userName";
		data[1][1]="Password";
		//row 1
		data[1][0]="userName1";
		data[1][1]="Password1";
				
		//row 1
		data[2][0]="userName2";
		data[1][1]="Password2";
		
		return data;
		
		
	}
	
	
}
