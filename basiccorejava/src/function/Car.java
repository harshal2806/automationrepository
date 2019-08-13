package function;

public class Car
{
	static int wheels=4;
	String colour="Blue";
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
		//static veriables and static fuctions
		testdrive();
		System.out.println(wheels);
		//Non static veriables and non static function
		Car c=new Car();
		System.out.println(c.colour);
		c.specification();
	}
}
