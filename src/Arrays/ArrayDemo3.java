package Arrays;

import java.util.Scanner;

public class ArrayDemo3 
{
	public static void main(String[] args)
	{
		String s[]=new String[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr 5 String in array");
		for(int i=0;i<5;i++)
		{
			s[i]=in.next();
		}
		System.out.println("Entered String are=");
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i]);
		}
	}

}
