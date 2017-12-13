package day15.inner2;

public class InnerTest01 {
	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();
		
		A a = new A();
		a.pp();
		
		new A().pp();
		
		A.S s = new A.S();//static한 inner class도 static class와 마찬가지로 new할 필요없이 클래스내임으로 메소드를 불러오는게 가능하다.
		s.print();
		
		new A.S().print();//inner클래스는 어려울 것 없이 외부 클래스 네임을 주소로 넣는 과정을 추가하는 것 그 이하는 인스턴스 클래스나 스태틱 클래스를 불러오는 것과 같다.
	}
}

class A {
	String name = "A";

	void pp() {
		B b = new B();
		b.print();
	}

	class B {
		void print() {
			System.out.println(name);
		}

	}
	static class S {
		void print() {
			//System.out.println(name);에러:A클래스에 인스턴스 변수가 들어갈 수 없게 된다. static하게 변하니까
			System.out.println("++++++");
		}
	}
	
}
