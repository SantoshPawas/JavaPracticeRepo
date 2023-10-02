package Arrays;

import java.util.ArrayList;

public class MultidusingArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList> ArrayList2Dime=new ArrayList<ArrayList>();
		
		ArrayList<Integer> row1=new ArrayList<Integer>();
		ArrayList<Integer> row2=new ArrayList<Integer>();
		ArrayList<Integer> row3=new ArrayList<Integer>();
		
		
		row1.add(10);
		row1.add(20);
		row1.add(30);
		ArrayList2Dime.add(row1);
		
		row2.add(40);
		row2.add(50);
		row2.add(60);
		
		ArrayList2Dime.add(row2);
		
		row3.add(70);
		row3.add(80);
		row3.add(90);
		
		ArrayList2Dime.add(row3);
		
		
		System.out.println(ArrayList2Dime);
		
		
		
	}

}
