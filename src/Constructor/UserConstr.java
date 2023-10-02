package Constructor;

public class UserConstr 
{
	
		int a,b;		//Non static global variable
		
		//intialise a & b using constructor

		UserConstr()		//user defined Constructor
		{
			a=10;
			b=20;
		}
		public void addition()
		{
			int add=a+b;
			System.out.println(add);
		}
		public static void main(String[] args)
		{
			UserConstr pc=new UserConstr();
			pc.addition();
			
		}

}
