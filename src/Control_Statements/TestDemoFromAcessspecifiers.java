package Control_Statements;

import AcessSpecifiers.Default_Demo;
import AcessSpecifiers.Private_Demo;
import AcessSpecifiers.ProtectedDemo;
import AcessSpecifiers.PublicDemo;

public class TestDemoFromAcessspecifiers 
{
	public static void main(String[] args)
	{
		PublicDemo pd=new PublicDemo();
		System.out.println(pd.x);
		pd.m1();
		 
		/*Private_Demo pd1=new Private_Demo();		//not wortking bcoz private and can't acess outside class access within class only
		System.out.println(pd1.x);
		pd1.m1();*/
		
		/*Default_Demo pd2=new Default_Demo();   //not wortking bcoz default, can't acess outside package ,access within same package class only
		System.out.println(pd2.x);
		pd2.m1();*/
		
		/*ProtectedDemo pd4=new ProtectedDemo(); //not wortking bcoz protected, can't acess outside package, access within same package class
		System.out.println(pd4.x);				// & if required outside package then requaired inheritance
		pd4.m1();*/

	}

}
