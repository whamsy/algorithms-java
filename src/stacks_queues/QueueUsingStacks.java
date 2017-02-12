package stacks_queues;

import java.util.Stack;

public class QueueUsingStacks {
	
	Stack<Integer> stack1 = new Stack<Integer>(); 
	Stack<Integer> stack2 = new Stack<Integer>(); 

		  void enqueue(int data) {
		    stack1.push(data);
		  }

		  boolean isEmpty() {
		    return stack1.size() + stack2.size() == 0;
		  }

		  int dequeue() throws Exception {
		    if(isEmpty()) {
		      throw new Exception("queue is empty");
		    }

		    if(stack2.isEmpty()) {
		      while(!stack1.isEmpty()){
		          stack2.push(stack1.pop());
		      }
		    }

		    return stack2.pop();
		  }
		

	public static void main(String[] args) throws Exception {
		
		QueueUsingStacks q1 = new QueueUsingStacks();
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());


	}

}
