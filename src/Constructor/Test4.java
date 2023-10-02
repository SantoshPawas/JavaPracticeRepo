package Constructor;

public class Test4 
{
	//step 1 variable declaration
	int x; //non static global variable
	int y;
	String name;
	
	//step2 variable initialization
	Test4()
	{
		x=20;
		y=40;
	}
	Test4(int a,int b)
	{
		x=a;
		y=b;
	}
	Test4(String sname)
	{
		name=sname;
	}
	//step3 Usage
	public void addition()
	{
		int add=x+y;
		System.out.println("Addition="+add);
	}
	public void printname()
	{
		System.out.println("Name="+name);
	}
	public static void main(String[] args)
	{
		//Create an object
		
		Test4 t4=new Test4();
		Test4 t5=new Test4(100,200);
		t4.addition();
		t5.addition();
		
		Test4 t6=new Test4("Parth");
		t6.printname();
		
	}

}
