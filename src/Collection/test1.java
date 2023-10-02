package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class test1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		al.add(100);
		al.add("Parth");
		al.add(85.56);
		al.add('A');
		System.out.println(al);
		
		System.out.println("---------for each----------");
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println("--------iterator-----------");
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------list iterator-----------");
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
				
	}

}
