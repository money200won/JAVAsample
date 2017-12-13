package day11;

public class Fish extends Animal {
	String name;

	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	
	public Fish(String kind, String name){
		//super(kind);
		super.setKind(kind);
		this.name=name;
	}
	
	@Override//컴파일을 지나도 사라지지 않는 골뱅이 주석 부모와 동일한 메소드가 있는지 체크해줌 오류를 출력함
	public void breath() {
		System.out.println("아가미 호흡");
	}

	public void display() {
		System.out.printf("Fish[%s,  %s]%n", super.getKind(), name);
	}
}
