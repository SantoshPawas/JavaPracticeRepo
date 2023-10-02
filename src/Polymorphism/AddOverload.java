package Polymorphism;

public class AddOverload 
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
	public void add(char c1,char c2)
	{
		System.out.println("Concantination of 2c char="+c1+c2);
		
	}
	public void add(String s1,String s2)
	{
		String s3=s1+s2;
		System.out.println("Concantination of 2 string="+s3);
	}
	

}
