package Looping_Demo;

public class Primecheck
{
	public static void main(String[] args)
	{
		int no=10;
		boolean status=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				status=false;
				break;
			}
		}
		if(status==true)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
