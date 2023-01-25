package Coding_question1;

import java.util.ArrayList;

public class CountingRocksSample {
static ArrayList <Integer> countingRocks(int ranges[][], int n, int r, int arr[]){
		ArrayList <Integer> a = new ArrayList<>();
		for(int i = 0; i < r; i++) {
			int count = 0;
			int low = ranges[i][0];
			int max = ranges[i][1];
			
			for(int j = 0; j < arr.length; j++) {
				if(low<=arr[j] && arr[j]<=max) 
					count +=1;
			}
				a.add(count);
		}
		return a;		
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int r = 2;
		int arr[] = {400, 567, 890,765,987};
		int ranges[][] = {{300,380},{800,1000}};
		
		ArrayList<Integer> ans = new ArrayList<>();
		ans=countingRocks(ranges,n,r,arr);
		
		for(int i = 0; i < ans.size(); i++) 
			System.out.print(ans.get(i)+ " ");
		System.out.println();
		
	}

}
