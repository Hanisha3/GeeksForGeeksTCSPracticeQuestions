package Coding_question1;

public class CountVowelsConsonants {
	static void countCharacter(String str) {
		int v = 0, c = 0, specialChar = 0, digits = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
				ch = Character.toLowerCase(ch);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					v++;
				else c++;
			}
			else if (ch>= '0' && ch <='9')
				digits++;
			else
				specialChar++;
		}
		System.out.println("v"+v);
		System.out.println("c"+c);
		System.out.println("digits"+digits);
		System.out.println("specialChar"+specialChar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Practice Coding 123#";
		countCharacter(str);
	}
	
	

}
