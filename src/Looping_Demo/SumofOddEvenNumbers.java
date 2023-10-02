package Looping_Demo;

public class SumofOddEvenNumbers 
{
	public static void main(String[] args)
	{
		int oddsum=0,evensum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println("Sum of odd Number="+oddsum);
		System.out.println("Sum of even Number="+evensum);
	}

}
