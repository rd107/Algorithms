package recursion;

class Node1
{
	int key;
	Node1 left,right;
	
	public Node1(int item)
	{
		key=item;
		left = right = null;
	}
}

public class PreOrderTraversal 
{
	Node1 root;
	
	public PreOrderTraversal()
	{
		root = null;
	}
	
	public void printPreOrderTraversal(Node1 node)
	{
		if(node == null)
			return;
		
		System.out.println(node.key);
		
		printPreOrderTraversal(node.left);
		
		printPreOrderTraversal(node.right);
	}
	
	public static void main(String[] args) 
	{
		PreOrderTraversal tree = new PreOrderTraversal();
		
		tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        
        System.out.println("Pre Order Traversal: ");
        
        tree.printPreOrderTraversal(tree.root);
	}
}
