package day14;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b = new BB();
		// a=b;���� : a�� AAŸ���̱� ������ b��� BBŸ���� �� �� ����. �θ�Ÿ������ �����ϸ� ����������.
		A c = new AA();
		c = new BB();
		// �θ�Ÿ������ �ϸ� ���� �ȿ� �پ��� �ڽĵ��� Ÿ���� �����ٰ� �� �� �ִ�. ������ �θ�Ÿ���� ���������� ������
		// �ش� �θ�Ÿ�Կ� �ִ� �޼ҵ� �ۿ� �� �� ���� ������ �ٸ� �θ�Ÿ�Կ� �ִ� �޼ҵ�� �ϳ��ϳ� ĳ������ �ؼ� ����ϴ� ��������
		// �ִ�.

		A[] aaa = { new AA(), new BB() };
		B[] bbb = { new AA(), new BB() };
		C[] ccc = { new AA(), new BB() };
		I[] iii = { new AA(), new BB() };
		for (int i = 0; i < aaa.length; i++) {
			aaa[i].a();
			bbb[i].b();
			ccc[i].c();
			iii[i].a();
			iii[i].b();
			iii[i].c();
		}

	}
}

class AA extends Object implements I {

	@Override
	public void c() {
	}

	@Override
	public void b() {
	}

	@Override
	public void a() {
	}

}

class BB extends Object implements I {

	@Override
	public void c() {
	}

	@Override
	public void b() {
	}

	@Override
	public void a() {
	}

}

interface I extends A, B, C {
	// �������̽������� ���߻�� : �ڹٿ����� �Ϲ������� ���߻���� ������ ������ ���������� �������̽������� �������̽�����
	// �����ϴ� ����� ���߻���� ���ȴ�. ������ �ϸ� I�� �θ�Ÿ������ �����ϸ� ��� �޼ҵ带 �� �� �ִ� ���°� �ȴ�.
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C {
	void c();

}
