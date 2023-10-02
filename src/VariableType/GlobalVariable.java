package VariableType;

public class GlobalVariable 
{
	static int a=10; // Static global variable
	int b=20;
	public static void main(String[] args)
	{
		GlobalVariable gv=new GlobalVariable();
		System.out.println(a);
		System.out.println(gv.b);
		
	}
	public static void m1()
	{
		
	}

}
