package Interface;
//	WHY DID JAVA PEOPLE PROVIDE PERMISSION TO DEFAULT METHOD
public interface Testing1
{
	//2015
	void m1();
	void m2();
	default void m3()
	{
		System.out.println("Welcome to default meethod of interface");
	}
	

}
