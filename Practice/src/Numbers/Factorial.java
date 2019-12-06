package Numbers;



public class Factorial {
	
	public static void Factors(int num)
	{
		int t=1;
		while(num>0) {
		
			t=t*num;
			num=num-1;
		}
		System.out.println(t);
	}
	public void fact(int num)
	{
		int fact=1;
		for(int i=1;1>=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors(0);
		Factors(0);

	}

}
