package day13test;

public class Circle extends Shape implements Drawable,Colorable{
//extends는 단 하나만 올 수 있고 반드시 implements 앞에 온다. implements는 interface를 상속받는 것으로 여러개 오는 것이 가능
	@Override
	public void calarea() {
		System.out.println(getClass().getSimpleName()+"면적계산");
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"을 그리다.");
		
	}

	@Override
	public void drawcolor() {
		System.out.println(getClass().getSimpleName()+"을 칠해.");
			
	}

}
