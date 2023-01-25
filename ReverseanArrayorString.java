package Coding_question1;

public class ReverseanArrayorString {
	static void reverseArray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;		
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6};
		reverseArray(arr,0,5);
		
	}

}
