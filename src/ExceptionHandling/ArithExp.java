package ExceptionHandling;

public class ArithExp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c = 0;
		System.out.println("Hi");
		try
		{
			c=a/b;
			
		}
		catch(ArithmeticException ae)
		{
			c=a/2;
		}
		finally
		{
			System.out.println(c);
			System.out.println("finally exicuted");
		}
		
		System.out.println("Hello");

		
	}
	
}
