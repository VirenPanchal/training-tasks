package five;

import java.util.Scanner;
public class Matrix
{
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row=sc.nextInt();
		System.out.println("Enter the number of column:");
		int column=sc.nextInt();
		int[][] arr1=new int[10][10];
		int[][] arr2=new int[10][10];
		System.out.println("Enter main matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Main Matrix is...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("Enter the number of row:");
		int row1=sc.nextInt();
		System.out.println("Enter the number of column:");
		int column1=sc.nextInt();
		if(row<=row1 && column<=column1)
		{
			System.out.println("Enter the valid row of sub matrix:");
		}
		else
		{
		System.out.println("Enter sub matrix:");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sub Matrix is ...");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		}
		int flag=0;
		int main2[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				main2[i][j]=arr1[i][j+1];
			}
		}
		int main3[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				main3[i][j]=arr1[i+1][j];
			}
		}
		int main4[][]=new int[row1][column1];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				main4[i][j]=arr1[i+1][j+1];
			}
		}
		int k=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{	
				if(arr2[k][k]==arr1[i-1][j-1] && arr2[k][k+1]==arr1[i-1][j])
				{	
					if(arr2[k+1][k]==arr1[i][j-1] && arr2[k+1][k+1]==arr1[i][j])
					{
						flag=1;
					}	
				}
			}
		}	
		if(flag==1)
		{
			System.out.println("Sub Matrix is Subset of Main matrix!!!");
		}
		else
		{
			System.out.println("Sub Matrix is Not Subset of Main matrix!!!");
		}

	}
}

