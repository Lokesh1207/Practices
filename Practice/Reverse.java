package Practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int nums = sc.nextInt();

		System.out.println("Reversed: "+reverse(nums));
	}

	private static int reverse(int nums) {
		int rem = 0;
		int reversed = 0;
		while (nums != 0) {
			rem = nums % 10;
			reversed = reversed * 10 + rem;
			nums/=10;
		}
		return reversed;
	}
}
