package Polymorphism;

public class OverloadDemo extends AddOverload
{
	public static void main(String[] args)
	{
		OverloadDemo od=new OverloadDemo();
		od.add(10, 20);
		od.add('a','b');
		od.add("Santosh","Pawase" );

	}
	}
