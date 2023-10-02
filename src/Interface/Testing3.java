package Interface;

public class Testing3 implements Testing1
{
	public void m1()
	{
		System.out.println("Good Morning");
	}
	public void m2()
	{
		System.out.println("Good afternoon");
	}
	/*default void m3()
	{
		
	}*/
	public static void main(String[] args)
	{
		Testing3 t3=new Testing3();
		t3.m1();
		t3.m2();
		t3.m3();
	}

}
