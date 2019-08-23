package First;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
	public static void main(String[]args) throws Throwable
	{
		System.out.println("Hello Scaletech:");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name:");
        String name = reader.readLine();
        System.out.println("Your name is:"+name);
       
        
        
        
	}

}
