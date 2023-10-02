package Collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo 
{
	public static void main(String[] args) throws ClassCastException
	{
		LinkedList L1=new LinkedList();
		L1.add("Rohit");
		L1.add(100);
		L1.add('A');
		L1.add(60.25f);
		L1.add(100);
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		
		//verify list is empty or not
		System.out.println(L1.isEmpty());
		
		//size
		System.out.println(L1.size());
		//add info in between
		
		L1.add(1, 200);
		System.out.println(L1);
		
		//remove
		L1.remove(1);
		System.out.println(L1);
		
		//update
		L1.set(3, 80.25f);
		System.out.println(L1);
		
		//to get info from index
		
		System.out.println(L1.indexOf('A'));
		
		//to get info from index
		
		System.out.println(L1.get(2));
		
		//for each loop
		System.out.println("---for each loop-----");
		for(Object s1:L1)
		{
			System.out.println(s1);
		}
		//using iterator cursor
		System.out.println("--Iterator cursor-----");
		
		Iterator itr=L1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//usig list iterator cursor
		System.out.println("---using ListIterator cursor----");
		
		ListIterator ltr=L1.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			
		}
		
		//usinng enumeration cursor
		System.out.println("-----using enumeration cursor------");
		Enumeration emu=(Enumeration) L1.element();
		while(emu.hasMoreElements())
		{
			System.out.println(emu.nextElement());
		}
		
		
		
		
		
		
	}

}
