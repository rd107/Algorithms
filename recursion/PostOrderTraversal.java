package recursion;

class Node2
{
	int key;
	Node2 left,right;
	
	public Node2(int item)
	{
		key=item;
		left=right=null;
	}
}

public class PostOrderTraversal 
{
	Node2 root;
	
	public PostOrderTraversal()
	{
		root =null;
	}
	
	private void printPostOrderTraversal(Node2 node) 
	{
		if(node==null)
			return;
		
		printPostOrderTraversal(node.left);
		
		printPostOrderTraversal(node.right);
		
		System.out.println(node.key);
	}
	
	public static void main(String[] args) 
	{
		PostOrderTraversal tree = new PostOrderTraversal();
		
		tree.root = new Node2(1);
		tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);
        
        System.out.println("Post Order Traversal: ");
        tree.printPostOrderTraversal(tree.root);
	}

}
