package day14;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b = new BB();
		// a=b;오류 : a는 AA타입이기 때문에 b라는 BB타입은 들어갈 수 없다. 부모타입으로 통합하면 가능해진다.
		A c = new AA();
		c = new BB();
		// 부모타입으로 하면 변수 안에 다양한 자식들의 타입을 가져다가 쓸 수 있다. 하지만 부모타입이 여러가지가 있으면
		// 해당 부모타입에 있는 메소드 밖에 쓸 수 없기 때문에 다른 부모타입에 있는 메소드는 하나하나 캐스팅을 해서 써야하는 불편함이
		// 있다.

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
	// 인터페이스에서의 다중상속 : 자바에서는 일반적으로 다중상속이 허용되지 않지만 예외적으로 인터페이스에서는 인터페이스들을
	// 통합하는 방식의 다중상속이 허용된다. 통합을 하면 I를 부모타입으로 설정하면 모든 메소드를 쓸 수 있는 상태가 된다.
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
