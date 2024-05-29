package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	private static boolean anagramChecker(String s1, String s2) {
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for (char c1 : arr1) {
			sb1.append(c1);
		}

		for (char c2 : arr2) {
			sb2.append(c2);
		}

		s1 = sb1.toString();
		s2 = sb2.toString();

		if (s1.equals(s2) && s1.length() == s2.length()) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter S2: ");
		String s2 = sc.nextLine();
		
		if(anagramChecker(s1, s2)) {
			System.out.println("Strings are anagrams of each other.");
		}
		else {
			System.err.println("Strings are not anagrams of each other.");
		}
	}

}
