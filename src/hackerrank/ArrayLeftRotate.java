package hackerrank;

import java.util.Arrays;

public class ArrayLeftRotate{
	
	public static void main(String args[]){
		
		int n = 5; //number of elements
		int d = 1; //number of rotations to be done
		int a[] = {1,2,3,4,5}; //array to be rotated
		int out[] = new int[n];
		
		for(int i=0;i<n;i++){
			int final_position = i - d; //calculate the final position
			
			if (final_position < 0){  //make allowance if final < 0
				final_position += n;
			}
			
			out[final_position] = a[i];
			
		}
	
		
		
		
		System.out.println(Arrays.toString(out));
		
		
		
	}
}