package linkedlists;

import linkedlists.RemoveDuplicates.Node;

//Given head pointer of a linked list, sort it in ascending order using insertion sort.
public class InsertionSortList{
	
	static Node head;
		
	static class Node{
			
		public int data;
		public Node next;
			
		Node(int a){
			this.data = a;
			this.next = null;
		}
	}
	
	static void printlist(Node start){
		
		while(start != null){
			System.out.print(start.data+" ");
			start = start.next;
		}
	}
	public static void main(String args[]){
		
		InsertionSortList list1 = new InsertionSortList();
		list1.head = new Node(17);
		list1.head.next = new Node(7);
		list1.head.next.next = new Node(41);
		list1.head.next.next.next = new Node(28);
		list1.head.next.next.next.next = new Node(21);
		list1.head.next.next.next.next.next = new Node(14);
		
		printlist(head);
		System.out.println("\n"+"test1");
		
		
		printlist(insertion_sort(head));
	}
	private static Node insertion_sort(Node head1) {
		
		
		Node head2 = new Node(head1.data);
		head1 = head1.next;
		while(head1 != null){
			if(head1.data < head2.data){
				Node temp = new Node(head2.data);
				head2 = new Node(head1.data);
				head2.next = temp;
				head1 = head1.next;
			} else if(head1.data > head2.data){
				Node start = head2;
				while((head1.data > head2.data)&&(head2.next!=null)){
					//System.out.println(head1.data+","+head2.data);
					head2= head2.next;
					System.out.println(head1.data+","+head2.data+"inside");
				}
				
				Node temp = new Node(head1.data);
				head2.next = temp;
				head2 = start;
				
				
				System.out.println("sorted list as of now");
				printlist(head2);
				System.out.println("");
				System.out.println(head1.data+","+head2.data+"outside");
				head1 = head1.next;
				
			}
		}
		
		
//		//head2.data = 0;
//		System.out.println("test2");
//		while(head1 != null){
//			System.out.println("testx");
//			if (head2.next == null){
//				System.out.println("test3");
//				head2 = new Node(head1.data);
//				System.out.println(head1.data);
//				head1 = head1.next;
//			} else if(head1.data < head2.data){
//				System.out.println("test4");
//				Node temp = new Node(head2.data);
//				head2 = new Node(head1.data);
//				head2.next = temp;
//				head1 = head1.next;
//			} else if(head1.data > head2.data){
//				System.out.println("test4");
//				Node start = head2;
//				while(head1.data>head2.data){
//					head2 = head2.next;
//				}
//				Node temp = new Node(head2.data);
//				head2 = new Node(head1.data);
//				head2.next = temp;
//				head1 = head1.next;
//				head2 = start;
//			}
//		}
		
		return head2;
		
	}
}