package Arrays;

import java.util.Arrays;

public class sortArray
{
	public static void main(String[] args) 
	{
		int[] arr= {1,5,6,78,9,10,12};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("descending order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	

}
