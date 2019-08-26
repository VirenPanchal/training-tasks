import java.util.Scanner;

public class StringEqual {
	public static boolean compare(String x, String y){
        if(x.length()!=y.length())
            return false;

        for (int i = 0; i <x.length() ; i++) {
            if(x.charAt(i)!=y.charAt(i))
                return false;
        }
        return true;
    }
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String x=sc.next();
		System.out.println("Enter another the String:");
		String y=sc.next();
		System.out.println("Result after comparing two string:"+compare(x, y));
	}
	

}
