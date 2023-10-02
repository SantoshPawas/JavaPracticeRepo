package Constructor;

public class Student 
{
	int rno;
	String name;
	 Student()			//initialisation
	{
		rno=5;
		name="Sandip";
	}
	public static void main(String[] args)
	{
		Student s1=new Student();			//declaration
		System.out.println(s1.rno);			//usage
		System.out.println(s1.name);
	}

}

