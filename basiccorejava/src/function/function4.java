package function;
//display the total mark, percentage and pass or fail when at least single subject had less than 35 marks.

public class function4 {

	public static void main(String[] args) 
	{
		int[] marks= {36,86,45,78,91};
		String str=finalresult(marks);
		System.out.println(str);
	}
	public static String finalresult(int[]arr)
	{
		int total=0;
		boolean fail=false;
		for (int i=0;i<arr.length;i++)
		{
		total=total+arr[i];
		if(arr[i]<35)
		{
			fail=true;
		}
		}
		System.out.println(total);
		double percentage=total*100/500;
		System.out.println(percentage);
		
		String res=null;
		if(fail)
		{
			res="you are fail";
		}

		else if(percentage>75)
		{
			res="You are passed with distinction";
		}
		else if(percentage>=60)
		{
			res="you are passed with 1st class";
		}
	else if(percentage>=35) 
	{
		res="you are passed with 2nd class";
	}
	
		return res;
	}

}

