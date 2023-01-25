package Coding_question1;

public class SumofdigitsofaNumber {
	static int sum(int n) {
		int result = 0;
		
		while(n>0) {
			result+=n%10;
			n=n/10;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123451;
		System.out.print(sum(n));
	}

}
