package Coding_question1;

public class SumofGeometricSeries {
	static double geoseries(int a, double r, int n) {
		double result = 0;
		for(int i = 0; i < n; i++) {
			result = result + a*(Math.pow(r, i));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		double r = 2;
		int n = 15;
		System.out.print(geoseries(a,r,n));
	}

}
