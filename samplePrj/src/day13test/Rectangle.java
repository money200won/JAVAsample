package day13test;

public class Rectangle extends Shape implements Drawable,Colorable{

	@Override
	public void drawcolor() {
		System.out.println(getClass().getSimpleName()+"�������");
		
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"�� �׸���.");
		
	}

	@Override
	public void calarea() {
		System.out.println(getClass().getSimpleName()+"�� ĥ��.");
		
	}

}
