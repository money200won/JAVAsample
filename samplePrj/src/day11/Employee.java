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
		System.out.printf("이   름 : %4s\t나  이 : %d\t부    서 : %s%n",super.getName(),super.getAge(),dept);
	}
}

