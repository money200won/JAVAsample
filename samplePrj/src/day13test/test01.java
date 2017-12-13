package day13test;

public class test01 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calarea();
		c.draw();
		c.drawcolor();

		Shape s = c;
		System.out.println(c);
		System.out.println(s);
		// 인터페이스를 쓰면 호출할 때 타입을 맞게 쓰지 않으면 전혀 쓸 수가 없다.
		Drawable d = c;
		d.draw();
		System.out.println("==========================================");
		Shape[] ss={
			new Circle(),
			new Rectangle()
		};
		
		for(int i=0;i<ss.length;i++){
			ss[i].calarea();
			((Drawable)ss[i]).draw();
			((Colorable) ss[i]).drawcolor();
		}
	}

}
