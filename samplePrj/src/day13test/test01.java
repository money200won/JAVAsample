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
		// �������̽��� ���� ȣ���� �� Ÿ���� �°� ���� ������ ���� �� ���� ����.
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
