package collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class MapInterface {

	public static void main(String[] args) 
	{
		//Hashmap-It allow null value
		/*Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("anand", 30);
		map.put("abhishek", 27);
		map.put("ayushi", 24);
		map.put(null 50);
		
		
		System.out.println(map.get(null));*/
		
		
		Hashtable<String,Integer> map=new Hashtable<String,Integer>();
		map.put("anand", 30);
		map.put("abhishek", 27);
		map.put("ayushi", 24);
		//map.put(null, 50); //<-------It not allow null value
		map.put("abhishek", 28);
		map.put("anand", 24);
		
		Hashtable map1 = (Hashtable) map.clone();
		System.out.println(map1);
		
		
		System.out.println(map.get("abhishek"));
		
		Set<String> set=map.keySet();
		//System.out.println(map.get(set));
		
		for(String s:set)
		{
			System.out.println(map.get(s));
		}
		
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
			
		}
		if(map.contains(24))
		{
			System.out.println("value found");
		}else
		{
			System.out.println("value notfound");
		}
		//Enumation
		Enumeration e=map.elements();	
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		//entrySet
		Set s=map.entrySet();
		System.out.println(s);
		
		System.out.println(map.hashCode());
		
		
		
		
		
		

	}

}
