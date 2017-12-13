package day12;

public class Circle1 {
	double r;
	double pi = Math.PI;
	
	public Circle1() {
		super();
	}
	public Circle1(double r) {
		super();
		this.r = r;
	}
	
	public void showsize(){
		System.out.println(r*r*pi);
	}

}
