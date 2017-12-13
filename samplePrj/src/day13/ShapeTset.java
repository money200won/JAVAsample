package day13;

public class ShapeTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10,10);
		
		Circle c1 = new Circle("red", p1, 3 );
		System.out.println(c1);
		c1.draw();
		((Shape)c1).draw();
		Object obj = c1;
		System.out.println(obj);
		
		Point[] p = {new Point(10,10),new Point(20,10),new Point(10,20),new Point(20,20)};
		Rectangle sq = new Rectangle(p, "blue");
		sq.toString();
		System.out.println(sq);
		sq.draw();
		
		
	}

}
