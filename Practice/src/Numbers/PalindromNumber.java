package Numbers;

public class PalindromNumber {
	
	//151 reverse of his will be same.. 
	
	public static void isPalindromNumber(int num)
	{
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		while(num>0)
		{
			r=num%10;//get a reminder
			sum=(sum*10)+r;
			num=num/10;		
		}
		if(t==sum)
		{
			System.out.print("Palindrom number"+"  ");
		}else {
			System.out.print("not Palindrom number"+"  ");
		}
		
	}
	public static void Palindromnum(int num)
	{
		for (int i=0;i<=num;i++)
		{
			
			isPalindromNumber(i);
			System.out.println(i+"  ");
		}
	}
	

	public static void main(String[] args) {
		isPalindromNumber(2345432);
		Palindromnum(150);
		

	}

}
