package Control_Statements;

public class Else_if_Consition 
{
	public static void main(String[] args)
	{
		int marks=36;
		if(marks>=65)
		{
			System.out.println("He got Distinction");
		}
		else if(marks>=60)
		{
			System.out.println("He got First Class");
			
		}
		else if(marks>=55)
		{
			System.out.println("He got higher second class");
			
		}
		else if(marks>=35)
		{
			System.out.println("He got Second class");
		}
		else 
		{
			System.out.println("Sorry!He has Fail");
		}
	}

}
