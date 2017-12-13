package day11;

public class Dog extends Animal {
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
	
}
