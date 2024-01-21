package arraylearn;

public class Arraybasics13 {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int val = 1;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				arr[row][col] = val;
				val = val + 1;
			}
		}
		int rowtot = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rowtot = rowtot + arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("Row total is:" + rowtot);
			System.out.println(" ");
		}
	}
}