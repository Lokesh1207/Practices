package arraylearn;

import java.util.Scanner;

public class Basics5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array 1 length:");
		int arr1len = sc.nextInt();
		System.out.println("Enter the array 2 length:");
		int arr2len = sc.nextInt();

		int len;
		if (arr1len > arr2len) {
			len = arr1len;
		} else {
			len = arr2len;
		}

		System.out.println("enter the array 1 elements:");
		int arr1[] = new int[arr1len];
		for (int i = 0; i < arr1len; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the array 2 elements:");
		int arr2[] = new int[arr2len];
		for (int i = 0; i < arr2len; i++) {
			arr2[i] = sc.nextInt();
		}

		int result[] = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = arr1[i] * arr2[i];
		}
		System.out.println("ans ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
