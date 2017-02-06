package arrays;

import java.util.ArrayList;

//Given an array (list) of intervals as input where each interval has a start and end timestamps.
//Input array is sorted by starting timestamps. You are required to merge overlapping intervals 
//and return output array (list).
//Consider below input array. Intervals (1, 5), (3, 7), (4, 6), (6, 8) are overlapping 
//so should be merged to one big interval (1, 8). Similarly intervals (10, 12) and (11, 15) 
//are also overlapping intervals and should be merged to (10, 15).
public class MergeOverlaps{
	public static void main(String args[]){
		ArrayList<Tuple<Integer,Integer>> test = new ArrayList<Tuple<Integer,Integer>>();
		
		
	}
	
	public class Pair<F,S>{
		
		public F first;
		public S second;
		
		public Pair(F first, S second){
			this.first = first;
			this.second = second;
		}
		
	}
	
	public class Tuple<X, Y> { 
		  public final X x; 
		  public final Y y; 
		  public Tuple(X x, Y y) { 
		    this.x = x; 
		    this.y = y; 
		  } 
		} 
}