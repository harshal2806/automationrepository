package GlobalVar;

public class Child extends Parent
{
	public Child(int a, String s) {
		super(a, s);
		
	}

	/*int a=10;
	static String s="sachin";
	*/
	public static void main(String[] args) {
		Child ch=new Child(6, "error");
		//int c=ch.test(50,"Aditya");
		/*System.out.println(a);
		System.out.println(s); 
		*/		 
		ch.test();
		
		
		


	}
	
	public int test()
	{
		/*int a=30;
		String s="Jain";*/
		System.out.println(a);
		System.out.println(s);
		return a;
		
	}
	public static void div()
	{
		
	}
	

}
