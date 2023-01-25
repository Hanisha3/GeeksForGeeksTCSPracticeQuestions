package Coding_question1;

public class StrongNumber {
	static boolean strongnum(int n) {
		int result=0;
		String s = n+ "";
		for(int i = 0; i<s.length(); i++) {
			int x = Integer.valueOf(s.charAt(i));
			result+=factorial(x);
			
		}
		if(n==result) {
			return true;
		}
		return false;
	}
	static int factorial(int x) {
		if(x==1)
			return 1;
		if(x==0)
			return 1;
		else
			return (factorial(x-1)*x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		System.out.print(strongnum(n));
	}

}
