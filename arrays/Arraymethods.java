package arrays;

import java.util.*;

public class Arraymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 13, 11, 14, 12, 15 };
		Arrays.sort(array);
		System.out.println("========ARRAYS.SORT METHOD=================");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
