package Add1;

public class Arithmatic 
{
	public static void main(String[] args)
	{
		int a=10,b=20,c;
		c=add(a,b);
		//c=a+b;
		System.out.println("Addition="+c);
	}
	public static int add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition="+z);
		return(z);
		
	}

}
