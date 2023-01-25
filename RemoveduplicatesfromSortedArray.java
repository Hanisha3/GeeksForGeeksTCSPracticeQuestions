package Coding_question1;

public class RemoveduplicatesfromSortedArray {
	static int removeduplicates(int arr[], int l) {
		// TODO Auto-generated method stub
		
		if(l==0 || l==1) {
			return l;
		}
		int[] temp = new int[l];
		int j = 0;
		for(int i = 0; i < l-1; i++) 
			if(arr[i]!= arr[i+1])
				temp[j++]=arr[i];
		temp[j++]=arr[l-1];
			
		for(int k = 0; k < j; k++) 
				arr[k]=temp[k];
		
		return j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		 int l=arr.length;
		 
		 l = removeduplicates(arr,l);
		 
		 for(int i = 0;  i < l; i++) {
		 System.out.print(arr[i]+"");
	}
	}
}
