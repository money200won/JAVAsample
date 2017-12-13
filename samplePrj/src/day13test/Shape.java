package day13test;

public abstract class Shape {
	protected double area;
	protected String name;
	
	public abstract void calarea();
	
	@Override
	public String toString() {
		return "["+name+", " + area+"]";
	}
}
