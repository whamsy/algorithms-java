package trees;
//Given roots of two binary trees, determine if these trees are identical or not.



public class IdenticalBinaryTrees {
	
	Node root;
	
	static class Node 
	{
	    int data;
	    Node left, right;
	  
	    Node(int item) 
	    {
	        data = item;
	        left = right = null;
	    }
	}

	public static void main(String[] args) {
		
		IdenticalBinaryTrees tree1 = new IdenticalBinaryTrees();
		IdenticalBinaryTrees tree2 = new IdenticalBinaryTrees();
		
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(5);
		tree1.root.left.right = new Node(4);
		
		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		
		 if (identical_trees(tree1.root, tree2.root)){
			 System.out.println("Trees are identical");
		 } else {
			System.out.println("Trees are not identical");
		 }

	}
	
	static boolean identical_trees(Node root1, Node root2){
		if(root1==null && root2==null){
			return true;
		}
		
		if(root1 != null && root2 != null){
			return(root1.data==root2.data && identical_trees(root1.left, root2.left) && identical_trees(root1.right, root2.right));
		}
		
		return false;
	}

}

