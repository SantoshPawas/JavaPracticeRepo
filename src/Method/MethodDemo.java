package Method;

public class MethodDemo
{
	public static void main(String[] args)
	{
		add(100,50);
		MethodDemo md=new MethodDemo();
		md.sub(100, 50);
		MethodDemo2.mult(100, 50);
		MethodDemo2 md2=new MethodDemo2();
		md2.div(100, 50);
		
		int rem=MethodDemo2.rem(100, 6);
		System.out.println("Reminder="+rem);
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("You are in static method within same class");
		System.out.println("Addition="+c);
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("You are in Non static method within same class");
		System.out.println("Substraction="+c);
	}
}