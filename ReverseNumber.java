package Coding_question1;

public class ReverseNumber {
	static int reverse(int n) {
		int rev = 0;
		while(n>0) {
			rev = rev*10 + n%10;
			n= n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		System.out.print(reverse(n));
	}

}
