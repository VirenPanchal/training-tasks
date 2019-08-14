import java.util.Scanner;

public class stringpalindrom {
	public static boolean compare(String string, String reverse){
        if(string==null || reverse==null){
            return false;
        }
        if(string.length()!=reverse.length())
            return false;

        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)!=reverse.charAt(i))
                return false;
        }
        return true;
    }
	public static void main(String[]args)
	{
		String string,reverse="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		string=sc.nextLine();
		int c=string.length();
		System.out.println("Length is:"+c);
		
		for(int i=c-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
			System.out.println(reverse);
		}
		System.out.println("Result:"+compare(string, reverse));
		if(compare(string, reverse)==true)
		{
			System.out.println("Its a Palindrom");
		}
		else
		{
			System.out.println("It is Not a Palindrom");
		}
		char[] charactor=string.toCharArray();
		boolean[]check=new boolean[300];
		StringBuilder bn=new StringBuilder();
		for(char d:charactor)
		{
			if(!check[d])
			{
				check[d]=true;
				bn.append(d);
			}
		}
		System.out.println("After remove duplicate:"+bn);
		
			}
		}
		
		


