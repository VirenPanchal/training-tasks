package four;

public class Tree {
	public static Node root;
	public Tree()
	{
		this.root=null;
	}
	public void insert(int id)
	{
		Node newNode=new Node(id);
		if(root==null) {
			root=newNode
		}
	}
	
}