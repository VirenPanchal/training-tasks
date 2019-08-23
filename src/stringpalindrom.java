import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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
			
		}
		System.out.println("Reverse String is:"+reverse);
		
		if(compare(string, reverse)==true)
		{
			System.out.println("Its a Palindrom");
		}
		else
		{
			System.out.println("It is Not a Palindrom");
		}
			
		//Removeing duplicate from the string
		
		StringBuilder sb = new StringBuilder();
		int idx;
		for (int i = 0; i < string.length(); i++) {
		    char ch = string.charAt(i);
		    idx = string.indexOf(ch, i + 1);
		    if (idx == -1) {
		        sb.append(ch);
		    }
		}
		System.out.println("After remove duplicate:"+sb);
	}
}
		
		


