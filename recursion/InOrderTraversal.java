package recursion;

class Node
{
	int key;
	Node left,right;
	
	public Node(int item)
	{
		key=item;
		left = right = null;
	}
}

public class InOrderTraversal 
{
	Node root;
	
	public InOrderTraversal() 
	{
		root = null;
	}
	
	public void printInOrder(Node node)
	{
		if(node==null)
			return;
		
		printInOrder(node.left);
		
		System.out.println(node.key);
		
		printInOrder(node.right);
	}
	
	public static void main(String[] args) 
	{
		InOrderTraversal tree = new InOrderTraversal();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Inorder Traversal: ");
		tree.printInOrder(tree.root);
	}
}
