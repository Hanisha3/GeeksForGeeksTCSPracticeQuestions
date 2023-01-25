package Coding_question1;

public class FirstNonRepeatingElement {
	static int FNRElement(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) 
				if(i!=j && arr[i]==arr[j]) 
					break;
			if(j==n) {
				return arr[i];
			}
				}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		int n = arr.length;
		System.out.print(FNRElement(arr,n));
	}
}