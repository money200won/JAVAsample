package day10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("===============================");
		Dog d= new Dog();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);
		System.out.println("_______________________________");
		d.display();
		//Dog d= new Dog(); d에서는 자식 부모 전부 호출 가능 하지만 기본적으로 자식꺼로 호출 없으면 부모꺼 호출
		//부모 영역을 읽어오려면 d.super.kind나 ((Animal)d).kind로 업캐스팅을 해야함 근데 main은 static이라 super를 못씀
		
		//is a관계
		Animal e = new Dog();
		e.breath();
		//e.bike(); 이건 오류남 부모 타입이기 때문에 부모 영역에만 엑세스 가능, 다운캐스팅해서 써야함
		((Dog)e).bike();//다운캐스팅 결과
		System.out.println(e.kind);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Fish f = new Fish();
		f.breath();
		Animal g = new Fish();
		g.breath();//메소드가 오버라이딩되어서 부모타입으로 변수를 만들어서 호출해도 자식의 메소드가 나옴
	}

}
