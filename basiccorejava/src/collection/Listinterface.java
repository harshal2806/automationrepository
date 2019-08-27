package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listinterface {

	public static void main(String[] args)
	{
		//ArreyList
		/*List<String>list=new ArrayList<>(); //<string>-generic
		list.add("harshal");
		list.add("Jain");
		list.add("Techbodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		//LinkedList
		/*List<String>list=new LinkedList<>(); //<string>-generic
		list.add("harshal");
		list.add("Jain");
		list.add("Techbodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		//Vector
		List<String>list=new Vector<>(); //<string>-generic
		list.add("harshal");
		list.add("Jain");
		list.add("harshal");
		list.add("Jain");
		list.add("Techbodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		

	}
	

}
