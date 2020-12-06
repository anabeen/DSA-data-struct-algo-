import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		// Syntax to remember
		/*
        int[] a = new int[3];
        char[] b = "Hi".toCharArray();
        ArrayList<Integer> c = new ArrayList<>();
        Stack<Integer> d = new Stack<>();
        HashSet<Integer> e = new HashSet<>();
  	    Queue<Integer> f = new LinkedList<>();
		LinkedList<Integer> g = new LinkedList<>();
		*/
        
		
		// Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
		System.out.println("Testing Taking out vowels");
		String s = "leetcodeisacommunityforcoders";
		
		removeVowels rV = new removeVowels();
		String noVowels = rV.removedVowels(s);
		System.out.println(noVowels);
		
		//Write a function that takes a string as input and reverse only the vowels of a string.
		System.out.println("Testing Reverse Vowels leetcode");
		String leetcode = "leetcode";
		
		reverseVowel rv = new reverseVowel();
		String str = rv.reverseVowels(leetcode);
		System.out.println(str);
		
		
	}
}