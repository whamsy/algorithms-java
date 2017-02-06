package arrays;

import java.util.Arrays;

//Given an integer array, move all instances of a number 'k' to the left 
//(beginning of the array) while maintaining the order of other elements in the array.

public class MovingElementsLeft{
	public static void main(String args[]){
		
		int a[] = {1,10,20,4,59,63,4,88,4};
		int move = 4;
		move_elements(a,move);
		System.out.println(Arrays.toString(a));
		
	}

	private static void move_elements(int[] a, int k) {
		
		int read = a.length - 1;
		int write = a.length - 1;
		
		while(read >= 0){
			if (a[read] == k){
				read--;
				}
			else if (a[read] != k){
				a[write] = a[read];
				read--;
				write--;
				}
		}
		
		while(write >= 0){
			a[write] = k;
			write--;
		}
		
	}
}