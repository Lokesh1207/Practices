package arraylearn;

public class Arraybasics14 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int transpose[][] = new int[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				transpose[row][col] = arr[col][row];
			}
		}
		System.out.println("THE TRANSPOSE MATRIX IS:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
