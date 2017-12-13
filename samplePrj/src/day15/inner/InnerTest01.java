package day15.inner;

public class InnerTest01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A());
		b1.print();
	}
}

class A{
	String name = "A";
}

class B{
	A a;//��������� ������ �۵��� ���� a�ȿ� �ּҰ� ���� ������
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	void print(){
		System.out.println(a.name);
	}
}