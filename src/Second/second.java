package Second;

import java.util.ArrayList;
import java.util.Scanner;

public class second {
	public static void main(String[]args) {
		ArrayList<Integer>ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		System.out.println(ar);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index:");
		int ind=sc.nextInt();
		System.out.println("Enter the value:");
		int val=sc.nextInt();
		System.out.println("Value updated:"+ar.set(ind, val));
		System.out.println(ar);
		System.out.println("Enter the index");
		int inde=sc.nextInt();
		System.out.println("Value Deleted:"+ar.remove(inde));
		System.out.println(ar);
		
		
		
		
	}

}
