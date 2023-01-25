package Coding_question1;

public class EquilibriumIndex {
	public static int Index(int arr[], int n) {
		int i,j,leftsum,rightsum;
		for(i=0; i< n; ++i) {
			leftsum=0;
			for(j=0;j<i;j++) {
				leftsum+=arr[j];
			}
			rightsum=0;
			for(j=i+1;j<n;j++) {
				rightsum+=arr[j];
			}
			if(leftsum==rightsum)
				return i;		
	}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int n = arr.length;
		EquilibriumIndex e = new EquilibriumIndex();
		System.out.print(e.Index(arr,n));
	}
}
