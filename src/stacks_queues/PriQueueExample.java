package stacks_queues;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class PriQueueExample {

	public static void main(String[] args) {
		
		Comparator<Integer> comp1 = new IntegerValComparator();
		
		PriorityQueue<Integer> test = new PriorityQueue<>(comp1);
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> testhmap = new HashMap<>();
		
//		for(int i = 1; i < 11; i++){
//			test.add(100-i);
//			testhmap.put(i, i*5);
//			
//		}
		
		test.add(2);
		test.add(4);
		test.add(66);
		test.add(74);
		test.add(9);
		test.add(12);
		test.add(25);
		test.add(81);
		test.add(66);
		test.add(72);
		
		
		System.out.println(test.poll());
		System.out.println(test.poll());
		System.out.println(test.poll());
		
		System.out.println("BREAK");
		
		test2.add(2);
		test2.add(4);
		test2.add(66);
		test2.add(74);
		test2.add(9);
		test2.add(12);
		
		Collections.sort(test2,comp1);
		
		int i = 0;
		while(i<test2.size()){
			System.out.println(test2.get(i));
			i++;
		}
		
		
//		Iterator it = test.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		Iterator hit = testhmap.entrySet().iterator();
//		while(hit.hasNext()){
//			System.out.println(hit.next());
//		}
		//test.add(testhmap);
		
//		for (Map.Entry m : testhmap.entrySet()){
//			System.out.println("5 x "+m.getKey()+" = "+m.getValue());
//		}
		
		//System.out.println(test.peek());

	}

}
