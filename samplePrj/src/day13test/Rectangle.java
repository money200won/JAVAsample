package day13test;

public class Rectangle extends Shape implements Drawable,Colorable{

	@Override
	public void drawcolor() {
		System.out.println(getClass().getSimpleName()+"면적계산");
		
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"을 그리다.");
		
	}

	@Override
	public void calarea() {
		System.out.println(getClass().getSimpleName()+"을 칠해.");
		
	}

}
