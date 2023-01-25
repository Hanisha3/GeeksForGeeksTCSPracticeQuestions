package Coding_question1;

public class StringPalindromeOrNot {
	static boolean checkPalindrom(String str) {
		String rev ="";
		boolean ans = false;
		for(int i = str.length()-1; i>=0; i--){
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
			ans = true;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdedcba";
		System.out.print(checkPalindrom(str));
	}

}
