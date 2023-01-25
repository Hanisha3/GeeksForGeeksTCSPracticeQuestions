package Coding_question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountingFreqElementsinArray {
	static void countFreq(int arr[], int n) {
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(hmp.containsKey(arr[i])) {
				hmp.put(arr[i], hmp.get(arr[i])+1);
				}
			else {
				hmp.put(arr[i], 1);
			}
	}
		for(Entry<Integer, Integer> entry : hmp.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		 int n = arr.length;
		 countFreq(arr, n);
	}
}
