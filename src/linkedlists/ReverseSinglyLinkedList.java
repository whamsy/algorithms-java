package linkedlists;

/**
 * Given the pointer/reference to the head of a singly linked list, 
 * reverse it and return the pointer/reference to the head of reversed linked list.
*/

public class ReverseSinglyLinkedList{
	
	static Node head;
	
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
		
		ReverseSinglyLinkedList list1 = new ReverseSinglyLinkedList();
		list1.head = new Node(7);
		list1.head.next = new Node(14);
		list1.head.next.next = new Node(21);
		list1.head.next.next.next = new Node(28);
		
		printList(head);
		
		System.out.println("");
		
		printList(reverse_list(head));
	}

	private static Node reverse_list(Node head2) {
		
		if(head2==null||head2.next==null){
			return null;
		}
		
		Node start = head2;
		Node point = head2.next;
		
		start.next = null;
		
		while(point != null){
			Node temp = point.next;
			point.next = start;
			start = point;
			point = temp;
		}
		head2 = start;
		
		return head2;
	}
}