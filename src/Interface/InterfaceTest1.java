package Interface;

public class InterfaceTest1 implements InterfaceTest
{
	public void m1()
	{
		System.out.println(InterfaceTest.a);
		System.out.println("Hi");
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		InterfaceTest1 c1=new InterfaceTest1();
		c1.m1();
		c1.m2();
	}
	

}
