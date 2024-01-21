package arraylearn;

public class Classdemo2 {

	public static void main(String[] args) {
		Volume1 box = new Volume1(); // class volume1 created already
		int l = box.length;
		int b = box.breadth;
		int h = box.height;
		int ans = l * b * h;
		System.out.println(ans);
	}
}
