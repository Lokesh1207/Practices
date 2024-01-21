package arraylearn;
import java.util.Scanner;
public class Arraybasicstest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int secondmax = 0;
		int marks[] = new int[5];

		System.out.println("Enter marks:");
		for (int i = 0; i < marks.length; i++) {
			int num = sc.nextInt();
			marks[i] = num;

			if (marks[i] > max) {
				secondmax = max;
				max = marks[i];

			}
		}
		System.out.println("Maximum is:" + max);
		System.out.println("Second Maximum is:" + secondmax);
	}
}
