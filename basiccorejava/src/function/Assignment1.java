package function;

public class Assignment1 {

	public static void main(String[] args)
	{
          String res=result(68);  
          System.out.println(res);

	}
	public static String result(int marks)
	{
		String res;
		if (marks>75)
		{
			res="You are passed with distinction";
		}
		else if(marks>=60)
		{
			res="you are passed with 1st class";
		}
	else if(marks>=35) 
	{
		res="you are passed with 2nd class";
	}else {
		res="you are falied";
	}
		return res;
	}
	}


