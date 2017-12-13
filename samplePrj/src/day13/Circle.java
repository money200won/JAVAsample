package day13;

public class Circle extends Shape {
	Point center;
	int r;
	
	public Circle() {
		super();
	}
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	public Circle(String color, Point center, int r) {
		super(color);
		this.center = center;
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [중심점=" + center + ", 반지름=" + r + "색깔="+getColor()+"]";
	}
	@Override
	public void draw(){
		super.draw();//부모 클라스에 있던 메소드도 사용하고 싶을 때 이렇게 오버라이딩 할 메소드 안에 호출해주면 된다.
		System.out.println(" 원 그리기 ");
	}
	
	
	
}
