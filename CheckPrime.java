package Coding_question1;

public class CheckPrime {
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		for(int i = 3; i <= Math.sqrt(n); i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPrime(250))
			System.out.print("true");
		else
			System.out.print("false");
	}

}
