package Coding_question1;

public class SumofArithmeticSeries {
	static void SumofArithmetic(float a,float d, int n) {
		float result = 0;
		result = (2*a)+((n-1)*d);
		System.out.print(result*(n/2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 2.5f,d = 1.5f;
		int n = 20;
		SumofArithmetic(a,d,n);
	}

}
