package day11;

public class Fish extends Animal {
	String name;

	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	
	public Fish(String kind, String name){
		//super(kind);
		super.setKind(kind);
		this.name=name;
	}
	
	@Override//�������� ������ ������� �ʴ� ����� �ּ� �θ�� ������ �޼ҵ尡 �ִ��� üũ���� ������ �����
	public void breath() {
		System.out.println("�ư��� ȣ��");
	}

	public void display() {
		System.out.printf("Fish[%s,  %s]%n", super.getKind(), name);
	}
}
