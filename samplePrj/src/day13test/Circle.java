package day13test;

public class Circle extends Shape implements Drawable,Colorable{
//extends�� �� �ϳ��� �� �� �ְ� �ݵ�� implements �տ� �´�. implements�� interface�� ��ӹ޴� ������ ������ ���� ���� ����
	@Override
	public void calarea() {
		System.out.println(getClass().getSimpleName()+"�������");
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"�� �׸���.");
		
	}

	@Override
	public void drawcolor() {
		System.out.println(getClass().getSimpleName()+"�� ĥ��.");
			
	}

}
