package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

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
		
		
		Map<String,Integer> map=new Hashtable<String,Integer>();
		map.put("anand", 30);
		map.put("abhishek", 27);
		map.put("ayushi", 24);
		//map.put(null, 50); //<-------It not allow null value
		map.put("abhishek", 28);
		
		
		System.out.println(map.get("abhishek"));
		
		Set<String> set=map.keySet();
		//System.out.println(map.get(set));
		
		for(String s:set)
		{
			System.out.println(map.get(s));
		}
		
		
		
		
		

	}

}
