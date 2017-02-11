package trees;

import java.util.Stack;

public class InorderTraversal {
	
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
		
		InorderTraversal tree = new InorderTraversal();
		
		tree.root = new Node(100);
		tree.root.left = new Node(50);
		tree.root.right = new Node(200);
		tree.root.left.left = new Node(25);
		tree.root.left.right = new Node(75);
		tree.root.left.left.right = new Node(35);
		
		inorder_traverse(tree.root);

	}

	static void inorder_traverse(Node root1) {
		
		if(root1 == null){
			System.out.println("Empty Tree");
			return;
		}
		
		Stack<Node> helper = new Stack<>();
		
		while(!helper.isEmpty() || (root1 != null)){
			
			if(root1 != null){
				helper.push(root1);
				root1 = root1.left;
				continue;
			}
			
			root1 = helper.peek().right;
			System.out.println(helper.pop().data);
			
		}
		
	}

}
