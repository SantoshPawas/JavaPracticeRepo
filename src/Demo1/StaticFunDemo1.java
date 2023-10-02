package Demo1;
import java.util.*;

public class StaticFunDemo1 
{
	public static void main(String[] args)
	{
		int no1,no2,rem;
		System.out.println("Enter two number");
		Scanner in=new Scanner(System.in);
		no1=in.nextInt();
		no2=in.nextInt();
		Add(no1,no2);
		Sub(no1,no2);
		Mult(no1,no2);
		Div(no1,no2);
		rem=Remi(no1,no2);
		System.out.println("Reminder="+rem);
		
	}
	public static void Add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition="+c);
	}
	public static void Sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Substraction="+c);
	}
	public static void Mult(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Multiplication="+c);
		
	}
	public static void Div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Division="+c);
	}
	public static int Remi(int a,int b)
	{
		int c;
		c=a%b;
		return c;
	}
	
}