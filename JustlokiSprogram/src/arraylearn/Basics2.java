package arraylearn;

public class Basics2 {
	static int numb(int num1, int num2) {
		int ans = 0;
		if (num1 > num2) {
			ans = num1;
			System.out.println("Num 1 is greater");
		} else {
			ans = num2;
			System.out.println("Num 2 is greater");
		}
		return ans;
	}

	public static void main(String[] args) {
		int result = numb(5, 9);
		System.out.println("The greater number is " + result);
	}
}
