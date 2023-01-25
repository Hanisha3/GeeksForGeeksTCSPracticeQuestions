package Coding_question1;

import java.util.Arrays;

public class MeanMedianofArray {
	static double mean(int arr[],int len) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum/(double)len;		
	}
	static double median(int arr[],int len) {
		Arrays.sort(arr);
		if(len%2==0)
			return (double)(arr[len/2]+arr[(len-1)/2])/2;
		return (double)arr[len/2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 4, 2, 7, 5, 8, 6};
		int len = arr.length;
		
		System.out.print("Mean="+mean(arr,len));
		System.out.print("Median="+median(arr,len));
	}

}
