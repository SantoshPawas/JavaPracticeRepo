package Method;

public class MethodDemo2 
{
	public static void mult(int a,int b)
	{
		System.out.println("You are in static method within different class");
		int c=a+b;
		System.out.println("Multiplication="+c);
		
	}
	public void div(int a,int b)
	{
		System.out.println("You are in Non static method within diff class");
		float c=a/b;
		System.out.println("Division="+c);
	}
	public static int rem(int a,int b)
	{
		System.out.println("You are in static method within different class & returning value");
		int c=a%b;
		return c;
		
	}

}
