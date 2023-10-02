package VariableType;

public class Test7 
{
	int b=20; 	//Nonstatic gloabal variable
	public void m1()
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Test7 t7=new Test7();
		System.out.println(t7.b);
		t7.m1();
		m2();
		
	}
	public static void m2()
	{
		Test7 t8=new Test7();
		System.out.println(t8.b);
		
	}
	
}
