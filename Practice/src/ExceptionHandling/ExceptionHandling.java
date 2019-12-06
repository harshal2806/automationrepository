package ExceptionHandling;

public class ExceptionHandling {
	int a=10;
	//ExceptionHandling obj; --forgot to create object..in practical ex.

	public static void main(String[] args) {
		
		//this type of exception un uncaught exception

		/*int i=9/0;              //arithmetic exc
		System.out.println(i);//
		
		//cought exception         //
		Thread.sleep(2000);
		*/
		
		/*//null pointer exc
		ExceptionHandling obj=new ExceptionHandling();//null.any value--null pointer exception
		obj=null;
		System.out.println(obj.a);//obj=null so obj not representing any object
		*/
	//how to handle exc
		//1.try-catch block--handle it because, code should not be terminated
		//it is report about the exception in syso
		try {
		int i=9/0;    //exception
		
	}catch(ArithmeticException e) {
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

		

}
}
