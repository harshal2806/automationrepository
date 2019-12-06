package ExceptionHandling;

public class ThrowsException {
	public static void main(String[] args) throws ArithmeticException
	{
		ThrowsException obj= new ThrowsException();
		obj.sum();
		
		System.out.println("abc");
		
		
	}
	
	public void sum()throws ArithmeticException
	{
		try {
		div();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public void div() throws ArithmeticException
	{
		int i=9/0;
		
		
	}

}
