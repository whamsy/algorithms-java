package arrays;

//Given three integer arrays sorted in ascending order, find the smallest number that is common in all three arrays.

public class SmallestCommonNumber{
	public static void main(String args[]){
		
		int array1[] = {6,7,10,25,30,63,64};
		int array2[] = {-1,4,5,6,7,8,50};
		int array3[] = {1,6,10,14};
		
		System.out.println(smallest(array1,array2,array3));
	}

	private static int smallest(int[] a1, int[] a2, int[] a3) {
		
		int p1 = 0, p2 = 0, p3 = 0;
		
		while(p1<a1.length && p2<a2.length && p3<a3.length){
			
			if(a1[p1]==a2[p2] && a2[p2]==a3[p3]) 
				return a1[p1];
			
			if(a1[p1]<a2[p2] && a1[p1]<a3[p3]) 
				p1++;
			else if(a2[p2]<a1[p1] && a2[p2]<a3[p3]) 
				p2++;
			else if(a3[p3]<a1[p1] && a3[p3]<a2[p2]) 
				p3++;
		}
		return -1;
	}
}