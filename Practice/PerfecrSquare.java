package Practice;

import java.util.Scanner;

public class PerfecrSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter elements: ");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		checkSquare(N, arr);
	}

	private static void checkSquare(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				if (isPerfectNumber(sum)) {
					System.out.println(arr[i] + " and " + arr[j]);
					break;
				}
			}
		}
	}

	private static boolean isPerfectNumber(int sum) {
		double sqrt = Math.sqrt(sum);
		return (sqrt == (int) sqrt);
	}
}
