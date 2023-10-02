package Interface;

public class Sample22 implements Sample11 
{
	//implementation class
	//final public static int a=10;
	//abstract public void m1();
	//abstract public void m2();
	
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
		Sample22 s22=new Sample22();
		s22.m1();
		s22.m2();
	}
	

}
