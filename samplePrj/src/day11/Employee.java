package day11;

public class Employee extends Person{
	String dept;
	
	public Employee(){
		
	}
	
	public Employee(String name,int age,String dept){
		super(name,age);
		this.dept=dept;
	}
	
	public void display(){
		System.out.printf("��   �� : %4s\t��  �� : %d\t��    �� : %s%n",super.getName(),super.getAge(),dept);
	}
}

