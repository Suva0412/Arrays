package arrays;

import java.util.Scanner;

public class Arraycountofoddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; 
		System.out.println("Enter the array size: ");
		n = sc.nextInt();
		int array[] = new int[100];
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the array inputs: ");
			array[i] = sc.nextInt();
		}
		int odd=0, even=0;
		for (int i = 0; i <= n; i++) {
			if (array[i]%2!=0)
				odd++;
			else
			even++;
		}
		System.out.println("Odd numbers count is: "+odd);
		System.out.println("Even numbers count is: "+even);
}
}
