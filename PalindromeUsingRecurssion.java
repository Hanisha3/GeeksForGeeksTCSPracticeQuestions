package Coding_question1;

public class PalindromeUsingRecurssion {
	static  String isPalin(String s) {
		String rev = "";
		if(s==null || s.isEmpty()) {
			return s;
		}
		return s.charAt(s.length()-1) + isPalin(s.substring(0, s.length()-1));
	}
	static boolean isPalindrome(String s) {
		String r = isPalin(s);
		if(r.equals(s))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		System.out.println(isPalin(s));
		System.out.print(isPalindrome(s));
	}

}
