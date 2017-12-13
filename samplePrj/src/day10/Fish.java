package day10;

public class Fish extends Animal {
	String name;
	public void breath(){
		System.out.println("아가미 호흡");//오버라이딩
		//주의! 오버라이딩 된 메소드는 부모의 메소드를 호출해도((Animal)f).breath(); 오버라이딩 된 것을 호출한다.
		//캐스팅으로는 불가능하고 정확한 경로 지정하면 호출이 가능하긴 함. super.f.breath();
	}
}
