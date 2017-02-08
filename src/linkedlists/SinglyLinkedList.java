package linkedlists;

import java.util.LinkedList;

/**
 * Given the pointer/reference to the head of a singly linked list, 
 * reverse it and return the pointer/reference to the head of reversed linked list.
*/

public class SinglyLinkedList{
	
	static Node head;
	
	static class Node{
		
		public int data;
		public Node next;
		
		Node(int a, Node next){
			this.data = a;
			this.next = next;
		}
	}
	
	public static void main(String args[]){
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(7);
		list1.add(14);
		list1.add(21);
		list1.add(28);
		
		System.out.println(list1);
		reverse_list(list1);
		
	}
	
	

	private static void reverse_list(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		
	}
}