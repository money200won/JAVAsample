package Practice;

public class Circle extends Shape {
	private double radius;

	
public Circle(String name,double radius) {
		super.setName(name);
		super.setArea(area);
		this.radius = radius;
	}

//¼Â°Ù
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calculationArea(){
		area=this.radius*this.radius*Math.PI;
	}
	
}
