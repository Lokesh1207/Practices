package arraylearn;

class Volume {
	int length;
	int breadth;
	int height;
}
public class Classdemo {

	public static void main(String[] args) {
		Volume box = new Volume(); // object created with Volume-->class name,box -->object name,then object syntax
									// is followed
		box.length = 10;
		box.breadth = 10;
		box.height = 10;

		System.out.println(box.length);
		System.out.println(box.breadth);
		System.out.println(box.height);
	}

}
