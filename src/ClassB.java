
public class ClassB extends ClassA 
{
	public void showname()
	{
		System.out.println("ClassB method has called");
	}
	public static void main(String[] args) 
	{
		
		
		ClassB b=new ClassB();
		b.showname();
		
		ClassA a=new ClassA();
		a.showname();
		
		
	}

}
