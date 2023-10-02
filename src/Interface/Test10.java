package Interface;

public class Test10 implements Version_9
{
	public void m1()
	{
		System.out.println("Welcome to overridden m1");
		Version_9.super.m1();
		
	}
	public static void main(String[] args)
	{
		Test10 t10=new Test10();
		t10.m1();
		t10.m2();
	}

}
