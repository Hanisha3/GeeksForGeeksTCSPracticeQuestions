package Coding_question1;

public class GCDof2numbers {
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
		if(a>b)
			return gcd((a-b),b);
		else
			return gcd(a,(b-a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 98, b = 56;
		System.out.print(gcd(a,b));
	}

}
