package Method;

public class Sample4 {

	public static void main(String[] args)
	{
		Sample4 s4=new Sample4();
		addition(10,20,30);
		s4.addition(200, 300);
		
	}
	public static void addition(int x,int y,int z)
	{
		int sum=x+y+z;
		System.out.println(sum);
	}
	public void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

}
