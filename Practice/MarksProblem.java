package Practice;

import java.util.Scanner;

public class MarksProblem {

	private static int findAvg(int n, int[] arr) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum / n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter elements: ");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findAvg(N, arr));
	}

}
