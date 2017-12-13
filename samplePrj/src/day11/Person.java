package day11;

public class Person {
	private String name;
	private int age;
	
	
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	//생성자 함수 부분
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter setter 부분
	
	public void display(){
	}
	//오버라이딩 부분 public void display(){}로 써도 전부 디폴트가 변하면서 작동함
	//System.out.printf("이   름 : %4s\t나  이 : %d%n",getName(),getAge());
	//Person도 display를 쓸 수 있도록 개인적으로 바꾼 부분
	
	
	
	
	
	
	
	
}
