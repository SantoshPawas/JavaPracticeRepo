package VariableType;

public class Staticgloablevardiffclass 
{
	public static void main(String[] args)
	{
		Test3 t3=new Test3();
		System.out.println(Test3.a); // static global variable call from diff class
		System.out.println(t3.d);  	// Static global variable call from diff class
	}

}
