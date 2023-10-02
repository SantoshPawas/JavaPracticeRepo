package Inheritance;

public class StudentSimple
{
	int rollno;
	String name;
	StudentSimple(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void ShowName()
	{
		System.out.println("Student Rollno="+rollno);
		System.out.println("Student Name="+name);
	}

}
