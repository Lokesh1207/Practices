package arraylearn;

import java.util.Scanner;

public class Basic8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.println("Enter array 1: ");
		for (int i = 0; i < 5; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter array 2: ");
		for (int i = 0; i < 5; i++) {
			arr2[i] = sc.nextInt();
		}
		int h = 0;
		int resultarray[] = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					resultarray[h] = arr1[i];
					h++;
				}
			}
		}
		System.out.println("Common elements are ");
		for (int i = 0; i < resultarray.length; i++) {
			System.out.println(resultarray[i]);
		}
	}
}
