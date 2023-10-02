package VariableType;

public class VariableDemo1 
{
	static int no;
	String name;
	public static void main(String[] args)
	{
		VariableDemo1 vd1=new VariableDemo1();
		System.out.println(no);
		System.out.println(vd1.name);
		vd1.m2();
	}
	public static void m1()
	{
		VariableDemo1 vd1=new VariableDemo1();
		VariableDemo2 vd2=new VariableDemo2();
		
		System.out.println(no);
		System.out.println(vd1.name);
		System.out.println(VariableDemo2.address);
		System.out.println(vd2.per);

		
		
	}
	public void m2()
	{
		VariableDemo2 vd2=new VariableDemo2();

		System.out.println(VariableDemo1.no);
		System.out.println(name);
		System.out.println(VariableDemo2.address);
		System.out.println(vd2.per);

		
	}
}
