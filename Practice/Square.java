package Practice;

import java.util.Scanner;

public class Square {

	private static void square(int num, int[] arr) {
		if(num<1) {
			System.err.println("Invalid.");
		}
		int sq = 0;
		for (int i = 0; i < num; i++) {
			sq = arr[i] * arr[i];
			System.out.print(sq + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		square(num, arr);
	}
}
