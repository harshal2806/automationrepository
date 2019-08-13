package function;

public class User
{

	public static void main(String[] args)
	{
		System.out.println(Car.wheels);
		Car.testdrive();
		
		//static
		//Non static fuctions and veriable
		Car Renault= new Car();
		Renault.colour="Black";
		Renault.model="Yad nahi hai";
		Renault.specification();
		
		Car.wheels=5;  //static-call it by class name always
		
		Car BMW =new Car();
		BMW.colour="white";
		BMW.model="X1";
		BMW.specification();
		
		//Renault.wheels=3;  //not right way to call function, call it by class name
		
		Car jaguar =new Car();
		jaguar.colour="wine";
		jaguar.model="XJ";
		jaguar.specification();
		
		Renault.specification();

	}

}
