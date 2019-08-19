import java.util.Random;
import java.util.Scanner;

class Node
{
	Node left,right;
	int data;
	
	public Node()
	{
		left=null;
		right=null;
		data=0;
	}
	
	public Node(int n)
	{
		left=null;
		right=null;
		data=n;
	}
	
	public void setLeft(Node n)
	{
		left=n;
	}
	
	public void setRight(Node n)
	{
		right=n;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right; 
	}
	
	public void setData(int d)
	{
		data=d;
	}
	
	public int getData()
	{
		return data;
	}
}


class Binarytree
{
	private Node root;
	
	public void BinarytreeT()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void insert(int data)
	{
		root=insert(root,data);
	}
	
	private Node insert(Node node,int data)
	{
		if(node==null)
			node=new Node(data);
		else
		{
			if(data<node.getData())
			{
				node.left=insert(node.left,data);
			}
			else if(data>node.getData())
			{
				node.right=insert(node.right,data);
			}
		}
			return node;
	}
	
	void levelOrder()
	{
		int h=height(root);
		int i;
		for(i=1;i<=h;i++)
		{
			level(root,i);
		}
	}

	private void level(Node root, int i) {
		if(root==null)
		{
			return ;
		}
		if(i==1)
		{
			System.out.print(root.data+" ");
		}
		else if(i>1)
		{
			level(root.left,i-1);
			level(root.right,i-1);
		}
		
	}

	private int height(Node root) {
	    if(root==null)
	    {
	    	return 0;
	    }
	    else
	    {
	    	int lh=height(root.left);
	    	int rh=height(root.right);
	    	if(lh>rh)
	    	{
	    		return lh+1;
	    	}
	    	else
	    	{
	    		return rh+1;
	    	}
	    }
	}
	
	public boolean Sum(int data)
	{
		return Sum(root,data);
	}
	
	private boolean Sum(Node node,int sum)
	{
		if(node==null)
		{
			return(sum==0);
		}
		else
		{
			boolean ans=false;
			sum=sum-node.getData();
			
			if(sum==0 && node.left==null && node.right==null)
			{
				return true;
			}
			if(node.left!=null)
			{
				Sum(node.left,sum);
			}
			if(node.right!=null)
			{
				Sum(node.right,sum);
			}
			
			return ans;
	
		}
		
		
		
	}
}
public class Tree {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Binarytree bt=new Binarytree();
		System.out.println("Enter the depth:");
		int d=sc.nextInt();
		for(int i=1;i<=d;i++)
		{
			Random rand=new Random();
			int range=rand.nextInt(100);
			bt.insert(range);
			
		}
			System.out.println("Tree is:");
			bt.levelOrder();
			System.out.println("\nEnter the sum:");
			int sum=sc.nextInt();
	
			if(bt.Sum(sum))
			{
				System.out.println(sum+"  it is equal to sum of all node..");
			}
			else
			{
				System.out.println(sum+"  it is notequal to sum of all node..");
			}
	}

}


