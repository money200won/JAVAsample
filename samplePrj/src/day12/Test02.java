package day12;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Animal f = new Fish();
		// Animal�� abstract�� Ŭ������ Ÿ������ �����ϴ� ���� �����ϴ� ������ ��ü���� �� new�� �Ἥ ��ü�� �޸𸮿�
		// �ø��°� �Ұ����ϴ�.

		Animal[] ani = new Animal[5];
		// �̰� �� �������� �� �� �ִµ� �̰� ��ü�� �����ϴ°� AnimalŸ������ 5���� ���� ����ٴ� �ǹ̷� ���� Ÿ�� ������
		// ���̴�.
		Animal[] animal = { a, f };
		for (int i = 0; i < animal.length; i++) {
			animal[i].breath();
		}
		
		Circle1 c = new Circle1(3);
		c.showsize();
	}

}
