package MultArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class print2diarray 
{
	public static void main(String[] args) 
	{
	
		int[][] m1=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			System.out.print("[");
			for(int j=0;j<3;j++)
			{
				System.out.print(m1[i][j]+",");
			}
			System.out.print("]"+",");
		} 
		
	}
	

}
