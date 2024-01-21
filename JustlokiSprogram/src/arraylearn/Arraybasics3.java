package arraylearn;

public class Arraybasics3 {

	public static void main(String[] args) {
		int marks[] = { 90, 45, 67, 80, 100, 99 };
		int max = marks[0];
		int min = marks[0];

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
			if (marks[i] < min) {
				min = marks[i];
			}
		}
		System.out.println("Maximum is:" + max);
		System.out.println("Minimum is:" + min);
	}

}
