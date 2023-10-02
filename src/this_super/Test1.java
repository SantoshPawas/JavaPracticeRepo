package this_super;
//demo for this super keyword
public class Test1 extends Test2
{
	int a=20;
	int b=30;
	public void m1()
	{
		int a=10;				
		System.out.println(a); //10
		System.out.println(a); 	//10
		System.out.println(this.a);	//20
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(c);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		t1.m1();
		
		
	}

}
