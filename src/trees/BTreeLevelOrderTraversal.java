package trees;

import java.util.ArrayDeque;
import java.util.Queue;

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
		tree.root.right.right.right = new Node(380);
		tree.root.right.right.left = new Node(320);
		
		level_traverse(tree.root);

	}

	private static void level_traverse(Node root2) {
		
		if (root2==null) System.out.println("Tree is empty");
		
		Queue<Node> curr = new ArrayDeque<>();
		Node null_node = new Node(0);
		
		curr.add(root2);
		curr.add(null_node);
		
		while(!curr.isEmpty()){
			
			if(curr.peek().left !=null){
				curr.add(curr.peek().left);
			}
			
			if(!(curr.peek().right==null)){
				curr.add(curr.peek().right);
			}
			
			System.out.print(curr.poll().data+",");
			
			if(curr.peek()==null_node){
				System.out.println("");
				curr.poll();
				if(!curr.isEmpty()){
					curr.add(null_node);
				}
			} 
			
		}
	}

}
