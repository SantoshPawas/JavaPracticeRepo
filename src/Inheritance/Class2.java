package Inheritance;

public class Class2 extends SimpleInheritance
{
	public void m3()
	{
		System.out.println("Welcome to m3");
	}
	public static void m4()
	{
		System.out.println("Welcome to m4");
	}
	public static void main(String[] args)
	{
		
		Class2 c2=new Class2();
		c2.m3();
		m4();
		c2.m1();
		c2.m2(); //OR
		SimpleInheritance.m2();
		

		
	}

}
