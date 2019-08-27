package exceptionhandling;

public class UncheckException {

	public static UncheckException obj;
	public static void main(String[] args)
	{
		String str="anand";
		//System.out.println(str.charAt(6));//String index out of range: 6
		//at java.lang.String.charAt(Unknown Source)

		System.out.println(10/0);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at exceptionhandling.UncheckException.main(UncheckException.java:11)
		
		obj.test();
	}

	public static void test()
	{
		
	}
}
