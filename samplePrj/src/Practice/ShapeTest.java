package Practice;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("��", 10);
		shape[1] = new Rectangle("���簢��", 10, 20);

		for (int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}

	}

}
