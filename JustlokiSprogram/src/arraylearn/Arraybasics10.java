package arraylearn;

public class Arraybasics10 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int len = arr.length / 2;
		int b[] = new int[len];

		int j = 0;
		for (int i = 1; i < arr.length; i += 2) {
			b[j] = arr[i];
			j++;
		}
		System.out.println("The odd index values are:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
