package day15.inner2;

public class InnerTest01 {
	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();
		
		A a = new A();
		a.pp();
		
		new A().pp();
		
		A.S s = new A.S();//static�� inner class�� static class�� ���������� new�� �ʿ���� Ŭ������������ �޼ҵ带 �ҷ����°� �����ϴ�.
		s.print();
		
		new A.S().print();//innerŬ������ ����� �� ���� �ܺ� Ŭ���� ������ �ּҷ� �ִ� ������ �߰��ϴ� �� �� ���ϴ� �ν��Ͻ� Ŭ������ ����ƽ Ŭ������ �ҷ����� �Ͱ� ����.
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
			//System.out.println(name);����:AŬ������ �ν��Ͻ� ������ �� �� ���� �ȴ�. static�ϰ� ���ϴϱ�
			System.out.println("++++++");
		}
	}
	
}
