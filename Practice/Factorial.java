package Practice;

import java.util.Scanner;

public class Factorial {
	private static int findfact(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		System.out.println(findfact(num));

	}
}
