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
	}
	
   public void accelaration()
     {
	System.out.println(steering+" steering car having "+cc+" cc engine run on "+fueltype+" fueltype");
     }
}



