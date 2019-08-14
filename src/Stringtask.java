import java.util.Scanner;

public class Stringtask {
	public static void main(String[]args)
	{
		String str,rev="",rev1="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		str=sc.next();
		
		System.out.println("Enter the starting position");
		int sp=sc.nextInt();
		System.out.println("Enter the ending position");
		int ep=sc.nextInt();
		
		String bet=str.substring(sp-1,ep);
		System.out.println("String is :"+bet);
		int len=bet.length();
		System.out.println(len);       
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+bet.charAt(i);
			System.out.println(rev);  
		}
				if(rev.equals(str))
				{
					System.out.println("is palindrom");
				}
				
			
				
			}		
		}
	
		
		
	
	
				
		
	


