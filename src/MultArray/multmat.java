package MultArray;

public class multmat 
{
	public void multmat(int m1[][],int m2[][])
	{
		int[][] m3=new int[][] {{0,0,0},{0,0,0}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("mltiplication=");
		multmat.showmat(m3);
	}
	public static void showmat(int mat[][])
	{
		int[][] m3=new int[3][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
