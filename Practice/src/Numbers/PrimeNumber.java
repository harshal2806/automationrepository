package Numbers;

import org.testng.xml.ISuiteParser;

public class PrimeNumber {
	//2 is lowest prime number
	
	
	public static boolean isPimeNumber(int num) {
		//edge corner cases:
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num %i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPimeNumber(i))
			System.out.print(i+"   ");
		}
		System.out.println("Prime no up to"+num);
	
	}

	public static void main(String[] args) {
		
		getPrimeNumber(7);
		getPrimeNumber(13);
		getPrimeNumber(19);
		
	}

}
