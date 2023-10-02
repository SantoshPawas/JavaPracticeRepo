package Casting;

public class Son1 extends Father1
{
	public void mobile()
	{
		System.out.println("Samsung A50");
	}
	
	
	//overridden method
	
	public void car()
	{
		System.out.println("Kia celtos");
		
	}
	/*public void money()
	{
		System.out.println("2 Lakhs");
	}*/
	public void home()
	{
		System.out.println("3BHK");
	}
	
	public static void main(String[] args)
	{
		Father1 s1=new Son1();
		s1.car();
		s1.money();
		s1.home();
		
		
		
		Father1 f1=new Father1();
		Son1 s2=new Son1();
		f1=s1;
		//f1.car();
	//	f1.home();
		//f1.money();
		s2=(Son1)f1;
		
		
		
		
	}
}
