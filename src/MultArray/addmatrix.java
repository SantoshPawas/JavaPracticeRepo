package MultArray;

public class addmatrix 
{

	public void addmat(int m1[][],int m2[][])
	{
		int[][] m3=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
				System.out.print(m3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
	public static void showmat(int mat[][])
	{
		int[][] m3=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}


}
