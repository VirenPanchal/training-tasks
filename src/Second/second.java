package Second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
		System.out.println("Value updated:"+ar.set(ind-1, val));
		System.out.println(ar);
		System.out.println("Enter the index");
		int inde=sc.nextInt();
		System.out.println("Value Deleted:"+ar.remove(inde-1));
		System.out.println(ar);
		
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(21);
		hs.add(22);
		hs.add(23);
		hs.add(24);
		hs.add(25);
		hs.add(26);
		System.out.println(hs);
        System.out.println("Enter the index:");
		int index=sc.nextInt();
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		System.out.println("Value updated:"+ar.set(index-1, value));
		System.out.println(ar);
		System.out.println("Enter the index");
		int index1=sc.nextInt();
		System.out.println("Value Deleted:"+ar.remove(index1-1));
		System.out.println(ar);
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "Viren");
		hm.put(2, "Vatsal");
		hm.put(3, "Nisarg");
		hm.put(4, "Rushabh");
		hm.put(5, "Harshil");
		System.out.println(hm);
		System.out.println("Enter the index");
		int i=sc.nextInt();
		System.out.println("Enter the value:");
		String v=sc.next();
		System.out.println("Value updated:"+hm.replace(i,v));
		System.out.println(hm);
		System.out.println("Enter the index");
		int i1=sc.nextInt();
		System.out.println("Value Deleted:"+hm.remove(i1));
		System.out.println(hm);
		
		
		
		
		
	}

}
