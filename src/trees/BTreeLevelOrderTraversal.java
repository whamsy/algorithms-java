package trees;

import java.util.ArrayDeque;
import java.util.Queue;

import trees.InorderTraversal.Node;

public class BTreeLevelOrderTraversal {
	
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
		
		BTreeLevelOrderTraversal tree = new BTreeLevelOrderTraversal();
		
		tree.root = new Node(100);
		tree.root.left = new Node(50);
		tree.root.right = new Node(200);
		tree.root.left.left = new Node(25);
		tree.root.left.right = new Node(75);
		tree.root.right.right = new Node(350);
		
		level_traverse(tree.root);

	}

	private static void level_traverse(Node root2) {
		
		if (root2==null) System.out.println("Tree is empty");
		Queue<Node> curr = new ArrayDeque<>();
		
		while(!curr.isEmpty()){
			curr.add(root2);
			
		}
		
		
		
	}

}
