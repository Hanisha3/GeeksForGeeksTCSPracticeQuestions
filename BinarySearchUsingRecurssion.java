package Coding_question1;

public class BinarySearchUsingRecurssion {
	static boolean binarySearch(int[] arr, int low, int high, int key) {
		int mid=(high+low)/2;
		
		if(low>high)
			return false;
		if(arr[mid]==key)
			return true;
		if(key<arr[mid])
			return binarySearch(arr, low, mid-1, key);
		else
			return binarySearch(arr, mid+1, high, key);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 9, 13, 17, 21, 30};
		System.out.print(binarySearch(arr, 0, (arr.length-1), 28));
	}

}
