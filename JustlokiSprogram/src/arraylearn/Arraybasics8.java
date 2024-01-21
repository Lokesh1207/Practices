package arraylearn;

public class Arraybasics8 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5, 6 };

		int len1 = arr1.length;
		int len2 = arr2.length;
		int mergedArray[] = new int[(len1 + len2)];

		for (int i = 0; i < len1; i++) {
			mergedArray[i] = arr1[i];
		}

		for (int i = 0; i < len2; i++) {
			mergedArray[len1 + i] = arr2[i];
		}

		System.out.print("The merged array is: ");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
}
