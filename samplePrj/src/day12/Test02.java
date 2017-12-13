package day12;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Animal f = new Fish();
		// Animal이 abstract인 클래스라도 타입으로 선언하는 것은 가능하다 하지만 객체생성 즉 new를 써서 객체로 메모리에
		// 올리는건 불가능하다.

		Animal[] ani = new Animal[5];
		// 이게 왜 가능하지 할 수 있는데 이건 객체를 생성하는게 Animal타입으로 5개의 방을 만든다는 의미로 단지 타입 선언일
		// 뿐이다.
		Animal[] animal = { a, f };
		for (int i = 0; i < animal.length; i++) {
			animal[i].breath();
		}
		
		Circle1 c = new Circle1(3);
		c.showsize();
	}

}
