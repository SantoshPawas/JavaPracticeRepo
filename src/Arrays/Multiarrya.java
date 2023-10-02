package Arrays;

public class Multiarrya 
{
	public static void main(String[] args) 
	{
		int m1[][]= {{10,20,30},{40,50,60}};
		/*m1[0][0]=10;
		m1[0][1]=20;
		m1[0][2]=30;
		m1[1][0]=40;
		m1[1][1]=50;
		m1[1][2]=60;*/
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m1[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
