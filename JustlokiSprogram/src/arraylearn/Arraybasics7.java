package arraylearn;

public class Arraybasics7 {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20 };
		int len = a.length > b.length ? a.length : b.length;
		int c[] = new int[len];
		int smallarr = a.length < b.length ? a.length : b.length; // to print and add the elements that is present in
																	// the smallarray(b) and then printing rest of the
																	// elements (a).

		int i = 0;
		for (i = 0; i < smallarr; i++) {
			c[i] = a[i] + b[i];
		}
		while (i < len) {
			c[i] = a[i];
			i++;
		}
		System.out.print("The resultant array C:");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
