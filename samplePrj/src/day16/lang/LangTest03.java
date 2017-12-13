package day16.lang;

public class LangTest03 {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		System.out.println("변화전 "+p1);
		
		Point p2 = (Point) p1.clone();
		p1.setX(111);
		System.out.println(p2);
		System.out.println("변화후 "+p1);

	}

}
