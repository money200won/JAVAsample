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
		System.out.printf("��   �� : %4s\t��  �� : %d\t��    �� : %s%n",super.getName(),super.getAge(),id);
	}
}
