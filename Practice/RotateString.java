package Practice;

import java.util.Scanner;

public class RotateString {

	private static String rotateLeft(int n, String word) {
		char arr[] = word.toCharArray();

		StringBuffer sb = new StringBuffer();

		int len = arr.length;

		n = n % len;

		for (int i = n; i < arr.length; i++) {
			sb.append(arr[i]);
		}

		for (int k = 0; k < n; k++) {
			sb.append(arr[k]);
		}

		return sb.toString();

	}

	private static String rotateRight(int n, String word) {
		char arr[] = word.toCharArray();

		StringBuffer sb = new StringBuffer();
		
		int len = arr.length;

		n = n % len;
		
		for (int i = n + 1; i < arr.length; i++) {
			sb.append(arr[i]);
		}

		for (int j = 0; j <= n; j++) {
			sb.append(arr[j]);
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		System.out.println("Enter N: ");
		int n = sc.nextInt();

		System.out.println("Right rotation for " + n + ": " + rotateRight(n, word));
		System.out.println("Left rotation for " + n + ": " + rotateLeft(n, word));

	}
}
