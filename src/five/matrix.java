package five;

import java.util.Scanner;

public class matrix {
	static boolean isSubset(int arr1[][],int arr2[][],int m,int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<=m;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(arr2[i][j]==arr1[i][j])
				{
					break;
				}
				if(j==m)
				{
					return false;
				}
					return true;
			}
		}
		return false;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row=sc.nextInt();
		System.out.println("Enter the number of column:");
		int column=sc.nextInt();
		
		int arr1[][]=new int[10][10];
		
		System.out.println("Enter the value:");

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Main Matrix is:");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Enter the small matrix rows:");
		int roww=sc.nextInt();
		System.out.println("Enter the small matrix column:");
		int columnn=sc.nextInt();
		
		if(roww>=row && columnn>=column)
		{
			System.out.println("Plz Enter Smaller Size Array");
		}
		else
		{
			System.out.println("Its smaller:");
			int arr2[][]=new int[10][10];
			System.out.println("Enter the value:");
			for(int i=1;i<=roww;i++)
			{
				for(int j=1;j<=columnn;j++)
				{
					arr2[i][j]=sc.nextInt();
				}
			}
			System.out.println("Small Matrix is:");
			for(int i=1;i<=roww;i++)
			{
				for(int j=1;j<=columnn;j++) 
				{
					System.out.print(arr2[i][j]+"\t");
				}
				System.out.println();
			}
			int m=arr1.length;
			int n=arr2.length;
			
			if(isSubset(arr1, arr2, m, n))
			{
				System.out.println("Arr2 is subset of Arr1");
			}
			else
			{
				System.out.println("Arr2 is not subset of Arr1");
			}
		}

	}
}
	
		
		 
	



	
