package arrays;

//Given a sorted array of integers, return the low and high index of the given key. 
//Return -1 if not found. The array length can be in millions with lots of duplicates

public class LowHighIndices{
	public static void main(String args[]){
		
		int a[] = {1,2,2,2,5,5,5,5,5,5,10,10,20};
		int k = 2;
		
		//System.out.println(low_index(a,k));
		System.out.println(high_index(a,k));
		
	}

	private static int high_index(int[] a, int k) {
		
		int start = 0;
		int end = a.length - 1;
		//int mid = (start+end)/2;
		
		while(start<end){
			int mid = (start+end)/2;
			if(a[mid]<=k){
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		if (a[end] == k) 
			return end;
		else 
			return -1;
	}

	private static char[] low_index(int[] a, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}