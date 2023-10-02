package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;



public class LinkedHashSetDemo
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		//addd
		lhs.add("Rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(60.25f);
		lhs.add(100);		//duplicate
		lhs.add(null);
		lhs.add(null);		//duplicate
		System.out.println(lhs);
		
		//isempty
		System.out.println(lhs.isEmpty());

		//size
		System.out.println(lhs.size());
		
		
		//remove
		lhs.remove('A');
		System.out.println(lhs);
		//for each loop
		for(Object obj:lhs)
		{
			System.out.println(obj);
		}
		
		//iterator cursor
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//listiterator
		
		
	}

}
