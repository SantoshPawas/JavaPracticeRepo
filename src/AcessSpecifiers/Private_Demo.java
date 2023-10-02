package AcessSpecifiers;

public class Private_Demo
{
	private int Y=501;
	private Private_Demo()
	{
		System.out.println("welcome to private constructor");
	}
	private void m2()
	{
		System.out.println("Welcome to private methos");
	}
	public static void main(String[] aregs)
	{
		Private_Demo pd =new Private_Demo();
		pd.m2();
	}

}
