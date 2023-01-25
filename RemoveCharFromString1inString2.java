package Coding_question1;

public class RemoveCharFromString1inString2 {
	static String removeString(String str1, String str2) {
		for(int i = 0; i < str2.length(); i++) {
			char j = str2.charAt(i);
			while(str1.contains(j+ "")) {
				str1=str1.replace(j +"", "");
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "geeksfprgeeks";
		String str2 = "esk";
		System.out.print(removeString(str1,str2));
	}

}
