package arrays;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, ele, pos = 0;
		System.out.println("Enter the array size: ");
		n = sc.nextInt();

		int a[] = new int[100];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the array elements: ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the elemnets you want to search: ");
		ele = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == ele) {
				pos = i;
				break;
			}
		}

		if (pos == 0) {
			System.out.println("Position not found");
		}
		System.out.println("The position is: " + pos);
	}
}