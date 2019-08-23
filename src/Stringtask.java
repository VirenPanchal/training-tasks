import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Stringtask {
	
	public static void expand(String rev,int low,int high,Set<String>set)
	{
		while(low>=0 && high<rev.length() && rev.charAt(low)==rev.charAt(high))
		{
			set.add(rev.substring(low, high + 1));
			low--;
			high++;
		}
	}
	
	public static void allpelindrom(String rev)
	{
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<=rev.length();i++)
		{
			expand(rev,i,i,set);
			expand(rev,i,i+1,set);
		}
		System.out.print(set);
	}
	
	

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
			
		}
			allpelindrom(rev);
			
			
				
			}		
		}
	
		
		
	
	
				
		
	


