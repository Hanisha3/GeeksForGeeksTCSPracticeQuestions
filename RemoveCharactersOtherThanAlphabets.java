package Coding_question1;

public class RemoveCharactersOtherThanAlphabets {
	static void remchar(String str) {
		//String str2 = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)<'a' || str.charAt(i)>'z' && str.charAt(i)<'A'|| str.charAt(i)>'Z') {
				str = str.substring(0,i)+str.substring(i+1);
				i--;
			}
		}
		System.out.print(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "$Gee*k;s..fo, r’Ge^eks?";
		remchar(str);
	}

}
