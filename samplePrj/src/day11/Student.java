package day11;

public class Student extends Person{
	int id;
	
	public Student(){
		
	}
	
	public Student(String name,int age,int id){
		super(name,age);
		this.id=id;
	}
	
	public void display(){
		System.out.printf("이   름 : %4s\t나  이 : %d\t학    번 : %s%n",super.getName(),super.getAge(),id);
	}
}
