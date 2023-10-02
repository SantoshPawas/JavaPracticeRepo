package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;


public class ArrayListDemo

{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		//add information
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(60.25f);
		al.add(100);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		//verify arraylist is empty or not
		System.out.println(al.isEmpty());
		
		//size
		System.out.println(al.size());
		
		//info present or not
		
		System.out.println(al.contains('A'));
		
		//add info in between arraylist
		al.add(1, 200);
		System.out.println(al);
		
		//remove info
		al.remove(1);
		System.out.println(al);
		
		//update infoo
		
		al.set(3, 90.75f);
		
		//to find index of data
		
		System.out.println(al.indexOf("Rahul"));
		
		//to get info by providing index
		
		System.out.println(al.get(2));
		
		System.out.println("----using for each loop---------");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	
		
		System.out.println("----using iterator cursor---------");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----using list iterator cursor----------");
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("Reverce element by list iterator");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}

}
