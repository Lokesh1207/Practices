package arraylearn;

public class Arraybasics5 {

	public static void main(String[] args) {
		// swapping the numbers
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Before swapping:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int temp = arr[0];
		int i = 0;
		while (i < arr.length - 1) { // because temp will be there in index 4 thats why a.lngth-1
			arr[i] = arr[i + 1];
			i++;
		}
		arr[i] = temp;

		System.out.println("The elements after swapping:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
