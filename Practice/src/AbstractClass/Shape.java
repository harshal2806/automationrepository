package AbstractClass;

public abstract class Shape {
	int color;
	
	Shape()//abstract class constructor
	{
		System.out.println("shape class constuctor");
	}
	
	
	abstract void drawng();//abstract method
	//non abstrqct method
	public void fill()
	{
		System.out.println("shape---fill");
		
	}
	//can not object of abstract class
	//Partial abstraction

}
