package this_super;

public class Baseclass extends Superclasss
{
	int a=100;
	public void m1() 
	{
		int a=10;
		System.out.println("Access Local value for a="+a);
		System.out.println("Access Global value for a="+this.a);
		System.out.println("Access value in super classs for a="+super.a);
	}
	public static void main(String[] args)
	{
		Baseclass bc=new Baseclass();
		bc.m1();
	}

}
