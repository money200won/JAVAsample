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
	A a;//여기까지만 있으면 작동을 못함 a안에 주소가 없기 때문에
	
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