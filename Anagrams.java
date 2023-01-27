package Coding_question1;

import java.util.Arrays;

public class Anagrams {
	static boolean anagrams(String s1, String s2) {
		if(s1.length()==s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				return true;
			}
			return false;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.print(anagrams(s1,s2));
	}

}
