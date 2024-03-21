package arrays;

import java.util.*;

public class secondnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the array size" );
		n=sc.nextInt();
		
		int arr[]= new int[n];
		
		for (int i=0; i < n; i++)
		{
			System.out.println("Enter the elements of an array: ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The elements in the array are: ");
		for (int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("The second smallest number in an array is: "+arr[1]);
		System.out.println("The second largest number in an array is: "+arr[n-2]);
	}
	
}
