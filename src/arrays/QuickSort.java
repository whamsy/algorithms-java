package arrays;

import java.util.Arrays;

//Given an integer array, sort it in ascending order using quicksort.
public class QuickSort{
	public static void main(String args[]){
		int a[] = {23,26,2,25};
		
		quick_sort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
	}

	private static void quick_sort(int[] a,int low, int high) {
		
		if (high>low){
			int pivot = partition_array(a,low,high);
			quick_sort(a,low,pivot-1);
			quick_sort(a,pivot+1,high);
		}
	}

	private static int partition_array(int[] arr, int low, int high) {
		
		int pivot_value = arr[low];
		int i = low;
		int j = high;

		  while (i < j) {
		    while (arr[i] <= pivot_value && i < high) 
		    	{
		    	 i++;
		    	}
		    while (arr[j] > pivot_value) j--;
		    
		    if (i < j) {
		      // swap arr[i] and arr[j]
		      int temp = arr[i];
		      arr[i] = arr[j];
		      arr[j] = temp;
		    }
		    else {
		      break;
		    }
		  }

		  arr[low] = arr[j];
		  arr[j] = pivot_value;

		  // return the pivot index
		  return j;
		
	}
}