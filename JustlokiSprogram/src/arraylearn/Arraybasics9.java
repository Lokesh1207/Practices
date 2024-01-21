package arraylearn;

public class Arraybasics9 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -4, 5, -6, 7, -8 };
		int neg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				neg++;
			}
		}
		int b[] = new int[neg];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				b[j] = arr[i];
				j++;
			}
		}
		System.out.print("The negative elements are: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
