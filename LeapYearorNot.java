package Coding_question1;

public class LeapYearorNot {
	static boolean leapyr(int n) {
		if(n%400==0)
			return true;
		if(n%4==0 && n%100!= 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2001;
		System.out.print(leapyr(year));
	}

}
