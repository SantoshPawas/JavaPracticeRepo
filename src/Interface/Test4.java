package Interface;

public class Test4 extends TestDemo implements Test3 
{
	public void m1()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		Test4 t4=new Test4();
		t4.m1();
		t4.m2();
	}
}
