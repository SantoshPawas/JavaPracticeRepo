package String;

public class Test7 
{
	public static void main(String[] args) 
	{
		String s1=new String("Pune");
		String s2="Pune";
		String s3="Pune";
		String s4="Pune";
		String s5="Mumbai";
		System.out.println(s1+s2+s3+s4+s5);
		s1.concat(s5);
		System.out.println(s1);
	}

}
