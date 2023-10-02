package Method;

public class Sample3
{
	public static void main(String[] args)
	{
		addition();
		addition(100,200);
	}
	public static void addition()
	{
		int  a=10,b=20,c;
		c=a+b;
		System.out.println("Addition="+c);
		
	}
	public static void addition(int a,int b) 
	{
		int c=a+b;
		System.out.println("Addition="+c);
		
	}
}
