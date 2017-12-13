package day13;

import java.util.Arrays;

public class Rectangle extends Shape{
	Point[] p = new Point[4];

	int width; //= p[3].getX()-p[0].getX();
	int height; //= p[3].getY()-p[0].getY();

	public Rectangle() {
		super();
	}
	public Rectangle(Point[] p) {
		super();
		this.p = p;
	}
	public Rectangle (Point[] p, String color) {
		super(color);
		this.p = p;
		this.width = p[3].getX()-p[0].getX();
		this.height = p[3].getY()-p[0].getY();
	}
	
	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ", width=" + width + ", height=" + height + "]";
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("사각형 그리기");
	}
	
	
}
