package arraylearn;

import java.util.Scanner;

public class Basics11 { // same program using methods
	static void arraycheck(int arr[]) {
		Scanner sc = new Scanner(System.in);
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

	public static void main(String[] args) {
		int arr1[] = new int[5];
		arraycheck(arr1);
	}
}
