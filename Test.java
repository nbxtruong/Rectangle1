
public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10);
		Square s = new Square(10);
		Rectangles.resize(r, 2);
		System.out.println("height = " + r.height() + " width = "
				+ r.width());
		Rectangles.resize(s, 2);
		System.out.println("height = " + s.height() + " width = "
				+ s.width());
	}
}
