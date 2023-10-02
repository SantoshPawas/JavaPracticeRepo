package VariableType;

public class Test8 
{
	static int a=10;		//static global variable
	public static void main(String[] args)
	{
		Test8 t8=new Test8();
		System.out.println(a);
		t8.m1();
		m2();
		
		
	}
	public void m1()
	{
		System.out.println(a);
	}
	public static void m2()
	{
		System.out.println(a);
	}
	

}
