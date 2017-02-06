package arrays;

import java.util.HashSet;

//Given an array of integers and a value, determine if 
//there are any two integers in the array which sum equal to the given value.

public class ArraySumExists{
	public static void main(String args[]){
		int a[] = {5,7,1,2,4,3,8};
		int k = 6;
		
		System.out.println(sum_exists(a,k));
	}

	private static String sum_exists(int[] a, int k) {
		
		HashSet<Integer> values = new HashSet<>();
		
		for(int i = 0; i < a.length; i++){
			if (values.contains(k-a[i])){
				return "Sum exists : ("+a[i]+","+(k-a[i])+")";
			} else{
				values.add(a[i]);
			}
		}
		
		return "Sum not found";
	}
}