package day12;

public class Dog extends Animal {//Animal이 abstract이 되는 순간 breath()메소드를 쓰던 Dog가 오류
	//이걸 abstract으로 하던가 아니면 여기서 breath()를 완성해야함. abstract면 객체 생성을 못함.
	String kind = "강아지 종류";
	String name ;
	
	public Dog() {
		//super();//디폴트 생성자를 지워도 반드시 상위 조상의 생성자 함수를 다녀온다.
	}//디폴트 생성자 함수

	public Dog(String kind, String name) {
		//super();
		this.kind = kind;
		this.name = name;
	}//kind와 name의 생성자 함수
	
	public Dog(String superk, String kind, String name) {
		super(superk);//이런 방식으로 부모의 생성자 함수에 값을 넣을 수 있다.
		this.kind = kind;
		this.name = name;
	}//kind와 name의 생성자 함수
	/*
	public void display(){
		System.out.printf("Dog[%s,  %s]%n",kind,name);
	}
	*/
	public void display(){
		System.out.printf("Dog[%s,  %s,  %s]%n",super.getKind(),kind,name);
	}
	//public void breath(){}//abstract에서 없던 바디부{}를 부여함으로서 완성시킴.
	//이렇게 강제성을 부여하면 오버라이딩이 어떤 문제로 실행되지 않을 가능성을 막아준다

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("폐 호흡");
	}
	
}
