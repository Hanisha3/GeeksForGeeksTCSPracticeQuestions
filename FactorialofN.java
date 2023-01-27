package Coding_question1;

//import java.util.Scanner;

public class FactorialofN {
	static int fa(int n) {
		if(n==0)
			return 1;
		return n*fa(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//sc.close();
		int n = 10;
		System.out.print(fa(n));
	}

}
