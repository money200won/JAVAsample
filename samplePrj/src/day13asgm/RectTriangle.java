package day13asgm;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return width*height/2;
	}
	
}
