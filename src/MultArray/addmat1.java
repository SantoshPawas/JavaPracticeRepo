package MultArray;

public class addmat1 extends addmatrix
{
	public static void main(String[] args) 
	{
		int m1[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("First matrix=");
		addmatrix.showmat(m1);
		System.out.println("Second matrix=");
		
		addmatrix.showmat(m2);
		addmatrix am=new addmatrix();
		System.out.println("Addition of matrix=");
		
		am.addmat(m1, m2);
		
		
	}

}
