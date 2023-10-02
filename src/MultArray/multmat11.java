package MultArray;

public class multmat11 extends multmat
{
	public static void main(String[] args) 
	{
		int m1[][]=new int[][] {{1,2},{3,4}};
		int m2[][]=new int[][] {{1,2},{3,4}};
		
		System.out.println("First matrix=");
		multmat.showmat(m1);
		System.out.println("Second matrix=");
		
		multmat.showmat(m2);
		multmat mm=new multmat();
		
		mm.multmat(m1, m2);
		
		
	}

}
