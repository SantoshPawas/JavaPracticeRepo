package Interface;

public class Test9 implements Version_9
{
	//implementation class
	//m1(), m2()
	public void m1()
	{
		
		Version_9.super.m1();
	}
	public void m2()
	{
		Version_9.super.m2();
	}
	public static void main(String[] args)
	{
		Test9 t9=new Test9();
		t9.m1();
		t9.m2();
		
	}
	

}
