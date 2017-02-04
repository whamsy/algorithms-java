package arrays;

import java.util.Arrays;

//Given an array of integers, rotate the array by 'N' elements.

public class ArrayRotate{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7}; //array to be rotated
		int d = 4; //number of rotations, '+' -> right, '-' -> left
		
		System.out.println(Arrays.toString(a));
		
		System.out.print(Arrays.toString(rotate(a,d)));
//		reverse_array(a, 0, a.length-1);
//		System.out.println(Arrays.toString(a));
//		
//		reverse_array(a, 0, 1-1);
//		System.out.println(Arrays.toString(a));
//		
//		reverse_array(a, 1, a.length-1);
//		System.out.println(Arrays.toString(a));
		
		
	}

	private static int[] rotate(int[] a, int d) {
		
		int len = a.length;
		
		reverse_array(a,0,len-1);
		reverse_array(a, 0, d-1);
		reverse_array(a, d, len-1);
		
		return a;
		
	}

	private static void reverse_array(int[] a, int i, int j) {
		
		while(i<j){
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;
		}
	}
}