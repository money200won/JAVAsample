package day11;

public class Teacher extends Person{
	String subject;
	
	public Teacher(){
		
	}
	
	public Teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
	}
	
	public void display(){
		System.out.printf("��   �� : %4s\t��  �� : %d\t������ : %s%n",super.getName(),super.getAge(),subject);
	}
}
