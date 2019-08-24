package function;

public class Fuctionalocerloading2 {
	public static void main(String[] args)
	{
		//add(10,20);
		//add(10,20,30);
		
		//sum.add(10,20);
		int e=sum.add(10,20);//int
		System.out.println(e);//int
		//sum.add(10, 20,"hello");
		int d=sum.add(10, 20,"hello");//int
		System.out.println(d+"  hello");//int
	}
}
	class sum
	{
	public static int add(int a,int b)
	{
		return a+b;
		//System.out.println(a+b);//void 
	}
	public static int add(int a,int b,String massege)
	{
		return a+b;
		
		//System.out.println(a+b+"  "+massege);//void
	}
	}

	

