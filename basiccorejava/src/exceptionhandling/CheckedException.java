package exceptionhandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("name");
		
		Thread.sleep(600); //checked exc.
		//UncheckException.test();
		
		System.out.println("surname");
		
		FileInputStream obj=new FileInputStream("");

	}

}
