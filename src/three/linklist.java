package three;

import java.util.LinkedList;
import java.util.Scanner;

public class linklist {
	public static void main(String[]args)
	{
		LinkedList<Integer>ls=new LinkedList<Integer>();
		ls.add(22);
		ls.addFirst(21);
		ls.add(23);
		ls.add(24);
		ls.add(25);
		ls.add(26);
		System.out.println("Linked list is:"+ls);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index:");
		int index=sc.nextInt();
		System.out.println("Enter the Value:");
		int value=sc.nextInt();
		System.out.println("Updated value:"+ls.set(index,value));
		System.out.println(ls);
		System.out.println("After the deleting:"+ls.remove(index));
		System.out.println(ls);
		
	}

}
