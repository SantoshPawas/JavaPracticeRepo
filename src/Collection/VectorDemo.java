package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		
		//add info
		v1.add("Virat");
		v1.add(100);
		v1.add('A');
		v1.add(60.25f);
		v1.add(100);
		v1.add(null);
		v1.add(null);
		System.out.println(v1);
		//verify vector issempty
		System.out.println(v1.isEmpty());
		
		//size
		System.out.println(v1.size());
		
		//info present or not
		System.out.println(v1.contains("Virat"));
		//add info in between
		
		v1.add(1, 200);
		System.out.println(v1);
		//remove info
		
		v1.remove(1);
		System.out.println(v1);
		//update info
		v1.set(3, 89.95f);
		System.out.println(v1);
		//to find index of data
		
		System.out.println(v1.indexOf('A'));
		
		//to get data of given index
		
		System.out.println(v1.get(4));
		//using forloop
		System.out.println("--------using for looop---------");
		for(Object obj:v1)
		{
			System.out.println(obj);
		}
		
		//using iterator curson
		System.out.println("----using iterator cursor-----");
		
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//using listilerator
		System.out.println("--using listiterator cursor----");
		ListIterator ltr=v1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		//using enumerartion cursor
		System.out.println("--using enumeration cursor----");
		
		Enumeration emu=v1.elements();
		while(emu.hasMoreElements())
		{
			System.out.println(emu.nextElement());
		}
		
		
		
		
		
	}

}
