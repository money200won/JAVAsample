package day8;

/**
 * 
 * @author student
 * @since 2017. 11. 8
 * 
 */
public class Employee {
	String num;
	String name;
	String dept;

	public Employee() {
		this("000","사원명","땡땡부");
		/*
		this.num="000";
		this.name="사원명";
		this.dept="땡땡부";
		*/
		//System.out.println("Employee() 생성자 함수");
	}

	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	// 생성자 함수는 Employee()에서 ()부분 메모리에 올라간 후 default 생성자 함수대로 움직임
	// 생성자 함수도 여러개의 메소드 오버로딩이 가능합니다.
	/**
	 * Employee 정보 출력용==========
	 */
	public void display() {
		System.out.printf("Employee[%4s %4s %4s] %n", num, name, dept);
	}
}
