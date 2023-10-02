package Constructor;

public class Constructor_Overload 
{
	Constructor_Overload()
	{
		System.out.println("Hello I am in  Default constructor");
	}
	Constructor_Overload(int a)
	{
		System.out.println(a);
	}
	Constructor_Overload(String s)
	{
		System.out.println(s);

	}
	Constructor_Overload(char c)
	{
		System.out.println(c);

	}
	public static void main(String[] args)
	{
		Constructor_Overload co1=new Constructor_Overload();
		Constructor_Overload co2=new Constructor_Overload(10);
		Constructor_Overload co3=new Constructor_Overload("Parth");
		Constructor_Overload co4=new Constructor_Overload('a');

	}
}
