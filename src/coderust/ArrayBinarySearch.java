//Given a sorted array of integers, return the index of the given key. Return -1 if not found.

package coderust;

public class ArrayBinarySearch{
	
	public static void main(String args[]){
		
		int array[] = {1,10,20,47,59,63,75,88,99,107,120,133,155,162,176,188,199,200,210,222};
		
<<<<<<< HEAD
		int find = 88;
=======
		int find = 47;
>>>>>>> master
		int low = 0;
		int high = array.length;
		
		
<<<<<<< HEAD
		System.out.println(binarySearch(array,find,low,high));
=======
		System.out.println(binarySearch(array[],find));
>>>>>>> master
		
		
	}
	
	public static int binarySearch(int input[],int x, int low, int high){
		
		int mid = (low+high)/2;
<<<<<<< HEAD
		
		if (low > high) return -1;
		
		if(x == input[mid]){
			return mid;
		} else if(x < input[mid]){
			return binarySearch(input, x, low, mid-1);
		} else {
			return binarySearch(input, x, mid + 1, high);
		}
		
		
=======
		if(x < input[mid]){
			high = mid
		}
>>>>>>> master
	}
}