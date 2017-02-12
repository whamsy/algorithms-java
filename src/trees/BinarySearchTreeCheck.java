package trees;

public class BinarySearchTreeCheck {
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int a){
			this.data = a;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;

	public static void main(String[] args) {
		
		BinarySearchTreeCheck tree = new BinarySearchTreeCheck();
		
		tree.root = new Node(100);
		tree.root.left = new Node(50);
		tree.root.right = new Node(200);
		tree.root.left.left = new Node(25);
		tree.root.left.right = new Node(75);
		tree.root.right.right = new Node(350);
		tree.root.right.right.right = new Node(380);
		tree.root.right.right.left = new Node(37770);
		
		if(isbst_check(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
			System.out.println("Is BST");
		} else {
			System.out.println("Not a BST");
		}

	}

	private static boolean isbst_check(Node root2, int min, int max) {
		
		if(root2==null){
			return true;
		}
		
		if(root2.data<min || root2.data>max){
			return false;
		}
		
		return (isbst_check(root2.left, min, root2.data) && isbst_check(root2.right, root2.data, max));
		
		
	}

}
