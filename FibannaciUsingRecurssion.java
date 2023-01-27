package Coding_question1;

public class FibannaciUsingRecurssion {
	static int fib(int n) {
		if(n==0)
			return n;
		if(n == 1)
			return n;

		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.print(fib(n));
	}

}
