package arraylearn;

public class Basic6 {

	public static void main(String[] args) {
		int arr1[] = { 1, 1, 2, 3, 4 };
		int arr2[] = { 22, 4, 45, 4 };
		int arr3[] = new int[10];

		for (int i = 0; i < 5; i++) {
			if (arr1[i] == arr2[i]) {
				arr3[i] = arr1[i];
			}
			System.out.println(arr3[i]);
		}
	}
}
