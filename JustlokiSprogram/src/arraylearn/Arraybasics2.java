package arraylearn;

public class Arraybasics2 {

	public static void main(String[] args) {
		// To print the maximum marks
		int marks[] = { 90, 45, 67, 80, 100, 99 };
		int max = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}
		System.out.println("Maximum is:" + max);

}
}
