package Interface;

public class Sample2 implements Sample1
{
	//imnplementation class
	//final public static int a=10;
	//abstract public void m1();
	//abstract public voidd m2();
	public void m1()
	{
		
		System.out.println("Hi");
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		
		s2.m1();
		s2.m2();
		//s2.a=20;				//a is final feild of interface so it cann't reinitialise
		System.out.println(s2.a);
	}

}
