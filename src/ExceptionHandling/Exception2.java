package ExceptionHandling;

public class Exception2 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,55};
		try
		{
			ar[6]=66;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception is handled");
		}
		finally
		{
			System.out.println("hi");
		}
		
		
		
	}

}
