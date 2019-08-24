package function;

public class Car
{
	static int wheels=4;  //
	String colour="Blue";  //instance veriable
	String model;
	
	public void specification()
	{
		System.out.println("specification:wheels:"+wheels+",'colour="+colour+" and model="+model);
	}
	public static void testdrive()
	{
		System.out.println("Test drive");
	}
	public static void main(String[] args)
	{
		//static variables and static functions
		testdrive();
		System.out.println(wheels);
		//Non static variables and non static function
		Car c=new Car();
		System.out.println(c.colour);
		c.specification();
	}
}
