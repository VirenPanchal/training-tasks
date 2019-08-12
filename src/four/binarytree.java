package four;

class node
{
	int key;
	node left;
	node right;
 
public node(int item)
{
	key=item;
	left=right=null;
}
}
public class binarytree {
	node root;
	binarytree(int key)
	{
		root=new node(key);
	}
	binarytree()
	{
		root=null;
	}
	public static void main(String[]args)
	{
		binarytree tr=new binarytree();
		tr.root=new node(1);
		tr.root.left=new node(2);
		tr.root.right=new node(3);
		tr.root.left.left=new node(4);
		tr.root.left.right=new node(5);
		tr.root.right.left=new node(6);
		tr.root.right.right=new node(7);
		System.out.println("....");
	}
}

