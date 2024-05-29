package Practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//vowel ---> append "ay"
//not a vowel ---> "ed"

public class PigLatin {

	public static void main(String[] args) {
		String s = "God is great";
		doPigLatin(s);
	}

	private static void doPigLatin(String s) {

		if (s == null || s.isEmpty()) {
			System.err.println("Input string is empty.");
			return;
		}

		char arr[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		LinkedList<String> list = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				list.add(sb.toString());
				sb.setLength(0);
			} else {
				sb.append(arr[i]);
			}
		}
		if (sb.length() > 0) {
			list.add(sb.toString());
		}

		checkVowel(list);
	}

	private static void checkVowel(LinkedList<String> list) {

		Set<Character> set = new HashSet<>();
		for (char vow : "aeiouAEIOU".toCharArray()) {
			set.add(vow);
		}

		for (int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			char firstChar = word.charAt(0);
			String modified = word.substring(1); // od 'g' will be removed
			modified += firstChar; // odg --> concating the firstchar to the modified string.
			if (set.contains(firstChar)) {
				list.set(i, modified + "ay");
			} else {
				list.set(i, modified + "ed");
			}
		}
		result(list);
	}

	private static void result(LinkedList<String> list) {
		for (String s : list) {
			System.out.print(s + " ");
		}
	}
}
