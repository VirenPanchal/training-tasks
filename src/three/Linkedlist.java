package three;

import java.util.Scanner;

public class Linkedlist {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static Linkedlist insert (Linkedlist list,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null)
		{
			list.head=new_node;
		}
		else {
			Node last =list.head;
			while(last.next!=null)
			{
				 last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    } 
	   void deleteNode(int key) 
	    { 
	    
	        Node temp = head, prev = null; 
	  
	      
	        if (temp != null && temp.data == key) 
	        { 
	            head = temp.next;
	            return; 
	        } 
	  
	    
	        while (temp != null && temp.data != key) 
	        { 
	            prev = temp; 
	            temp = temp.next; 
	        }     
	  
	     
	        if (temp == null) return; 
	 	prev.next = temp.next; 
	    } 
	
	  public static void printList(Linkedlist list) 
	    { 
	        Node currNode = list.head; 
	        System.out.println("LinkedList: "); 
	       
	        while (currNode != null) { 
	       System.out.println(currNode.data+" "); 
            currNode = currNode.next; 
	        } 
	    } 
	  public static void main(String[] args) 
	    { 
	        Linkedlist list = new Linkedlist(); 
	        list = insert(list, 12); 
	        list = insert(list, 21); 
	        list = insert(list, 13); 
	        list = insert(list, 41); 
	        list = insert(list, 15); 
	        list = insert(list, 61); 
	        list = insert(list, 17); 
	        list = insert(list, 18); 
	        
	        printList(list); 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the delete node");
	        int n=sc.nextInt();
	        list.deleteNode(n);
	        System.out.println("After Delete");
	        printList(list);
	        
	       
	       
	        		
	    } 
	}

