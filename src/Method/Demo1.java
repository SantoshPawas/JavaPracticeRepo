package Method;

public class Demo1 
{

	public static void main(String[] args)
	{
		addition();
		addition(2000,400);
		addition(40,60);
		System.out.println("Back to main");
		addition();
		addition(250,56.65f);
	}
	public static void addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition="+c);			
	}
	public static void addition()
	{
		int a=1000,b=3000,c;
		c=a+b;
		System.out.println("Addition="+c);
	}
	public static void addition(int a,float b)
	{
		float c=a+b;
		System.out.println("Addition="+c);
	}
	

}
