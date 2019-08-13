package function;

public class FunctionOverloading {

	public static void main(String[] args)
	{
		sum(10,20);
		sum(10,20,30);    //method overloading - allow for different parameters

	}
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}


}
