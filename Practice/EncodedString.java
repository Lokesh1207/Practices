package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncodedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		printEncoded(s);
		sc.close();
	}

	private static void printEncoded(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			sb.append(key);
			sb.append(value);
		}
		System.out.println(sb.toString());
	}
}
