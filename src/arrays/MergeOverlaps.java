package arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

//Given an array (list) of intervals as input where each interval has a start and end timestamps.
//Input array is sorted by starting timestamps. You are required to merge overlapping intervals 
//and return output array (list).
//Consider input array[(1, 5), (3, 7), (4, 6), (6, 8),(10, 12) and (11, 15)]. Intervals (1, 5), (3, 7), (4, 6), (6, 8) are overlapping 
//so should be merged to one big interval (1, 8). Similarly intervals (10, 12) and (11, 15) 
//are also overlapping intervals and should be merged to (10, 15).
public class MergeOverlaps{
	
	static class Tuple { 
		public Integer x;
		public Integer y;
		
		public Tuple(int a, int b) {
			this.x = a; 
		    this.y = b;
		    }
		
		@Override
        public String toString() {
            return x.toString()+"-"+y.toString();
        }
	}
	
	public static void main(String args[]){
		
		ArrayList<Tuple> test = new ArrayList<Tuple>();
		Tuple tuple1 = new Tuple(1,5);
		Tuple tuple2 = new Tuple(3,7);
		Tuple tuple3 = new Tuple(4,6);
		Tuple tuple4 = new Tuple(6,8);
		Tuple tuple5 = new Tuple(10,12);
		Tuple tuple6 = new Tuple(11,15);
		test.add(tuple1);
		test.add(tuple2);
		test.add(tuple3);
		test.add(tuple4);
		test.add(tuple5);
		test.add(tuple6);
		
		merge_overlaps(test);
		
		System.out.println(test);
	}

	private static void merge_overlaps(ArrayList<Tuple> test) {
		
		int start = test.get(0).x;
		int end = test.get(0).y;
		int i = 1;
		while(i<test.size()){
			
			int curr_start = test.get(i).x;
			int curr_end = test.get(i).y;
			
			if (curr_start<end){
				end = Math.max(end, curr_end);
				test.set(i, new Tuple(start,end));
				test.remove(i-1);
				
			} else{
				start = curr_start;
				end = curr_end;
				i++;
			}
			
			//uncomment the following command to keep track
			//System.out.println(test+"  start: "+start+" end: "+end+" curr_start: "+curr_start+" curr_end: "+curr_end+" i:"+i);
		}
		
	}
}