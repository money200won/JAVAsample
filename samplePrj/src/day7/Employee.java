package day7;

public class Employee {
	String num;
	String name;
	String dept;
	
	public void display()//함수의 선언부
	{
	//함수의 바디부
		System.out.printf("Employee_[사번 : %5s 이름 : %5s 부서 : %5s] %n", num, name, dept);
	}
}
