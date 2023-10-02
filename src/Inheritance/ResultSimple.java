package Inheritance;

public class ResultSimple extends StudentSimple
{
	int m1,m2,m3;
	float per;
	
	ResultSimple(int r,String name,int m1,int m2,int m3)
	{
		super(r,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		per=(float)(m1+m2+m3)/3;
		
		
	}
	public void ShowwResult()
	{
		ShowName();
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m3="+m3);
		System.out.println("Percentage="+per);
	}
	

}
