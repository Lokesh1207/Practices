package arraylearn;

import java.util.Scanner;

public class Basics9 {

	static int numb(int num1, int num2) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		num1 = sc.nextInt();
		System.out.println("Enter num2 ");
		num2 = sc.nextInt();
		if (num1 > num2) {
			ans = num1;
			System.out.println("Num 1 is greater");
		} else {
			ans = num2;
			System.out.println("Num 2 is greater");
		}
		return ans;
	}

	public static void main(String[] args) {
		int result = numb(5, 9);
		System.out.println("The greater number is " + result);
	}

}
