package Coding_question1;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplicateUsingHashmap {
	static void removeDuplicate(int  arr[], int n) {
		HashMap<Integer, Boolean>hmp = new HashMap<>();
		for(int i = 0 ; i < n; i++) {
			
			if(hmp.get(arr[i])== null)
				System.out.print(arr[i] + "");
			hmp.put(arr[i], true);
		}
//		for(Entry<Integer,Boolean>entry:hmp.entrySet()) {
//        	System.out.print(entry.getKey()+""+entry.getValue());
//       }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
        int n = arr.length;
        removeDuplicate(arr,n);
        
        
	}

}
