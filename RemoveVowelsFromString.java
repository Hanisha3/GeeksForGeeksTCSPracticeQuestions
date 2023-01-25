package Coding_question1;

public class RemoveVowelsFromString {
	static String remov(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "GeeeksforGeeks - A Computer Science Portal for Geeks"; 
		String str = "Heelloo";
		System.out.print(remov(str));
	}

}
