package Practice;

import java.util.Scanner;

public class UpperLower {
	static void isUpperLower(char c) {
		if (c >= 65 && c <= 90) { //A AA
			System.out.println("Upper Case.");
		} else if (c >= 97 && c <= 122) {
			System.out.println("Lower Case.");
		} else {
			System.out.println("Invalid Character.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		String s = sc.nextLine(); //ssdsdaa
		if (s.length() != 1) {    //0123
			System.out.println("Please enter a single character.");
		} else {
			char c = s.charAt(0);
			isUpperLower(c);
		}

	}

}
