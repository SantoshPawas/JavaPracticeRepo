import java.util.ArrayList;

public class Collections
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("santosh");
		al.add('S');
		
		System.out.println(al.size());
		System.out.println(al.indexOf("santosh"));
		
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		al.add(0, 20);
		System.out.println(al);
		al.add(2, "Parth");
		al.add(3, null);
		System.out.println(al);
			
		
	}

}
