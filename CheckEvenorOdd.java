package Coding_question1;

public class CheckEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without using % (modulus operator)
		int n = 511;
		int x = n/2;
		if(x*2 == n)
			System.out.println("even");
		else
			System.out.println("odd");
		
		//second approach
		if((n&1)==0)
			System.out.print("even");
		else
			System.out.print("odd");
	}

}
