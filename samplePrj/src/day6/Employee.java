package day6;

public class Employee {
	String name;
	String dept;
	String num;
	// �̷��� �������� ��� ������� �Ѵ�.
	// Primary Key(�⺻Ű) ���� �ߺ��� ���� ���� �з��� ������ �Ǵ� Ű ���⼱ ���

	public void display() {
		System.out.printf("Employee_[��� : %10s �̸� : %10s �μ� : %10s] %n", num, name, dept);
	}
}
