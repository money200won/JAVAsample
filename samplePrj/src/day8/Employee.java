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
		this("000","�����","������");
		/*
		this.num="000";
		this.name="�����";
		this.dept="������";
		*/
		//System.out.println("Employee() ������ �Լ�");
	}

	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	// ������ �Լ��� Employee()���� ()�κ� �޸𸮿� �ö� �� default ������ �Լ���� ������
	// ������ �Լ��� �������� �޼ҵ� �����ε��� �����մϴ�.
	/**
	 * Employee ���� ��¿�==========
	 */
	public void display() {
		System.out.printf("Employee[%4s %4s %4s] %n", num, name, dept);
	}
}
