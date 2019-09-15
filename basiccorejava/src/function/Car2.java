package function;

public class Car2 
{
	int cc;
	String fueltype;
	int steering;
	
	//Default Constructor
	public Car2()
	{
		
	}
	
	//Parameterized Constructor
	public Car2(int cc, String fueltype, int steering)
	{
		this.cc=cc;
		this.fueltype=fueltype;
		this.steering=steering;
		//System.out.println(steering+" steering car having "+cc+" cc engine run on "+fueltype+" fueltype");
		
	}
	
   public void  accelaration()
     {
	System.out.println(steering+" steering car having "+cc+" cc engine run on "+fueltype+" fueltype");
     }
   
   public static void main(String[] args) 
	{
		Car2 nano=new Car2(900, "petrol", 1);
		nano.accelaration();

		Car2 THAR=new Car2(2000, "diesel", 1);
		THAR.accelaration();
	}
}



