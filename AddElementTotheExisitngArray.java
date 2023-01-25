package Coding_question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementTotheExisitngArray {
	static Integer[] AddElement(Integer arr[], int n, int x) {
		List<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(arr));
		arraylist.add(x);
		arr = arraylist.toArray(arr);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10;
         Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         int x = 50;
         arr=AddElement(arr,n,x);
         System.out.print(Arrays.toString(arr));
	}

}
