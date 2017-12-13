package day13asgm;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = { new Rectangle(5, 6), new RectTriangle(6, 2) };
		for (int i = 0; i < shape.length; i++) {
			System.out.println("area: " + shape[i].getArea());
			if (shape[i] instanceof Resizable) {
				((Rectangle) shape[i]).resize(0.5);
				System.out.println("new area: " + ((Rectangle) shape[i]).getArea());
			}
		}
	}

}
