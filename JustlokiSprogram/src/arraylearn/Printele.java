package arraylearn;

import java.util.Scanner;

public class Printele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("The next 5 elements are:");
		if (arr[4] > arr[0]) {
			for (int i = arr[4]; i <= arr[4] + 5; i++) {
				System.out.println(i);
			}
		}
	}
}
