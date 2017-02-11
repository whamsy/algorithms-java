package linkedlists;

import java.util.HashSet;

//Remove duplicate nodes from linked list of integers while keeping only the first occurrence of duplicates.

public class RemoveDuplicates{
	
	Node head;
	
	static class Node{
		
		public int data;
		public Node next;
		
		Node(int a){
			this.data = a;
			this.next = null;
		}
	}
	
	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String args[]){
		
		RemoveDuplicates list1 = new RemoveDuplicates();
		list1.head = new Node(7);
		list1.head.next = new Node(7);
		list1.head.next.next = new Node(21);
		list1.head.next.next.next = new Node(28);
		list1.head.next.next.next.next = new Node(21);
		list1.head.next.next.next.next.next = new Node(14);
		
		printList(list1.head);
		remove_duplicates(list1);
		System.out.println("");
		printList(list1.head);
		
	}
	private static void remove_duplicates(RemoveDuplicates list1) {
		
		HashSet<Integer> present = new HashSet<>();
		
		Node curr = list1.head.next;
		Node prev = list1.head;
		
		while(curr!=null){
			if (present.contains(curr.data) || (prev.data==curr.data)){
				prev.next = curr.next;
				curr = curr.next;
			} else {
				present.add(curr.data);
				prev = prev.next;
				curr = curr.next;
			}
		}
		
	}
}