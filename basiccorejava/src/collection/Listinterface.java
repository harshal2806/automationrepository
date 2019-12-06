package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import function.Car2;

public class Listinterface {

	public static void main(String[] args)
	{
		//ArreyList
		List<String>list=new ArrayList<>(); //<string>-generic-if remove some ele all ele shifts.,slow
		list.add("harshal");
		list.add("Jain");
		list.add("harshal");
		list.add("Jain");
		list.add("Techbodhi");
		//iterator method for fetching values of list
		Iterator<String> it=list.iterator();
		while (it.hasNext())
		{
			//String list1=it.next();
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------------");
			System.out.println(list.size());
		System.out.println("-------------------------------------------");
			System.out.println(list.get(1));
			
		System.out.println("-------------------------------------------");
			list.remove(2);
			for(int i =0;i<list.size();i++)
			{
				System.out.println(list.get(i));
				
			}
		System.out.println("-------------------------------------------");
			System.out.println(list.get(2));
			
		System.out.println("-------------------------------------------");
			
		Car2 nano=new Car2(900, "petrol", 1);
		Car2 THAR=new Car2(2000, "diesel", 1);
			
		List<Car2> car=new ArrayList<Car2>();
		car.add(THAR);
		car.add(nano);
		Iterator<Car2> c=car.iterator();
		while(c.hasNext()) {
			Car2 c2=c.next();
			System.out.print(c2.cc+"    ");
			System.out.print(c2.fueltype+"   ");
			System.out.println(c2.steering);
			
		}
		System.out.println("-------------------------------------------");
		System.out.println(list.contains("harshal"));
		System.out.println("-------------------------------------------");
		System.out.println(list.containsAll(car));
		
		
		/*for(String s:list)
		{
			System.out.println(s);
		*/
		//LinkedList
//		List<String>list=new LinkedList<>(); //<string>-generic-doubly linked list,fast
//		list.add("harshal");
//		list.add("Jain");
//		list.add("Techbodhi");
//		
//		for(String s:list)
//		{
//			System.out.println(s);
//		}
		//Vector
		/*List<String>list=new Vector<>(); //<string>-generic
		list.add("harshal");
		list.add("Jain");
		list.add("harshal");
		list.add("Jain");
		list.add("Techbodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		

	}
	

}
