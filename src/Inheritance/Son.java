package Inheritance;

public class Son extends Father
{
	public void Mobile()
	{
		System.out.println("Samsung A31S");

	}
	public static void main(String[] args)
	{
		//creating obj of son class
		Son s1=new Son();
		s1.Car();
		s1.Money();
		s1.Home();
		s1.Mobile();
	}
}
