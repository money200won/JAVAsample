package day11;

public class Person {
	private String name;
	private int age;
	
	
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	//������ �Լ� �κ�
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter setter �κ�
	
	public void display(){
	}
	//�������̵� �κ� public void display(){}�� �ᵵ ���� ����Ʈ�� ���ϸ鼭 �۵���
	//System.out.printf("��   �� : %4s\t��  �� : %d%n",getName(),getAge());
	//Person�� display�� �� �� �ֵ��� ���������� �ٲ� �κ�
	
	
	
	
	
	
	
	
}
