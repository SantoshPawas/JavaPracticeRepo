package Casting;

public class Son extends Father 
{
	public void mobile()
	{
		System.out.println("Samsung A50");
	}
	public static void main(String[] args)
	{
		Father s1=new Son();
		s1.car();
		s1.home();
		s1.money();
		//s1.mobile();
	}
	

}
