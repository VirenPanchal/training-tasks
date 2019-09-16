package three;

import java.util.Scanner;

public class Linkedlist {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node current;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	//Inserting Node at the position
	Node InsertNth(int data, int position) {
	    Node newNode = new Node(position);
	    newNode.data = data;
	    newNode.next = null;

	    if (head == null) {
	        return newNode;
	    }
	    if (position == 0) {
	        newNode.next = head;
	        head = newNode;
	        return head;
	    }
	    Node prev = null;
	    Node current = head;
	    int i = 0;
	    while (current !=null && i < position) {
	        prev = current;
	        current = current.next;
	        i++;
	    }
	    newNode.next = prev.next;
	    prev.next = newNode;
	    return head;
	}
	
	//Inserting Node
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
	
	//UpdateNode
	void updateNode()
	{
		int i;
		if(head==null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		System.out.println("REEnter the position:");
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
	
		if(pos<1)
		{
			System.out.println("Invalid node position:");
			return;
		}
		
		if(pos>=1)
		{
			System.out.println("Enter the new data:");
			int value=sc.nextInt();
				deleteNode(pos-1);
				InsertNth(value,pos-1);
			}
		return;	
		}
	
		//Delete node
	 void deleteNode(int key) 
	    { 
	    if (head == null)
				return;
	    	Node temp = head;
	    	if (key == 0) {
				head = temp.next; 
			}
	    		for (int i = 0; temp != null && i < key - 1; i++)
				temp = temp.next;
	    			
	    		if (temp == null || temp.next == null)
				return;

			Node next = temp.next.next;
			temp.next = next; 
		
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
		  int Operation = 0;
	        Linkedlist list = new Linkedlist(); 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Number of element you want to insert:");
	        int n=sc.nextInt();
	        System.out.println("Enter the value:");
	      
	        for(int i=1;i<=n;i++)
	        {
	        	int val=sc.nextInt();
	        	list = insert(list, val); 
	        
	        }
	 	   printList(list); 
	 	   
	        System.out.println("Enter the case --- 1.insert element at the End of Linkedlist ");
	        System.out.println(" 2. delete:"); 
	        System.out.println(" 3. Insert element at position:");
	        System.out.println(" 4. Update:");
	      
	        Operation=sc.nextInt();
	    switch (Operation) {
	  
	  case 1:
		  System.out.println("Enter the value:");
		  int in=sc.nextInt();
		  list = insert(list, in);
		  System.out.println("After inserting");
		  printList(list); 
		  break;
		  
	  case 2:
		  System.out.println("Enter the deleteing node index:");
	        int del=sc.nextInt();
	        list.deleteNode(del-1);
	        System.out.println("After Delete");
	        printList(list);
	        break;
	        
	  case 3:
		  System.out.println("Enter the position:");
		  int position=sc.nextInt();
		  System.out.println("Enter the value:");
		  int data=sc.nextInt();
		 list.InsertNth(data, position-1);
		 printList(list);
		 break;
		 
	  case 4:
		  System.out.println("Enter the position:");
		  int num=sc.nextInt();
		  if(num>n)
		  {
			  System.out.println("Enter valid num");
		  }
		  else
		  {
			  list.updateNode();
		  }
	  printList(list);
	  
	  }
	    } 
}   
	        
	       
	       
	        		
	    

