package Interface;

public interface Version_9 
{
	//super interface
	//default method
	default void m1()
	{
		m3();
		
		
	}
	
	// default method
	
	default void m2()
	{
		m3();
		System.out.println("Good Afternoon");
		System.out.println("Good Night");
	}
	private void m3()
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
	
	

}
