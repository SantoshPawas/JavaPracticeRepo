package Method;

public class Sample1 
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		Sample2 s2=new Sample2();
		m1();
		s1.m2();
		Sample2.m3();
		s2.m3();
		s2.m4();
		
	}
	public static void m1()
	{
		System.out.println("Method m1 is running from same class");
		
	}
	public void m2()
	{
		System.out.println("Method m2 is running from same class");
		
	}
}
