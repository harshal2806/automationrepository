package function;

public class OverloadingPractice {

	public static void main(String[] args)
	{
		//add(10,20);
		//add(10,20,30);
		
		addition.add(10,20);
		//System.out.println(e);
		addition.add(10, 20,"hello");
		//System.out.println(d+"  hello");
	}

}
	class addition
	{
	public static void add(int a,int b)
	{
		//return a+b;
		System.out.println(a+b);
	}
	public static void add(int a,int b,String massege)
	{
		//return a+b;
		
		System.out.println(a+b+"  "+massege);
	}
	public static void add(int c,int d,int e)
	{
		//return a+b;
		System.out.println(c+d);
	
	}
	}
	

	

