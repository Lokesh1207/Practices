package arraylearn;

public class Arraybasics6 {

	public static void main(String[] args) {
		int a[] = { 30, 20, 50 };
		int b[] = { 80, 90 };
		int len = 0;

		if (a.length > b.length) {
			len = a.length;
		} else {
			len = b.length;
		}

		int c[] = new int[len]; // now c will be allocated with max index value either a or b len=3
		for (int i = 0; i < len; i++) { // 0<3 && 0<2 //c=3 c=110 110 50
			if (i < a.length && i < b.length) {
				c[i] = a[i] + b[i];
			} else if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[i];
			}
		}
		System.out.print("Result array c: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
