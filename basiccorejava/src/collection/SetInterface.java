package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args)
	{
		//Hashset Random access
		/*Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		
		for(int a:set)
		{
			System.out.println(a);
			
		}*/
		//LinkedHaSet-insertion order preserves
//		Set<Integer> set=new LinkedHashSet<>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(30);
//		set.add(40);
//		
//		for(int a:set)
//		{
//			System.out.println(a);
//			
//		}
		//TreeSet-Sorted
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(30);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(40);
		set.add(60);
		
		/*for(int a:set)
		{
			System.out.println(a);
			
		}
*/
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		


	}

}
