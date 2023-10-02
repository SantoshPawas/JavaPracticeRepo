package Constructor;

public class check_default_para 
{
	int rno;
	private check_default_para()
	{
		System.out.println("I am Default constructor");
	}
	check_default_para(int a)
	{
		rno=a;
		System.out.println("I am parameterrised constructor");
	}
	public static void main(String[] args)
	{
		check_default_para cdp=new check_default_para();
		check_default_para cdp1=new check_default_para(10);

		
	}

}
