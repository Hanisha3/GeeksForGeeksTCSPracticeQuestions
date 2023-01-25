package Coding_question1;

import java.util.Arrays;

public class SmallestAndSecondSmallestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {111, 13, 25, 9, 34, 1, 1, 1};
	    int n=arr.length;
	    Arrays.sort(arr);
	    System.out.println(arr[0]);
	    
	    int i = 1;
	  
	    if(arr[i]>arr[0])
	    		System.out.print(arr[i]);
	    
	    else
	    	i++;
	    }
	}

