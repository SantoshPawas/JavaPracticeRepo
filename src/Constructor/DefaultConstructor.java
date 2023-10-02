package Constructor;

public class DefaultConstructor 
{
	public static void main(String[] args)
	{
		DefaultConstructor dc=new DefaultConstructor();
		dc.multiplication();
	}
	public void multiplication()
	{
		int a=10,b=20,mult;
		mult=a*b;
		System.out.println(mult);
	}

}
