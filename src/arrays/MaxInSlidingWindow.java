package arrays;
import java.util.ArrayDeque;

//Given a large array of integers and a window of size 'w', 
//find the current maximum in the window as the window slides through the entire array.

public class MaxInSlidingWindow{
	
	public static void main(String args[]){
		
		int array[] = {-4,2,-5,3,6};
		int w = 3;
		
		ArrayDeque<Integer> window = new ArrayDeque<>();
		
		for(int i = 0; i < w; i++){
			
			while(!window.isEmpty() && array[i]>window.peekLast()){
				window.removeLast();
			}
			
			window.addLast(i);
		}
		
		System.out.println(array[window.peekFirst()]+",");
		
		for(int i=w; i < array.length; i++){
			
				while(!window.isEmpty() && array[i]>window.peekLast()){
					window.removeLast();
				}
				
				while(!window.isEmpty() && window.peekFirst()<i-w){
					window.removeFirst();
				}
				
				window.addLast(i);
				
				System.out.println(array[window.peekFirst()]+",");
		}	
	}
}