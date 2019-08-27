package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  //throws- chekced exception
	{
		pause1(6000);
		pause(6000);
		test();
	
		

	}
	
	public static void pause(int seconds) throws InterruptedException //hand over to next user/checked
	{
		Thread.sleep(seconds);
	}
	public static void pause1(int seconds) 
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void test() throws ArithmeticException
	{
		
	}

}
