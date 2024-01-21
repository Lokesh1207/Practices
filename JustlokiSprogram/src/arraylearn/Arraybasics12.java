package arraylearn;

public class Arraybasics12 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; // 50 40 30 20 10
		System.out.print("Before swapping: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int temp = 0;
		int len = arr.length; // 5
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i]; // temp=arr[0] --> temp =10;
			arr[i] = arr[len - 1 - i]; // arr[0] = arr [5-1-0] --> arr[4] //(arr[0]=arr[4]) //10=>50 swaps
			arr[len - 1 - i] = temp; // arr[4] = temp --> 50=temp
		}

		System.out.print("\nAfter swapping: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
