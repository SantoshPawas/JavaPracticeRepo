package Interface;

public class Student extends Marks implements ISchool
{
	int rollno;
	String name;
	public Student(int a,int b,int c,int r,String s)
	{
		super(a,b,c);
		rollno=r;
		name=s;
	}
	
	public void showinfo()
	{
		System.out.println("School Code="+scode);
		System.out.println("Student rollno="+rollno);
		System.out.println("Student Name="+name);
	}
	public static void main(String[] args)
	{
		Student s1=new Student(89,93,92,1,"Parth");
		s1.showinfo();
		s1.showmarrks();
	}

}
