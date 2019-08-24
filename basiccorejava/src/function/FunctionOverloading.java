package function;

public class FunctionOverloading {

	public static void main(String[] args)
	{
		//sum s=new sum();
		
		int sum1=sum(23,22);
		int sum2=sum(10,20,30);    //method overloading - allow for different parameters
		
		System.out.println(sum1+sum2);
		sum(10, 20, 30, 40);
		

	}
	
	public static int sum(int a,int b)
	{
		return a+b;
		//int d=a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
		//int e=a+b+c;
	}
	private static void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);

	}


}
