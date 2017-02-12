package stacks_queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueues {
	
	Queue<Integer> queue1 = new ArrayDeque<>();
	Queue<Integer> queue2 = new ArrayDeque<>();
	Queue<Integer> queue3 = new ArrayDeque<>();	

	void push(int data){
			queue1.add(data);
	}
	
	boolean isEmpty(){
		return (queue1.isEmpty() && queue2.isEmpty());
	}
	
	int pop() throws Exception{
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		
		while(queue1.size()>1){
			queue2.add(queue1.remove());
		}
		int value = queue1.poll();
		
		queue3 = queue1;
		queue1 = queue2;
		queue2 = queue3;
		
		return value;
		
	}

	public static void main(String[] args) throws Exception {
		
		StackUsingQueues stack1 = new StackUsingQueues();
		stack1.push(3);
		stack1.push(5);
		stack1.push(9);
		System.out.println(stack1.pop());
		stack1.push(10);
		stack1.push(16);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
	}

}
