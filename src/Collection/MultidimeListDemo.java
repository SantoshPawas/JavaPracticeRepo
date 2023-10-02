package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultidimeListDemo

{
	public static void main(String[] args) 
	{
		 // Create a two-dimensional ArrayList of integers
        ArrayList<ArrayList> twoDArrayList = new ArrayList<ArrayList>();
       
        // Create the first row and add it to the outer ArrayList
        ArrayList row1 = new ArrayList();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        twoDArrayList.add(row1);
       
        // Create the second row and add it to the outer ArrayList
        ArrayList row2 = new ArrayList();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        twoDArrayList.add(row2);
       
        // Retrieve and print the value at the second row and the third column
        int value = (int) twoDArrayList.get(1).get(2);
        System.out.println("Value at row 2, column 3: " + value);
        System.out.println(twoDArrayList);
		
	}

}
