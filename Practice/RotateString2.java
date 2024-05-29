package Practice;

import java.util.Scanner;

public class RotateString2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Right rotation for " + n + ": " + rotateRight(n, word));
        System.out.println("Left rotation for " + n + ": " + rotateLeft(n, word));
    }

    private static String rotateLeft(int n, String word) {
        char[] arr = word.toCharArray();
        StringBuffer sb = new StringBuffer();
        int len = arr.length;

        // Calculate effective rotation
        n = n % len;
        
        // First part: from n to end
        for (int i = n; i < len; i++) {
            sb.append(arr[i]);
        }

        // Second part: from start to n-1
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    private static String rotateRight(int n, String word) {
        char[] arr = word.toCharArray();
        StringBuffer sb = new StringBuffer();
        int len = arr.length;

        // Calculate effective rotation
        n = n % len;

        // First part: from len - n to end
        for (int i = len - n; i < len; i++) {
            sb.append(arr[i]);
        }

        // Second part: from start to len - n
        for (int i = 0; i < len - n; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
