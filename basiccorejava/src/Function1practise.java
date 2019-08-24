import sun.awt.AWTAccessor.SystemColorAccessor;

public class Function1practise {

	public static void main(String[] args)
	{
		//int a=10,b=20,c=30;
		sum(10,20);
		int sum2=sum1(20,20);
		System.out.println(sum2+"   hello");

	}
	public static void sum(int a,int b)
	
	{
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(b-a);
	}
	public static int sum1(int c,int d)
	{
		System.out.println(c+d);
		return c=d;
	}

}
