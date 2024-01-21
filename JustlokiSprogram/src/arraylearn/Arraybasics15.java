package arraylearn;

import java.util.Scanner;

public class Arraybasics15 {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("MATRIX");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Enter the elements at " + row + col + ":");
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println("The matrix you've given is:");
		int primaryDiagsum = 0;
		int secondaryDiagsum = 0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(arr[row][col] + " ");
				if (row == col) {
					primaryDiagsum = primaryDiagsum + arr[row][col];
				}
				if (col == (2 - row)) {
					secondaryDiagsum = secondaryDiagsum + arr[row][col];
				}
			}
			System.out.println("");
		}
		System.out.println("Sum of primary diagonal is: " + primaryDiagsum);
		System.out.println("Sum of secondary diagonal is: " + secondaryDiagsum);
	}
}
