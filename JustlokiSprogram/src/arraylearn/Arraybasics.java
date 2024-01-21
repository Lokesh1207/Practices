package arraylearn;

import java.util.Scanner;
public class Arraybasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array length:");
		int length = sc.nextInt();

		int num[] = new int[length];
		int i = 0;
		while (i < length) {
			System.out.print("Enter the number " + i + " :");
			num[i] = sc.nextInt();
			i++;
		}

		for (i = 0; i < length; i++) {
			System.out.println("The elements are: " + num[i]);
		}
	}
}
