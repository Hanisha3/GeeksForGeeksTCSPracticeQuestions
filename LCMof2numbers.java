package Coding_question1;

public class LCMof2numbers {
	static int lcm(int a, int b) {
		int lcm = (a*b)/gcd(a,b);
		return lcm;
	}
	static int gcd(int a, int b) {
		if(a==b) {
			return a;
		}
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a>b) {
			return gcd((a-b),b);
		}
		return gcd(a,(b-a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5,b=7;
		System.out.print(lcm(a,b));
	}

}
