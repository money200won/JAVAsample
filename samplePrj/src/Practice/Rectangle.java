package Practice;

public class Rectangle extends Shape {
	private double width;
	private double hight;
	
public Rectangle(String name, double width, double hight) {
		super.setName(name);
		super.setArea(area);
		this.width = width;
		this.hight = hight;
	}
	//¼Â°Ù
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public void calculationArea(){
		area=this.width*this.hight;
	}
	
	
}
