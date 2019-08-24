package function;
public class functions2{
	public static boolean eligible(int age)
	{
		if(age>=18 && age<=30)
		{
			return true;
		}else {
			return false;
		}
	}

 	public static void main(String[] args) 
	
	{
		int sum1,sum2;
		sum1=sum(10,20);
		sum2=sum(30,40);
		System.out.println(sum1+sum2);
		boolean res;
		res=eligible(25);
		if (res)
		{
			System.out.println("you are eligible");
			
		}else {
			System.out.println("you are not eligible");
		}
	}
	public static int sum(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
}
