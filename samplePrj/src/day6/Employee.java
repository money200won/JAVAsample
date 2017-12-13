package day6;

public class Employee {
	String name;
	String dept;
	String num;
	// 이러한 변수들을 멤버 변수라고 한다.
	// Primary Key(기본키) 절대 중복될 일이 없는 분류의 기준이 되는 키 여기선 사번

	public void display() {
		System.out.printf("Employee_[사번 : %10s 이름 : %10s 부서 : %10s] %n", num, name, dept);
	}
}
