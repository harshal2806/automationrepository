
public class Function2prac {

	public static void main(String[] args)
	{
		boolean res=eligible(33);
		String massage=null;
		if(res)
		{
			System.out.println("you are eligible");
		}else
		{
			System.out.println("you are not eliglible");
		}
	}
	public static boolean eligible(int a)
	{
		if(a>=18 && a<=30)
		{
			return true;
		}else
		{
			return false;
			
		}
	}
	

}
