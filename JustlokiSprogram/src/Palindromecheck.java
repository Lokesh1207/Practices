package arraylearn;

import java.util.Scanner;

public class Palindromecheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = sc.next();
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		System.out.println("Reversed String is: " + rev);
		int j = 0;
		boolean isPalindrome = true;
		while (j < word.length()) {
			if (word.charAt(j) != rev.charAt(j)) {
				isPalindrome = false;
				break;
			}
			j++;
		}
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
