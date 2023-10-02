package Abstract_Class;
// Example for concrete class

public class Sample3 extends Sample2
{
	//concrete class 
	//sub class
	//m1(), m2(),m3(),m4()
	
	public void m3()
	{
		System.out.println("Good morning");
		
	}
	public void m4()
	{
		System.out.println("Good Afternoon");
		
	}
	public static void main(String[] args)
	{
		Sample3 s3=new Sample3();
		s3.m1();
		s3.m2();
		s3.m3();
		s3.m4();
	}

}
