package arraylearn;

public class Basics4 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int len1 = arr1.length;
		int arr2[] = { 1, 2, 3, 4, 5 };
		int len2 = arr2.length;
		int arr3[] = new int[len1];

		for (int i = 0; i < arr3.length - 1; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
