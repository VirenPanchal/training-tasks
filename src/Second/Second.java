package Second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Second {
	public static void main(String[]args) {
		//Add value in ArrayList
		ArrayList<Integer>ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		System.out.println("....ArrayList....");
		System.out.println(ar);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index of Arraylist:");
		int ind=sc.nextInt();
		System.out.println("Enter the value of Arraylist:");
		int val=sc.nextInt();
		System.out.println("Value updated in Arraylist:"+ar.set(ind-1, val));
		System.out.println(ar);
		System.out.println("Enter the index");
		int inde=sc.nextInt();
		System.out.println("After Value Deleted:"+ar.remove(inde-1));
		System.out.println(ar);
		
		//Add Value in HashSet
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(21);
		hs.add(22);
		hs.add(23);
		hs.add(24);
		hs.add(25);
		hs.add(26);
		System.out.println("...HashSet...");
		System.out.println(hs);
        System.out.println("Enter the index of Hashset:");
		int index=sc.nextInt();
		System.out.println("Enter the value of Hashset:");
		int value=sc.nextInt();
		System.out.println("After Value updated:"+ar.set(index-1, value));
		System.out.println(ar);
		System.out.println("Enter the index you want to delete from Hashset:");
		int index1=sc.nextInt();
		System.out.println("Value Deleted from the Hashset:"+ar.remove(index1-1));
		System.out.println(ar);
		
		//Add Value in HashMap
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "Viren");
		hm.put(2, "Vatsal");
		hm.put(3, "Nisarg");
		hm.put(4, "Rushabh");
		hm.put(5, "Harshil");
		System.out.println("...HashMap...");
		System.out.println(hm);
		System.out.println("Enter the index of hashmap");
		int i=sc.nextInt();
		System.out.println("Enter the value of Hashmap:");
		String v=sc.next();
		System.out.println("Value updated:"+hm.replace(i,v));
		System.out.println(hm);
		System.out.println("Enter the index of deleting value");
		int i1=sc.nextInt();
		System.out.println("after Value Deleted:"+hm.remove(i1));
		System.out.println(hm);
		
		
		
		
		
	}

}
