package day12;

public class Dog extends Animal {//Animal�� abstract�� �Ǵ� ���� breath()�޼ҵ带 ���� Dog�� ����
	//�̰� abstract���� �ϴ��� �ƴϸ� ���⼭ breath()�� �ϼ��ؾ���. abstract�� ��ü ������ ����.
	String kind = "������ ����";
	String name ;
	
	public Dog() {
		//super();//����Ʈ �����ڸ� ������ �ݵ�� ���� ������ ������ �Լ��� �ٳ�´�.
	}//����Ʈ ������ �Լ�

	public Dog(String kind, String name) {
		//super();
		this.kind = kind;
		this.name = name;
	}//kind�� name�� ������ �Լ�
	
	public Dog(String superk, String kind, String name) {
		super(superk);//�̷� ������� �θ��� ������ �Լ��� ���� ���� �� �ִ�.
		this.kind = kind;
		this.name = name;
	}//kind�� name�� ������ �Լ�
	/*
	public void display(){
		System.out.printf("Dog[%s,  %s]%n",kind,name);
	}
	*/
	public void display(){
		System.out.printf("Dog[%s,  %s,  %s]%n",super.getKind(),kind,name);
	}
	//public void breath(){}//abstract���� ���� �ٵ��{}�� �ο������μ� �ϼ���Ŵ.
	//�̷��� �������� �ο��ϸ� �������̵��� � ������ ������� ���� ���ɼ��� �����ش�

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("�� ȣ��");
	}
	
}
