package Practice;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUMBER: ");
		int num = sc.nextInt();
		if (isLuckyNumber(num)) {
			System.out.println("Lucky Number.");
		} else {
			System.out.println("Not a Lucky Number.");
		}
	}

	private static boolean isLuckyNumber(int num) {
		if (num <= 0) {
			return false;
		}

		int sum = 0;// 2
		while (num != 0) {
			sum += num % 10; // 2 4 4+1-->5
			num /= 10; // 122 --> 122 12 1 0
		}
		return isPrime(sum);
	}

	private static boolean isPrime(int sum) {
		if (sum <= 1) {
			return false;
		}

		for (int i = 2; i <= sum / 2; i++) {
			if (sum % i == 0) { // 2 % 2 == 0
				return false; // Not prime number.
			}
		}
		return true;
	}
}
