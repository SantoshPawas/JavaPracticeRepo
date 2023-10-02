package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HAshSetDemo
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		//add
		hs.add("Rahul");
		hs.add(100);
		hs.add('A');
		hs.add(60.25f);
		hs.add(100);		//duplicate not allowed
		hs.add(null);
		hs.add(null);		//duplicate
		System.out.println(hs);
		
		
		//isempty
		System.out.println(hs.isEmpty());
		//size
		System.out.println(hs.size());
		
		//remove
		hs.remove(100);
		System.out.println(hs);
		
		//check it is present or not
		
		System.out.println(hs.contains("Rahul"));
		
		//foreach
		
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		//iterator cursot
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

}
