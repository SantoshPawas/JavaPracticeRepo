package Generalization;

public class VI implements Simcard
{
	public void sms()
	{
		System.out.println("300 sms");
	}
	public void calling()
	{
		System.out.println("3000 min");
	}
	public void internet()
	{
		System.out.println("3 GB");
	}
	public static void main(String[] args)
	{
		VI v=new VI();
		v.sms();
		v.calling();
		v.internet();
	}

}
