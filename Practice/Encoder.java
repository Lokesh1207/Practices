package Practice;

import java.util.*;

public class Encoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine(); // wwwwaaadexxxxxx
		char arr[] = s.toCharArray();

		for (int i = 0; i < arr.length; i += 2) {
			char c = arr[i];
			int count = Character.getNumericValue(arr[i+1]);
			for (int j = 0; j < count; j++) {
				System.out.print(c+" ");
			}
		}
	}

}
