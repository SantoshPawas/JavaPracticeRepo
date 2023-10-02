package Interface;

public interface Version_8 
{
	//java version 1.8 ->default method+static method
	//java version 1.9->private method
	
	void m1();				//abstarct public void m1()
	public void m2();		//abstract public void m2()
	abstract void m3();		//abstract public void m3()
	abstract public void m4();	//abstract public void m4()
	
	//default method
	
	default void m5()
	{
		System.out.println("Hi");
	}
	public static void m6()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		m6();
	}
	private void m7()
	{
		System.out.println("Good morning");
	}

}
