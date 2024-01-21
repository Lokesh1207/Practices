package arraylearn;

public class Arraybasics4 {

	public static void main(String[] args) {
		int arr[] = { 10, 100, 20, 30, 50 };
		int max = 0, secondmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) { // 50>0 secondmax=0 max=50
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) { // 40>0 secondmax=40
				secondmax = arr[i];
			}
		}
		System.out.println("Max is " + max);
		System.out.println("Second Max is " + secondmax);
	}

}
