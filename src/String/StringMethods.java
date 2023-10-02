package String;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s1="Velocity";
		String s2="";
		String s3="ABCD";
		//get size
	
		System.out.println(s1.length());
		
		//to check empty or not
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s2.isBlank());
		
		//to convert uppercase
		System.out.println(s1.toUpperCase());
		
		//to lowerccase
		System.out.println(s1.toLowerCase());
		
		//to index of char
		System.out.println(s1.charAt(5));
		//to equal
		
		System.out.println(s1.equals(s2));
		
		//indexof
		
		System.out.println(s1.indexOf('o'));
		
		
		
		
		
		
		
		
	}

}
