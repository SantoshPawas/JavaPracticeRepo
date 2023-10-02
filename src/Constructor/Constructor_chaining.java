package Constructor;

public class Constructor_chaining 
{
	 Constructor_chaining()
	{
	
		this(10);		//
		
		
	}
	Constructor_chaining(int a)
	{
		
		this("Parth");
		
	}
	Constructor_chaining(String name)
	{
		this('a');
	}
	Constructor_chaining(char x)
	{
		
		System.out.println("parameterized constructor with  is called");
	}
	public static void main(String[] args)
	{
		Constructor_chaining cc=new Constructor_chaining();
	}
}
