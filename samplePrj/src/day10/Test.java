package day10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("===============================");
		Dog d= new Dog();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);
		System.out.println("_______________________________");
		d.display();
		//Dog d= new Dog(); d������ �ڽ� �θ� ���� ȣ�� ���� ������ �⺻������ �ڽĲ��� ȣ�� ������ �θ� ȣ��
		//�θ� ������ �о������ d.super.kind�� ((Animal)d).kind�� ��ĳ������ �ؾ��� �ٵ� main�� static�̶� super�� ����
		
		//is a����
		Animal e = new Dog();
		e.breath();
		//e.bike(); �̰� ������ �θ� Ÿ���̱� ������ �θ� �������� ������ ����, �ٿ�ĳ�����ؼ� �����
		((Dog)e).bike();//�ٿ�ĳ���� ���
		System.out.println(e.kind);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Fish f = new Fish();
		f.breath();
		Animal g = new Fish();
		g.breath();//�޼ҵ尡 �������̵��Ǿ �θ�Ÿ������ ������ ���� ȣ���ص� �ڽ��� �޼ҵ尡 ����
	}

}
