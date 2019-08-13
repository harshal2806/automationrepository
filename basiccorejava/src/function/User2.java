package function;

public class User2 {

	public static void main(String[] args)
	{
		Car2 honda= new Car2();
		honda.cc=2000;
		honda.fueltype="diesel";
		honda.steering=1;
		honda.accelaration();
		
		Car2 audi= new Car2();
		audi.cc=3000;
		audi.fueltype="diesel";
		audi.steering=1;
		audi.accelaration();
		
		Car2 hyundai= new Car2();
		hyundai.cc=1500;
		hyundai.fueltype="petrol";
		hyundai.steering=1;
		hyundai.accelaration();
		
		
	}

}
