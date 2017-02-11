package linkedlists;

//Given head pointer of a linked list, sort it in ascending order using insertion sort.
public class InsertionSortList{
	
	Node head;
		
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
		
		printlist(list1.head);
		System.out.println("\n"+"test1");
		
		printlist(insertion_sort(list1.head));
	}
	private static Node insertion_sort(Node head1) {
		
		//InsertionSortList list2 = new InsertionSortList();
		
		Node head2 = new Node(head1.data);
		head1 = head1.next;
		
		while(head1 != null){
			if(head1.data <= head2.data){
				Node temp = new Node(head2.data);
				head2 = new Node(head1.data);
				head2.next = temp;
				head1 = head1.next;
			} else if(head1.data > head2.data){
				Node start = head2;
				while((head1.data > head2.data)&&(head2.next!=null)){
					System.out.println(head1.data+","+head2.data);
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
		return head2;
	}
}