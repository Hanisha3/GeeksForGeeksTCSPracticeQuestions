package Coding_question1;

public class ReplaceAll0with5 {
	static String replace(int n) {
		String s = n + "";
		return s.replace('0', '5');
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100123;
		System.out.print(replace(n));
	}

}
