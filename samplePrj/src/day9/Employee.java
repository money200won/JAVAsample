package day9;

public class Employee {
	private String name;//이름
	private int salary;//급여
	private String ssn;//주민번호
	//private 처리하면 인캡슐레이션(숨기기)가 된다. 다른 기능에 영향을 최소화한다.
	//set,get 메소드를 사용하자
	public Employee(){
		
	}
	public Employee(String name, int salary, String ssn){
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getnName(){
		return this.name;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return this.salary;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getnSsn(){
		return this.ssn;
	}
	
	
	public void display(){
		System.out.printf("Employee[%s, %d, %s]%n",name,salary,ssn);
	}
	
	
	
	
}
