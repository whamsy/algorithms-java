package hackerrank;
 
//problem at https://www.hackerrank.com/challenges/ctci-making-anagrams

public class StringAnagrams{
	
	public static void main(String args[]){

		String a = "abcda";
		String b = "aghcb";
		
		System.out.println("\n"+"Number of Deletions required: "+numberNeeded(a,b));
		
		
	}
	
	public static int numberNeeded(String a, String b) {
		int[] lettercounts = new int[26];
		
		for(char c : a.toCharArray()){
			//get the position of the character in question, for e.g. the letter d is the 4th alphabet
			//so 'd'-'a' gives 3, the array gets updated at postion 3, increment it.
			lettercounts[c-'a']++; 
		}
		for(char c : b.toCharArray()){
			//equate the number of occurences by subtracting, n ocuurences of a char in both strings will
			//cancel out. No subtractions required in that case.
			lettercounts[c-'a']--;
		}
		int result = 0;
		
		for(int i : lettercounts){
			result += Math.abs(i);
			System.out.print(i+",");
		}
		
		
		return result;
	}
	
}