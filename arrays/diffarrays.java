package arrays;

import java.util.Scanner;

import com.Suva.genericmethododdeven;

public class diffarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// call generic method to find odd and even
		genericmethododdeven oddeven = new genericmethododdeven();
		int n;
		System.out.println("Enter the array size");
		n = sc.nextInt();

		int a[] = new int[100];
		int b[] = new int[100];
		int c[] = new int[100];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the array elements: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
			if (oddeven.is_even(i) == true) {
				b[i] = a[i];
//		 System.out.println("The even numbers are: "+b[i]);
			} else if (oddeven.is_odd(i) == true) {
				c[i] = a[i];
//	 System.out.println("The odd numbers are: "+c[i]);
			}
		System.out.println("The even numbers are:");
		for (int i=0; i< b.length; i++) {
		System.out.println(b[i]);
		}
		System.out.println("The odd numbers are: ");
		for (int i=0; i< c.length; i++) {
		System.out.println(c[i]);
		}
	}
	}