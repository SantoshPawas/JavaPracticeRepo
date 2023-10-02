package StaticRegularmethodDemo;

public class StataicDemo 
{
	public static void main(String[] args)
	{
		StataicDemo sd=new StataicDemo();
		Static_Demo2 sd2=new Static_Demo2();
		showfirstname();
		sd.showSurname();
		sd2.showaddress();
		sd2.showpin();
		
		
	}
	public static void showfirstname()			//static regular method
	{
		System.out.println("You are in Static regular method within same class");
		System.out.println("Hi I am Santosh");
	}
	public void showSurname()
	{
		System.out.println("You are in Non Static Regular method within same class");
		System.out.println("Hi My surname is Pawaase ");	//Non Static regular method
	}

}
