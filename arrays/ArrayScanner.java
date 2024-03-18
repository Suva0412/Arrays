package arrays;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("Enter the array size:");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the array number:");
			a[i] = sc.nextInt();
		}
		for (int i = n; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
