package day13asgm;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		}
	public double getArea(){
		return width*height;
	}
	
	public void resize(double s){
		this.width=width*s;
		this.height=height*s;
		}
	
}
